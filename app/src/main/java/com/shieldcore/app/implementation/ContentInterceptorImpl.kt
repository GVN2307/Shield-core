package com.shieldcore.app.implementation

import android.graphics.Rect
import android.util.Log
import android.view.accessibility.AccessibilityEvent
import android.view.accessibility.AccessibilityNodeInfo
import com.shieldcore.app.core.interfaces.ContentData
import com.shieldcore.app.core.interfaces.ContentInterceptor
import com.shieldcore.app.core.interfaces.ContentListener
import com.shieldcore.app.core.interfaces.ContentMetadata
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class ContentInterceptorImpl @Inject constructor() : ContentInterceptor {

    private var monitoringPackages: List<String> = emptyList()
    private val listeners = mutableListOf<ContentListener>()
    private var isMonitoring = false

    companion object {
        private const val TAG = "ContentInterceptor"
    }

    override fun startMonitoring(targetPackages: List<String>) {
        Log.d(TAG, "Starting monitoring for packages: $targetPackages")
        monitoringPackages = targetPackages
        isMonitoring = true
    }

    override fun stopMonitoring() {
        Log.d(TAG, "Stopping monitoring")
        isMonitoring = false
    }

    override fun onAccessibilityEvent(event: AccessibilityEvent): ContentData? {
        if (!isMonitoring) return null
        
        val packageName = event.packageName?.toString() ?: return null
        if (!monitoringPackages.contains(packageName)) return null

        val rootNode = event.source ?: return null
        
        return try {
            val extractedText = StringBuilder()
            val bounds = Rect()
            
            traverseNode(rootNode, extractedText, bounds)
            
            if (extractedText.isBlank()) return null

            val content = ContentData(
                text = extractedText.toString(),
                metadata = ContentMetadata(),
                timestamp = System.currentTimeMillis(),
                sourceApp = packageName,
                screenBounds = bounds
            )

            listeners.forEach { it.onContentCaptured(content) }
            content
        } finally {
            rootNode.recycle()
        }
    }

    override fun registerContentListener(listener: ContentListener) {
        listeners.add(listener)
    }

    private fun traverseNode(node: AccessibilityNodeInfo, textCollector: StringBuilder, boundsCollector: Rect) {
        val text = node.text?.toString()
        if (!text.isNullOrBlank()) {
            if (textCollector.isNotEmpty()) textCollector.append(" ")
            textCollector.append(text)
            
            val nodeBounds = Rect()
            node.getBoundsInScreen(nodeBounds)
            if (boundsCollector.isEmpty) {
                boundsCollector.set(nodeBounds)
            } else {
                boundsCollector.union(nodeBounds)
            }
        }

        for (i in 0 until node.childCount) {
            val child = node.getChild(i)
            if (child != null) {
                traverseNode(child, textCollector, boundsCollector)
                child.recycle()
            }
        }
    }
}
