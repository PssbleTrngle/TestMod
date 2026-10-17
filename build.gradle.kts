plugins {
    id("com.possible-triangle.forge")
    id("conventions")
}

forge {
    accessTransformer()
    enableMixins()

    dataGen {
        splitSourceSet()
    }
}
