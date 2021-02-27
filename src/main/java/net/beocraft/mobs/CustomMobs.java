package net.beocraft.mobs;

import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

public final class CustomMobs extends JavaPlugin {

    @Override
    public void onEnable() {
        getLogger().info("Loading customisations");
        PluginManager manager = getServer().getPluginManager();
        manager.registerEvents(new EntityExplode(), this);
        manager.registerEvents(new EntityDeath(), this);
        manager.registerEvents(new EntityChangeBlock(), this);
    }
}
