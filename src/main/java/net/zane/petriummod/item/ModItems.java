package net.zane.petriummod.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.util.Rarity;
import net.zane.petriummod.PetriumMod;
import net.minecraft.item.Item;
import net.minecraft.util.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {

    public static final Item PETRIUM = registerItem("petrium",
            new Item(new FabricItemSettings().rarity(Rarity.EPIC).group(ModItemGroup.PETRIUM)));
    public static final Item PETRIUM_INGOT = registerItem("petrium_ingot",
            new Item(new FabricItemSettings().rarity(Rarity.EPIC).group(ModItemGroup.PETRIUM)));
    private static Item registerItem(String name, Item item) {
        return Registry.register(Registry.ITEM, new Identifier(PetriumMod.MOD_ID, name), item);
    }
    public static void registerModItems() {
        PetriumMod.LOGGER.debug("Registering Mod Items for " + PetriumMod.MOD_ID);

    }
}
