plugins {
    kotlin("jvm") version "1.7.0"
    application
}

group = "se.vallett"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation(kotlin("test"))

    implementation("io.ktor:ktor-client-core:${Versions.ktor}")
    implementation("io.ktor:ktor-client-okhttp:${Versions.ktor}")
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