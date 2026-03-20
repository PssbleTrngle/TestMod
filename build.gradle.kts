plugins {
    id("com.possible-triangle.core")
    id("com.possible-triangle.architectury") apply false
    id("com.possible-triangle.forge") apply false
    id("com.possible-triangle.fabric") apply false
}

subprojects {
    apply(plugin = "com.possible-triangle.core")

    upload {
        maven {
            nexus()
        }
    }
}

enableSpotless()
enableSonarQube()
