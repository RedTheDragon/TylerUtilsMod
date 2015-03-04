package com.tylerhyper.utils.mod;

import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class annoycommand implements CommandExecutor {
    public boolean onCommand (CommandSender sender, Command command, String label, String[] split) {
        if (!(sender instanceof Player)) {
            return false;
        }
        Player player = (Player) sender;
        if (split.length == 0) {
        	Bukkit.getLogger().info("FUCK ME HARD");
        	Bukkit.getLogger().info("FUCK ME HARD");
        	Bukkit.getLogger().info("FUCK ME HARD");
        	Bukkit.getLogger().info("FUCK ME HARD");
        	Bukkit.getLogger().info("FUCK ME HARD");
        	Bukkit.getLogger().info("FUCK ME HARD");
        	Bukkit.getLogger().info("FUCK ME HARD");
        	Bukkit.getLogger().info("FUCK ME HARD");
        	Bukkit.getLogger().info("FUCK ME HARD");
        	Bukkit.getLogger().info("FUCK ME HARD");
        	Bukkit.getLogger().info("FUCK ME HARD");
        	Bukkit.getLogger().info("FUCK ME HARD");
        	return true;
        }
		return false;
}
}
