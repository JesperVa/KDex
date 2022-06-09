import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
    kotlin("jvm") version "1.6.21"
    application
}

group = "se.vallett"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

object Versions {
    const val ktorVersion = "2.0.2"
}

dependencies {
    testImplementation(kotlin("test"))

    implementation("io.ktor:ktor-client-core:${Versions.ktorVersion}")
    implementation("io.ktor:ktor-client-okhttp:${Versions.ktorVersion}")
}

tasks.test {
    useJUnitPlatform()
}

tasks.withType<KotlinCompile> {
    kotlinOptions.jvmTarget = "1.8"
}

application {
    mainClass.set("MainKt")
}