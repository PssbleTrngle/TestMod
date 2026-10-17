plugins {
    id("com.possible-triangle.neoforge")
    id("conventions")
}

neoforge {
    accessTransformer()

    dataGen {
        splitSourceSet()
    }
}
