import com.possible_triangle.gradle.neoforge.NeoforgeExtension

plugins {
    id("upload")
}

configure<NeoforgeExtension> {
    accessTransformer()

    unitTests = true

    dataGen {
        splitSourceSet()
        owner = project
    }
}
