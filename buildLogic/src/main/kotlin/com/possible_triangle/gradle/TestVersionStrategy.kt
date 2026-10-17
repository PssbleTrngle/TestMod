package com.possible_triangle.gradle

import com.possible_triangle.gradle.upload.SimpleVersionStrategy
import com.possible_triangle.gradle.upload.WithMinecraftVersion
import com.possible_triangle.gradle.upload.WrappedVersionStrategy
import org.gradle.api.provider.Provider

class TestVersionStrategy(private val setupKey: Provider<String>) :
    WrappedVersionStrategy(WithMinecraftVersion(SimpleVersionStrategy())) {

    override fun uploadVersion(mod: ModVersionProperties): String {
        return "${super.uploadVersion(mod)}-${setupKey.get()}"
    }

    override fun artifactName(mod: ModVersionProperties): String {
        return "${super.artifactName(mod)}-${setupKey.get()}"
    }
}

