package me.theclashfruit.craftlytics.config;

import me.shedaniel.autoconfig.ConfigData;
import me.shedaniel.autoconfig.annotation.Config;

@Config(name = "craftlytics")
public class CraftlyticsConfig implements ConfigData {
    boolean optOut = false;
    String excludedMods = "examplemodid,anothermod";
    String apiUrl = "https://craftlytics.theclashfruit.me/api";
}
