buildscript {
    repositories {
        mavenLocal()
        mavenCentral()
        google()
    }
}

plugins {
    id("com.android.application") version Versions.androidGradlePlugin apply false
    id("com.android.library") version Versions.androidGradlePlugin apply false
    id("org.jetbrains.kotlin.android") version Versions.kotlin apply false
}