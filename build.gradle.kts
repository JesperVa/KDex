import com.adarshr.gradle.testlogger.theme.ThemeType

plugins {
    kotlin("jvm") version Versions.kotlin
    id("com.adarshr.test-logger") version "3.2.0"
    id("org.cqfn.diktat.diktat-gradle-plugin") version "1.1.0"
    application
}

group = "se.vallett"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation(kotlin("test"))
    testImplementation("io.kotest:kotest-assertions-core:${Versions.kotest}")

    implementation("io.ktor:ktor-client-core:${Versions.ktor}")
    implementation("io.ktor:ktor-client-okhttp:${Versions.ktor}")
}

testlogger {
    theme = ThemeType.MOCHA
    showSummary = true
    showOnlySlow = false
}

diktat {
    githubActions = true
}

tasks {
    compileKotlin {
        kotlinOptions {
            jvmTarget = Versions.jvm
        }
    }

    compileTestKotlin {
        kotlinOptions {
            jvmTarget = Versions.jvm
        }
    }

    test {
        useJUnitPlatform {
            excludeTags("integration")
        }
    }

    register("integrationTest", Test::class) {
        group = "verification"
        useJUnitPlatform() {
            includeTags("integration")
        }
    }
}