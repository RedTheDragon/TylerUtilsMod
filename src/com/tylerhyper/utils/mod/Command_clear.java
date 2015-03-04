package com.tylerhyper.utils.mod;

import me.StevenLawson.TotalFreedomMod.TFM_AdminList;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class Command_clear implements CommandExecutor {
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (!(sender instanceof Player)) {
            return false;
        }
      if (TFM_AdminList.isSeniorAdmin(sender))
        {
            if (args.length < 1)
            {
            return false;
            }
            if (args[0].equals("all"))
            {
          for(Player player : Bukkit.getOnlinePlayers())
                {
                    player.closeInventory();
                    player.getInventory().clear();
                    player.sendMessage(ChatColor.GOLD + "Your inventory has been cleared by an Administrator.");
                }
            }
            else
            {
                Player player = (Player)sender;
                player.closeInventory();
                player.getInventory().clear();
                player.sendMessage(ChatColor.GOLD + "Your inventory has been cleared.");
            }
        }
        else
      {
        Player player = (Player)sender;
        player.closeInventory();
        player.getInventory().clear();
        player.sendMessage(ChatColor.GOLD + "Your inventory has been cleared.");
      }
        return true;
    }
}