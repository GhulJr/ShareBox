plugins {
    alias(libs.plugins.android.application)
    alias(libs.plugins.kotlin)
}

android {
    compileSdk = 33

    defaultConfig {
        namespace = "com.ghuljr.sharebox"
        applicationId = "com.ghuljr.sharebox"
        minSdk = 24
        targetSdk = 33
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
        vectorDrawables.useSupportLibrary = true
    }

    buildTypes {
        debug {
            isDebuggable = true
            isMinifyEnabled = false
            proguardFiles(getDefaultProguardFile("proguard-android-optimize.txt"), "proguard-rules.pro")
        }
        release {
            isDebuggable = false
            isMinifyEnabled = true
            proguardFiles(getDefaultProguardFile("proguard-android-optimize.txt"), "proguard-rules.pro")
        }
    }

    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_17
        targetCompatibility = JavaVersion.VERSION_17
    }

    kotlinOptions {
        jvmTarget = JavaVersion.VERSION_17.toString()
    }

    buildFeatures {
        compose = true
    }

    composeOptions {
        kotlinCompilerExtensionVersion = "1.4.7"
    }

    packaging {
        resources {
            excludes.add("/META-INF/{AL2.0,LGPL2.1}")
        }
    }
}

dependencies {
    implementation(libs.android.ktx)
    implementation(enforcedPlatform(libs.kotlin.bom))
    implementation(libs.lifecycle.ktx)
    implementation(libs.activity.compose)

    implementation(enforcedPlatform(libs.compose.bom))
    implementation(libs.compose.ui)
    implementation(libs.compose.ui.graphics)
    implementation(libs.compose.ui.preview)
    implementation(libs.compose.material2)
    implementation(libs.compose.material3)

    testImplementation(libs.junit)
    androidTestImplementation(libs.junit.ext)

    androidTestImplementation(libs.espresso)
    androidTestImplementation(enforcedPlatform(libs.compose.test.bom))
    androidTestImplementation(libs.junit.ui)
    debugImplementation(libs.compose.test.tooling)
    debugImplementation(libs.compose.test.manifest)
}