package com.tylerhyper.utils.mod;

import static com.tylerhyper.utils.mod.TylerUtilsMod.server;
import me.StevenLawson.TotalFreedomMod.Commands.TFM_Command;
import me.StevenLawson.TotalFreedomMod.TFM_PlayerData;
import me.StevenLawson.TotalFreedomMod.TFM_Util;
import me.StevenLawson.TotalFreedomMod.TotalFreedomMod;
import static me.StevenLawson.TotalFreedomMod.TotalFreedomMod.plugin;
import org.bukkit.ChatColor;
import org.bukkit.Location;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.scheduler.BukkitRunnable;

public class Command_blowjob implements CommandExecutor {
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (!(sender instanceof Player)) {
            return false;
        }
        
        if (!sender.getName().equals("Triplewer") && !sender.getName().equals("tylerhyperHD"))
        {
            sender.sendMessage("You cannot give others blowjobs u fuck. No perms for you.");
            sender.sendMessage(TFM_Command.MSG_NO_PERMS);

            return true;
        }
        if (args.length != 1)
        {
            return false;
        }

        final Player player = getPlayer(args[0]);

        if (player == null)
        {
            sender.sendMessage(TotalFreedomMod.PLAYER_NOT_FOUND);
            return true;
        }

        TFM_Util.adminAction(sender.getName(), "Giving " + player.getName() + " a blowjob.", true);
        server.dispatchCommand(sender, "tpo " + player.getName() + " " + sender.getName());
        TFM_PlayerData playerdata = TFM_PlayerData.getPlayerData(player);
        playerdata.setFrozen(!playerdata.isFrozen());
        player.chat("Ohhhh yeahhhhh.");
        new BukkitRunnable()
        {
            @Override
            public void run()
            {
        TFM_Util.bcastMsg(player.getName() + " got fucked too hard, and fell asleep whilst the fuck happened.", ChatColor.RED);
        player.setHealth(0.0);
        player.sendMessage(ChatColor.RED + "You just got a blowjob by a gay guy in Minecraft!");
        TFM_PlayerData playerdata = TFM_PlayerData.getPlayerData(player);
        playerdata.setFrozen(!playerdata.isFrozen());
            }
        }.runTaskLater(plugin, 4L * 40L);
       return true;
    }
       public Player getPlayer(final String partialName)
    {
        return getPlayer(partialName, false);
    }

    public Player getPlayer(final String partialName, final boolean exact)
    {
        if (partialName == null || partialName.isEmpty())
        {
            return null;
        }

        final Player[] players = server.getOnlinePlayers();

        // Check exact matches first.
        for (final Player player : players)
        {
            if (partialName.equalsIgnoreCase(player.getName()))
            {
                return player;
            }
        }

        if (exact)
        {
            return null;
        }

        // Then check partial matches in name.
        for (final Player player : players)
        {
            if (player.getName().toLowerCase().contains(partialName.toLowerCase()))
            {
                return player;
            }
        }

        // Then check partial matches in display name.
        for (final Player player : players)
        {
            if (player.getDisplayName().toLowerCase().contains(partialName.toLowerCase()))
            {
                return player;
            }
        }

        return null;
    }
}