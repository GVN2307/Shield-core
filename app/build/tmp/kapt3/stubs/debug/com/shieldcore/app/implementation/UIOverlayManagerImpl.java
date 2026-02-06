package com.shieldcore.app.implementation;

@javax.inject.Singleton
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0019B\u0011\b\u0007\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\b\u0010\r\u001a\u00020\u000eH\u0003J\b\u0010\u000f\u001a\u00020\u000eH\u0016J\u0018\u0010\u0010\u001a\u00020\u00072\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0014H\u0016J\u0010\u0010\u0015\u001a\u00020\u000e2\u0006\u0010\u0016\u001a\u00020\u0007H\u0016J\u0018\u0010\u0017\u001a\u00020\u000e2\u0006\u0010\u0016\u001a\u00020\u00072\u0006\u0010\u0018\u001a\u00020\u0012H\u0016R\u001a\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\n0\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001a"}, d2 = {"Lcom/shieldcore/app/implementation/UIOverlayManagerImpl;", "Lcom/shieldcore/app/core/interfaces/UIOverlayManager;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "activeOverlays", "", "", "Landroidx/compose/ui/platform/ComposeView;", "lifecycleOwners", "Lcom/shieldcore/app/implementation/UIOverlayManagerImpl$FunctionalLifecycleOwner;", "windowManager", "Landroid/view/WindowManager;", "BlockerOverlayUI", "", "clearAllOverlays", "createOverlay", "bounds", "Landroid/graphics/Rect;", "content", "Lcom/shieldcore/app/core/interfaces/ContentData;", "removeOverlay", "overlayId", "updateOverlayPosition", "newBounds", "FunctionalLifecycleOwner", "app_debug"})
public final class UIOverlayManagerImpl implements com.shieldcore.app.core.interfaces.UIOverlayManager {
    @org.jetbrains.annotations.NotNull
    private final android.content.Context context = null;
    @org.jetbrains.annotations.NotNull
    private final android.view.WindowManager windowManager = null;
    @org.jetbrains.annotations.NotNull
    private final java.util.Map<java.lang.String, androidx.compose.ui.platform.ComposeView> activeOverlays = null;
    @org.jetbrains.annotations.NotNull
    private final java.util.Map<java.lang.String, com.shieldcore.app.implementation.UIOverlayManagerImpl.FunctionalLifecycleOwner> lifecycleOwners = null;
    
    @javax.inject.Inject
    public UIOverlayManagerImpl(@dagger.hilt.android.qualifiers.ApplicationContext
    @org.jetbrains.annotations.NotNull
    android.content.Context context) {
        super();
    }
    
    @java.lang.Override
    @org.jetbrains.annotations.NotNull
    public java.lang.String createOverlay(@org.jetbrains.annotations.NotNull
    android.graphics.Rect bounds, @org.jetbrains.annotations.NotNull
    com.shieldcore.app.core.interfaces.ContentData content) {
        return null;
    }
    
    @java.lang.Override
    public void removeOverlay(@org.jetbrains.annotations.NotNull
    java.lang.String overlayId) {
    }
    
    @java.lang.Override
    public void updateOverlayPosition(@org.jetbrains.annotations.NotNull
    java.lang.String overlayId, @org.jetbrains.annotations.NotNull
    android.graphics.Rect newBounds) {
    }
    
    @java.lang.Override
    public void clearAllOverlays() {
    }
    
    @androidx.compose.runtime.Composable
    private final void BlockerOverlayUI() {
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u0005\u00a2\u0006\u0002\u0010\u0004J\u0006\u0010\u0016\u001a\u00020\u0017J\u000e\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0019\u001a\u00020\u001aR\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\r\u001a\u00020\u000eX\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u000e\u0010\u0011\u001a\u00020\u0012X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0013\u001a\u00020\u0012X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015\u00a8\u0006\u001b"}, d2 = {"Lcom/shieldcore/app/implementation/UIOverlayManagerImpl$FunctionalLifecycleOwner;", "Landroidx/lifecycle/LifecycleOwner;", "Landroidx/lifecycle/ViewModelStoreOwner;", "Landroidx/savedstate/SavedStateRegistryOwner;", "()V", "controller", "Landroidx/savedstate/SavedStateRegistryController;", "lifecycle", "Landroidx/lifecycle/Lifecycle;", "getLifecycle", "()Landroidx/lifecycle/Lifecycle;", "lifecycleRegistry", "Landroidx/lifecycle/LifecycleRegistry;", "savedStateRegistry", "Landroidx/savedstate/SavedStateRegistry;", "getSavedStateRegistry", "()Landroidx/savedstate/SavedStateRegistry;", "store", "Landroidx/lifecycle/ViewModelStore;", "viewModelStore", "getViewModelStore", "()Landroidx/lifecycle/ViewModelStore;", "clear", "", "handleLifecycleEvent", "event", "Landroidx/lifecycle/Lifecycle$Event;", "app_debug"})
    static final class FunctionalLifecycleOwner implements androidx.lifecycle.LifecycleOwner, androidx.lifecycle.ViewModelStoreOwner, androidx.savedstate.SavedStateRegistryOwner {
        @org.jetbrains.annotations.NotNull
        private final androidx.lifecycle.LifecycleRegistry lifecycleRegistry = null;
        @org.jetbrains.annotations.NotNull
        private final androidx.lifecycle.ViewModelStore store = null;
        @org.jetbrains.annotations.NotNull
        private final androidx.savedstate.SavedStateRegistryController controller = null;
        @org.jetbrains.annotations.NotNull
        private final androidx.lifecycle.Lifecycle lifecycle = null;
        @org.jetbrains.annotations.NotNull
        private final androidx.lifecycle.ViewModelStore viewModelStore = null;
        @org.jetbrains.annotations.NotNull
        private final androidx.savedstate.SavedStateRegistry savedStateRegistry = null;
        
        public FunctionalLifecycleOwner() {
            super();
        }
        
        @java.lang.Override
        @org.jetbrains.annotations.NotNull
        public androidx.lifecycle.Lifecycle getLifecycle() {
            return null;
        }
        
        @java.lang.Override
        @org.jetbrains.annotations.NotNull
        public androidx.lifecycle.ViewModelStore getViewModelStore() {
            return null;
        }
        
        @java.lang.Override
        @org.jetbrains.annotations.NotNull
        public androidx.savedstate.SavedStateRegistry getSavedStateRegistry() {
            return null;
        }
        
        public final void handleLifecycleEvent(@org.jetbrains.annotations.NotNull
        androidx.lifecycle.Lifecycle.Event event) {
        }
        
        public final void clear() {
        }
    }
}