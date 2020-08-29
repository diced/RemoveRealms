package wtf.diced.removerealms;

import me.sargunvohra.mcmods.autoconfig1u.ConfigData;
import me.sargunvohra.mcmods.autoconfig1u.annotation.Config;

@Config(name = "removerealms")
public class RemoveRealmsConfig implements ConfigData {
    public boolean removeMultiplayer = false;
    public boolean removeRealms = true;
}