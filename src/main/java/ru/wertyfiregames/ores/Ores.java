/**
 * File created on 15:25 11.07.2024 by Wertyfire
 */

package ru.wertyfiregames.ores;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.common.config.Configuration;
import org.apache.logging.log4j.Logger;
import ru.wertyfiregames.ores.config.OConfig;
import ru.wertyfiregames.ores.proxy.CommonProxy;

import java.io.File;

@Mod(modid = Ores.MOD_ID, name = Ores.NAME, version = Ores.VERSION,
        guiFactory = Ores.GUI_FACTORY, canBeDeactivated = true)
public class Ores {
    public static final String MOD_ID = "ores";
    public static final String NAME = "Ores";
    public static final String VERSION = "1.0.0";
    public static final String GUI_FACTORY = "ru.wertyfiregames.ores.config.OConfigFactory";
    private static Logger modLogger;
    public static Configuration config;

    @Mod.Instance("ores")
    public Ores instance;
    private static final String clientSide = "ru.wertyfiregames.ores.proxy.ClientProxy";
    private static final String serverSide = "ru.wertyfiregames.ores.proxy.CommonProxy";
    @SidedProxy(clientSide = clientSide, serverSide = serverSide)
    public static CommonProxy proxy;

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event) {
        modLogger = event.getModLog();
        getModLogger().info("Ores mod: logger loaded");
        File configFile = new File(event.getModConfigurationDirectory().toString() + "/ores.cfg");
        config = new Configuration(configFile);
        OConfig.load();
        getModLogger().info("Ores mod: configuration loaded");
        proxy.preInit(event);
    }

    @Mod.EventHandler
    public void init(FMLInitializationEvent event) {
        proxy.init(event);
    }

    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent event) {
        proxy.postInit(event);
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