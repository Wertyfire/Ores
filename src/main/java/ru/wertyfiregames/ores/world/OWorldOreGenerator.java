/**
 * File created on 21:39 14.07.2024 by Wertyfire
 */

package ru.wertyfiregames.ores.world;

import cpw.mods.fml.common.IWorldGenerator;
import net.minecraft.block.Block;
import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.feature.WorldGenMinable;
import ru.wertyfiregames.ores.config.OConfig;
import ru.wertyfiregames.ores.init.OBlocks;

import java.util.Random;

public class OWorldOreGenerator implements IWorldGenerator {
    @Override
    public void generate(Random random, int chunkX, int chunkZ, World world, IChunkProvider chunkGenerator, IChunkProvider chunkProvider) {
        switch (world.provider.dimensionId) {
            case -1:
                generateNether(world, random, chunkX * 16, chunkZ * 16);
            case 0:
                generateSurface(world, random, chunkX * 16, chunkZ * 16);
            case 1:
                generateEnd(world, random, chunkX * 16, chunkZ * 16);
        }
    }

    private void generateNether(World world, Random random, int x, int z) {}
    private void generateSurface(World world, Random random, int x, int z) {
        if (OConfig.GENERATE_COPPER_ORE) addOreSpawn(OBlocks.copper_ore, world, random, x, z, 16,
                16, 8, 6, 40, 75);
    }
    private void generateEnd(World world, Random random, int x, int z) {}

    private void addOreSpawn(Block block, World world, Random random, int blockXPos, int blockZPos, int maxX, int maxZ, int maxVeinSize, int chancesToSpawn, int minY, int maxY) {
        for (int i = 0; i < chancesToSpawn; i++) {
            int posX = blockXPos + random.nextInt(maxX);
            int posY = minY + random.nextInt(maxY - minY);
            int posZ = blockZPos + random.nextInt(maxZ);
            new WorldGenMinable(block, maxVeinSize).generate(world, random, posX, posY, posZ);
        }
    }
}