/**
 * File created on 18:14 11.07.2024 by Wertyfire
 */

package ru.wertyfiregames.ores.proxy;

import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import ru.wertyfiregames.ores.Ores;
import ru.wertyfiregames.ores.init.*;
import ru.wertyfiregames.ores.init.compat.OOreDictionary;
import ru.wertyfiregames.ores.world.OWorldOreGenerator;

@SideOnly(Side.CLIENT)
public class ClientProxy extends CommonProxy {
    @Override
    public void preInit(FMLPreInitializationEvent event) {
        OItems.register();
        Ores.getModLogger().info("Ores mod: items registered");
        OBlocks.register();
        Ores.getModLogger().info("Ores mod: blocks loaded");
        super.preInit(event);
        Ores.getModLogger().info("Ores mod: pre initialization complete");
    }

    @Override
    public void init(FMLInitializationEvent event) {
        GameRegistry.registerWorldGenerator(new OWorldOreGenerator(), 0);
        Ores.getModLogger().info("Ores mod: ore generator loaded");
        OOreDictionary.register();
        Ores.getModLogger().info("Ores mod: ore dictionary loaded");
        ORecipes.register();
        Ores.getModLogger().info("Ores mod: recipes loaded");
        super.init(event);
        Ores.getModLogger().info("Ores mod: initialization complete");
    }

    @Override
    public void postInit(FMLPostInitializationEvent event) {
        super.postInit(event);
        Ores.getModLogger().info("Ores mod: post initialization complete");
    }
}