package org.knpronoob.chainCreeperExplosions;

import org.bukkit.plugin.java.JavaPlugin;
import org.knpronoob.chainCreeperExplosions.Events.CreeperDamageEvents;

public final class ChainCreeperExplosions extends JavaPlugin {

    @Override
    public void onEnable() {
        getServer().getPluginManager().registerEvents(new CreeperDamageEvents(), this);
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
