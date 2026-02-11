# Nearby Mosque Finder (MVP)

A simple, fast, and lightweight Android app to find nearby mosques, built with Flutter.
Initially focused on Faisalabad – Samundari Road area.

## Features (MVP)
- **Automatic Location**: Gets user GPS location (with permissions).
- **Nearby Mosques**: Lists mosques sorted by distance.
- **Direction Compass**: Shows accurate Qibla-like direction arrow towards the nearest mosque.
- **Maps Integration**: Google Maps view with markers.
- **Navigation**: One-tap navigation via Google Maps app.

## Setup Instructions

### 1. Prerequisites
- Flutter SDK installed.
- Android device or emulator (API 21+).

### 2. Google Maps API Key
To see the map, you need a Google Maps API Key.
1. Go to [Google Cloud Console](https://console.cloud.google.com/).
2. Create a project and enable **Maps SDK for Android**.
3. Generate an API Key.
4. Open `android/app/src/main/AndroidManifest.xml`.
5. Replace `YOUR_API_KEY_HERE` with your actual key:
   ```xml
   <meta-data android:name="com.google.android.geo.API_KEY" android:value="AIzaSy..." />
   ```

### 3. Run the App
```bash
flutter pub get
flutter run
```

## Tech Stack
- **Framework**: Flutter (Dart)
- **Maps**: `google_maps_flutter`
- **Location**: `geolocator`
- **Compass**: `flutter_compass`
- **Navigation**: `url_launcher`

## Scalability
The current version uses a hardcoded list of mosques for the Samundari Road area for the MVP.
To scale:
1. Replace the `_mosques` list in `lib/main.dart` with a backend API call (e.g., Google Places API or a custom database).
2. Use `GoogleMap`'s user location stream for real-time updates.

## Notes
- Optimized for low-end devices (minSdk 21).
- Non-intrusive UI.
- No ads or login required.
