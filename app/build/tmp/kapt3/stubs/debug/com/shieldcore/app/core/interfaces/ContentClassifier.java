package com.shieldcore.app.core.interfaces;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\bH&J\b\u0010\t\u001a\u00020\bH&J\u0016\u0010\n\u001a\u00020\u000b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\b0\rH&\u00a8\u0006\u000e"}, d2 = {"Lcom/shieldcore/app/core/interfaces/ContentClassifier;", "", "classifyImage", "Lcom/shieldcore/app/core/interfaces/ClassificationResult;", "bitmap", "Landroid/graphics/Bitmap;", "classifyText", "text", "", "getModelVersion", "updateModels", "", "modelPaths", "", "app_debug"})
public abstract interface ContentClassifier {
    
    @org.jetbrains.annotations.NotNull
    public abstract com.shieldcore.app.core.interfaces.ClassificationResult classifyText(@org.jetbrains.annotations.NotNull
    java.lang.String text);
    
    @org.jetbrains.annotations.NotNull
    public abstract com.shieldcore.app.core.interfaces.ClassificationResult classifyImage(@org.jetbrains.annotations.NotNull
    android.graphics.Bitmap bitmap);
    
    public abstract void updateModels(@org.jetbrains.annotations.NotNull
    java.util.List<java.lang.String> modelPaths);
    
    @org.jetbrains.annotations.NotNull
    public abstract java.lang.String getModelVersion();
}