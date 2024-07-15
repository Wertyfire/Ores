/**
 * File created on 22:44 11.07.2024 by Wertyfire
 */

package ru.wertyfiregames.ores.block;

import net.minecraft.block.material.MapColor;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

public class BlockOCompressed extends BlockDefault {
    private final MapColor mapColor;

    public BlockOCompressed(MapColor mapColor, String name, String textureName,
                            CreativeTabs creativeTab, int level, float hardness, float resistance) {
        super(Material.iron, name, textureName, creativeTab, "pickaxe", level, hardness, resistance);
        this.mapColor = mapColor;
    }

    public BlockOCompressed(MapColor mapColor, String nameAll, CreativeTabs creativeTab, int level,
                            float hardness, float resistance) {
        super(Material.iron, nameAll, creativeTab, "pickaxe", level, hardness, resistance);
        this.mapColor = mapColor;
    }

    @Override
    public MapColor getMapColor(int var1) {
        return mapColor;
    }
}