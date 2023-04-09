package com.acrifly.acrifly;

import com.acrifly.acrifly.commands.GmCommand;
import org.bukkit.plugin.java.JavaPlugin;

public final class Acrifly extends JavaPlugin {

    @Override
    public void onEnable() {
        getCommand("gm").setExecutor(new GmCommand());

    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
