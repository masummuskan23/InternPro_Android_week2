# Implicit Intents Application

This Android application demonstrates the use of implicit intents to open a web page and dial a phone number. It allows users to:
- Launch a web browser to display a specified URL.
- Open the phone dialer with a pre-filled phone number.

## Features
- **Open Web Page**: Launch the device's default browser to display a webpage using `Intent.ACTION_VIEW`.
- **Dial Phone Number**: Open the dialer with a phone number pre-filled using `Intent.ACTION_DIAL`.

## Requirements
- **Platform**: Android 4.4 (API 19) or higher.
- **Development Tool**: Android Studio.
- **Language**: Java.
- **Permissions**: No explicit permissions required since the app uses `ACTION_DIAL` for phone calls.

## Getting Started

### Prerequisites
- Install Android Studio.
- Ensure the Android SDK is installed.
- A physical Android device or an Android emulator for testing.
