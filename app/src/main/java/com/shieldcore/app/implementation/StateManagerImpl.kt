package com.shieldcore.app.implementation

import com.shieldcore.app.core.interfaces.*
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class StateManagerImpl @Inject constructor() : StateManager {
    private var currentMode = SystemMode.GUARDIAN_MODE
    private var config = ShieldCoreConfig(
        enabledCategories = setOf(ContentCategory.HATE_SPEECH, ContentCategory.ADULT_CONTENT),
        sensitivityLevels = emptyMap(),
        parentFaceIds = emptyList(),
        privilegeTimeoutMinutes = 60,
        targetApplications = listOf("com.instagram.android", "com.zhiliaoapp.musically")
    )

    override fun setMode(mode: SystemMode) {
        currentMode = mode
    }

    override fun getCurrentMode(): SystemMode = currentMode

    override fun saveConfiguration(config: ShieldCoreConfig) {
        this.config = config
    }

    override fun loadConfiguration(): ShieldCoreConfig = config

    override fun logActivity(activity: ActivityLog) {
        // Logging logic to be implemented
    }
}
