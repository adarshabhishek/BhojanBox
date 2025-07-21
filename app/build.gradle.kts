plugins {
    alias(libs.plugins.android.application)
    alias(libs.plugins.kotlin.android)
    alias(libs.plugins.kotlin.compose)

    id("com.google.dagger.hilt.android")
    id("kotlin-kapt")
    kotlin("plugin.serialization") version "2.0.0"
    alias(libs.plugins.google.gms.google.services)
}

android {
    namespace = "com.example.bhojanbox"
    compileSdk = 35

    defaultConfig {
        applicationId = "com.example.bhojanbox"
        minSdk = 24
        targetSdk = 35
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
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
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_11
        targetCompatibility = JavaVersion.VERSION_11
    }
    kotlinOptions {
        jvmTarget = "11"
    }
    buildFeatures {
        compose = true
    }
}

dependencies {

    implementation(libs.androidx.core.ktx)
    implementation(libs.androidx.lifecycle.runtime.ktx)
    implementation(libs.androidx.activity.compose)
    implementation(platform(libs.androidx.compose.bom))
    implementation(libs.androidx.ui)
    implementation(libs.androidx.ui.graphics)
    implementation(libs.androidx.ui.tooling.preview)
    implementation(libs.androidx.material3)
    implementation(libs.firebase.auth)
    implementation(libs.androidx.credentials)
    implementation(libs.androidx.credentials.play.services.auth)
    implementation(libs.googleid)
    testImplementation(libs.junit)
    androidTestImplementation(libs.androidx.junit)
    androidTestImplementation(libs.androidx.espresso.core)
    androidTestImplementation(platform(libs.androidx.compose.bom))
    androidTestImplementation(libs.androidx.ui.test.junit4)
    debugImplementation(libs.androidx.ui.tooling)
    debugImplementation(libs.androidx.ui.test.manifest)

    implementation("com.github.bumptech.glide:glide:4.16.0")
    implementation("com.github.bumptech.glide:compose:1.0.0-alpha.1")

    implementation("androidx.compose.material:material-icons-extended-android:1.7.8")

    implementation("com.google.dagger:hilt-android:2.56.1")
    kapt("com.google.dagger:hilt-android-compiler:2.56.1")
    implementation("androidx.hilt:hilt-navigation-compose:1.2.0")
    kapt("androidx.hilt:hilt-compiler:1.2.0")

    implementation("io.coil-kt:coil-compose:2.6.0")

    implementation("androidx.navigation:navigation-compose:2.9.2")

    implementation("org.jetbrains.kotlinx:kotlinx-serialization-json:1.8.0")

    implementation("com.razorpay:checkout:1.6.41")

    implementation("com.canopas.compose-animated-navigationbar:bottombar:1.0.1")

    implementation("com.airbnb.android:lottie-compose:4.2.0")

    implementation("com.google.accompanist:accompanist-systemuicontroller:0.32.0")

    implementation("androidx.core:core-splashscreen:1.0.1")

}