package com.github.kaorystudios.mc.carpodi.advancedjoins;

import com.github.kaorystudios.mc.carpodi.advancedjoins.commands.AdvancedJoinsCMD;
import com.github.kaorystudios.mc.carpodi.advancedjoins.filemanager.FileManager;
import com.github.kaorystudios.mc.carpodi.advancedjoins.listeners.OnJoin;
import com.github.kaorystudios.mc.carpodi.advancedjoins.listeners.OnQuit;
import com.github.kaorystudios.mc.carpodi.advancedjoins.utils.MessageColors;
import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;
import org.bukkit.command.CommandExecutor;
import org.bukkit.plugin.PluginDescriptionFile;
import org.bukkit.plugin.java.JavaPlugin;
public final class AdvancedJoins extends JavaPlugin {

    private FileManager config;
    PluginDescriptionFile pdffile = getDescription();
    public String version = this.pdffile.getVersion();


    @Override
    public void onEnable() {
        // Plugin startup logic
        Bukkit.getConsoleSender().sendMessage(MessageColors.getMsgColor("&7&m------------------------------------"));
        Bukkit.getConsoleSender().sendMessage(MessageColors.getMsgColor("&aAdvancedJoins &b"+version));
        Bukkit.getConsoleSender().sendMessage(MessageColors.getMsgColor("&r "));
        Bukkit.getConsoleSender().sendMessage(MessageColors.getMsgColor("&a Thanks for using AdvancedJoins! :D"));
        Bukkit.getConsoleSender().sendMessage(MessageColors.getMsgColor("&2 Created By: &fCarpodi&7, &fHappyRogelio7&7, &fKamila21Y&7, &fKaoryStudios&7, &fKaoryStudiosMC&7."));
        Bukkit.getConsoleSender().sendMessage(MessageColors.getMsgColor("&r "));
        Bukkit.getConsoleSender().sendMessage(MessageColors.getMsgColor("&a Version Server:&f "+Bukkit.getVersion()));
        Bukkit.getConsoleSender().sendMessage(MessageColors.getMsgColor("&r "));
        Bukkit.getConsoleSender().sendMessage(MessageColors.getMsgColor("&9&l Discord: &fhttps://discord.gg/3EebYUyeUX"));
        Bukkit.getConsoleSender().sendMessage(MessageColors.getMsgColor("&d&l GitHub: &fhttps://github.com/KaoryStudios"));
        Bukkit.getConsoleSender().sendMessage(MessageColors.getMsgColor("&7&m------------------------------------"));

        this.config = new FileManager(this, "config");
        getServer().getPluginManager().registerEvents(new OnJoin(this), this);
        getServer().getPluginManager().registerEvents(new OnQuit(this), this);
        getCommand("advancedjoinscmd").setExecutor((CommandExecutor) new AdvancedJoinsCMD(this));


    }

    @Override
    public void onDisable() {
        Bukkit.getConsoleSender().sendMessage(MessageColors.getMsgColor("&7&m------------------------------------"));
        Bukkit.getConsoleSender().sendMessage(MessageColors.getMsgColor("&aDisabled advancedJoins &b"+version));
        Bukkit.getConsoleSender().sendMessage(MessageColors.getMsgColor("&r "));
        Bukkit.getConsoleSender().sendMessage(MessageColors.getMsgColor("&a Thanks for using AdvancedJoins! :D"));
        Bukkit.getConsoleSender().sendMessage(MessageColors.getMsgColor("&2 Created By: &fCarpodi&7, &fHappyRogelio7&7, &fKamila21Y&7, &fKaoryStudios&7, &fKaoryStudiosMC&7."));
        Bukkit.getConsoleSender().sendMessage(MessageColors.getMsgColor("&r "));
        Bukkit.getConsoleSender().sendMessage(MessageColors.getMsgColor("&a Version Server:&f "+Bukkit.getVersion()));
        Bukkit.getConsoleSender().sendMessage(MessageColors.getMsgColor("&r "));
        Bukkit.getConsoleSender().sendMessage(MessageColors.getMsgColor("&9&l Discord: &fhttps://discord.gg/3EebYUyeUX"));
        Bukkit.getConsoleSender().sendMessage(MessageColors.getMsgColor("&d&l GitHub: &fhttps://github.com/KaoryStudios"));
        Bukkit.getConsoleSender().sendMessage(MessageColors.getMsgColor("&7&m------------------------------------"));
        // Plugin shutdown logic
    }

    public FileManager getConfig(){
        return this.config;
    }
}
