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

    companion object {
        private const val TAG = "ShieldCoreAS"
    }

    override fun onAccessibilityEvent(event: AccessibilityEvent) {
        // Only monitor content if the system is enabled
        if (stateManager.getCurrentMode() == SystemMode.DISABLED) return

        val content = contentInterceptor.onAccessibilityEvent(event)
        if (content != null) {
            // Classify the extracted text
            val result = contentClassifier.classifyText(content.text)
            
            // If harmful content is detected, apply the overlay
            if (result.category != ContentCategory.SAFE && result.category != ContentCategory.UNKNOWN) {
                Log.d(TAG, "⚠️ Harmful content detected in ${content.sourceApp}: ${result.category}")
                
                // Mask the content area
                uiOverlayManager.createOverlay(content.screenBounds, content)
                
                // Log the incident in the system state
                stateManager.logActivity(ActivityLog(
                    timestamp = System.currentTimeMillis(),
                    event = ActivityEvent.CONTENT_BLOCKED,
                    contentCategory = result.category,
                    sourceApp = content.sourceApp,
                    actionTaken = "UI Masking Applied"
                ))
            }
        }
    }

    override fun onInterrupt() {
        Log.d(TAG, "Accessibility Service Interrupted")
        contentInterceptor.stopMonitoring()
        uiOverlayManager.clearAllOverlays()
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
    }
}
