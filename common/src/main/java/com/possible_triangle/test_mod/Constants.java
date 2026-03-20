package com.possible_triangle.test_mod;

import net.minecraft.resources.ResourceLocation;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Constants {
    public static final Logger LOGGER = LogManager.getLogger();
    public static final String MOD_ID = "test_mod";

    public static ResourceLocation createId(String location) {
        return new ResourceLocation(MOD_ID, location);
    }


}
