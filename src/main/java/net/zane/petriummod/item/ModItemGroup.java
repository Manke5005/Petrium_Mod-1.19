package net.zane.petriummod.item;

import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;
import net.zane.petriummod.PetriumMod;

public class ModItemGroup {
    public static final ItemGroup PETRIUM = FabricItemGroupBuilder.build(
            new Identifier(PetriumMod.MOD_ID, "petrium"), () -> new ItemStack(ModItems.PETRIUM_INGOT));
}
