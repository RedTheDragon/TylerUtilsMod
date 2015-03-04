package com.tylerhyper.utils.mod;

// Implements TotalFreedom so it runs with the mod //
import me.StevenLawson.TotalFreedomMod.Commands.AdminLevel;
import me.StevenLawson.TotalFreedomMod.Commands.CommandParameters;
import me.StevenLawson.TotalFreedomMod.Commands.CommandPermissions;
import me.StevenLawson.TotalFreedomMod.Commands.SourceType;
import me.StevenLawson.TotalFreedomMod.Commands.TFM_Command;
// Would be glad if someone could unimplement this part //

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.PlayerInventory;

@CommandPermissions(level = AdminLevel.ALL, source = SourceType.BOTH)
@CommandParameters(description = "Allows people to pull out their long shaft.", usage = "/<command>", aliases = "longcock")
public class Command_longshaft extends TFM_Command
{

    @Override
    public boolean run(CommandSender sender, Player sender_p, Command cmd, String commandLabel, String[] args, boolean senderIsConsole)
    {
        PlayerInventory inv = sender_p.getInventory();
        ItemStack LongShaft = new ItemStack(Material.STICK, 1);
        for (Enchantment ench : Enchantment.values())
            {
                LongShaft.addUnsafeEnchantment(ench, 10000);
            }
        inv.addItem(LongShaft);
        sender_p.sendMessage(ChatColor.GOLD + "Giving you a long, hard shaft.");
        
        return true;
    }
}
