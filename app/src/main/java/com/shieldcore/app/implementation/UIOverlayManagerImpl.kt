package com.shieldcore.app.implementation

import android.content.Context
import android.graphics.PixelFormat
import android.graphics.Rect
import android.os.Build
import android.util.Log
import android.view.Gravity
import android.view.WindowManager
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.ComposeView
import androidx.compose.ui.unit.sp
import androidx.lifecycle.Lifecycle
import androidx.lifecycle.LifecycleOwner
import androidx.lifecycle.LifecycleRegistry
import androidx.lifecycle.ViewModelStore
import androidx.lifecycle.ViewModelStoreOwner
import androidx.lifecycle.setViewTreeLifecycleOwner
import androidx.lifecycle.setViewTreeViewModelStoreOwner
import androidx.savedstate.SavedStateRegistry
import androidx.savedstate.SavedStateRegistryController
import androidx.savedstate.SavedStateRegistryOwner
import androidx.savedstate.setViewTreeSavedStateRegistryOwner
import com.shieldcore.app.core.interfaces.ContentData
import com.shieldcore.app.core.interfaces.UIOverlayManager
import dagger.hilt.android.qualifiers.ApplicationContext
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class UIOverlayManagerImpl @Inject constructor(
    @ApplicationContext private val context: Context
) : UIOverlayManager {

    private val windowManager = context.getSystemService(Context.WINDOW_SERVICE) as WindowManager
    private val activeOverlays = mutableMapOf<String, ComposeView>()
    private val lifecycleOwners = mutableMapOf<String, FunctionalLifecycleOwner>()

    private class FunctionalLifecycleOwner : LifecycleOwner, ViewModelStoreOwner, SavedStateRegistryOwner {
        private val lifecycleRegistry = LifecycleRegistry(this)
        private val store = ViewModelStore()
        private val controller = SavedStateRegistryController.create(this)

        init {
            controller.performRestore(null)
        }

        override val lifecycle: Lifecycle = lifecycleRegistry
        override val viewModelStore: ViewModelStore = store
        override val savedStateRegistry: SavedStateRegistry = controller.savedStateRegistry

        fun handleLifecycleEvent(event: Lifecycle.Event) {
            lifecycleRegistry.handleLifecycleEvent(event)
        }

        fun clear() {
            handleLifecycleEvent(Lifecycle.Event.ON_DESTROY)
            store.clear()
        }
    }

    override fun createOverlay(bounds: Rect, content: ContentData): String {
        val overlayId = java.util.UUID.randomUUID().toString()
        
        val composeView = ComposeView(context).apply {
            setContent {
                BlockerOverlayUI()
            }
        }

        if (!android.provider.Settings.canDrawOverlays(context)) {
            Log.e("ShieldOverlay", "Cannot create overlay: SYSTEM_ALERT_WINDOW permission not granted")
            return ""
        }

        val lifecycleOwner = FunctionalLifecycleOwner()
        lifecycleOwner.handleLifecycleEvent(Lifecycle.Event.ON_CREATE)
        lifecycleOwner.handleLifecycleEvent(Lifecycle.Event.ON_START)
        lifecycleOwner.handleLifecycleEvent(Lifecycle.Event.ON_RESUME)
        
        composeView.setViewTreeLifecycleOwner(lifecycleOwner)
        composeView.setViewTreeViewModelStoreOwner(lifecycleOwner)
        composeView.setViewTreeSavedStateRegistryOwner(lifecycleOwner)
        
        lifecycleOwners[overlayId] = lifecycleOwner

        val params = WindowManager.LayoutParams(
            bounds.width(),
            bounds.height(),
            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
                WindowManager.LayoutParams.TYPE_APPLICATION_OVERLAY
            } else {
                @Suppress("DEPRECATION")
                WindowManager.LayoutParams.TYPE_PHONE
            },
            WindowManager.LayoutParams.FLAG_NOT_FOCUSABLE or 
            WindowManager.LayoutParams.FLAG_LAYOUT_IN_SCREEN or 
            WindowManager.LayoutParams.FLAG_WATCH_OUTSIDE_TOUCH or
            WindowManager.LayoutParams.FLAG_HARDWARE_ACCELERATED,
            PixelFormat.TRANSLUCENT
        ).apply {
            gravity = Gravity.TOP or Gravity.START
            x = bounds.left
            y = bounds.top
        }

        try {
            windowManager.addView(composeView, params)
            activeOverlays[overlayId] = composeView
            return overlayId
        } catch (e: Exception) {
            Log.e("ShieldOverlay", "Critical error adding view: ${e.message}")
            lifecycleOwner.clear()
            lifecycleOwners.remove(overlayId)
            return ""
        }
    }

    override fun removeOverlay(overlayId: String) {
        activeOverlays[overlayId]?.let {
            try {
                windowManager.removeView(it)
            } catch (e: Exception) {
                Log.e("ShieldOverlay", "Error removing view: ${e.message}")
            }
            activeOverlays.remove(overlayId)
        }
        lifecycleOwners[overlayId]?.let {
            it.clear() // Explicitly destroy lifecycle and clear ViewModels
            lifecycleOwners.remove(overlayId)
        }
    }

    override fun updateOverlayPosition(overlayId: String, newBounds: Rect) {
        activeOverlays[overlayId]?.let {
            val params = it.layoutParams as WindowManager.LayoutParams
            params.x = newBounds.left
            params.y = newBounds.top
            params.width = newBounds.width()
            params.height = newBounds.height()
            windowManager.updateViewLayout(it, params)
        }
    }

    override fun clearAllOverlays() {
        activeOverlays.values.forEach { 
            try {
                windowManager.removeView(it)
            } catch (e: Exception) {
                // Ignore if view not attached
            }
        }
        activeOverlays.clear()
    }

    @Composable
    private fun BlockerOverlayUI() {
        Box(
            modifier = Modifier
                .fillMaxSize()
                .background(Color.Black.copy(alpha = 0.95f))
        ) {
            Text(
                text = "🛡️ Blocked",
                color = Color.White,
                fontSize = 10.sp,
                modifier = Modifier.background(Color.Red.copy(alpha = 0.8f))
            )
        }
    }
}
