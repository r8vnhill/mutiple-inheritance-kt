plugins {
    kotlin("jvm")
    id("io.gitlab.arturbosch.detekt")
}

allprojects {
    group = "multiple-inheritance-kt"
    version = extra["multiple-inheritance-kt.version"] as String
}

subprojects {
    repositories {
        mavenCentral()
    }
}
