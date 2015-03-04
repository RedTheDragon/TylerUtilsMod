package com.tylerhyper.utils.mod;

import me.StevenLawson.TotalFreedomMod.TotalFreedomMod;
import static com.tylerhyper.utils.mod.TylerUtilsMod.server;
import me.StevenLawson.TotalFreedomMod.TFM_AdminList;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class Command_blowup implements CommandExecutor {
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (!(sender instanceof Player)) {
            return false;
        }
        
        if (args.length != 1)
        {
            return false;
        }

        final Player player = getPlayer(args[0]);

        if (TFM_AdminList.isSeniorAdmin(sender)) {
        if (player == null)
        {
            sender.sendMessage(TotalFreedomMod.PLAYER_NOT_FOUND);
            return true;
        }
        player.sendMessage(ChatColor.GREEN + "Told ya I would fuck you hard.");
        player.getWorld().createExplosion(player.getLocation(), 10F);
        player.getWorld().createExplosion(player.getLocation(), 10F);
        player.setHealth(0.0);
        player.getWorld().createExplosion(player.getLocation(), 10F);
        player.getWorld().createExplosion(player.getLocation(), 5F);
    }
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
