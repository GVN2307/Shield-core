package com.shieldcore.app.implementation;

@javax.inject.Singleton
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0007\u0018\u0000 \u00152\u00020\u0001:\u0001\u0015B\u0011\b\u0007\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0016J\u0010\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\fH\u0016J\b\u0010\u000f\u001a\u00020\u0010H\u0016J\u0010\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0014H\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0016"}, d2 = {"Lcom/shieldcore/app/implementation/FaceAuthenticatorImpl;", "Lcom/shieldcore/app/core/interfaces/FaceAuthenticator;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "detector", "Lcom/google/mlkit/vision/face/FaceDetector;", "detectorOptions", "Lcom/google/mlkit/vision/face/FaceDetectorOptions;", "authenticateParent", "Lcom/shieldcore/app/core/interfaces/AuthenticationResult;", "bitmap", "Landroid/graphics/Bitmap;", "enrollParentFace", "Lcom/shieldcore/app/core/interfaces/EnrollmentResult;", "isAuthenticationEnabled", "", "removeParentFace", "", "faceId", "", "Companion", "app_debug"})
public final class FaceAuthenticatorImpl implements com.shieldcore.app.core.interfaces.FaceAuthenticator {
    @org.jetbrains.annotations.NotNull
    private final android.content.Context context = null;
    @org.jetbrains.annotations.NotNull
    private final com.google.mlkit.vision.face.FaceDetectorOptions detectorOptions = null;
    @org.jetbrains.annotations.NotNull
    private final com.google.mlkit.vision.face.FaceDetector detector = null;
    @org.jetbrains.annotations.NotNull
    private static final java.lang.String TAG = "FaceAuthenticator";
    @org.jetbrains.annotations.NotNull
    public static final com.shieldcore.app.implementation.FaceAuthenticatorImpl.Companion Companion = null;
    
    @javax.inject.Inject
    public FaceAuthenticatorImpl(@dagger.hilt.android.qualifiers.ApplicationContext
    @org.jetbrains.annotations.NotNull
    android.content.Context context) {
        super();
    }
    
    @java.lang.Override
    @org.jetbrains.annotations.NotNull
    public com.shieldcore.app.core.interfaces.EnrollmentResult enrollParentFace(@org.jetbrains.annotations.NotNull
    android.graphics.Bitmap bitmap) {
        return null;
    }
    
    @java.lang.Override
    @org.jetbrains.annotations.NotNull
    public com.shieldcore.app.core.interfaces.AuthenticationResult authenticateParent(@org.jetbrains.annotations.NotNull
    android.graphics.Bitmap bitmap) {
        return null;
    }
    
    @java.lang.Override
    public void removeParentFace(@org.jetbrains.annotations.NotNull
    java.lang.String faceId) {
    }
    
    @java.lang.Override
    public boolean isAuthenticationEnabled() {
        return false;
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0005"}, d2 = {"Lcom/shieldcore/app/implementation/FaceAuthenticatorImpl$Companion;", "", "()V", "TAG", "", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}