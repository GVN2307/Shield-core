package com.shieldcore.app.overlay

import android.app.Notification
import android.app.NotificationChannel
import android.app.NotificationManager
import android.content.Context
import android.content.Intent
import android.os.Build
import android.os.IBinder
import android.util.Log
import androidx.core.app.NotificationCompat
import androidx.lifecycle.LifecycleService
import com.shieldcore.app.R
import com.shieldcore.app.core.interfaces.UIOverlayManager
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject

@AndroidEntryPoint
class OverlayService : LifecycleService() {

    @Inject
    lateinit var uiOverlayManager: UIOverlayManager

    companion object {
        private const val TAG = "OverlayService"
        private const val NOTIFICATION_ID = 888
        private const val CHANNEL_ID = "ShieldCoreGuardian"
        const val ACTION_CLEAR_OVERLAYS = "com.shieldcore.app.ACTION_CLEAR_OVERLAYS"
    }

    override fun onCreate() {
        super.onCreate()
        createNotificationChannel()
        startForeground(NOTIFICATION_ID, createNotification())
    }

    private fun createNotificationChannel() {
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
            val channel = NotificationChannel(
                CHANNEL_ID,
                "ShieldCore Guardian",
                NotificationManager.IMPORTANCE_LOW
            ).apply {
                description = "ShieldCore is actively protecting your device."
            }
            val manager = getSystemService(Context.NOTIFICATION_SERVICE) as NotificationManager
            manager.createNotificationChannel(channel)
        }
    }

    private fun createNotification(): Notification {
        return NotificationCompat.Builder(this, CHANNEL_ID)
            .setContentTitle("🛡️ ShieldCore Active")
            .setContentText("Global Language Safety Engine is running.")
            .setSmallIcon(android.R.drawable.ic_lock_lock)
            .setPriority(NotificationCompat.PRIORITY_LOW)
            .setCategory(Notification.CATEGORY_SERVICE)
            .build()
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
