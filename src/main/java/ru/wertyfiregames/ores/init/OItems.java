/**
 * File created on 20:58 11.07.2024 by Wertyfire
 */

package ru.wertyfiregames.ores.init;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.item.Item;
import ru.wertyfiregames.ores.creativetab.OCreativeTabs;
import ru.wertyfiregames.wertyfirecore.item.DefaultItem;

public class OItems {
    public static final Item copper_ingot = new DefaultItem("copperIngot", "copper_ingot", OCreativeTabs.tabOres);
    public static final Item silver_ingot = new DefaultItem("silverIngot", "silver_ingot", OCreativeTabs.tabOres);
    public static final Item tin_ingot = new DefaultItem("tinIngot", "tin_ingot", OCreativeTabs.tabOres);

    public static void register() {
        GameRegistry.registerItem(copper_ingot, "copper_ingot");
        GameRegistry.registerItem(silver_ingot, "silver_ingot");
        GameRegistry.registerItem(tin_ingot, "tin_ingot");
    }
}