plugins {
    id("com.possible-triangle.neoforge")
    id("conventions")
}

neoforge {
    accessTransformer()

    unitTests = true

    dataGen {
        splitSourceSet()
    }
}
