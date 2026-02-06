package com.shieldcore.app.overlay

import android.content.Intent
import android.os.IBinder
import android.util.Log
import androidx.lifecycle.LifecycleService
import com.shieldcore.app.core.interfaces.UIOverlayManager
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject

@AndroidEntryPoint
class OverlayService : LifecycleService() {

    @Inject
    lateinit var uiOverlayManager: UIOverlayManager

    companion object {
        private const val TAG = "OverlayService"
        const val ACTION_CLEAR_OVERLAYS = "com.shieldcore.app.ACTION_CLEAR_OVERLAYS"
    }

    override fun onBind(intent: Intent): IBinder? {
        super.onBind(intent)
        return null
    }

    override fun onStartCommand(intent: Intent?, flags: Int, startId: Int): Int {
        super.onStartCommand(intent, flags, startId)
        Log.d(TAG, "Overlay Service Start Command: ${intent?.action}")
        
        when (intent?.action) {
            ACTION_CLEAR_OVERLAYS -> {
                uiOverlayManager.clearAllOverlays()
            }
        }
        
        return START_STICKY
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d(TAG, "Overlay Service Destroyed")
        uiOverlayManager.clearAllOverlays()
    }
}
