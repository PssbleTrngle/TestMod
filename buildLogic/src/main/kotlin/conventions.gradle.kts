import com.possible_triangle.gradle.TestVersionStrategy

plugins {
    id("com.possible-triangle.core")
}

val setupType = rootProject.providers.gradleProperty("setup_key")
mod.versionStrategy = TestVersionStrategy(setupType)

upload.maven {
    nexus()
    githubPackages()
}

enableSpotless()
enableSonarQube()
