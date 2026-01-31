# ShieldCore - Advanced Content Moderation for Minors

**ShieldCore** is a system-level content moderation architecture designed to provide a safe digital environment for minors on Android devices. Unlike traditional "app-lock" solutions, ShieldCore operates at the OS-interface layer using Android Accessibility Services to analyze and filter real-time social media content dynamically.

## 🚀 Key Features

- **Real-Time Interception**: Captures text and metadata from social media apps as they appear on screen.
- **On-Device AI Classification**: Uses TensorFlow Lite (TFLite) models to classify content (Hate Speech, Violence, Adult Content) locally on the device.
- **Dynamic UI Masking**: Automatically overlays and hides harmful content while keeping the rest of the application functional.
- **Local-First Privacy**: All processing, AI inference, and biometric data stay on the device. No data is transmitted externally.
- **Biometric Parental Controls**: Securely override filtering using facial recognition for authorized parents.

## 🏗️ Architecture Overiew

ShieldCore integrates deeply with the Android system to provide seamless protection:

- **Content Interceptor**: Leverages `AccessibilityService` to monitor and extract on-screen content.
- **Content Classifier**: Executes AI models locally, utilizing hardware acceleration (NPU/GPU) when available.
- **UI Overlay Manager**: Manages non-intrusive window overlays to mask flagged content regions.
- **Face Authenticator**: Provides secure, biometric-based privilege escalation.

## 📄 Documentation

Detailed specifications and architectural designs can be found in the following documents:

- 📋 [Requirements Document](requirements.md) - Project scope, user stories, and acceptance criteria.
- 📐 [Design Document](design.md) - High-level architecture, component interfaces, and data models.

## 🛡️ Privacy & Security

ShieldCore is built with privacy as a core tenet:
- **Zero Cloud dependency**: All inference happens on-edge.
- **No data harvesting**: Content analysis is ephemeral and local.
- **Secure Biometrics**: Face embeddings are stored in the Android Keystore.

---
*Created with [Kiro](https://kiro.ai)*
