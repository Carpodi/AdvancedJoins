package com.github.kaorystudios.mc.carpodi.advancedjoins.listeners;

import com.github.kaorystudios.mc.carpodi.advancedjoins.AdvancedJoins;
import com.github.kaorystudios.mc.carpodi.advancedjoins.utils.MessageColors;
import me.clip.placeholderapi.PlaceholderAPI;
import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;

public class OnJoin implements Listener {

    private final AdvancedJoins plugin;

    public OnJoin(AdvancedJoins plugin) {
        this.plugin = plugin;
    }

    @EventHandler
    public void onJoin(PlayerJoinEvent e) {

        Player p = e.getPlayer();

        e.setJoinMessage(null);

        for (Player po : Bukkit.getOnlinePlayers()) {
            po.sendMessage(MessageColors.getMsgColor(PlaceholderAPI.setPlaceholders(p, MessageColors.getMsgColor(plugin.getConfig().getString("join.msg")))));
        }

    }
}