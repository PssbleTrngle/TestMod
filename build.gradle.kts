plugins {
    id("com.possible-triangle.core")
    id("com.possible-triangle.vanilla") apply false
    id("com.possible-triangle.forge") apply false
    id("com.possible-triangle.fabric") apply false
}

val (semver, _, key) =
    project.mod.version
        .get()
        .split("-")

subprojects {
    apply(plugin = "com.possible-triangle.core")

    upload {
        forEach {
            version = "$semver-$key"
            versionName = "${key.capitalize()}/${project.name.capitalize()} $semver"
        }

        maven {
            nexus()
            githubPackages()
            name = "${mod.id.get()}-$key-${project.name}"
            artifactVersion = "$semver-${mod.minecraftVersion.get()}"
        }
    }
}

enableSpotless()
enableSonarQube()
