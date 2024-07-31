/**
 * File created on 15:58 11.07.2024 by Wertyfire
 */

package ru.wertyfiregames.ores.init;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;
import net.minecraft.block.material.MapColor;
import ru.wertyfiregames.ores.block.*;
import ru.wertyfiregames.ores.creativetab.OCreativeTabs;
import ru.wertyfiregames.wertyfirecore.block.CompressedBlock;

public class OBlocks {

    public static final Block copper_ore = new BlockOOre("copperOre", "copper_ore", OCreativeTabs.tabOres, 1, 3f, 5f);
    public static final Block copper_block = new CompressedBlock(MapColor.adobeColor, "copperBlock", "copper_block", OCreativeTabs.tabOres, 1, 4.5f, 10f);
    public static final Block silver_ore = new BlockOOre("silverOre", "silver_ore", OCreativeTabs.tabOres, 2, 3f, 5f);
    public static final Block silver_block = new CompressedBlock(MapColor.silverColor, "silverBlock", "silver_block", OCreativeTabs.tabOres, 2, 5f, 10f);
    public static final Block tin_ore = new BlockOOre("tinOre", "tin_ore", OCreativeTabs.tabOres, 1, 3f, 5f);
    public static final Block tin_block = new CompressedBlock(MapColor.ironColor, "tinBlock", "tin_block", OCreativeTabs.tabOres, 1, 3f, 5f);

    public static void register() {
//        Ores
        GameRegistry.registerBlock(copper_ore, "copper_ore");
        GameRegistry.registerBlock(silver_ore, "silver_ore");
        GameRegistry.registerBlock(tin_ore, "tin_ore");

//        Blocks
        GameRegistry.registerBlock(copper_block, "copper_block");
        GameRegistry.registerBlock(silver_block, "silver_block");
        GameRegistry.registerBlock(tin_block, "tin_block");
    }
}