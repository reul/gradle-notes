plugins {
    id("com.android.application")
    kotlin("android")
    id("kotlin-android-extensions")
}

android {
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }

    compileSdkVersion(Settings.compileSdk)
    buildToolsVersion(Settings.buildToolsVersion)

    defaultConfig {
        minSdkVersion(Settings.minSdk)
        targetSdkVersion(Settings.targetSdk)

        applicationId = "space.reul.gradlenotes.minimalbuildsrc"

        versionCode = 1
        versionName = "1.0"
    }

    buildTypes {
        maybeCreate("release").apply {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
    }
}

dependencies {
    implementation(fileTree(mapOf("dir" to "libs", "include" to listOf("*.jar"))))
    implementation(embeddedKotlin("stdlib-jdk8"))
    implementation(Deps.coreKtx)
    implementation(Deps.appcompat)
}
