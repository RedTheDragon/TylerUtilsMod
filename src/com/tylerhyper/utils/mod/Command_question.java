package com.tylerhyper.utils.mod;

// Implements TotalFreedom so it runs with the mod //
import me.StevenLawson.TotalFreedomMod.Commands.AdminLevel;
import me.StevenLawson.TotalFreedomMod.Commands.CommandParameters;
import me.StevenLawson.TotalFreedomMod.Commands.CommandPermissions;
import me.StevenLawson.TotalFreedomMod.Commands.SourceType;
import me.StevenLawson.TotalFreedomMod.Commands.TFM_Command;
// Would be glad if someone could unimplement this part //

import me.StevenLawson.TotalFreedomMod.Config.TFM_ConfigEntry;
import me.StevenLawson.TotalFreedomMod.TFM_Util;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

@CommandPermissions(level = AdminLevel.ALL, source = SourceType.ONLY_IN_GAME)
@CommandParameters(description = "Ask something to the admins.", usage = "/<command>")
public class Command_question extends TFM_Command
{
    @Override
    public boolean run(CommandSender sender, Player sender_p, Command cmd, String commandLabel, String[] args, boolean senderIsConsole)
    {
    if (TFM_ConfigEntry.TRAINING_SESSION.getBoolean().booleanValue())
     {
        sender.sendMessage(ChatColor.GREEN + "You've requested to talk during a meeting. We will give u access shortly.");

            for(Player player : Bukkit.getOnlinePlayers())
                {
            if (TFM_Util.isHighRank(player))
            {
                player.sendMessage("§e[§bAdminChat§e] §4CONSOLE §5[Console]§f: " + ChatColor.YELLOW + sender_p.getName() + " has requested to talk.");
            }
        }
     }
    else {
        sender_p.sendMessage(ChatColor.RED + "The question command is not available unless a quiz is active!");
    }
        return true;
    }
}