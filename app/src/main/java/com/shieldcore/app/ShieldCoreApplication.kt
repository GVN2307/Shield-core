package com.shieldcore.app

import android.app.Application
import dagger.hilt.android.HiltAndroidApp

@HiltAndroidApp
class ShieldCoreApplication : Application() {
    override fun onCreate() {
        super.onCreate()
        // Initialization logic will go here
    }
}
