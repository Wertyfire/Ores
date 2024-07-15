/**
 * File created on 20:50 11.07.2024 by Wertyfire
 */

package ru.wertyfiregames.ores.item;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import ru.wertyfiregames.ores.Ores;

public class ItemDefault extends Item {
    public ItemDefault(String name, String textureName, CreativeTabs creativeTab) {
        super();
        setUnlocalizedName(name);
        setTextureName(Ores.getModId() + ":" + textureName);
        setCreativeTab(creativeTab);
    }
    public ItemDefault(String nameAll, CreativeTabs creativeTab) {
        super();
        setUnlocalizedName(nameAll);
        setTextureName(Ores.getModId() + ":" + nameAll);
        setCreativeTab(creativeTab);
    }
}