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
    public static final String CATEGORY_ORES = "ores";
    public static final String CATEGORY_GENERATION = CATEGORY_ORES + Configuration.CATEGORY_SPLITTER + "generation";

    public static boolean GENERATE_COPPER_ORE;
    public static boolean GENERATE_SILVER_ORE;
    public static boolean GENERATE_TIN_ORE;

    public static void load() {
        Ores.getConfig().setCategoryLanguageKey(CATEGORY_GENERATION, "ores.config.generate.category");
        Ores.getConfig().addCustomCategoryComment(CATEGORY_GENERATION, "What ores should generate in the world?");

        GENERATE_COPPER_ORE = getBoolean(CATEGORY_GENERATION, "generateCopperOre", "ores.config.generate.copperOre", "Generate copper ore in the world?", true);
        GENERATE_SILVER_ORE = getBoolean(CATEGORY_GENERATION, "generateSilverOre", "ores.config.generate.silverOre", "Generate silver ore in the world?", true);
        GENERATE_TIN_ORE = getBoolean(CATEGORY_GENERATION, "generateTinOre", "ores.config.generate.tinOre", "Generate tin ore in the world?", true);

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