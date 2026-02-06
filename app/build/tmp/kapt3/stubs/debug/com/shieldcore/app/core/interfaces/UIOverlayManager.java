package com.shieldcore.app.core.interfaces;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\u0018\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH&J\u0010\u0010\n\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\u0005H&J\u0018\u0010\f\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\u0007H&\u00a8\u0006\u000e"}, d2 = {"Lcom/shieldcore/app/core/interfaces/UIOverlayManager;", "", "clearAllOverlays", "", "createOverlay", "", "bounds", "Landroid/graphics/Rect;", "content", "Lcom/shieldcore/app/core/interfaces/ContentData;", "removeOverlay", "overlayId", "updateOverlayPosition", "newBounds", "app_debug"})
public abstract interface UIOverlayManager {
    
    @org.jetbrains.annotations.NotNull
    public abstract java.lang.String createOverlay(@org.jetbrains.annotations.NotNull
    android.graphics.Rect bounds, @org.jetbrains.annotations.NotNull
    com.shieldcore.app.core.interfaces.ContentData content);
    
    public abstract void removeOverlay(@org.jetbrains.annotations.NotNull
    java.lang.String overlayId);
    
    public abstract void updateOverlayPosition(@org.jetbrains.annotations.NotNull
    java.lang.String overlayId, @org.jetbrains.annotations.NotNull
    android.graphics.Rect newBounds);
    
    public abstract void clearAllOverlays();
}