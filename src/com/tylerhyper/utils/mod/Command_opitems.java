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


public class Command_opitems implements CommandExecutor {
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (!(sender instanceof Player)) {
            return false;
        }
        Player player = Bukkit.getPlayer(sender.getName());
        PlayerInventory inv = player.getInventory();
        ItemStack sword = new ItemStack(Material.DIAMOND_SWORD, 1);
        ItemStack chestplate = new ItemStack(Material.DIAMOND_CHESTPLATE, 1);
        ItemStack leggings = new ItemStack(Material.DIAMOND_LEGGINGS, 1);
        ItemStack boots = new ItemStack(Material.DIAMOND_BOOTS, 1);
        ItemStack helmet = new ItemStack(Material.DIAMOND_HELMET, 1);
        ItemStack bow = new ItemStack(Material.BOW, 1);
        ItemStack arrow = new ItemStack(Material.ARROW, 1);
        for (Enchantment ench : Enchantment.values())
            {
                sword.addUnsafeEnchantment(ench, 10000);
            }
        for (Enchantment ench : Enchantment.values())
            {
                bow.addUnsafeEnchantment(ench, 10000);
            }
            for (Enchantment ench : Enchantment.values())
            {
                arrow.addUnsafeEnchantment(ench, 10000);
            }
                inv.addItem(bow);
                inv.addItem(arrow);
                inv.addItem(sword);
        for (Enchantment ench : Enchantment.values())
            {
                chestplate.addUnsafeEnchantment(ench, 10000);
            }
        for (Enchantment ench : Enchantment.values())
            {
                leggings.addUnsafeEnchantment(ench, 10000);
            }
        for (Enchantment ench : Enchantment.values())
            {
                boots.addUnsafeEnchantment(ench, 10000);
            }
        for (Enchantment ench : Enchantment.values())
            {
                helmet.addUnsafeEnchantment(ench, 10000);
            }
                inv.setHelmet(helmet);
                inv.setBoots(boots);
                inv.setLeggings(leggings);
                inv.setChestplate(chestplate);
                sender.sendMessage(ChatColor.RED + "Op items have been placed in your inventory.");
                return true;
            }
 }