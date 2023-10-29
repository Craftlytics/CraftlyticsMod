package me.theclashfruit.craftlytics.config;

import me.shedaniel.autoconfig.ConfigData;
import me.shedaniel.autoconfig.annotation.Config;

@Config(name = "craftlytics")
public class CraftlyticsConfig implements ConfigData {
    public boolean optOut = false;
    public String excludedMods = "examplemodid,anothermod";
    public String apiUrl = "https://craftlytics.theclashfruit.me/api";
}
