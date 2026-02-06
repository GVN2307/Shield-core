package com.shieldcore.app.di;

@dagger.Module
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\'\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\'J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\'J\u0010\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\'J\u0010\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012H\'J\u0010\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0016H\'\u00a8\u0006\u0017"}, d2 = {"Lcom/shieldcore/app/di/StateModule;", "", "()V", "bindContentClassifier", "Lcom/shieldcore/app/core/interfaces/ContentClassifier;", "contentClassifierImpl", "Lcom/shieldcore/app/implementation/ContentClassifierImpl;", "bindContentInterceptor", "Lcom/shieldcore/app/core/interfaces/ContentInterceptor;", "contentInterceptorImpl", "Lcom/shieldcore/app/implementation/ContentInterceptorImpl;", "bindFaceAuthenticator", "Lcom/shieldcore/app/core/interfaces/FaceAuthenticator;", "faceAuthenticatorImpl", "Lcom/shieldcore/app/implementation/FaceAuthenticatorImpl;", "bindStateManager", "Lcom/shieldcore/app/core/interfaces/StateManager;", "stateManagerImpl", "Lcom/shieldcore/app/implementation/StateManagerImpl;", "bindUIOverlayManager", "Lcom/shieldcore/app/core/interfaces/UIOverlayManager;", "uiOverlayManagerImpl", "Lcom/shieldcore/app/implementation/UIOverlayManagerImpl;", "app_debug"})
@dagger.hilt.InstallIn(value = {dagger.hilt.components.SingletonComponent.class})
public abstract class StateModule {
    
    public StateModule() {
        super();
    }
    
    @dagger.Binds
    @javax.inject.Singleton
    @org.jetbrains.annotations.NotNull
    public abstract com.shieldcore.app.core.interfaces.StateManager bindStateManager(@org.jetbrains.annotations.NotNull
    com.shieldcore.app.implementation.StateManagerImpl stateManagerImpl);
    
    @dagger.Binds
    @javax.inject.Singleton
    @org.jetbrains.annotations.NotNull
    public abstract com.shieldcore.app.core.interfaces.ContentInterceptor bindContentInterceptor(@org.jetbrains.annotations.NotNull
    com.shieldcore.app.implementation.ContentInterceptorImpl contentInterceptorImpl);
    
    @dagger.Binds
    @javax.inject.Singleton
    @org.jetbrains.annotations.NotNull
    public abstract com.shieldcore.app.core.interfaces.UIOverlayManager bindUIOverlayManager(@org.jetbrains.annotations.NotNull
    com.shieldcore.app.implementation.UIOverlayManagerImpl uiOverlayManagerImpl);
    
    @dagger.Binds
    @javax.inject.Singleton
    @org.jetbrains.annotations.NotNull
    public abstract com.shieldcore.app.core.interfaces.ContentClassifier bindContentClassifier(@org.jetbrains.annotations.NotNull
    com.shieldcore.app.implementation.ContentClassifierImpl contentClassifierImpl);
    
    @dagger.Binds
    @javax.inject.Singleton
    @org.jetbrains.annotations.NotNull
    public abstract com.shieldcore.app.core.interfaces.FaceAuthenticator bindFaceAuthenticator(@org.jetbrains.annotations.NotNull
    com.shieldcore.app.implementation.FaceAuthenticatorImpl faceAuthenticatorImpl);
}