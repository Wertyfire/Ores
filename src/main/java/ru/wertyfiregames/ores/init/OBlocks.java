/**
 * File created on 15:58 11.07.2024 by Wertyfire
 */

package ru.wertyfiregames.ores.init;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;
import net.minecraft.block.material.MapColor;
import ru.wertyfiregames.ores.block.*;
import ru.wertyfiregames.ores.creativetab.OCreativeTabs;

public class OBlocks {

    public static final Block copper_ore = new BlockOOre("copperOre", "copper_ore", OCreativeTabs.tabOres, 1, 3f, 5f);
    public static final Block copper_block = new BlockOCompressed(MapColor.brownColor, "copperBlock", "copper_block", OCreativeTabs.tabOres, 1, 5f, 10f);

    public static void register() {
        GameRegistry.registerBlock(copper_ore, "copper_ore");
        GameRegistry.registerBlock(copper_block, "copper_block");
    }
}