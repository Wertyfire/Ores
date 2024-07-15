/**
 * File created on 13:15 12.07.2024 by Wertyfire
 */

package ru.wertyfiregames.ores.init.compat;

import net.minecraftforge.oredict.OreDictionary;
import ru.wertyfiregames.ores.init.OBlocks;
import ru.wertyfiregames.ores.init.OItems;

public class OOreDictionary {
    public static void register() {
        OreDictionary.registerOre("oreCopper", OBlocks.copper_ore);
        OreDictionary.registerOre("ingotCopper", OItems.copper_ingot);
        OreDictionary.registerOre("blockCopper", OBlocks.copper_block);
    }
}