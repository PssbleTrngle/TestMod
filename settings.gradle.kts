pluginManagement {
    repositories {
        gradlePluginPortal()
        mavenLocal()
    }
}

includeBuild("buildLogic")

plugins {
    id("com.possible-triangle.helper") version ("1.4")
}
