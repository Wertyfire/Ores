/**
 * File created on 15:25 11.07.2024 by Wertyfire
 */

package ru.wertyfiregames.ores;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.*;
import cpw.mods.fml.common.ModMetadata;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraftforge.common.config.Configuration;
import org.apache.logging.log4j.Logger;
import ru.wertyfiregames.ores.config.OConfig;
import ru.wertyfiregames.ores.init.OBlocks;
import ru.wertyfiregames.ores.init.OItems;
import ru.wertyfiregames.ores.init.ORecipes;
import ru.wertyfiregames.ores.init.compat.OOreDictionary;
import ru.wertyfiregames.ores.world.OWorldOreGenerator;
import ru.wertyfiregames.wertyfirecore.context.IMod;
import ru.wertyfiregames.wertyfirecore.context.InitActions;
import ru.wertyfiregames.wertyfirecore.context.ModContext;

import java.io.File;

@Mod(modid = Ores.MOD_ID, name = Ores.NAME, version = Ores.VERSION, dependencies = Ores.DEPENDENCIES,
        guiFactory = "ru.wertyfiregames.ores.config.OConfigFactory")
public class Ores implements IMod {
    public static final String MOD_ID = "ores";
    public static final String NAME = "Ores";
    public static final String VERSION = "1.0.0";
    public static final String DEPENDENCIES = "required-after:wertyfirecore@[1.0.1];";
    private static Logger modLogger;
    public static Configuration config;

    @Metadata
    public static ModMetadata METADATA;
    @Instance
    public static Ores INSTANCE;

    @EventHandler
    public void preInit(FMLPreInitializationEvent event) {
        modLogger = event.getModLog();
        getModLogger().debug("Ores mod: logger loaded");
        File configFile = new File(event.getModConfigurationDirectory().toString() + "/ores.cfg");
        config = new Configuration(configFile);
        OConfig.load();
        getModLogger().info("Ores mod: configuration loaded");
        ModContext.setModContext("ores");
        OItems.register();
        Ores.getModLogger().debug("Ores mod: items registered");
        OBlocks.register();
        Ores.getModLogger().debug("Ores mod: blocks loaded");
        InitActions.doPreInit(event);
        Ores.getModLogger().info("Ores mod: pre initialization complete");
        ModContext.freeContext();
    }

    @EventHandler
    public void init(FMLInitializationEvent event) {
        ModContext.setModContext(this);
        GameRegistry.registerWorldGenerator(new OWorldOreGenerator(), 0);
        Ores.getModLogger().debug("Ores mod: ore generator loaded");
        OOreDictionary.register();
        Ores.getModLogger().debug("Ores mod: ore dictionary loaded");
        ORecipes.register();
        Ores.getModLogger().debug("Ores mod: recipes loaded");
        InitActions.doInit(event);
        Ores.getModLogger().info("Ores mod: initialization complete");
        ModContext.freeContext();
    }

    @EventHandler
    public void postInit(FMLPostInitializationEvent event) {
        ModContext.setModContext(this);
        InitActions.doPostInit(event);
        Ores.getModLogger().info("Ores mod: post initialization complete");
        ModContext.freeContext();
    }

//    Getters
    public static String getModId() {
        return MOD_ID;
    }
    public static String getName() {
        return NAME;
    }
    public static String getVersion() {
        return VERSION;
    }
    public static Logger getModLogger() {
        return modLogger;
    }
    public static Configuration getConfig() {
        return config;
    }
}