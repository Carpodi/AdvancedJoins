package com.github.kaorystudios.mc.carpodi.advancedjoins.listeners;

import com.github.kaorystudios.mc.carpodi.advancedjoins.AdvancedJoins;
import com.github.kaorystudios.mc.carpodi.advancedjoins.utils.MessageColors;
import me.clip.placeholderapi.PlaceholderAPI;
import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.event.player.PlayerQuitEvent;

public class OnQuit implements Listener {

    private final AdvancedJoins plugin;

    public OnQuit(AdvancedJoins plugin) {
        this.plugin = plugin;
    }

    @EventHandler
    public void onJoin(PlayerQuitEvent e) {

        Player p = e.getPlayer();

        e.setQuitMessage(null);

        for (Player po : Bukkit.getOnlinePlayers()) {
            po.sendMessage(MessageColors.getMsgColor(PlaceholderAPI.setPlaceholders(p, MessageColors.getMsgColor(plugin.getConfig().getString("quit.msg")))));
        }

    }
}