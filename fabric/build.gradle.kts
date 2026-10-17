plugins {
    id("com.possible-triangle.fabric")
    id("loader")
}

fabric {
    dependOn(project(":common"))

    accessWidener(project(":common"))
}
