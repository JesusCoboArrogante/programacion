plugins {
    kotlin("jvm") version "2.0.20"
}

group = "org.example"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation(kotlin("test"))
    implementation("com.h2database:h2:2.1.214")
}

tasks.test {
    useJUnitPlatform()
}
kotlin {
    jvmToolchain(21)
}