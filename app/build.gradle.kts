plugins {
    alias(libs.plugins.android.application)
    alias(libs.plugins.jetbrains.kotlin.android)
}

android {
    namespace = "org.thefproject.fedu"
    compileSdk = 35

    defaultConfig {
        applicationId = "org.thefproject.fedu"
        minSdk = 22
        targetSdk = 33
        versionCode = 307
        versionName = "0.8_dev"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    buildTypes {
        release {
            multiDexEnabled = true
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
            signingConfig = signingConfigs.getByName("debug")
        }

    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
    kotlinOptions {
        jvmTarget = "1.8"
    }

    buildFeatures {
        viewBinding = true
      buildConfig = true
    }
}


dependencies {

// implementation 'com.android.support:multidex:1.0.3'
    implementation("com.android.support:multidex:1.0.3")
    implementation ("com.airbnb.android:lottie:6.5.2")
    implementation ("com.google.android.material:material:1.4.0")
    implementation("com.squareup.okhttp3:okhttp:4.9.3")
    implementation(libs.androidx.core.ktx)
    implementation(libs.androidx.appcompat)
    implementation(libs.material)
    implementation(libs.androidx.activity)
    implementation(libs.androidx.constraintlayout)
    implementation(libs.androidx.runner)
    implementation(libs.androidx.espresso.core)
    testImplementation(libs.junit)
    androidTestImplementation(libs.androidx.junit)
    androidTestImplementation(libs.androidx.espresso.core)
}
