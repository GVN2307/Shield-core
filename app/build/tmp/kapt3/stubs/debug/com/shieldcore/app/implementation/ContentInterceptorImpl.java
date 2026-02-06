package com.shieldcore.app.implementation;

@javax.inject.Singleton
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 \u001a2\u00020\u0001:\u0001\u001aB\u0007\b\u0007\u00a2\u0006\u0002\u0010\u0002J\u0016\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\t2\u0006\u0010\r\u001a\u00020\u000eH\u0016J\u0010\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0007H\u0016J\u0016\u0010\u0012\u001a\u00020\u00102\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\n0\tH\u0016J\b\u0010\u0014\u001a\u00020\u0010H\u0016J&\u0010\u0015\u001a\u00020\u00102\u0006\u0010\u0016\u001a\u00020\u00172\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\f0\u00062\u0006\u0010\u0019\u001a\u00020\nH\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\tX\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001b"}, d2 = {"Lcom/shieldcore/app/implementation/ContentInterceptorImpl;", "Lcom/shieldcore/app/core/interfaces/ContentInterceptor;", "()V", "isMonitoring", "", "listeners", "", "Lcom/shieldcore/app/core/interfaces/ContentListener;", "monitoringPackages", "", "", "onAccessibilityEvent", "Lcom/shieldcore/app/core/interfaces/ContentData;", "event", "Landroid/view/accessibility/AccessibilityEvent;", "registerContentListener", "", "listener", "startMonitoring", "targetPackages", "stopMonitoring", "traverseNode", "node", "Landroid/view/accessibility/AccessibilityNodeInfo;", "results", "packageName", "Companion", "app_debug"})
public final class ContentInterceptorImpl implements com.shieldcore.app.core.interfaces.ContentInterceptor {
    @org.jetbrains.annotations.NotNull
    private java.util.List<java.lang.String> monitoringPackages;
    @org.jetbrains.annotations.NotNull
    private final java.util.List<com.shieldcore.app.core.interfaces.ContentListener> listeners = null;
    private boolean isMonitoring = false;
    @org.jetbrains.annotations.NotNull
    private static final java.lang.String TAG = "ContentInterceptor";
    @org.jetbrains.annotations.NotNull
    public static final com.shieldcore.app.implementation.ContentInterceptorImpl.Companion Companion = null;
    
    @javax.inject.Inject
    public ContentInterceptorImpl() {
        super();
    }
    
    @java.lang.Override
    public void startMonitoring(@org.jetbrains.annotations.NotNull
    java.util.List<java.lang.String> targetPackages) {
    }
    
    @java.lang.Override
    public void stopMonitoring() {
    }
    
    @java.lang.Override
    @org.jetbrains.annotations.NotNull
    public java.util.List<com.shieldcore.app.core.interfaces.ContentData> onAccessibilityEvent(@org.jetbrains.annotations.NotNull
    android.view.accessibility.AccessibilityEvent event) {
        return null;
    }
    
    @java.lang.Override
    public void registerContentListener(@org.jetbrains.annotations.NotNull
    com.shieldcore.app.core.interfaces.ContentListener listener) {
    }
    
    private final void traverseNode(android.view.accessibility.AccessibilityNodeInfo node, java.util.List<com.shieldcore.app.core.interfaces.ContentData> results, java.lang.String packageName) {
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0005"}, d2 = {"Lcom/shieldcore/app/implementation/ContentInterceptorImpl$Companion;", "", "()V", "TAG", "", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}