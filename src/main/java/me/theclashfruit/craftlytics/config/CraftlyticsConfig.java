package me.theclashfruit.craftlytics.config;

import me.shedaniel.autoconfig.ConfigData;
import me.shedaniel.autoconfig.annotation.Config;
import me.shedaniel.autoconfig.annotation.ConfigEntry;

@Config(name = "craftlytics")
public class CraftlyticsConfig implements ConfigData {
    @ConfigEntry.Gui.Tooltip
    public boolean optOut = false;
    @ConfigEntry.Gui.Tooltip
    public boolean showWarning = true;
    @ConfigEntry.Gui.Tooltip
    public String excludedMods = "examplemodid,anothermod";
    @ConfigEntry.Gui.Tooltip
    public String apiUrl = "https://craftlytics.theclashfruit.me/api";
}
