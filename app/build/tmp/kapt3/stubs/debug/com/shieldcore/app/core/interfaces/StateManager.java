package com.shieldcore.app.core.interfaces;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\b\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH&J\u0010\u0010\n\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\u0005H&J\u0010\u0010\f\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u0003H&\u00a8\u0006\u000e"}, d2 = {"Lcom/shieldcore/app/core/interfaces/StateManager;", "", "getCurrentMode", "Lcom/shieldcore/app/core/interfaces/SystemMode;", "loadConfiguration", "Lcom/shieldcore/app/core/interfaces/ShieldCoreConfig;", "logActivity", "", "activity", "Lcom/shieldcore/app/core/interfaces/ActivityLog;", "saveConfiguration", "config", "setMode", "mode", "app_debug"})
public abstract interface StateManager {
    
    public abstract void setMode(@org.jetbrains.annotations.NotNull
    com.shieldcore.app.core.interfaces.SystemMode mode);
    
    @org.jetbrains.annotations.NotNull
    public abstract com.shieldcore.app.core.interfaces.SystemMode getCurrentMode();
    
    public abstract void saveConfiguration(@org.jetbrains.annotations.NotNull
    com.shieldcore.app.core.interfaces.ShieldCoreConfig config);
    
    @org.jetbrains.annotations.NotNull
    public abstract com.shieldcore.app.core.interfaces.ShieldCoreConfig loadConfiguration();
    
    public abstract void logActivity(@org.jetbrains.annotations.NotNull
    com.shieldcore.app.core.interfaces.ActivityLog activity);
}