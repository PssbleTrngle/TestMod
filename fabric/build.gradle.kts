plugins {
    id("com.possible-triangle.fabric")
}

fabric {
    dependOn(project(":common"))
    accessWidener(project(":common"))
}

// TODO move to gradle helper?
tasks.withType<Test> { enabled = false }
