import de.fayard.refreshVersions.core.versionFor

val versionKittens: String by rootProject.extra
val versionCodeKittens: Int by rootProject.extra
val versionJdk: JavaVersion by rootProject.extra
val versionAndroidSdk: Int by rootProject.extra
val versionAndroidSdkMin: Int by rootProject.extra

plugins {
    id("com.android.application")
    kotlin("android")
}

android {
    compileSdk = versionAndroidSdk

    defaultConfig {
        applicationId = "dev.gressier.kittens.android"
        minSdk = versionAndroidSdkMin
        targetSdk = versionAndroidSdk
        versionCode = versionCodeKittens
        versionName = versionKittens
    }
    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(getDefaultProguardFile("proguard-android-optimize.txt"), "proguard-rules.pro")
        }
    }
    compileOptions {
        sourceCompatibility = versionJdk
        targetCompatibility = sourceCompatibility
    }
    kotlinOptions {
        jvmTarget = "${compileOptions.sourceCompatibility}"
    }
    buildFeatures {
        compose = true
    }
    composeOptions {
        kotlinCompilerExtensionVersion = versionFor(AndroidX.compose.ui)
    }
    packagingOptions {
        resources {
            excludes += "/META-INF/{AL2.0,LGPL2.1}"
        }
    }
}

dependencies {
    implementation(project(":kittens-shared"))

    // Core
    implementation(AndroidX.core.ktx)

    // Compose
    implementation(AndroidX.compose.ui)
    implementation(AndroidX.compose.ui.toolingPreview)

    // Material
    implementation("androidx.compose.material3:material3:_")

    // Lifecycle
    implementation(AndroidX.lifecycle.runtimeKtx)

    // Activity
    implementation(AndroidX.activity.compose)

    // Navigation
    implementation(AndroidX.navigation.compose)
}