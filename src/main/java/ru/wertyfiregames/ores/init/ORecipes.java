/**
 * File created on 12:11 12.07.2024 by Wertyfire
 */

package ru.wertyfiregames.ores.init;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.item.ItemStack;

public class ORecipes {
    public static void register() {
        GameRegistry.addSmelting(OBlocks.copper_ore, new ItemStack(OItems.copper_ingot), 0.7f);
        GameRegistry.addSmelting(OBlocks.silver_ore, new ItemStack(OItems.silver_ingot), 0.7f);
        GameRegistry.addRecipe(new ItemStack(OBlocks.copper_block), "SSS", "SSS", "SSS", 'S', OItems.copper_ingot);
        GameRegistry.addRecipe(new ItemStack(OBlocks.silver_block), "SSS", "SSS", "SSS", 'S', OItems.silver_ingot);
        GameRegistry.addShapelessRecipe(new ItemStack(OItems.copper_ingot, 9), new ItemStack(OBlocks.copper_block));
        GameRegistry.addShapelessRecipe(new ItemStack(OItems.silver_ingot, 9), new ItemStack(OBlocks.silver_block));
    }
}