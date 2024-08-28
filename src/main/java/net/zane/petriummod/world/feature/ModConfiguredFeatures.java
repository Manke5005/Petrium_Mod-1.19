package net.zane.petriummod.world.feature;

import net.minecraft.util.registry.RegistryEntry;
import net.minecraft.world.gen.feature.*;
import net.zane.petriummod.PetriumMod;
import net.zane.petriummod.block.ModBlocks;

import java.util.List;

public class ModConfiguredFeatures {

    public static final List<OreFeatureConfig.Target> OVERWORLD_PETRIUM_ORES = List.of(
            OreFeatureConfig.createTarget(OreConfiguredFeatures.STONE_ORE_REPLACEABLES, ModBlocks.PETRIUM_ORE.getDefaultState()),
            OreFeatureConfig.createTarget(OreConfiguredFeatures.DEEPSLATE_ORE_REPLACEABLES, ModBlocks.DEEPSLATE_PETRIUM_ORE.getDefaultState()));

    public static final RegistryEntry<ConfiguredFeature<OreFeatureConfig, ?>> PETRIUM_ORE =
            ConfiguredFeatures.register("petrium_ore", Feature.ORE, new OreFeatureConfig(OVERWORLD_PETRIUM_ORES, 3));


    public static void registerConfiguredFeatures() {
        PetriumMod.LOGGER.debug("Registering the ModConfiguredFeatures for " + PetriumMod.MOD_ID);
    }
}
