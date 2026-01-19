package me.volume;

import org.bukkit.plugin.java.JavaPlugin;

public class TheVolume extends JavaPlugin {
    @Override
    public void onEnable() {
        getLogger().info("TheVolume plugin enabled!");
    }

    @Override
    public void onDisable() {
        getLogger().info("TheVolume plugin disabled!");
    }
}
