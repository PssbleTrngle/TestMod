import com.possible_triangle.gradle.modModules
import org.gradle.internal.extensions.stdlib.capitalized

plugins {
    id("com.possible-triangle.neoforge")
    id("upload")
}

dependencies {
    modModules.forEach {
        api(project(it.path))
        jarJar(project(it.path))
    }
}

neoForge.runs.configureEach {
    ideName = name.capitalized()
    ideFolderName.unset()
}

modModules.forEach {
    modrinth.additionalFiles.add(
        provider {
            it.upload.modrinth.file
                .get()
        },
    )
}
