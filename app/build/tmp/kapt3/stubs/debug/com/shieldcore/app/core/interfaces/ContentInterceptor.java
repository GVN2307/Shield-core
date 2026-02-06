package com.shieldcore.app.core.interfaces;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0016\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0005\u001a\u00020\u0006H&J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH&J\u0016\u0010\u000b\u001a\u00020\b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u0003H&J\b\u0010\u000e\u001a\u00020\bH&\u00a8\u0006\u000f"}, d2 = {"Lcom/shieldcore/app/core/interfaces/ContentInterceptor;", "", "onAccessibilityEvent", "", "Lcom/shieldcore/app/core/interfaces/ContentData;", "event", "Landroid/view/accessibility/AccessibilityEvent;", "registerContentListener", "", "listener", "Lcom/shieldcore/app/core/interfaces/ContentListener;", "startMonitoring", "targetPackages", "", "stopMonitoring", "app_debug"})
public abstract interface ContentInterceptor {
    
    public abstract void startMonitoring(@org.jetbrains.annotations.NotNull
    java.util.List<java.lang.String> targetPackages);
    
    public abstract void stopMonitoring();
    
    @org.jetbrains.annotations.NotNull
    public abstract java.util.List<com.shieldcore.app.core.interfaces.ContentData> onAccessibilityEvent(@org.jetbrains.annotations.NotNull
    android.view.accessibility.AccessibilityEvent event);
    
    public abstract void registerContentListener(@org.jetbrains.annotations.NotNull
    com.shieldcore.app.core.interfaces.ContentListener listener);
}