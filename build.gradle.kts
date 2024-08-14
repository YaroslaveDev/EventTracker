// Top-level build file where you can add configuration options common to all sub-projects/modules.
plugins {
    id("com.android.application") version "8.2.2" apply false
    id("org.jetbrains.kotlin.android") version "1.9.24" apply false
    kotlin("plugin.serialization") version "1.9.24"
    id("com.google.dagger.hilt.android") version "2.44" apply false
}

//buildscript {
//
//    repositories {
//        google()
//        mavenCentral()
//        maven { url = uri("https://jitpack.io") }
//    }
//    dependencies {
//        classpath("com.google.dagger:hilt-android-gradle-plugin:2.48.1")
//        classpath("org.jetbrains.kotlin:kotlin-serialization:1.9.20")
//
//    }
//}