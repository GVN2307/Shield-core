package com.shieldcore.app.ui

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.shieldcore.app.core.interfaces.SystemMode
import com.shieldcore.app.core.interfaces.StateManager
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
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    MainScreen(stateManager)
                }
            }
        }
    }
}

@Composable
fun MainScreen(stateManager: StateManager) {
    var mode by remember { mutableStateOf(stateManager.getCurrentMode()) }

    Column(
        modifier = Modifier.fillMaxSize().padding(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Text(text = "ShieldCore Status", style = MaterialTheme.typography.headlineMedium)
        Spacer(modifier = Modifier.height(16.dp))
        Text(text = "Current Mode: $mode", style = MaterialTheme.typography.bodyLarge)
        Spacer(modifier = Modifier.height(32.dp))
        Button(onClick = {
            val newMode = if (mode == SystemMode.GUARDIAN_MODE) {
                SystemMode.PRIVILEGE_MODE
            } else {
                SystemMode.GUARDIAN_MODE
            }
            stateManager.setMode(newMode)
            mode = newMode
        }) {
            Text(text = if (mode == SystemMode.GUARDIAN_MODE) "Switch to Privilege Mode" else "Switch to Guardian Mode")
        }
    }
}

@Composable
fun ShieldCoreTheme(content: @Composable () -> Unit) {
    MaterialTheme(
        colorScheme = darkColorScheme(),
        content = content
    )
}
