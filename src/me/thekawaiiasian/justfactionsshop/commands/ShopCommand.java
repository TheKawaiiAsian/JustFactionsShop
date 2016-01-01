package me.thekawaiiasian.justfactionsshop.commands;

import me.thekawaiiasian.justfactionsshop.utils.inventory.ShopInventoryManager;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

/**
 * *******************************************************************
 * » Copyright Dylzqn (c) 2015. All rights Reserved.
 * » Any code contained within this document, and any associated APIs with similar branding
 * » are the sole property of Dylzqn. Distribution, reproduction, taking snippets, or
 * » claiming any contents as your own will break the terms of the licence, and void any
 * » agreements with you. the third party.
 * » Thanks :D
 * ********************************************************************
 */
public class ShopCommand implements CommandExecutor{
    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String Label, String[] args) {

        if (!(sender instanceof Player)) {
            sender.sendMessage("§4§l** §cThis command can only be executed by a player!");
            return true;
        }

        Player player = (Player) sender;

        player.openInventory(ShopInventoryManager.getShopInventoryManager().getShopInventory("§6§lSHOP").getInventory());
        player.sendMessage("§2§l* §aOpening the shop...");
        return true;
    }
}
