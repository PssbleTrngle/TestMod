package com.possible_triangle.test_mod;

import net.fabricmc.api.ModInitializer;

public class FabricEntrypoint implements ModInitializer {

    @Override
    public void onInitialize() {
        Constants.LOGGER.info("fabric started");
    }

}