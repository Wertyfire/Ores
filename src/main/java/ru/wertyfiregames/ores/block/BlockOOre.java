/**
 * File created on 17:09 11.07.2024 by Wertyfire
 */

package ru.wertyfiregames.ores.block;

import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

public class BlockOOre extends BlockDefault {

    public BlockOOre(String name, String textureName, CreativeTabs creativeTab,
                     int level, float hardness, float resistance) {
        super(Material.rock, name, textureName, creativeTab, "pickaxe", level, hardness, resistance);
    }
    public BlockOOre(String nameAll, CreativeTabs creativeTab,
                     int level, float hardness, float resistance) {
        super(Material.rock, nameAll, nameAll, creativeTab, "pickaxe", level, hardness, resistance);
    }
}