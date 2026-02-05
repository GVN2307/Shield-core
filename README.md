# ShieldCore - Advanced Content Moderation for Minors

**ShieldCore** is a system-level content moderation architecture designed to provide a safe digital environment for minors on Android devices. Unlike traditional "app-lock" solutions, ShieldCore operates at the OS-interface layer using Android Accessibility Services to analyze and filter real-time social media content dynamically.

## 🚀 Key Features

- **Real-Time Interception**: Captures text and metadata from social media apps as they appear on screen.
- **On-Device AI Classification**: Uses TensorFlow Lite (TFLite) models to classify content (Hate Speech, Violence, Adult Content) locally on the device.
- **Dynamic UI Masking**: Automatically overlays and hides harmful content while keeping the rest of the application functional.
- **Local-First Privacy**: All processing, AI inference, and biometric data stay on the device. No data is transmitted externally.
- **Biometric Parental Controls**: Securely override filtering using facial recognition for authorized parents.

## 🏗️ Architecture Overview

ShieldCore integrates deeply with the Android system to provide seamless protection:

### Core Components

1. **Content Interceptor** (`ContentInterceptorImpl`)
   - Uses Android AccessibilityService API to capture content from social media apps
   - Implements package guard to only monitor target applications
   - Extracts text, metadata, and screen coordinates

2. **Content Classifier** (`ContentClassifierImpl`)
   - Uses TensorFlow Lite models for on-device AI classification
   - Categorizes content: hate speech, graphic violence, adult content
   - Supports NPU/GPU acceleration for performance

3. **UI Overlay Manager** (`UIOverlayManagerImpl`)
   - Creates WindowManager overlays to mask harmful content
   - Preserves app layout and functionality
   - Displays "ShieldCore: Content Blocked for Safety" messages

4. **Face Authenticator** (`FaceAuthenticatorImpl`)
   - Uses Google ML Kit for facial recognition
   - Enables parent privilege escalation (Child → Parent mode)
   - Stores face embeddings locally using Android Keystore

5. **State Manager** (`StateManagerImpl`)
   - Manages Guardian/Privilege mode transitions
   - Handles configuration persistence with DataStore
   - Maintains activity logs for parental review

## 📄 Documentation

Detailed specifications and architectural designs can be found in the following documents:

- 📋 [Requirements Document](requirements.md) - Project scope, user stories, and acceptance criteria.
- 📐 [Design Document](design.md) - High-level architecture, component interfaces, and data models.

## 🛡️ Privacy & Security

ShieldCore is built with privacy as a core tenet:
- **Zero Cloud dependency**: All inference happens on-edge.
- **No data harvesting**: Content analysis is ephemeral and local.
- **Secure Biometrics**: Face embeddings are stored in the Android Keystore.
- **Zero Data Transmission**: All processing occurs locally.
- **Open Source**: No paid APIs or external dependencies.

## 🏗️ Project Structure

```
app/src/main/java/com/shieldcore/app/
├── core/interfaces/           # Core interfaces and data models
├── implementation/            # Concrete implementations
├── accessibility/             # AccessibilityService implementation
├── overlay/                   # UI overlay service
├── ui/                       # Jetpack Compose UI
├── receiver/                 # Boot receiver for service persistence
└── di/                       # Dependency injection modules
```

## 🎯 Target Applications

ShieldCore monitors these social media applications:
- Instagram (`com.instagram.android`)
- TikTok (`com.zhiliaoapp.musically`)
- Snapchat (`com.snapchat.android`)
- Twitter (`com.twitter.android`)
- Facebook (`com.facebook.katana`)
- WhatsApp (`com.whatsapp`)
- Discord (`com.discord`)

## 🛠️ Technology Stack

- **Language**: Kotlin
- **UI Framework**: Jetpack Compose
- **Dependency Injection**: Hilt/Dagger
- **AI Framework**: TensorFlow Lite
- **Face Detection**: Google ML Kit
- **Data Persistence**: DataStore
- **Testing**: Kotest (Property-Based Testing)

## ⚖️ License

Open source implementation focusing on child safety and privacy protection.

---
*Created with [Kiro](https://kiro.ai)*
