package com.shieldcore.app.implementation;

@javax.inject.Singleton
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0010%\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000 \u00192\u00020\u0001:\u0001\u0019B\u0019\b\u0007\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0010\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012H\u0016J\u0010\u0010\u0013\u001a\u00020\u00102\u0006\u0010\u0014\u001a\u00020\tH\u0016J\b\u0010\u0015\u001a\u00020\tH\u0016J\u0016\u0010\u0016\u001a\u00020\u00172\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R \u0010\n\u001a\u0014\u0012\u0004\u0012\u00020\t\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b0\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\tX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010\r\u001a\u0004\u0018\u00010\u000eX\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001a"}, d2 = {"Lcom/shieldcore/app/implementation/ContentClassifierImpl;", "Lcom/shieldcore/app/core/interfaces/ContentClassifier;", "context", "Landroid/content/Context;", "networkService", "Lcom/shieldcore/app/implementation/NetworkModerationService;", "(Landroid/content/Context;Lcom/shieldcore/app/implementation/NetworkModerationService;)V", "globalAdultKeywords", "", "", "globalSafetyEngine", "", "modelVersion", "tfliteInterpreter", "Lorg/tensorflow/lite/Interpreter;", "classifyImage", "Lcom/shieldcore/app/core/interfaces/ClassificationResult;", "bitmap", "Landroid/graphics/Bitmap;", "classifyText", "text", "getModelVersion", "updateModels", "", "modelPaths", "Companion", "app_debug"})
public final class ContentClassifierImpl implements com.shieldcore.app.core.interfaces.ContentClassifier {
    @org.jetbrains.annotations.NotNull
    private final android.content.Context context = null;
    @org.jetbrains.annotations.NotNull
    private final com.shieldcore.app.implementation.NetworkModerationService networkService = null;
    @org.jetbrains.annotations.Nullable
    private org.tensorflow.lite.Interpreter tfliteInterpreter;
    @org.jetbrains.annotations.NotNull
    private java.lang.String modelVersion = "1.0.0-tflite-core";
    @org.jetbrains.annotations.NotNull
    private final java.util.Map<java.lang.String, java.util.List<java.lang.String>> globalSafetyEngine = null;
    @org.jetbrains.annotations.NotNull
    private final java.util.List<java.lang.String> globalAdultKeywords = null;
    @org.jetbrains.annotations.NotNull
    private static final java.lang.String TAG = "ContentClassifier";
    @org.jetbrains.annotations.NotNull
    private static final java.lang.String MODEL_FILENAME = "content_moderation_v1.tflite";
    @org.jetbrains.annotations.NotNull
    public static final com.shieldcore.app.implementation.ContentClassifierImpl.Companion Companion = null;
    
    @javax.inject.Inject
    public ContentClassifierImpl(@dagger.hilt.android.qualifiers.ApplicationContext
    @org.jetbrains.annotations.NotNull
    android.content.Context context, @org.jetbrains.annotations.NotNull
    com.shieldcore.app.implementation.NetworkModerationService networkService) {
        super();
    }
    
    @java.lang.Override
    @org.jetbrains.annotations.NotNull
    public com.shieldcore.app.core.interfaces.ClassificationResult classifyText(@org.jetbrains.annotations.NotNull
    java.lang.String text) {
        return null;
    }
    
    @java.lang.Override
    @org.jetbrains.annotations.NotNull
    public com.shieldcore.app.core.interfaces.ClassificationResult classifyImage(@org.jetbrains.annotations.NotNull
    android.graphics.Bitmap bitmap) {
        return null;
    }
    
    @java.lang.Override
    public void updateModels(@org.jetbrains.annotations.NotNull
    java.util.List<java.lang.String> modelPaths) {
    }
    
    @java.lang.Override
    @org.jetbrains.annotations.NotNull
    public java.lang.String getModelVersion() {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0006"}, d2 = {"Lcom/shieldcore/app/implementation/ContentClassifierImpl$Companion;", "", "()V", "MODEL_FILENAME", "", "TAG", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}