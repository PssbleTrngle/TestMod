package com.possible_triangle.test_mod.foo;

import net.minecraft.resources.ResourceLocation;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Constants {
    public static final Logger LOGGER = LogManager.getLogger();
    public static final String MOD_ID = "test_mod_foo";

    public static ResourceLocation createId(String location) {
        return ResourceLocation.fromNamespaceAndPath(MOD_ID, location);
    }


}
