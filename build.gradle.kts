plugins {
    kotlin("jvm") version "2.0.10"
}

group = "org.shevtsovla"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation(kotlin("test"))
    implementation(kotlin("stdlib-jdk8"))
}

tasks.test {
    useJUnitPlatform()
}
kotlin {
    jvmToolchain(20)
    jvmToolchain(8)
}