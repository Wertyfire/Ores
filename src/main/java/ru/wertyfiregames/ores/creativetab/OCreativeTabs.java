/**
 * File created on 22:02 11.07.2024 by Wertyfire
 */

package ru.wertyfiregames.ores.creativetab;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import ru.wertyfiregames.ores.init.OItems;

public class OCreativeTabs {
    public static final CreativeTabs tabOres = new CreativeTabs("ores") {
        @Override
        public Item getTabIconItem() {
            return OItems.copper_ingot;
        }
    };
}