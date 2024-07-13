rootProject.name = "multiple-inheritance-kt"

include(":single-inheritance", ":interfaces-revisited", ":multiple-inheritance")

pluginManagement {
    repositories {
        gradlePluginPortal()
    }

    plugins {
        kotlin("jvm") version extra["kotlin.version"] as String
        id("io.gitlab.arturbosch.detekt") version
                extra["detekt.version"] as String
    }
}
