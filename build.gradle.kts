plugins {
    kotlin("jvm")
    id("io.gitlab.arturbosch.detekt")
}

allprojects {
    group = rootProject.name
    version = extra["$group.version"] as String
}

subprojects {
    repositories {
        mavenCentral()
    }
}
