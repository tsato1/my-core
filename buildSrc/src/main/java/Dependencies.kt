object Versions {
    const val kotlin = "1.7.10"

    // Gradle Plugin
    const val androidGradlePlugin = "7.2.2"
    const val googleServicesGradlePlugin = "4.3.13"
    const val daggerHiltGradlePlugin = "2.43.2"
    const val crashlyticsGradlePlugin = "2.9.1"

    // Dependencies
    const val coreKtx = "1.9.0"
    const val securityCrypto = "1.1.0-alpha03"
    const val coroutines = "1.6.4"
    const val ktor = "2.1.0"
    const val daggerHilt = "2.43.2"

    // Compose
    const val compose = "1.2.1"
    const val composeCompiler = "1.3.1"
    const val material3 = "1.0.0-beta02"
    const val navigation = "2.5.2"
    const val hiltNavigationCompose = "1.0.0"
    const val activityCompose = "1.5.1"

    // Lifecycle
    const val lifecycle = "2.5.1"
}

object Build {
    const val androidBuildTools = "com.android.tools.build:gradle:${Versions.androidGradlePlugin}"
    const val kotlinGradlePlugin = "org.jetbrains.kotlin:kotlin-gradle-plugin:${Versions.kotlin}"
    const val hiltAndroidGradlePlugin = "com.google.dagger:hilt-android-gradle-plugin:${Versions.daggerHiltGradlePlugin}"
    const val googleServicesGradlePlugin = "com.google.gms:google-services:${Versions.googleServicesGradlePlugin}"
    const val crashlyticsGradlePlugin = "com.google.firebase:firebase-crashlytics-gradle:${Versions.crashlyticsGradlePlugin}"
}

object AndroidX {
    const val coreKtx = "androidx.core:core-ktx:${Versions.coreKtx}"
    const val lifecycle = "androidx.lifecycle:lifecycle-livedata-ktx:${Versions.lifecycle}"
    const val securityCrypto = "androidx.security:security-crypto:${Versions.securityCrypto}"
}

object Compose {
    const val compiler = "androidx.compose.compiler:compiler:${Versions.composeCompiler}"
    const val ui = "androidx.compose.ui:ui:${Versions.compose}"
    const val runtime = "androidx.compose.runtime:runtime:${Versions.compose}"
    const val material = "androidx.compose.material:material:${Versions.compose}"
    const val materialIcons = "androidx.compose.material:material-icons-extended:${Versions.compose}"

    const val material3 = "androidx.compose.material3:material3:${Versions.material3}"
    const val navigation = "androidx.navigation:navigation-compose:${Versions.navigation}"
    const val hiltNavigationCompose = "androidx.hilt:hilt-navigation-compose:${Versions.hiltNavigationCompose}"
    const val activityCompose = "androidx.activity:activity-compose:${Versions.activityCompose}"
    const val viewModelCompose = "androidx.lifecycle:lifecycle-viewmodel-compose:${Versions.lifecycle}"
}

object Coroutines {
    const val coroutines = "org.jetbrains.kotlinx:kotlinx-coroutines-core:${Versions.coroutines}"
}

object DaggerHilt {
    const val hiltAndroid = "com.google.dagger:hilt-android:${Versions.daggerHilt}"
    const val hiltCompiler = "com.google.dagger:hilt-android-compiler:${Versions.daggerHilt}"
}

object Ktor {
    const val logging = "io.ktor:ktor-client-logging:${Versions.ktor}"
    const val core = "io.ktor:ktor-client-core:${Versions.ktor}"
    const val cio = "io.ktor:ktor-client-cio:${Versions.ktor}"
    const val auth = "io.ktor:ktor-client-auth:${Versions.ktor}"
    const val contentNegotiation = "io.ktor:ktor-client-content-negotiation:${Versions.ktor}"
    const val serialization = "io.ktor:ktor-client-serialization:${Versions.ktor}"
    const val serializationJson = "io.ktor:ktor-serialization-kotlinx-json:${Versions.ktor}"
}