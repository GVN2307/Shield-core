package com.shieldcore.app.accessibility;

@dagger.hilt.android.AndroidEntryPoint
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 \"2\u00020\u0001:\u0001\"B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001eH\u0016J\b\u0010\u001f\u001a\u00020\u001cH\u0016J\b\u0010 \u001a\u00020\u001cH\u0016J\b\u0010!\u001a\u00020\u001cH\u0014R\u001e\u0010\u0003\u001a\u00020\u00048\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001e\u0010\t\u001a\u00020\n8\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001e\u0010\u000f\u001a\u00020\u00108\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u001e\u0010\u0015\u001a\u00020\u00168\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001a\u00a8\u0006#"}, d2 = {"Lcom/shieldcore/app/accessibility/ShieldCoreAccessibilityService;", "Landroid/accessibilityservice/AccessibilityService;", "()V", "contentClassifier", "Lcom/shieldcore/app/core/interfaces/ContentClassifier;", "getContentClassifier", "()Lcom/shieldcore/app/core/interfaces/ContentClassifier;", "setContentClassifier", "(Lcom/shieldcore/app/core/interfaces/ContentClassifier;)V", "contentInterceptor", "Lcom/shieldcore/app/core/interfaces/ContentInterceptor;", "getContentInterceptor", "()Lcom/shieldcore/app/core/interfaces/ContentInterceptor;", "setContentInterceptor", "(Lcom/shieldcore/app/core/interfaces/ContentInterceptor;)V", "stateManager", "Lcom/shieldcore/app/core/interfaces/StateManager;", "getStateManager", "()Lcom/shieldcore/app/core/interfaces/StateManager;", "setStateManager", "(Lcom/shieldcore/app/core/interfaces/StateManager;)V", "uiOverlayManager", "Lcom/shieldcore/app/core/interfaces/UIOverlayManager;", "getUiOverlayManager", "()Lcom/shieldcore/app/core/interfaces/UIOverlayManager;", "setUiOverlayManager", "(Lcom/shieldcore/app/core/interfaces/UIOverlayManager;)V", "onAccessibilityEvent", "", "event", "Landroid/view/accessibility/AccessibilityEvent;", "onDestroy", "onInterrupt", "onServiceConnected", "Companion", "app_debug"})
public final class ShieldCoreAccessibilityService extends android.accessibilityservice.AccessibilityService {
    @javax.inject.Inject
    public com.shieldcore.app.core.interfaces.ContentInterceptor contentInterceptor;
    @javax.inject.Inject
    public com.shieldcore.app.core.interfaces.StateManager stateManager;
    @javax.inject.Inject
    public com.shieldcore.app.core.interfaces.ContentClassifier contentClassifier;
    @javax.inject.Inject
    public com.shieldcore.app.core.interfaces.UIOverlayManager uiOverlayManager;
    @org.jetbrains.annotations.NotNull
    private static final java.lang.String TAG = "ShieldCoreAS";
    @org.jetbrains.annotations.NotNull
    public static final com.shieldcore.app.accessibility.ShieldCoreAccessibilityService.Companion Companion = null;
    
    public ShieldCoreAccessibilityService() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.shieldcore.app.core.interfaces.ContentInterceptor getContentInterceptor() {
        return null;
    }
    
    public final void setContentInterceptor(@org.jetbrains.annotations.NotNull
    com.shieldcore.app.core.interfaces.ContentInterceptor p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.shieldcore.app.core.interfaces.StateManager getStateManager() {
        return null;
    }
    
    public final void setStateManager(@org.jetbrains.annotations.NotNull
    com.shieldcore.app.core.interfaces.StateManager p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.shieldcore.app.core.interfaces.ContentClassifier getContentClassifier() {
        return null;
    }
    
    public final void setContentClassifier(@org.jetbrains.annotations.NotNull
    com.shieldcore.app.core.interfaces.ContentClassifier p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.shieldcore.app.core.interfaces.UIOverlayManager getUiOverlayManager() {
        return null;
    }
    
    public final void setUiOverlayManager(@org.jetbrains.annotations.NotNull
    com.shieldcore.app.core.interfaces.UIOverlayManager p0) {
    }
    
    @java.lang.Override
    public void onAccessibilityEvent(@org.jetbrains.annotations.NotNull
    android.view.accessibility.AccessibilityEvent event) {
    }
    
    @java.lang.Override
    public void onInterrupt() {
    }
    
    @java.lang.Override
    protected void onServiceConnected() {
    }
    
    @java.lang.Override
    public void onDestroy() {
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0005"}, d2 = {"Lcom/shieldcore/app/accessibility/ShieldCoreAccessibilityService$Companion;", "", "()V", "TAG", "", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}