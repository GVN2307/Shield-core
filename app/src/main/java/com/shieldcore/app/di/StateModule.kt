package com.shieldcore.app.di

import com.shieldcore.app.core.interfaces.StateManager
import com.shieldcore.app.implementation.StateManagerImpl
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
}
