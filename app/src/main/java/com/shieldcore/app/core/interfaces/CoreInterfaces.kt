package com.shieldcore.app.core.interfaces

import android.graphics.Bitmap
import android.graphics.Rect
import android.view.accessibility.AccessibilityEvent

interface ContentInterceptor {
    fun startMonitoring(targetPackages: List<String>)
    fun stopMonitoring()
    fun onAccessibilityEvent(event: AccessibilityEvent): ContentData?
    fun registerContentListener(listener: ContentListener)
}

interface ContentListener {
    fun onContentCaptured(content: ContentData)
}

data class ContentData(
    val text: String,
    val metadata: ContentMetadata,
    val timestamp: Long,
    val sourceApp: String,
    val screenBounds: Rect
)

data class ContentMetadata(
    val author: String? = null,
    val timestamp: Long? = null,
    val mediaType: MediaType = MediaType.TEXT_ONLY,
    val interactionCount: Int? = null,
    val hashtags: List<String> = emptyList()
)

enum class MediaType {
    TEXT_ONLY, IMAGE, VIDEO, MIXED_CONTENT
}

interface ContentClassifier {
    fun classifyText(text: String): ClassificationResult
    fun classifyImage(bitmap: Bitmap): ClassificationResult
    fun updateModels(modelPaths: List<String>)
    fun getModelVersion(): String
}

data class ClassificationResult(
    val category: ContentCategory,
    val confidence: Float,
    val processingTimeMs: Long
)

enum class ContentCategory {
    SAFE, HATE_SPEECH, GRAPHIC_VIOLENCE, ADULT_CONTENT, UNKNOWN
}

interface UIOverlayManager {
    fun createOverlay(bounds: Rect, content: ContentData)
    fun removeOverlay(overlayId: String)
    fun updateOverlayPosition(overlayId: String, newBounds: Rect)
    fun clearAllOverlays()
}

interface FaceAuthenticator {
    fun enrollParentFace(bitmap: Bitmap): EnrollmentResult
    fun authenticateParent(bitmap: Bitmap): AuthenticationResult
    fun removeParentFace(faceId: String)
    fun isAuthenticationEnabled(): Boolean
}

data class EnrollmentResult(val success: Boolean, val faceId: String?, val errorMessage: String?)
data class AuthenticationResult(
    val success: Boolean,
    val confidence: Float,
    val faceId: String?,
    val errorMessage: String?
)

interface StateManager {
    fun setMode(mode: SystemMode)
    fun getCurrentMode(): SystemMode
    fun saveConfiguration(config: ShieldCoreConfig)
    fun loadConfiguration(): ShieldCoreConfig
    fun logActivity(activity: ActivityLog)
}

enum class SystemMode {
    GUARDIAN_MODE, PRIVILEGE_MODE, DISABLED
}

data class ShieldCoreConfig(
    val enabledCategories: Set<ContentCategory>,
    val sensitivityLevels: Map<ContentCategory, Float>,
    val parentFaceIds: List<String>,
    val privilegeTimeoutMinutes: Int,
    val targetApplications: List<String>
)

data class ActivityLog(
    val timestamp: Long,
    val event: ActivityEvent,
    val contentCategory: ContentCategory?,
    val sourceApp: String,
    val actionTaken: String
)

enum class ActivityEvent {
    CONTENT_BLOCKED, CONTENT_ALLOWED, PRIVILEGE_GRANTED, 
    PRIVILEGE_DENIED, MODE_CHANGED, SYSTEM_ERROR
}
