package com.shieldcore.app.ui

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
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
    var showDemoContent by remember { mutableStateOf(false) }
    var testInput by remember { mutableStateOf("") }

    Column(
        modifier = Modifier.fillMaxSize().padding(16.dp).verticalScroll(rememberScrollState()),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(text = "🛡️ ShieldCore Admin", style = MaterialTheme.typography.headlineLarge)
        Spacer(modifier = Modifier.height(24.dp))
        
        Card(modifier = Modifier.fillMaxWidth()) {
            Column(modifier = Modifier.padding(16.dp)) {
                Text(text = "System Status: $mode", style = MaterialTheme.typography.titleMedium)
                Spacer(modifier = Modifier.height(8.dp))
                Button(onClick = {
                    val newMode = if (mode == SystemMode.GUARDIAN_MODE) {
                        SystemMode.PRIVILEGE_MODE
                    } else {
                        SystemMode.GUARDIAN_MODE
                    }
                    stateManager.setMode(newMode)
                    mode = newMode
                }, modifier = Modifier.fillMaxWidth()) {
                    Text(text = if (mode == SystemMode.GUARDIAN_MODE) "Unlock (Privilege Mode)" else "Lock (Guardian Mode)")
                }
            }
        }

        Spacer(modifier = Modifier.height(24.dp))
        
        Text(text = "Direct Client Demo", style = MaterialTheme.typography.headlineSmall)
        Text(text = "Verify masking smoothness here", style = MaterialTheme.typography.bodySmall)
        
        Card(modifier = Modifier.fillMaxWidth().padding(vertical = 8.dp), 
            colors = CardDefaults.cardColors(containerColor = MaterialTheme.colorScheme.secondaryContainer)) {
            Column(modifier = Modifier.padding(16.dp)) {
                Text(text = "Live Masking Test", style = MaterialTheme.typography.titleSmall)
                Text(text = "Type 'test_harmful' to see smooth masking", style = MaterialTheme.typography.bodySmall)
                TextField(
                    value = testInput,
                    onValueChange = { testInput = it },
                    label = { Text("Interactive Probe") },
                    modifier = Modifier.fillMaxWidth().padding(top = 8.dp)
                )
            }
        }

        if (mode == SystemMode.GUARDIAN_MODE) {
            Button(onClick = { showDemoContent = !showDemoContent }, modifier = Modifier.padding(top = 16.dp)) {
                Text(text = if (showDemoContent) "Hide Mock Content" else "Show Multi-Node Mock Content")
            }

            if (showDemoContent) {
                Column(modifier = Modifier.fillMaxWidth().padding(top = 16.dp)) {
                    MockPost(text = "This is a safe post about standard Android development.")
                    MockPost(text = "WARNING: This is a test_harmful post segment to verify masking precision.")
                    MockPost(text = "Another safe segment about client deployment strategy.")
                    MockPost(text = "DANGER: Triggering second test_harmful node for multi-masking verification.")
                }
            }
        }
    }
}

@Composable
fun MockPost(text: String) {
    ElevatedCard(modifier = Modifier.fillMaxWidth().padding(vertical = 4.dp)) {
        Box(modifier = Modifier.padding(16.dp)) {
            Text(text = text)
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
