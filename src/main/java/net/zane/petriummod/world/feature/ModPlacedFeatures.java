package net.zane.petriummod.world.feature;

import net.minecraft.util.registry.RegistryEntry;
import net.minecraft.world.gen.YOffset;
import net.minecraft.world.gen.feature.PlacedFeature;
import net.minecraft.world.gen.feature.PlacedFeatures;
import net.minecraft.world.gen.placementmodifier.*;
import java.util.List;

public class ModPlacedFeatures {
    public static final RegistryEntry<PlacedFeature> PETRIUM_ORE_PLACED = PlacedFeatures.register("petrium_ore_placed",
            ModConfiguredFeatures.PETRIUM_ORE, modifiersWithCount(3,
                    HeightRangePlacementModifier.trapezoid(YOffset.fixed(-101), YOffset.fixed(-21))));



    private static List<PlacementModifier> modifiers(PlacementModifier countModifier, PlacementModifier heightModifier) {
        return List.of(countModifier, SquarePlacementModifier.of(), heightModifier, BiomePlacementModifier.of());
    }

    private static List<PlacementModifier> modifiersWithCount(int count, PlacementModifier heightModifier) {
        return modifiers(CountPlacementModifier.of(count), heightModifier);
    }

    private static List<PlacementModifier> modifiersWithRarity(int chance, PlacementModifier heightModifier) {
        return modifiers(RarityFilterPlacementModifier.of(chance), heightModifier);
    }
}
