package com.shieldcore.app.implementation

import android.content.Context
import com.shieldcore.app.core.interfaces.*
import dagger.hilt.android.qualifiers.ApplicationContext
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class StateManagerImpl @Inject constructor(
    @ApplicationContext private val context: Context
) : StateManager {
    
    private val prefs = context.getSharedPreferences("shield_core_prefs", Context.MODE_PRIVATE)
    
    private var persistedMode: SystemMode
        get() = SystemMode.valueOf(prefs.getString("current_mode", SystemMode.GUARDIAN_MODE.name) ?: SystemMode.GUARDIAN_MODE.name)
        set(value) = prefs.edit().putString("current_mode", value.name).apply()

    private var targetApps: List<String>
        get() = prefs.getStringSet("target_apps", setOf(
            "com.instagram.android", 
            "com.zhiliaoapp.musically", 
            "com.snapchat.android", 
            "com.twitter.android",
            "com.facebook.katana",
            "com.whatsapp",
            "com.android.chrome",
            "com.shieldcore.app",
            "*" // Wildcard to ensure protection works on all apps in current testing phase
        ))?.toList() ?: emptyList()
        set(value) = prefs.edit().putStringSet("target_apps", value.toSet()).apply()

    override fun setMode(mode: SystemMode) {
        persistedMode = mode
    }

    override fun getCurrentMode(): SystemMode = persistedMode

    override fun saveConfiguration(config: ShieldCoreConfig) {
        targetApps = config.targetApplications
        // In production, other fields like privilegeTimeout would also be saved here
    }

    override fun loadConfiguration(): ShieldCoreConfig {
        return ShieldCoreConfig(
            enabledCategories = setOf(ContentCategory.HATE_SPEECH, ContentCategory.ADULT_CONTENT),
            sensitivityLevels = emptyMap(),
            parentFaceIds = emptyList(),
            privilegeTimeoutMinutes = 60,
            targetApplications = targetApps
        )
    }

    override fun logActivity(activity: ActivityLog) {
        // Logging logic (Persistence could be added here later if needed)
    }
}
