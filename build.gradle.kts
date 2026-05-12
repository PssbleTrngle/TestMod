plugins {
    id("com.possible-triangle.forge")
}

forge {
    accessTransformer()
    enableMixins()

    dataGen {
        splitSourceSet()
    }
}

val (semver, _, key) =
    project.mod.version
        .get()
        .split("-")

upload {
    forEach {
        version = "$semver-$key"
        versionName = "${key.capitalize()} $semver"
    }

    maven {
        nexus()
        githubPackages()
        name = "${mod.id.get()}-$key"
        artifactVersion = "$semver-${mod.minecraftVersion.get()}"
    }
}

enableSpotless()
enableSonarQube()
