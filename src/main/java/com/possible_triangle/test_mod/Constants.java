package com.possible_triangle.test_mod;

import net.minecraft.resources.Identifier;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Constants {
    public static final Logger LOGGER = LogManager.getLogger();
    public static final String MOD_ID = "test_mod";

    public static Identifier createId(String location) {
        return Identifier.fromNamespaceAndPath(MOD_ID, location);
    }

}
