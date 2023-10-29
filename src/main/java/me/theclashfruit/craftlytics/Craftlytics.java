package me.theclashfruit.craftlytics;

import me.shedaniel.autoconfig.AutoConfig;
import me.shedaniel.autoconfig.serializer.JanksonConfigSerializer;
import me.theclashfruit.craftlytics.config.CraftlyticsConfig;
import net.fabricmc.api.ModInitializer;

public class Craftlytics implements ModInitializer {
    /**
     * Runs the mod initializer.
     */
    @Override
    public void onInitialize() {

        // Register Config
        AutoConfig.register(CraftlyticsConfig.class, JanksonConfigSerializer::new);
    }
}
