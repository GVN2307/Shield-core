package com.shieldcore.app.accessibility

import android.accessibilityservice.AccessibilityService
import android.util.Log
import android.view.accessibility.AccessibilityEvent
import com.shieldcore.app.core.interfaces.*
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject

@AndroidEntryPoint
class ShieldCoreAccessibilityService : AccessibilityService() {

    @Inject
    lateinit var contentInterceptor: ContentInterceptor

    @Inject
    lateinit var stateManager: StateManager
    
    @Inject
    lateinit var contentClassifier: ContentClassifier
    
    @Inject
    lateinit var uiOverlayManager: UIOverlayManager

    private val activeOverlays = mutableMapOf<Int, String>() // contentHash to overlayId

    companion object {
        private const val TAG = "ShieldCoreAS"
    }

    override fun onAccessibilityEvent(event: AccessibilityEvent) {
        if (stateManager.getCurrentMode() == SystemMode.DISABLED) return

        // Performance Optimization: Cache current event for feed synchronization
        val contents = contentInterceptor.onAccessibilityEvent(event)
        val currentEventHashes = mutableSetOf<Int>()
        
        for (content in contents) {
            // Composite Fingerprint: Package + Text Hash + Y-Coordinate Anchor
            // This prevents collisions when identical text appears in different feed items.
            val contentFingerprint = "${content.sourceApp}_${content.text.hashCode()}_${content.screenBounds.top}"
            val contentKey = contentFingerprint.hashCode()
            
            val result = contentClassifier.classifyText(content.text)
            
            if (result.category != ContentCategory.SAFE && result.category != ContentCategory.UNKNOWN) {
                currentEventHashes.add(contentKey)
                val existingOverlayId = activeOverlays[contentKey]
                
                if (existingOverlayId != null) {
                    // Smoothly update position for scrolling content
                    uiOverlayManager.updateOverlayPosition(existingOverlayId, content.screenBounds)
                } else {
                    // Create new masking node
                    val newOverlayId = uiOverlayManager.createOverlay(content.screenBounds, content)
                    activeOverlays[contentKey] = newOverlayId
                    
                    // Requirement 5.5: Privacy-Preserving Logging (Observed not Recorded)
                    Log.d(TAG, "🛡️ ShieldCore: Blocked [${result.category}] in ${content.sourceApp}")
                    stateManager.logActivity(ActivityLog(
                        timestamp = System.currentTimeMillis(),
                        event = ActivityEvent.CONTENT_BLOCKED,
                        contentCategory = result.category,
                        sourceApp = content.sourceApp,
                        actionTaken = "Dynamic UI Masking"
                    ))
                }
            }
        }
        
        // Synchronized Reconciliation: Remove stale overlays instantly
        val iterator = activeOverlays.entries.iterator()
        while (iterator.hasNext()) {
            val entry = iterator.next()
            if (!currentEventHashes.contains(entry.key)) {
                uiOverlayManager.removeOverlay(entry.value)
                iterator.remove()
            }
        }
    }

    override fun onInterrupt() {
        Log.d(TAG, "Accessibility Service Interrupted")
        contentInterceptor.stopMonitoring()
        uiOverlayManager.clearAllOverlays()
        activeOverlays.clear()
    }

    override fun onServiceConnected() {
        super.onServiceConnected()
        Log.d(TAG, "Accessibility Service Connected")
        
        // Register service for deep-scanning access
        com.shieldcore.app.implementation.SystemServiceLocator.registerService(this)
        
        // Start monitoring apps configured in StateManager
        val config = stateManager.loadConfiguration()
        contentInterceptor.startMonitoring(config.targetApplications)
    }
    
    override fun onDestroy() {
        super.onDestroy()
        com.shieldcore.app.implementation.SystemServiceLocator.unregisterService()
        contentInterceptor.stopMonitoring()
        uiOverlayManager.clearAllOverlays()
        activeOverlays.clear()
    }
}
