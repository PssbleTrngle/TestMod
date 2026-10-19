package com.possible_triangle.test_mod.test;

import java.util.stream.Stream;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.server.MinecraftServer;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.neoforged.testframework.junit.EphemeralTestServerProvider;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

@ExtendWith(EphemeralTestServerProvider.class)
public class RegistryTest {

    @Test
    public void testSingle(MinecraftServer server) {
        var expected = Items.ACACIA_BOAT;

        var access = server.registryAccess();
        var registry = access.registryOrThrow(Registries.ITEM);

        var id = ResourceLocation.withDefaultNamespace("acacia_boat");
        var actual = registry.get(id);

        Assertions.assertEquals(expected, actual);
    }

    @ParameterizedTest
    @MethodSource("provideParameters")
    public void testParameterized(Block expected, ResourceLocation id, MinecraftServer server) {
        var access = server.registryAccess();
        var registry = access.registryOrThrow(Registries.BLOCK);

        var actual = registry.get(id);

        Assertions.assertEquals(expected, actual);
    }

    public static Stream<Arguments> provideParameters() {
        return Stream.of(
            Arguments.arguments(Blocks.CRYING_OBSIDIAN, ResourceLocation.withDefaultNamespace("crying_obsidian")),
            Arguments.arguments(Blocks.DARK_OAK_DOOR, ResourceLocation.withDefaultNamespace("dark_oak_door")),
            Arguments.arguments(Blocks.ANVIL, ResourceLocation.withDefaultNamespace("anvil")),
            Arguments.arguments(Blocks.POPPY, ResourceLocation.withDefaultNamespace("poppy"))
        );
    }

}
