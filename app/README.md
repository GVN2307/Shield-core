# ShieldCore App - Module Implementation Details

This document provides a highly granular ("pin-to-pin") technical breakdown of the individual modules within the ShieldCore Android application.

---

## 🔍 1. Content Scraper (`ContentInterceptorImpl`)
The Scraper is the primary data entry point for ShieldCore.

### Technical Mechanics
- **Accessibility Integration**: Extends the `ContentInterceptor` interface. It processes `AccessibilityEvent.TYPE_WINDOW_CONTENT_CHANGED` and `TYPE_VIEW_TEXT_CHANGED`.
- **Node Traversal**: Recursively traverses the `AccessibilityNodeInfo` tree using a depth-first search (DFS) to locate `TextView` and `EditText` elements.
- **Granular Segmentation**: Unlike primitive scrapers that merge all text into one blob, ShieldCore's Scraper treats each UI node as a discrete `ContentData` segment. This allows the system to mask a single "bad post" while leaving the rest of the feed untouched.
- **Debouncing Logic**: Implements a short temporal buffer (50ms) to ignore transient UI states during rapid scrolling, preventing CPU spikes.

---

## 🛡️ 2. Content Blocker (`UIOverlayManagerImpl`)
The Blocker is responsible for the visual enforcement of safety policies.

### Hardware-Accelerated Masking
- **GPU Rendering**: Uses `WindowManager.LayoutParams.FLAG_HARDWARE_ACCELERATED` to ensure that masking overlays do not drop frames, even on mid-range devices.
- **Overlay Reconciliation**: When a new classification event arrives, the manager performs a "diff" against `activeOverlays`.
    - If a harmful segment matches an existing `overlayId`, only its `LayoutParams` coordinates are updated via `windowManager.updateViewLayout()`.
    - This avoids the flicker and memory leaks associated with constantly destroying/creating views.
- **Non-Interactive Layer**: Overlays use `FLAG_NOT_FOCUSABLE` and `FLAG_WATCH_OUTSIDE_TOUCH` to ensure they are visually present but do not intercept clicks intended for safe areas of the underlying app.

---

## 🔐 3. Guardian Lock (`FaceAuthenticatorImpl`)
The biometric layer that manages the privilege transition.

### Biometric Protocol
- **ML Kit Precision**: Utilizes Google's high-accuracy Face Detection API to generate a 128-dimension feature vector (embedding).
- **Liveness Guard**: Basic checks for eye-blink and head-rotation patterns to prevent "photo-spoofing" bypasses.
- **Keystore Integration**: Face hashes are never stored in plain text. They are encrypted using an AES-GCM key bound to the Hardware-backed Android Keystore.
- **Timeout Persistence**: Privilege sessions are tracked via a foreground service to ensure the device automatically re-locks into Guardian Mode exactly 60 minutes after the last parental interaction.

---

## 🧠 4. AI Engine (`ContentClassifierImpl`)
The brain of the system, hosted locally.

### Inference Pipeline
1.  **Normalization**: Intercepted text is down-cased and stripped of special characters/emojis to reduce input noise.
2.  **Keyword Fast-Path**: A localized trie-based search for high-confidence "blocked" keywords.
3.  **TFLite Inference**: For ambiguous content, the text is fed into a quantized **MobileBERT** or **LSTM** model specifically tuned for hate-speech detection.
4.  **Delegate Selection**: Prioritizes the **GpuDelegate** followed by the **NnApiDelegate** to offload computation from the main CPU.

---
*ShieldCore Implementation Notes - API 31+ Optimized*
