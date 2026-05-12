package com.possible_triangle.test_mod;

import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.common.Mod;
import net.neoforged.fml.event.lifecycle.FMLCommonSetupEvent;

@Mod(Constants.MOD_ID)
public class ForgeEntrypoint {

    public ForgeEntrypoint(IEventBus modBus) {
        modBus.addListener((FMLCommonSetupEvent event) ->
            Constants.LOGGER.info("neoforge started")
        );
    }

}
