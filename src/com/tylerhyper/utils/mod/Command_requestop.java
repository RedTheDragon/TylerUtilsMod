package com.tylerhyper.utils.mod;

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

@CommandPermissions(level = AdminLevel.ALL, source = SourceType.ONLY_IN_GAME)
@CommandParameters(description = "Request op", usage = "/<command>", aliases = "canihaveop")
public class Command_requestop extends TFM_Command
{
    @Override
    public boolean run(CommandSender sender, Player sender_p, Command cmd, String commandLabel, String[] args, boolean senderIsConsole)
    {
        sender.sendMessage(ChatColor.GREEN + "You've just sent your request for op! An admin will op you soon.");

            for(Player player : Bukkit.getOnlinePlayers())
                {
            if (TFM_AdminList.isSuperAdmin(player))
            {
                player.sendMessage("§e[§bAdminChat§e] §4CONSOLE §5[Console]§f: " + ChatColor.YELLOW + sender_p.getName() + " needs to opped ");
            }
        }

        return true;
    }
}