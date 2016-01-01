package me.thekawaiiasian.justfactionsshop.listeners;

import me.thekawaiiasian.justfactionsshop.utils.inventory.ShopInventoryManager;
import me.thekawaiiasian.justfactionsshop.utils.npc.NPCManager;
import org.bukkit.entity.Villager;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerInteractEntityEvent;

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
public class EntityInteractListener implements Listener{

    @EventHandler
    public void onEntityInteract(PlayerInteractEntityEvent e){

        if (e.getRightClicked() instanceof Villager) {

            Villager villager = (Villager) e.getRightClicked();

            if (villager.getLocation().equals(NPCManager.getManager().getNPC(1).getLocation())) {
                e.setCancelled(true);
                e.getPlayer().openInventory(ShopInventoryManager.getShopInventoryManager().getShopInventory("§e§lBLOCKS").getInventory());
                e.getPlayer().sendMessage(NPCManager.getManager().getNPC(1).getName() + " §bHello, Welcome to the Blocks Shop. What would you like to purchase today?");
                return;
            }

            if (villager.getLocation().equals(NPCManager.getManager().getNPC(2).getLocation())) {
                e.setCancelled(true);
                e.getPlayer().openInventory(ShopInventoryManager.getShopInventoryManager().getShopInventory("§5§lRAIDING").getInventory());
                e.getPlayer().sendMessage(NPCManager.getManager().getNPC(2).getName() + " §bHello, Welcome to the Raiding Shop. What would you like to purchase today?");
                return;
            }

            if (villager.getLocation().equals(NPCManager.getManager().getNPC(4).getLocation())) {
                e.setCancelled(true);
                e.getPlayer().openInventory(ShopInventoryManager.getShopInventoryManager().getShopInventory("§6§lCOMBAT").getInventory());
                e.getPlayer().sendMessage(NPCManager.getManager().getNPC(4).getName() + " §bHello, Welcome to the Combat Shop. What would you like to purchase today?");
                return;
            }

            if (villager.getLocation().equals(NPCManager.getManager().getNPC(5).getLocation())) {
                e.setCancelled(true);
                e.getPlayer().openInventory(ShopInventoryManager.getShopInventoryManager().getShopInventory("§e§lTOOLS").getInventory());
                e.getPlayer().sendMessage(NPCManager.getManager().getNPC(5).getName() + " §bHello, Welcome to the Tools Shop. What would you like to purchase today?");
                return;
            }

        }
    }
}
