plugins {
    id("com.android.library")
}

android {
    namespace = "app.tauri.shell"
    compileSdk = 36

    defaultConfig {
        minSdk = 24

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
        consumerProguardFiles("consumer-rules.pro")
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
    }
}

kotlin {
    jvmToolchain(8)
}

dependencies {
    implementation("androidx.core:core-ktx:1.17.0")
    implementation("com.fasterxml.jackson.core:jackson-databind:2.21.0")
    implementation(project(":tauri-android"))
}
