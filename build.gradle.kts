buildscript {
    repositories {
        google()
        mavenCentral()
    }
    dependencies {
        // Dependensi classpath untuk Google Services (Firebase)
        classpath ("com.android.tools.build:gradle:7.4.0") // Pastikan ini adalah versi terbaru yang kompatibel
        classpath ("com.google.gms:google-services:4.3.15") // Untuk Firebase dan Google Play services
    }
}

plugins {
    // Plugin untuk aplikasi Android dan Kotlin
    id("com.android.application") version "8.5.2" apply false
    id("com.android.library") version "8.5.2" apply false
    id("org.jetbrains.kotlin.android") version "1.9.10" apply false
    // Menggunakan alias untuk plugin Google services
    alias(libs.plugins.google.gms.google.services) apply false
}
