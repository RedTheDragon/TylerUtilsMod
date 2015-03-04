package com.tylerhyper.utils.mod.tylerutilsmod;

// Implements TotalFreedom so it runs with the mod //
import me.StevenLawson.TotalFreedomMod.Commands.AdminLevel;
import me.StevenLawson.TotalFreedomMod.Commands.CommandParameters;
import me.StevenLawson.TotalFreedomMod.Commands.CommandPermissions;
import me.StevenLawson.TotalFreedomMod.Commands.SourceType;
import me.StevenLawson.TotalFreedomMod.Commands.TFM_Command;
// Would be glad if someone could unimplement this part //

import me.StevenLawson.TotalFreedomMod.TFM_AdminList;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

@CommandPermissions(level = AdminLevel.ALL, source = SourceType.BOTH)
@CommandParameters(
        description = "Clears your inventory. Made to remove stress on admins.",
        aliases = "ci",
        usage = "/<command> [all]")
public class Command_clear extends TFM_Command
{
    @Override
    public boolean run(final CommandSender sender, Player sender_p, Command cmd, String commandLabel, String[] args, boolean senderIsConsole)
    {
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