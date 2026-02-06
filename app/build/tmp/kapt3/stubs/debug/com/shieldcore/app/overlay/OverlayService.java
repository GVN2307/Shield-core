package com.shieldcore.app.overlay;

@dagger.hilt.android.AndroidEntryPoint
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00172\u00020\u0001:\u0001\u0017B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\t\u001a\u00020\nH\u0002J\b\u0010\u000b\u001a\u00020\fH\u0002J\u0012\u0010\r\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0016J\b\u0010\u0011\u001a\u00020\fH\u0016J\b\u0010\u0012\u001a\u00020\fH\u0016J\"\u0010\u0013\u001a\u00020\u00142\b\u0010\u000f\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u0014H\u0016R\u001e\u0010\u0003\u001a\u00020\u00048\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b\u00a8\u0006\u0018"}, d2 = {"Lcom/shieldcore/app/overlay/OverlayService;", "Landroidx/lifecycle/LifecycleService;", "()V", "uiOverlayManager", "Lcom/shieldcore/app/core/interfaces/UIOverlayManager;", "getUiOverlayManager", "()Lcom/shieldcore/app/core/interfaces/UIOverlayManager;", "setUiOverlayManager", "(Lcom/shieldcore/app/core/interfaces/UIOverlayManager;)V", "createNotification", "Landroid/app/Notification;", "createNotificationChannel", "", "onBind", "Landroid/os/IBinder;", "intent", "Landroid/content/Intent;", "onCreate", "onDestroy", "onStartCommand", "", "flags", "startId", "Companion", "app_debug"})
public final class OverlayService extends androidx.lifecycle.LifecycleService {
    @javax.inject.Inject
    public com.shieldcore.app.core.interfaces.UIOverlayManager uiOverlayManager;
    @org.jetbrains.annotations.NotNull
    private static final java.lang.String TAG = "OverlayService";
    private static final int NOTIFICATION_ID = 888;
    @org.jetbrains.annotations.NotNull
    private static final java.lang.String CHANNEL_ID = "ShieldCoreGuardian";
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String ACTION_CLEAR_OVERLAYS = "com.shieldcore.app.ACTION_CLEAR_OVERLAYS";
    @org.jetbrains.annotations.NotNull
    public static final com.shieldcore.app.overlay.OverlayService.Companion Companion = null;
    
    public OverlayService() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.shieldcore.app.core.interfaces.UIOverlayManager getUiOverlayManager() {
        return null;
    }
    
    public final void setUiOverlayManager(@org.jetbrains.annotations.NotNull
    com.shieldcore.app.core.interfaces.UIOverlayManager p0) {
    }
    
    @java.lang.Override
    public void onCreate() {
    }
    
    private final void createNotificationChannel() {
    }
    
    private final android.app.Notification createNotification() {
        return null;
    }
    
    @java.lang.Override
    @org.jetbrains.annotations.Nullable
    public android.os.IBinder onBind(@org.jetbrains.annotations.NotNull
    android.content.Intent intent) {
        return null;
    }
    
    @java.lang.Override
    public int onStartCommand(@org.jetbrains.annotations.Nullable
    android.content.Intent intent, int flags, int startId) {
        return 0;
    }
    
    @java.lang.Override
    public void onDestroy() {
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\t"}, d2 = {"Lcom/shieldcore/app/overlay/OverlayService$Companion;", "", "()V", "ACTION_CLEAR_OVERLAYS", "", "CHANNEL_ID", "NOTIFICATION_ID", "", "TAG", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}