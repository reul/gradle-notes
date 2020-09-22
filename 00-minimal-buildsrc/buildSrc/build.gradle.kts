plugins {
    `kotlin-dsl`
}

repositories {
    mavenCentral()
    google()
    jcenter()
}

dependencies {
    implementation(embeddedKotlin("gradle-plugin"))
    implementation("com.android.tools.build:gradle:4.0.1")
    implementation(gradleApi())
    implementation(localGroovy())
}
