package net.zane.petriummod;

import net.fabricmc.api.ModInitializer;
import net.zane.petriummod.block.ModBlocks;
import net.zane.petriummod.item.ModItems;
import net.zane.petriummod.world.feature.ModConfiguredFeatures;
import net.zane.petriummod.world.gen.ModOreGeneration;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class PetriumMod implements ModInitializer {
	public static final String MOD_ID = "petriummod";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModConfiguredFeatures.registerConfiguredFeatures();

		ModItems.registerModItems();
		ModBlocks.registerModBlocks();

		ModOreGeneration.generateOres();
	}
}
