/**
 * File created on 20:04 12.07.2024 by Wertyfire
 */

package ru.wertyfiregames.ores.config;

import cpw.mods.fml.client.event.ConfigChangedEvent;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.common.config.Configuration;
import net.minecraftforge.common.config.Property;
import ru.wertyfiregames.ores.Ores;

public class OConfig {
    public static final String CATEGORY_GENERATION = Configuration.CATEGORY_GENERAL + Configuration.CATEGORY_SPLITTER + "generation";

    public static boolean GENERATE_COPPER_ORE;

    public static void load() {
        Ores.getConfig().setCategoryLanguageKey(CATEGORY_GENERATION, "config.generate.category");
        Ores.getConfig().addCustomCategoryComment(CATEGORY_GENERATION, "What ores should generate in the world?");

        GENERATE_COPPER_ORE = getBoolean(CATEGORY_GENERATION, "generateCopperOre", "config.generate.copperOre", "Generate copper ore in the world?", true);

        if (Ores.getConfig().hasChanged())
            Ores.config.save();
    }

    private static boolean getBoolean(String category, String name, String languageKey, String comment, boolean def) {
        Property prop = Ores.getConfig().get(category, name, def);
        prop.setLanguageKey(languageKey);
        prop.comment = comment;
        return prop.getBoolean();
    }

    @SubscribeEvent
    public void onConfigChangedEvent(ConfigChangedEvent.OnConfigChangedEvent event) {
        if (event.modID.equalsIgnoreCase(Ores.getModId()))
            load();
    }
}