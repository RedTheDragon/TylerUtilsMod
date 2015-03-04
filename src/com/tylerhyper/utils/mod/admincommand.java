
package com.tylerhyper.utils.mod;

import java.util.ArrayList;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.GameMode;
import org.bukkit.Location;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class admincommand implements CommandExecutor {
	
	private ArrayList<Player> admin = new ArrayList<Player>();
    public boolean onCommand(CommandSender sender, Command command, String label, String[] split) {
        if (!(sender instanceof Player)) {
            sender.sendMessage(ChatColor.RED + "Only players can do this command!");
            return true;
        }
        
        Player p = (Player) sender;

        if (split.length == 0) {
        	if (!admin.contains(p)) {
        		admin.add(p);
        		p.setGameMode(GameMode.CREATIVE);
        		p.sendMessage("You are in ADMIN mode.");
        		p.sendMessage("Your gamemode has been updated.");
        		return true;
        	}
        	else {
        		admin.remove(p);
        		p.setGameMode(GameMode.SURVIVAL);
        		p.sendMessage("You are now in PLAY mode.");
        		p.sendMessage("Your gamemode has been updated.");
        		return true;
        	}
        }
		return false;
}
}