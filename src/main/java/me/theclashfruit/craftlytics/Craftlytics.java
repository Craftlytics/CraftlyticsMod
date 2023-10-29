package me.theclashfruit.craftlytics;

import me.shedaniel.autoconfig.AutoConfig;
import me.shedaniel.autoconfig.serializer.JanksonConfigSerializer;
import me.theclashfruit.craftlytics.config.CraftlyticsConfig;
import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Random;

public class Craftlytics implements ModInitializer {
    public static final String MOD_ID = "craftlytics";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

    public static final String[] randomMessage = {
        "waht?!", // me
        "say gex", // mya in crss server
        "I am a typical Windows 85 user. Nothings strange here!" // worldwidepixel in modrinth server
    };

    @Override
    public void onInitialize() {
        // the funny
        LOGGER.info(randomMessage[new Random().nextInt(randomMessage.length)]);

        // Register Config
        AutoConfig.register(CraftlyticsConfig.class, JanksonConfigSerializer::new);
    }
}
