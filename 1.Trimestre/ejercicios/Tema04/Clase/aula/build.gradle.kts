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
    implementation("org.lighthousegames:logging:1.3.0") // Librería de Logging
    implementation("ch.qos.logback:logback-classic:1.4.14") // Implementación de Logback


}

tasks.test {
    useJUnitPlatform()
}
kotlin {
    jvmToolchain(21)
}