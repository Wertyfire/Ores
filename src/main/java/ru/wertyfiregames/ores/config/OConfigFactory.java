/**
 * File created on 20:46 12.07.2024 by Wertyfire
 */

package ru.wertyfiregames.ores.config;

import cpw.mods.fml.client.IModGuiFactory;
import cpw.mods.fml.client.config.GuiConfig;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.GuiScreen;
import net.minecraftforge.common.config.ConfigElement;
import net.minecraftforge.common.config.Configuration;
import ru.wertyfiregames.ores.Ores;

import java.util.Set;

import static ru.wertyfiregames.ores.Ores.getConfig;

public class OConfigFactory implements IModGuiFactory {
    @Override
    public void initialize(Minecraft minecraftInstance) {

    }

    @Override
    public Class<? extends GuiScreen> mainConfigGuiClass() {
        return OresGuiConfig.class;
    }

    @Override
    public Set<RuntimeOptionCategoryElement> runtimeGuiCategories() {
        return null;
    }

    @Override
    public RuntimeOptionGuiHandler getHandlerFor(RuntimeOptionCategoryElement element) {
        return null;
    }

    public static class OresGuiConfig extends GuiConfig {
        @SuppressWarnings("all")
        public OresGuiConfig(GuiScreen guiScreen) {
            super(guiScreen, new ConfigElement(getConfig().getCategory(OConfig.CATEGORY_ORES)).getChildElements(),
                    Ores.getModId(), false, false,
                    GuiConfig.getAbridgedConfigPath(getConfig().toString()));
        }
    }
}