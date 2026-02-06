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

    override fun onAccessibilityEvent(event: AccessibilityEvent): List<ContentData> {
        if (!isMonitoring) return emptyList()
        
        val packageName = event.packageName?.toString() ?: return emptyList()
        if (!monitoringPackages.contains(packageName)) return emptyList()

        val rootNode = event.source ?: return emptyList()
        
        return try {
            val results = mutableListOf<ContentData>()
            traverseNode(rootNode, results, packageName)
            
            results.forEach { content ->
                listeners.forEach { it.onContentCaptured(content) }
            }
            results
        } finally {
            rootNode.recycle()
        }
    }

    override fun registerContentListener(listener: ContentListener) {
        listeners.add(listener)
    }

    private fun traverseNode(node: AccessibilityNodeInfo, results: MutableList<ContentData>, packageName: String) {
        val text = node.text?.toString()
        if (!text.isNullOrBlank()) {
            val nodeBounds = Rect()
            node.getBoundsInScreen(nodeBounds)
            
            if (!nodeBounds.isEmpty) {
                results.add(ContentData(
                    text = text,
                    metadata = ContentMetadata(),
                    timestamp = System.currentTimeMillis(),
                    sourceApp = packageName,
                    screenBounds = nodeBounds
                ))
            }
        }

        for (i in 0 until node.childCount) {
            val child = node.getChild(i)
            if (child != null) {
                traverseNode(child, results, packageName)
                child.recycle()
            }
        }
    }
}
