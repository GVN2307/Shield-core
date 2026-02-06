package com.shieldcore.app.implementation

import com.shieldcore.app.accessibility.ShieldCoreAccessibilityService

/**
 * Singleton locator to provide access to the platform AccessibilityService
 * for deep-window scanning (rootInActiveWindow).
 */
object SystemServiceLocator {
    private var accessibilityService: ShieldCoreAccessibilityService? = null

    fun registerService(service: ShieldCoreAccessibilityService) {
        accessibilityService = service
    }

    fun unregisterService() {
        accessibilityService = null
    }

    fun getAccessibilityService(): ShieldCoreAccessibilityService? = accessibilityService
}
