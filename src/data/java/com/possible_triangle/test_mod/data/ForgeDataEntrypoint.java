package com.possible_triangle.test_mod.data;

import com.possible_triangle.test_mod.Constants;
import net.minecraft.DetectedVersion;
import net.minecraft.data.metadata.PackMetadataGenerator;
import net.minecraft.network.chat.Component;
import net.minecraft.server.packs.PackType;
import net.minecraft.server.packs.metadata.pack.PackMetadataSection;
import net.minecraft.util.InclusiveRange;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.neoforge.data.event.GatherDataEvent;

@EventBusSubscriber(modid = Constants.MOD_ID)
public class ForgeDataEntrypoint {

    @SubscribeEvent
    public static void gatherData(GatherDataEvent.Client event) {
        var generator = event.getGenerator();
        var output = generator.getPackOutput();

        generator.addProvider(true, new PackMetadataGenerator(output).add(PackMetadataSection.SERVER_TYPE, new PackMetadataSection(
            Component.literal("test mod resources"),
            new InclusiveRange<>(DetectedVersion.BUILT_IN.packVersion(PackType.CLIENT_RESOURCES))
        )));
    }

}
