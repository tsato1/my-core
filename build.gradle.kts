buildscript {
    repositories {
        mavenLocal()
        mavenCentral()
        google()
    }
}

plugins {
    id("com.android.library") version Versions.androidGradlePlugin apply false
    id("org.jetbrains.kotlin.android") version Versions.kotlin apply false
}

tasks.register("clean", Delete::class) {
    delete(rootProject.buildDir)
}