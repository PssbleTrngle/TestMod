plugins {
    id("com.possible-triangle.core")
}

upload.maven {
    nexus()
    githubPackages()
}
