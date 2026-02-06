package com.shieldcore.app.di

import com.shieldcore.app.core.interfaces.ContentInterceptor
import com.shieldcore.app.core.interfaces.ContentClassifier
import com.shieldcore.app.core.interfaces.FaceAuthenticator
import com.shieldcore.app.core.interfaces.StateManager
import com.shieldcore.app.core.interfaces.UIOverlayManager
import com.shieldcore.app.implementation.ContentInterceptorImpl
import com.shieldcore.app.implementation.ContentClassifierImpl
import com.shieldcore.app.implementation.FaceAuthenticatorImpl
import com.shieldcore.app.implementation.StateManagerImpl
import com.shieldcore.app.implementation.UIOverlayManagerImpl
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
abstract class StateModule {
    @Binds
    @Singleton
    abstract fun bindStateManager(stateManagerImpl: StateManagerImpl): StateManager

    @Binds
    @Singleton
    abstract fun bindContentInterceptor(contentInterceptorImpl: ContentInterceptorImpl): ContentInterceptor

    @Binds
    @Singleton
    abstract fun bindUIOverlayManager(uiOverlayManagerImpl: UIOverlayManagerImpl): UIOverlayManager

    @Binds
    @Singleton
    abstract fun bindContentClassifier(contentClassifierImpl: ContentClassifierImpl): ContentClassifier

    @Binds
    @Singleton
    abstract fun bindFaceAuthenticator(faceAuthenticatorImpl: FaceAuthenticatorImpl): FaceAuthenticator
}
