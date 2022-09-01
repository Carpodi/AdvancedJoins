package com.github.kaorystudios.mc.carpodi.advancedjoins.commands;

import com.github.kaorystudios.mc.carpodi.advancedjoins.AdvancedJoins;
import com.github.kaorystudios.mc.carpodi.advancedjoins.utils.MessageColors;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
public class AdvancedJoinsCMD implements CommandExecutor {

    private final AdvancedJoins plugin;

    public AdvancedJoinsCMD (AdvancedJoins plugin) {
        this.plugin = plugin;
    }

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {

        if (args.length == 0) {
            sender.sendMessage(MessageColors.getMsgColor("&aCore Created by &fCarpodi&7, &fHappyRogelio7&7, &fKamila21Y&7, &fKaoryStudios&7, &fKaoryStudiosMC&7."));
            sender.sendMessage(MessageColors.getMsgColor("&aGitHub: &fhttps://github.com/KaoryStudios"));
            sender.sendMessage(MessageColors.getMsgColor("&aWebsite: &fhttps://kaorystudios.xyz/"));
            sender.sendMessage(MessageColors.getMsgColor("&aUsage: &f/"+label+" help"));
        }

        if (args.length > 0){

            if (args[0].equalsIgnoreCase("help")) {
                sender.sendMessage(MessageColors.getMsgColor("&r "));
                sender.sendMessage(MessageColors.getMsgColor("&a AdvancedJoins &7| &3Help:"));
                sender.sendMessage(MessageColors.getMsgColor("&r "));
                sender.sendMessage(MessageColors.getMsgColor("&7  <> Required &7&l|&r&7 [] Optional"));
                sender.sendMessage(MessageColors.getMsgColor("&r "));
                sender.sendMessage(MessageColors.getMsgColor("&f * &a/" + label + " help"));
                sender.sendMessage(MessageColors.getMsgColor("&f * &a/" + label + " info"));
                sender.sendMessage(MessageColors.getMsgColor("&f * &a/" + label + " reload"));
                sender.sendMessage(MessageColors.getMsgColor("&r "));
                return true;
            } else if (args[0].equalsIgnoreCase("info") || args[0].equalsIgnoreCase("version")) {
                sender.sendMessage(MessageColors.getMsgColor("&r "));
                sender.sendMessage(MessageColors.getMsgColor("&a AdvancedJoins &7| &3Info:"));
                sender.sendMessage(MessageColors.getMsgColor("&r "));
                sender.sendMessage(MessageColors.getMsgColor("&f * &9version: &f"+plugin.version));
                sender.sendMessage(MessageColors.getMsgColor("&f * &aCreated: &fCarpodi&7, &fHappyRogelio7&7, &fKamila21Y&7, &fKaoryStudios&7, &fKaoryStudiosMC&7."));
                sender.sendMessage(MessageColors.getMsgColor("&f * &dGitHub: &fhttps://github.com/KaoryStudios"));
                sender.sendMessage(MessageColors.getMsgColor("&f * &6Website: &fhttps://kaorystudios.xyz/"));
                sender.sendMessage(MessageColors.getMsgColor("&r "));
                return true;
            } else if (args[0].equalsIgnoreCase("reload")){
                if (!sender.hasPermission("advancedjoins.reload")){
                    sender.sendMessage(MessageColors.getMsgColor("&cYou dont have permission to use this!"));
                    return true;
                }
                plugin.getConfig().reload();
                plugin.getConfig().save();
                sender.sendMessage(MessageColors.getMsgColor("&aReloaded Config file."));
                return true;
            }

        }

        return true;
    }
}