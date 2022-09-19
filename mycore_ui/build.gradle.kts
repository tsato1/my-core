plugins {
    id("com.android.library")
    id("org.jetbrains.kotlin.android")
    id("maven-publish")
}

android {
    compileSdk = ProjectConfig.compileSdk

    defaultConfig {
        minSdk = ProjectConfig.minSdk
        targetSdk = ProjectConfig.targetSdk
//        versionCode = ProjectConfig.versionCode
//        versionName = ProjectConfig.versionName

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
//        consumerProguardFiles = "consumer-rules.pro"
    }
    buildFeatures {
        compose = true
    }
    composeOptions {
        kotlinCompilerExtensionVersion = Versions.composeCompiler
    }
    buildTypes {
        getByName("release") {
            isMinifyEnabled = true
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
    kotlinOptions {
        jvmTarget = "1.8"
    }
}

/* for maven remote */
afterEvaluate {
    publishing {
        publications {
            create<MavenPublication>("maven") {
                groupId = "com.github.tsato1"
                artifactId = "my-core"
                version = "0.0.1"
            }
        }
    }
}

/* for mave n local */
//publishing {
//    publications {
//        release(MavenPublication) {
//            groupId 'com.tsato.mobile'
//            artifactId 'mycore_ui'
//            version '0.0.0'
//            artifact("$libsDirName/mycore_ui-0.0.0.aar")
//        }
//    }
//}
//
//afterEvaluate {
//    tasks.clean.dependsOn("publishToMavenLocal")
//    tasks.preBuild.dependsOn("publishToMavenLocal")
//}

dependencies {
    implementation(AndroidX.lifecycle)

    implementation(Compose.compiler)
    implementation(Compose.ui)
    implementation(Compose.hiltNavigationCompose)
    implementation(Compose.material)
    implementation(Compose.materialIcons)
    implementation(Compose.runtime)
    implementation(Compose.navigation)
    implementation(Compose.viewModelCompose)
    implementation(Compose.activityCompose)

    testImplementation("junit:junit:4.13.2")
    androidTestImplementation("androidx.test.ext:junit:1.1.3")
    androidTestImplementation("androidx.test.espresso:espresso-core:3.4.0")
    androidTestImplementation("androidx.compose.ui:ui-test-junit4:${Versions.compose}")
    debugImplementation("androidx.compose.ui:ui-tooling:${Versions.compose}")
    debugImplementation("androidx.compose.ui:ui-test-manifest:${Versions.compose}")
}