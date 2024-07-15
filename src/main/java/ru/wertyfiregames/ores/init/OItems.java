/**
 * File created on 20:58 11.07.2024 by Wertyfire
 */

package ru.wertyfiregames.ores.init;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.item.Item;
import ru.wertyfiregames.ores.creativetab.OCreativeTabs;
import ru.wertyfiregames.ores.item.ItemDefault;

public class OItems {
    public static final Item copper_ingot = new ItemDefault("copperIngot", "copper_ingot", OCreativeTabs.tabOres);

    public static void register() {
        GameRegistry.registerItem(copper_ingot, "copper_ingot");
    }
}