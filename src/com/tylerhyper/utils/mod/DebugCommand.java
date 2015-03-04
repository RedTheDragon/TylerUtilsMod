package com.tylerhyper.utils.mod;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import  com.tylerhyper.utils.mod.TylerUtilsMod;
import org.bukkit.entity.Player;

/**
 * Handler for the /debug sample command.
 * @author SpaceManiac
 */
public class DebugCommand implements CommandExecutor {
    private final TylerUtilsMod plugin;

    public DebugCommand(TylerUtilsMod plugin) {
        this.plugin = plugin;
    }
    
    public boolean onCommand(CommandSender sender, Command command, String label, String[] split) {
        if (sender instanceof Player) {
            Player player = (Player) sender;
            plugin.setDebugging(player, !plugin.isDebugging(player));
            return true;
        } else {
            return false;
        }
    }
}
