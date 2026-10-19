import com.possible_triangle.gradle.modModules
import org.gradle.internal.extensions.stdlib.capitalized

plugins {
    id("com.possible-triangle.core") apply false
    id("com.possible-triangle.neoforge") apply false
    id("conventions")
}

project.modModules.forEach {
    it.extra.set("mod_id", "${mod.id.get()}_${it.name}")
    it.extra.set("mod_name", "${mod.name.get()} ${it.name.capitalized()}")
}
