pluginManagement {
    repositories {
        gradlePluginPortal()
        mavenLocal()
    }
}

includeBuild("buildLogic")

file("modules").listFiles().forEach {
    include(":${it.name}")
    project(":${it.name}").projectDir = it
}

include("combined")

plugins {
    id("com.possible-triangle.helper") version ("1.4")
}
