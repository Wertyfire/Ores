/**
 * File created on 16:53 11.07.2024 by Wertyfire
 */

package ru.wertyfiregames.ores.block;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.stats.StatList;
import net.minecraft.world.World;
import ru.wertyfiregames.ores.Ores;

public class BlockDefault extends Block {
    public BlockDefault(Material material, String name, String textureName,
                        CreativeTabs creativeTab, String toolType, int level, float hardness, float resistance) {
        super(material);
        setBlockName(name);
        setBlockTextureName(Ores.getModId() + ":" + textureName);
        setCreativeTab(creativeTab);
        setHarvestLevel(toolType, level);
        setHardness(hardness);
        setResistance(resistance);
    }

    public BlockDefault(Material material, String nameAll,
                        CreativeTabs creativeTab, String toolType, int level, float hardness, float resistance) {
        super(material);
        setBlockName(nameAll);
        setBlockTextureName(Ores.getModId() + ":" + nameAll);
        setCreativeTab(creativeTab);
        setHarvestLevel(toolType, level);
        setHardness(hardness);
        setResistance(resistance);
    }
}