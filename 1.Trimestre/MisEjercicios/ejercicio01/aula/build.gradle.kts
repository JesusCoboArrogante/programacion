plugins {
    kotlin("jvm") version "2.0.20"
    //dokka
    id("org.jetbrains.dokka") version "1.9.20"
}

group = "org.example"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation(kotlin("test"))
    //loggin
    implementation("org.lighthousegames:logging:1.5.0")
    implementation("ch.qos.logback:logback-classic:1.5.12")


    //mordant
    implementation("com.github.ajalt.mordant:mordant:2.2.0")
    implementation("net.java.dev.jna:jna:5.13.0")

}

tasks.test {
    useJUnitPlatform()
}
kotlin {
    jvmToolchain(21)
}

//jar
tasks.jar{
    manifest{
        attributes["Main-Class"] = "Mainkt"
        configurations["compileClasspath"].forEach{file: File ->
            from (zipTree(file.absoluteFile))
        }
        duplicatesStrategy = DuplicatesStrategy.INCLUDE
        archiveFileName.set("aula.jar")
    }
}