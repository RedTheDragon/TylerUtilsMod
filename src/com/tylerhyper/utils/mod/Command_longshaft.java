package com.tylerhyper.utils.mod;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.PlayerInventory;

public class Command_longshaft implements CommandExecutor {
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (!(sender instanceof Player)) {
            return false;
        }
        Player sender_p = Bukkit.getPlayer(sender.getName());
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
