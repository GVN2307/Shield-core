package com.shieldcore.app.ui

import android.os.Bundle
import android.content.Context
import android.content.Intent
import android.os.Build
import android.provider.Settings
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.CheckCircle
import androidx.compose.material.icons.filled.Warning
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.unit.dp
import androidx.core.net.toUri
import com.shieldcore.app.core.interfaces.SystemMode
import com.shieldcore.app.core.interfaces.StateManager
import com.shieldcore.app.overlay.OverlayService
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject

@AndroidEntryPoint
class MainActivity : ComponentActivity() {

    @Inject
    lateinit var stateManager: StateManager

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContent {
            ShieldCoreTheme {
                MainScreen(stateManager)
            }
        }
    }
}

@Composable
fun MainScreen(stateManager: StateManager) {
    val context = LocalContext.current
    var mode by remember { mutableStateOf(stateManager.getCurrentMode()) }
    var isOverlayPermissionGranted by remember { mutableStateOf(Settings.canDrawOverlays(context)) }
    var isAccessibilityEnabled by remember { mutableStateOf(isAccessibilityServiceEnabled(context)) }

    LaunchedEffect(Unit) {
        // Periodically refresh or refresh on start
        isOverlayPermissionGranted = Settings.canDrawOverlays(context)
        isAccessibilityEnabled = isAccessibilityServiceEnabled(context)
        
        // Ensure service is running if permissions are good
        if (isOverlayPermissionGranted) {
            val serviceIntent = Intent(context, OverlayService::class.java)
            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
                context.startForegroundService(serviceIntent)
            } else {
                context.startService(serviceIntent)
            }
        }
    }

    Surface(modifier = Modifier.fillMaxSize(), color = MaterialTheme.colorScheme.background) {
        Column(
            modifier = Modifier.fillMaxSize().padding(24.dp).verticalScroll(rememberScrollState()),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Text(text = "🛡️ ShieldCore Console", style = MaterialTheme.typography.headlineLarge)
            Text(text = "Enterprise AI Child Safety", style = MaterialTheme.typography.labelMedium, color = MaterialTheme.colorScheme.primary)
            
            Spacer(modifier = Modifier.height(32.dp))
            
            // Permission Status Section
            PermissionCard(
                title = "1. Overlay Permission",
                description = "Required to mask harmful content on top of other apps.",
                isGranted = isOverlayPermissionGranted,
                onClick = {
                    val intent = Intent(Settings.ACTION_MANAGE_OVERLAY_PERMISSION, "package:${context.packageName}".toUri())
                    context.startActivity(intent)
                }
            )
            
            Spacer(modifier = Modifier.height(16.dp))
            
            PermissionCard(
                title = "2. Accessibility Service",
                description = "Required to scan and identify harmful data in real-time.",
                isGranted = isAccessibilityEnabled,
                onClick = {
                    val intent = Intent(Settings.ACTION_ACCESSIBILITY_SETTINGS)
                    context.startActivity(intent)
                }
            )

            Spacer(modifier = Modifier.height(32.dp))
            
            // Mode Control Section
            if (isOverlayPermissionGranted && isAccessibilityEnabled) {
                Card(modifier = Modifier.fillMaxWidth(), colors = CardDefaults.cardColors(containerColor = MaterialTheme.colorScheme.primaryContainer)) {
                    Column(modifier = Modifier.padding(20.dp), horizontalAlignment = Alignment.CenterHorizontally) {
                        Text(text = "Protection Mode: $mode", style = MaterialTheme.typography.titleMedium)
                        Spacer(modifier = Modifier.height(12.dp))
                        Button(
                            onClick = {
                                val newMode = if (mode == SystemMode.GUARDIAN_MODE) SystemMode.PRIVILEGE_MODE else SystemMode.GUARDIAN_MODE
                                stateManager.setMode(newMode)
                                mode = newMode
                            },
                            modifier = Modifier.fillMaxWidth()
                        ) {
                            Text(text = if (mode == SystemMode.GUARDIAN_MODE) "Unlock (Master Mode)" else "Re-lock Guardian")
                        }
                    }
                }
            } else {
                Text(
                    text = "⚠️ Complete setup above to enable protection.",
                    style = MaterialTheme.typography.bodySmall,
                    color = MaterialTheme.colorScheme.error
                )
            }
            
            Spacer(modifier = Modifier.height(32.dp))
            
            Text(
                text = "ShieldCore is actively protecting social feeds while in Guardian Mode.",
                style = MaterialTheme.typography.bodySmall,
                textAlign = androidx.compose.ui.text.style.TextAlign.Center
            )
        }
    }
}

@Composable
fun PermissionCard(title: String, description: String, isGranted: Boolean, onClick: () -> Unit) {
    Card(modifier = Modifier.fillMaxWidth()) {
        Row(modifier = Modifier.padding(16.dp), verticalAlignment = Alignment.CenterVertically) {
            Column(modifier = Modifier.weight(1f)) {
                Text(text = title, style = MaterialTheme.typography.titleSmall)
                Text(text = description, style = MaterialTheme.typography.bodySmall)
            }
            IconButton(onClick = onClick) {
                Icon(
                    imageVector = if (isGranted) Icons.Default.CheckCircle else Icons.Default.Warning,
                    contentDescription = "Status",
                    tint = if (isGranted) Color.Green else Color.Red
                )
            }
        }
    }
}

fun isAccessibilityServiceEnabled(context: Context): Boolean {
    val expectedComponentName = android.content.ComponentName(context, com.shieldcore.app.accessibility.ShieldCoreAccessibilityService::class.java)
    val enabledServices = Settings.Secure.getString(context.contentResolver, Settings.Secure.ENABLED_ACCESSIBILITY_SERVICES) ?: return false
    return enabledServices.contains(expectedComponentName.flattenToString())
}

@Composable
fun ShieldCoreTheme(content: @Composable () -> Unit) {
    MaterialTheme(
        colorScheme = darkColorScheme(),
        content = content
    )
}
