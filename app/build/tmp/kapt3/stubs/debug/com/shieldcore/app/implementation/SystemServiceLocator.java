package com.shieldcore.app.implementation;

/**
 * Singleton locator to provide access to the platform AccessibilityService
 * for deep-window scanning (rootInActiveWindow).
 */
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004J\u000e\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0004J\u0006\u0010\t\u001a\u00020\u0007R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\n"}, d2 = {"Lcom/shieldcore/app/implementation/SystemServiceLocator;", "", "()V", "accessibilityService", "Lcom/shieldcore/app/accessibility/ShieldCoreAccessibilityService;", "getAccessibilityService", "registerService", "", "service", "unregisterService", "app_debug"})
public final class SystemServiceLocator {
    @org.jetbrains.annotations.Nullable
    private static com.shieldcore.app.accessibility.ShieldCoreAccessibilityService accessibilityService;
    @org.jetbrains.annotations.NotNull
    public static final com.shieldcore.app.implementation.SystemServiceLocator INSTANCE = null;
    
    private SystemServiceLocator() {
        super();
    }
    
    public final void registerService(@org.jetbrains.annotations.NotNull
    com.shieldcore.app.accessibility.ShieldCoreAccessibilityService service) {
    }
    
    public final void unregisterService() {
    }
    
    @org.jetbrains.annotations.Nullable
    public final com.shieldcore.app.accessibility.ShieldCoreAccessibilityService getAccessibilityService() {
        return null;
    }
}