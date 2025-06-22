plugins {
    id("com.android.application") apply false
    id("org.jetbrains.kotlin.android") apply false
}

buildscript {
    repositories {
        google()
        mavenCentral()
    }
    dependencies {
        classpath("com.android.tools.build:gradle:8.1.0")
        classpath("com.google.gms:google-services:4.4.2")
    }
}

allprojects {
    repositories {
        google()
        mavenCentral()
    }
}

tasks.register("clean", Delete::class) {
    // Sử dụng buildDir mặc định của dự án, không cần chỉ định thủ công
    delete(rootProject.layout.buildDirectory.get().asFile)
}