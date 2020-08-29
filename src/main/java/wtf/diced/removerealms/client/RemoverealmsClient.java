package wtf.diced.removerealms.client;

import me.sargunvohra.mcmods.autoconfig1u.AutoConfig;
import me.sargunvohra.mcmods.autoconfig1u.serializer.Toml4jConfigSerializer;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import wtf.diced.removerealms.RemoveRealmsConfig;

@Environment(EnvType.CLIENT)
public class RemoverealmsClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        AutoConfig.register(RemoveRealmsConfig.class, Toml4jConfigSerializer::new);
    }
}
