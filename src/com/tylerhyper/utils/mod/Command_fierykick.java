package com.tylerhyper.utils.mod;

// Implements TotalFreedom so it runs with the mod //
import me.StevenLawson.TotalFreedomMod.Commands.AdminLevel;
import me.StevenLawson.TotalFreedomMod.Commands.CommandParameters;
import me.StevenLawson.TotalFreedomMod.Commands.CommandPermissions;
import me.StevenLawson.TotalFreedomMod.Commands.SourceType;
import me.StevenLawson.TotalFreedomMod.Commands.TFM_Command;
// Would be glad if someone could unimplement this part //

import me.StevenLawson.TotalFreedomMod.TFM_Ban;
import me.StevenLawson.TotalFreedomMod.TFM_BanManager;
import me.StevenLawson.TotalFreedomMod.TFM_Util;
import me.StevenLawson.TotalFreedomMod.TotalFreedomMod;
import org.bukkit.ChatColor;
import org.bukkit.Location;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

@CommandPermissions(level = AdminLevel.SUPER, source = SourceType.BOTH)
@CommandParameters(description = "Paralyz a person from joining or five minutes!", usage = "/<command> <partialname>", aliases = "fkick")
public class Command_fierykick extends TFM_Command
{
    @Override
    public boolean run(CommandSender sender, Player sender_p, Command cmd, String commandLabel, String[] args, boolean senderIsConsole)
<<<<<<< Updated upstream:src/me/StevenLawson/TotalFreedomMod/Commands/Command_tban.java
    {
=======
    {        
>>>>>>> Stashed changes:src/com/tylerhyper/utils/mod/Command_fierykick.java
        if (args.length != 1)
        {
            return false;
        }

        final Player player = getPlayer(args[0]);

        if (player == null)
        {
            playerMsg(TotalFreedomMod.PLAYER_NOT_FOUND, ChatColor.RED);
            return true;
        }

<<<<<<< Updated upstream:src/me/StevenLawson/TotalFreedomMod/Commands/Command_tban.java
=======

>>>>>>> Stashed changes:src/com/tylerhyper/utils/mod/Command_fierykick.java
        // strike with lightning effect:
        final Location targetPos = player.getLocation();
        for (int x = -1; x <= 1; x++)
        {
            for (int z = -1; z <= 1; z++)
            {
                final Location strike_pos = new Location(targetPos.getWorld(), targetPos.getBlockX() + x, targetPos.getBlockY(), targetPos.getBlockZ() + z);
                targetPos.getWorld().strikeLightning(strike_pos);
            }
        }

<<<<<<< Updated upstream:src/me/StevenLawson/TotalFreedomMod/Commands/Command_tban.java
        TFM_Util.adminAction(sender.getName(), "Tempbanning: " + player.getName() + " for 5 minutes.", true);
        TFM_BanManager.addUuidBan(
                new TFM_Ban(TFM_Util.getUuid(player), player.getName(), sender.getName(), TFM_Util.parseDateOffset("5m"), ChatColor.RED + "You have been temporarily banned for 5 minutes."));

        player.kickPlayer(ChatColor.RED + "You have been temporarily banned for five minutes. Please read alexfreedommc.proboards.com for more info.");
=======
        TFM_Util.bcastMsg(sender.getName() + " is kicking " + player.getName() + " with a FIERY boot!", ChatColor.RED);
                TFM_BanManager.addUuidBan(
                new TFM_Ban(TFM_Util.getUuid(player), player.getName(), sender.getName(), TFM_Util.parseDateOffset("5m"), ChatColor.RED + "You're temporarily paralyzed for 5 minutes while we heal up that kick mark.."));
        player.kickPlayer(ChatColor.RED + sender.getName() + "'s boot hit ya' in the face..");
       
>>>>>>> Stashed changes:src/com/tylerhyper/utils/mod/Command_fierykick.java

        return true;
    }
}
