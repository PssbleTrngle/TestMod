plugins {
    id("com.possible-triangle.forge")
}

forge {
    dependOn(project(":common"))

    enableMixins()
    accessWidener(project(":common"))

    dataGen {
        splitSourceSet()
    }
}
