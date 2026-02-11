plugins {
    id("com.android.application")
    id("kotlin-android")
    // The Flutter Gradle Plugin must be applied after the Android and Kotlin Gradle plugins.
    id("dev.flutter.flutter-gradle-plugin")
}

android {
    namespace = "com.mosquefinder.mvp.mosque_finder"
    compileSdk = flutter.compileSdkVersion
    ndkVersion = flutter.ndkVersion

    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_17
        targetCompatibility = JavaVersion.VERSION_17
        // --- ADDED THIS LINE TO FIX NOTIFICATION ERROR ---
        isCoreLibraryDesugaringEnabled = true
    }

    kotlinOptions {
        jvmTarget = JavaVersion.VERSION_17.toString()
    }

    defaultConfig {
        applicationId = "com.mosquefinder.mvp.mosque_finder"
        // MinSdk 21 is required for both Google Maps and Local Notifications
        minSdk = 21 
        targetSdk = flutter.targetSdkVersion
        versionCode = flutter.versionCode
        versionName = flutter.versionName

        // Google Maps API Key Placeholder
        manifestPlaceholders["MAPS_API_KEY"] = System.getenv("MAPS_API_KEY") ?: "AIzaSyCdtq2WitrxXh_oH5FTMAv4-P7zOJrAOmA"
    }

    buildTypes {
        release {
            // Signing with the debug keys for now, so `flutter run --release` works.
            signingConfig = signingConfigs.getByName("debug")
        }
    }
}

flutter {
    source = "../.."
}

// --- ADDED THIS BLOCK AT THE BOTTOM ---
dependencies {
    coreLibraryDesugaring("com.android.tools:desugar_jdk_libs:2.1.4")
}
