package com.shieldcore.app.implementation;

@javax.inject.Singleton
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0007\b\u0007\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0007\u001a\u00020\u0006H\u0016J\b\u0010\b\u001a\u00020\u0004H\u0016J\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0016J\u0010\u0010\r\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u0004H\u0016J\u0010\u0010\u000e\u001a\u00020\n2\u0006\u0010\u000f\u001a\u00020\u0006H\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0010"}, d2 = {"Lcom/shieldcore/app/implementation/StateManagerImpl;", "Lcom/shieldcore/app/core/interfaces/StateManager;", "()V", "config", "Lcom/shieldcore/app/core/interfaces/ShieldCoreConfig;", "currentMode", "Lcom/shieldcore/app/core/interfaces/SystemMode;", "getCurrentMode", "loadConfiguration", "logActivity", "", "activity", "Lcom/shieldcore/app/core/interfaces/ActivityLog;", "saveConfiguration", "setMode", "mode", "app_debug"})
public final class StateManagerImpl implements com.shieldcore.app.core.interfaces.StateManager {
    @org.jetbrains.annotations.NotNull
    private com.shieldcore.app.core.interfaces.SystemMode currentMode = com.shieldcore.app.core.interfaces.SystemMode.GUARDIAN_MODE;
    @org.jetbrains.annotations.NotNull
    private com.shieldcore.app.core.interfaces.ShieldCoreConfig config;
    
    @javax.inject.Inject
    public StateManagerImpl() {
        super();
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