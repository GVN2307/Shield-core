package com.shieldcore.app.core.interfaces;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u0005H&J\b\u0010\b\u001a\u00020\tH&J\u0010\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH&\u00a8\u0006\u000e"}, d2 = {"Lcom/shieldcore/app/core/interfaces/FaceAuthenticator;", "", "authenticateParent", "Lcom/shieldcore/app/core/interfaces/AuthenticationResult;", "bitmap", "Landroid/graphics/Bitmap;", "enrollParentFace", "Lcom/shieldcore/app/core/interfaces/EnrollmentResult;", "isAuthenticationEnabled", "", "removeParentFace", "", "faceId", "", "app_debug"})
public abstract interface FaceAuthenticator {
    
    @org.jetbrains.annotations.NotNull
    public abstract com.shieldcore.app.core.interfaces.EnrollmentResult enrollParentFace(@org.jetbrains.annotations.NotNull
    android.graphics.Bitmap bitmap);
    
    @org.jetbrains.annotations.NotNull
    public abstract com.shieldcore.app.core.interfaces.AuthenticationResult authenticateParent(@org.jetbrains.annotations.NotNull
    android.graphics.Bitmap bitmap);
    
    public abstract void removeParentFace(@org.jetbrains.annotations.NotNull
    java.lang.String faceId);
    
    public abstract boolean isAuthenticationEnabled();
}