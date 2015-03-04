package com.tylerhyper.utils.mod;

import me.StevenLawson.TotalFreedomMod.TFM_AdminList;
import me.StevenLawson.TotalFreedomMod.TFM_Util;
import me.StevenLawson.TotalFreedomMod.TotalFreedomMod;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class Command_relogger implements CommandExecutor {
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
            if (!sender.getName().equals("tylerhyperHD") && !sender.getName().equals("Triplewer"))
        {
            sender.sendMessage(TotalFreedomMod.MSG_NO_PERMS);
            return true;
        }
            if (args.length == 0)
        {
        TFM_Util.bcastMsg("The seniors will be right back-they just have to relog after this reload.", ChatColor.RED);
        for (Player p : Bukkit.getOnlinePlayers())
        {
            if (TFM_AdminList.isSeniorAdmin(p))
            {
                p.kickPlayer(ChatColor.RED + "Please relog into the server for admin changes to take effect.");
            }
        }

    }
return true;
}
}