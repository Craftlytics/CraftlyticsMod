package me.theclashfruit.craftlytics.mixin;

import me.shedaniel.autoconfig.AutoConfig;
import me.theclashfruit.craftlytics.config.CraftlyticsConfig;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.gui.screen.Screen;
import net.minecraft.client.gui.screen.TitleScreen;
import net.minecraft.client.gui.screen.option.CreditsAndAttributionScreen;
import net.minecraft.client.gui.widget.ButtonWidget;
import net.minecraft.client.gui.widget.PressableTextWidget;
import net.minecraft.client.gui.widget.TextWidget;
import net.minecraft.text.Text;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(TitleScreen.class)
public class MainMenuMixin extends Screen {
    protected MainMenuMixin(Text title) {
        super(title);
    }

    @Inject(method = "init", at = @At("RETURN"))
    private void addText(CallbackInfo ci) {
        CraftlyticsConfig config = AutoConfig.getConfigHolder(CraftlyticsConfig.class).getConfig();
        
        if(config.showWarning)
            addDrawableChild(
                new TextWidget(
                    2, 
                    height - 20, 
                    textRenderer.getWidth(Text.translatable("text.craftlytics.warning")), 
                    10, 
                    Text.translatable("text.craftlytics.warning"), 
                    this.textRenderer
                )
            );
    }
}
