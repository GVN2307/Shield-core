package com.shieldcore.app.implementation;

@javax.inject.Singleton
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\b\u0010\u0016\u001a\u00020\u0006H\u0016J\b\u0010\u0017\u001a\u00020\u0018H\u0016J\u0010\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001cH\u0016J\u0010\u0010\u001d\u001a\u00020\u001a2\u0006\u0010\u001e\u001a\u00020\u0018H\u0016J\u0010\u0010\u001f\u001a\u00020\u001a2\u0006\u0010 \u001a\u00020\u0006H\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R$\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00068B@BX\u0082\u000e\u00a2\u0006\f\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u0016\u0010\f\u001a\n \u000e*\u0004\u0018\u00010\r0\rX\u0082\u0004\u00a2\u0006\u0002\n\u0000R0\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f2\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f8B@BX\u0082\u000e\u00a2\u0006\f\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015\u00a8\u0006!"}, d2 = {"Lcom/shieldcore/app/implementation/StateManagerImpl;", "Lcom/shieldcore/app/core/interfaces/StateManager;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "value", "Lcom/shieldcore/app/core/interfaces/SystemMode;", "persistedMode", "getPersistedMode", "()Lcom/shieldcore/app/core/interfaces/SystemMode;", "setPersistedMode", "(Lcom/shieldcore/app/core/interfaces/SystemMode;)V", "prefs", "Landroid/content/SharedPreferences;", "kotlin.jvm.PlatformType", "", "", "targetApps", "getTargetApps", "()Ljava/util/List;", "setTargetApps", "(Ljava/util/List;)V", "getCurrentMode", "loadConfiguration", "Lcom/shieldcore/app/core/interfaces/ShieldCoreConfig;", "logActivity", "", "activity", "Lcom/shieldcore/app/core/interfaces/ActivityLog;", "saveConfiguration", "config", "setMode", "mode", "app_debug"})
public final class StateManagerImpl implements com.shieldcore.app.core.interfaces.StateManager {
    @org.jetbrains.annotations.NotNull
    private final android.content.Context context = null;
    private final android.content.SharedPreferences prefs = null;
    
    @javax.inject.Inject
    public StateManagerImpl(@dagger.hilt.android.qualifiers.ApplicationContext
    @org.jetbrains.annotations.NotNull
    android.content.Context context) {
        super();
    }
    
    private final com.shieldcore.app.core.interfaces.SystemMode getPersistedMode() {
        return null;
    }
    
    private final void setPersistedMode(com.shieldcore.app.core.interfaces.SystemMode value) {
    }
    
    private final java.util.List<java.lang.String> getTargetApps() {
        return null;
    }
    
    private final void setTargetApps(java.util.List<java.lang.String> value) {
    }
    
    @java.lang.Override
    public void setMode(@org.jetbrains.annotations.NotNull
    com.shieldcore.app.core.interfaces.SystemMode mode) {
    }
    
    @java.lang.Override
    @org.jetbrains.annotations.NotNull
    public com.shieldcore.app.core.interfaces.SystemMode getCurrentMode() {
        return null;
    }
    
    @java.lang.Override
    public void saveConfiguration(@org.jetbrains.annotations.NotNull
    com.shieldcore.app.core.interfaces.ShieldCoreConfig config) {
    }
    
    @java.lang.Override
    @org.jetbrains.annotations.NotNull
    public com.shieldcore.app.core.interfaces.ShieldCoreConfig loadConfiguration() {
        return null;
    }
    
    @java.lang.Override
    public void logActivity(@org.jetbrains.annotations.NotNull
    com.shieldcore.app.core.interfaces.ActivityLog activity) {
    }
}