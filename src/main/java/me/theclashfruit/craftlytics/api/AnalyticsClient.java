package me.theclashfruit.craftlytics.api;

import me.shedaniel.autoconfig.AutoConfig;
import me.theclashfruit.craftlytics.config.CraftlyticsConfig;

import java.util.Arrays;

public class AnalyticsClient {
    private String apiKey;
    private String modId;
    private boolean isAllowed;

    public AnalyticsClient(String apiKey, String modId) {
        this.apiKey = apiKey;
        this.modId = modId;
    }

    public void initialize() {
        CraftlyticsConfig config = AutoConfig.getConfigHolder(CraftlyticsConfig.class).getConfig();

        this.isAllowed = !config.optOut && !Arrays.asList(config.excludedMods.split(",")).contains(this.modId);
    }

    public boolean getIsAllowed() {
        return this.isAllowed;
    }
}
