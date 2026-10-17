plugins {
    id("com.possible-triangle.fabric")
    id("conventions")
}

fabric {
    accessWidener()

    dataGen {
        splitSourceSet()
    }
}
