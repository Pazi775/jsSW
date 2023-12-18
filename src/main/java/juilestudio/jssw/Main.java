package juilestudio.jssw;

import org.bukkit.plugin.java.JavaPlugin;

import org.bukkit.Bukkit;
import juilestudio.jssw.commands.JsStaffWorkCommand;
import juilestudio.jssw.commands.StaffWorkCommand;
import juilestudio.jssw.event.Event;
import juilestudio.jssw.listeners.Listeners;
import juilestudio.jssw.utils.Config;
import juilestudio.jssw.utils.DataConfig;
import juilestudio.jssw.utils.Hex;
import juilestudio.jssw.utils.Updater;

public final class Main extends JavaPlugin {

    public static Main instance;

    @Override
    public void onEnable() {

        instance = this;
        Bukkit.getConsoleSender().sendMessage(Hex.color(""));
        Bukkit.getConsoleSender().sendMessage(Hex.color("&6» &fПлагин &6" + getPlugin(Main.class).getName() + " &fвключился&f!"));
        Bukkit.getConsoleSender().sendMessage(Hex.color("&6» &fВерсия: &6v" + getPlugin(Main.class).getDescription().getVersion()));
        Bukkit.getConsoleSender().sendMessage(Hex.color(""));
        Updater updater = new Updater(this);
        updater.start();

        this.getCommand("staffwork").setExecutor(new StaffWorkCommand());
        this.getCommand("jsstaffwork").setExecutor(new JsStaffWorkCommand());
        Config.loadYamlFile(this);
        DataConfig.loadYamlFile(this);
        Bukkit.getPluginManager().registerEvents(new Listeners(), this);
        Event.registerEvents();

    }

    @Override
    public void onDisable() {

        Bukkit.getConsoleSender().sendMessage(Hex.color(""));
        Bukkit.getConsoleSender().sendMessage(Hex.color("&6» &fПлагин &6" + getPlugin(Main.class).getName() + " &fвыключился&f!"));
        Bukkit.getConsoleSender().sendMessage(Hex.color("&6» &fВерсия: &6v" + getPlugin(Main.class).getDescription().getVersion()));
        Bukkit.getConsoleSender().sendMessage(Hex.color(""));

    }

    public static Main getInstance() {
        return instance;
    }
}