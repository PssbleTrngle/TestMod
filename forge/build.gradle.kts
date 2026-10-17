plugins {
    id("com.possible-triangle.neoforge")
    id("loader")
}

neoforge {
    dependOn(project(":common"))

    accessWidener(project(":common"))

    dataGen {
        splitSourceSet()
    }
}
