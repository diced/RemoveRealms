package wtf.diced.removerealms.mixin;

import me.sargunvohra.mcmods.autoconfig1u.AutoConfig;
import net.minecraft.client.gui.screen.Screen;
import net.minecraft.client.gui.screen.TitleScreen;
import net.minecraft.text.Text;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import wtf.diced.removerealms.RemoveRealmsConfig;

@Mixin(TitleScreen.class)
public class TitleScreenMixin extends Screen {
    protected TitleScreenMixin(Text title) {
        super(title);
    }

    @Inject(at = @At("TAIL"), method = "init()V")
    protected void init(CallbackInfo ci) {
        RemoveRealmsConfig config = AutoConfig.getConfigHolder(RemoveRealmsConfig.class).getConfig();
        if (config.removeMultiplayer) {
            this.buttons.get(1).visible = false;
        }
        if (config.removeRealms) {
            this.buttons.get(2).visible = false;
        }
    }
}
