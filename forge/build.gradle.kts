plugins {
    id("com.possible-triangle.forge")
    id("loader")
}

forge {
    dependOn(project(":common"))

    enableMixins()
    accessWidener(project(":common"))

    dataGen {
        splitSourceSet()
    }
}
