pluginManagement {
    val flutterSdkPath = File(properties["flutter.sdk"] as String).absolutePath

    includeBuild("$flutterSdkPath/packages/flutter_tools/gradle")

    repositories {
        google()
        mavenCentral()
        gradlePluginPortal()
    }
}

plugins {
    id("dev.flutter.flutter-plugin-loader") version "1.0.0"
    id("com.android.application") version "8.1.3" apply false  // Match Flutter 3.29.2's requirement
    id("org.jetbrains.kotlin.android") version "1.9.24" apply false  // Match your Kotlin version
}

dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        google()
        mavenCentral()
    }
}

include(":app")