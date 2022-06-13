import com.adarshr.gradle.testlogger.theme.ThemeType

plugins {
    kotlin("jvm") version "1.7.0"
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
            jvmTarget = "17"
        }
    }

    compileTestKotlin {
        kotlinOptions {
            jvmTarget = "1.8"
        }
    }

    test {
        useJUnitPlatform {
            excludeTags("integration")
        }
    }

    register("integrationTest", Test::class) {
        useJUnitPlatform() {
            includeTags("integration")
        }
    }
}