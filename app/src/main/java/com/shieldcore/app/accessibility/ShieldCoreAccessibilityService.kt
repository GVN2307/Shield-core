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

        val contents = contentInterceptor.onAccessibilityEvent(event)
        val currentEventHashes = mutableSetOf<Int>()
        
        for (content in contents) {
            val contentHash = content.text.hashCode()
            val result = contentClassifier.classifyText(content.text)
            
            if (result.category != ContentCategory.SAFE && result.category != ContentCategory.UNKNOWN) {
                currentEventHashes.add(contentHash)
                val existingOverlayId = activeOverlays[contentHash]
                
                if (existingOverlayId != null) {
                    uiOverlayManager.updateOverlayPosition(existingOverlayId, content.screenBounds)
                } else {
                    val newOverlayId = uiOverlayManager.createOverlay(content.screenBounds, content)
                    activeOverlays[contentHash] = newOverlayId
                    Log.d(TAG, "🛡️ Masked segment: ${result.category}")
                }
            }
        }
        
        // Reconciliation: Remove overlays that are no longer present in this event
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
        
        // Start monitoring apps configured in StateManager
        val config = stateManager.loadConfiguration()
        contentInterceptor.startMonitoring(config.targetApplications)
    }
    
    override fun onDestroy() {
        super.onDestroy()
        contentInterceptor.stopMonitoring()
        uiOverlayManager.clearAllOverlays()
        activeOverlays.clear()
    }
}
