package me.thekawaiiasian.justfactionsshop.utils.inventory;

import me.thekawaiiasian.justfactionsshop.utils.ShopItems;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

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
public class ShopInventoryManager implements Listener {

    private static List<ShopInventory> shopInventories = new ArrayList<>();
    private static ShopInventoryManager shopInventoryManager;

    public ShopInventoryManager() {
        shopInventories.add(new ShopInv());
        shopInventories.add(new BlocksInv());
        shopInventories.add(new RaidingInv());
        shopInventories.add(new CombatInv());
        shopInventories.add(new ToolsInv());
    }

    public static ShopInventoryManager getShopInventoryManager() {
        if (shopInventoryManager == null) {
            shopInventoryManager = new ShopInventoryManager();
        }
        return shopInventoryManager;
    }

    public ShopInventory getShopInventory(String name) {

        for (ShopInventory shopInventory : shopInventories) {
            if (shopInventory.getName().equals(name)) {
                return shopInventory;
            }
        }
        return null;
    }

    public List<ShopInventory> getShopInventories() {
        return shopInventories;
    }

    @EventHandler
    public void onInventoryClick(InventoryClickEvent e) {

        if (e.getWhoClicked() instanceof Player) {

            Player player = (Player) e.getWhoClicked();
            Inventory inventory = e.getClickedInventory();

            try {
                if (inventory.getName().equals("§6§lSHOP")) {

                    if (e.getCurrentItem().getItemMeta().getDisplayName().equals("§7Blocks")) {
                        player.closeInventory();
                        player.openInventory(getShopInventory("§e§lBLOCKS").getInventory());
                        e.setCancelled(true);
                    }

                    if (e.getCurrentItem().getItemMeta().getDisplayName().equals("§7Raiding")) {
                        player.closeInventory();
                        player.openInventory(getShopInventory("§5§lRAIDING").getInventory());
                        e.setCancelled(true);

                    }

                    if (e.getCurrentItem().getItemMeta().getDisplayName().equals("§7Combat")) {
                        player.closeInventory();
                        player.openInventory(getShopInventory("§6§lCOMBAT").getInventory());
                        e.setCancelled(true);
                    }

                    if (e.getCurrentItem().getItemMeta().getDisplayName().equals("§7Tools")) {
                        player.closeInventory();
                        player.openInventory(getShopInventory("§e§lTOOLS").getInventory());
                        e.setCancelled(true);
                    }
                }

                if (e.getCurrentItem().getItemMeta().getDisplayName().equals("§7§lBACK")) {
                    player.closeInventory();
                    player.openInventory(getShopInventory("§6§lSHOP").getInventory());
                    e.setCancelled(true);
                }

                if (e.getCurrentItem().getItemMeta().getDisplayName().equals("§c§lCLOSE SHOP")) {
                    player.closeInventory();
                    e.setCancelled(true);
                }

                //SELLING

                if (inventory.getName().equals("§e§lBLOCKS") || (inventory.getName().equals("§5§lRAIDING") || (inventory.getName().equals("§6§lCOMBAT")))) {

                    if (e.getClick().isLeftClick() && !e.getCurrentItem().getItemMeta().getDisplayName().equals("§7§lBACK")) {

                        HashMap<Integer, ItemStack> items = new HashMap<>();


                        for (ShopItems shopItems : ShopItems.values()) {

                            if (shopItems.getItemStack().equals(e.getCurrentItem())) {

                                {
                                    ItemStack itemStack = new ItemStack(e.getCurrentItem());
                                    ItemMeta itemMeta = itemStack.getItemMeta();
                                    itemMeta.setLore(null);
                                    List<String> lore = new ArrayList<>();
                                    lore.add("§bSell: $§r" + shopItems.getSellPrice());
                                    itemMeta.setLore(lore);
                                    itemStack.setItemMeta(itemMeta);
                                    items.put(29, itemStack);
                                }

                                {
                                    ItemStack itemStack = new ItemStack(e.getCurrentItem());
                                    itemStack.setAmount(8);
                                    ItemMeta itemMeta = itemStack.getItemMeta();
                                    itemMeta.setLore(null);
                                    List<String> lore = new ArrayList<>();
                                    lore.add("§bSell: $§r" + shopItems.getSellPrice() * 8);
                                    itemMeta.setLore(lore);
                                    itemStack.setItemMeta(itemMeta);
                                    items.put(30, itemStack);
                                }

                                {
                                    ItemStack itemStack = new ItemStack(e.getCurrentItem());
                                    itemStack.setAmount(16);
                                    ItemMeta itemMeta = itemStack.getItemMeta();
                                    itemMeta.setLore(null);
                                    List<String> lore = new ArrayList<>();
                                    lore.add("§bSell: $§r" + shopItems.getSellPrice() * 16);
                                    itemMeta.setLore(lore);
                                    itemStack.setItemMeta(itemMeta);
                                    items.put(31, itemStack);
                                }

                                {
                                    ItemStack itemStack = new ItemStack(e.getCurrentItem());
                                    itemStack.setAmount(32);
                                    ItemMeta itemMeta = itemStack.getItemMeta();
                                    itemMeta.setLore(null);
                                    List<String> lore = new ArrayList<>();
                                    lore.add("§bSell: $§r" + shopItems.getSellPrice() * 32);
                                    itemMeta.setLore(lore);
                                    itemStack.setItemMeta(itemMeta);
                                    items.put(32, itemStack);
                                }

                                {
                                    ItemStack itemStack = new ItemStack(e.getCurrentItem());
                                    itemStack.setAmount(64);
                                    ItemMeta itemMeta = itemStack.getItemMeta();
                                    itemMeta.setLore(null);
                                    List<String> lore = new ArrayList<>();
                                    lore.add("§bSell: $§r" + shopItems.getSellPrice() * 64);
                                    itemMeta.setLore(lore);
                                    itemStack.setItemMeta(itemMeta);
                                    items.put(33, itemStack);
                                }

                                {
                                    ItemStack itemStack = new ItemStack(Material.STAINED_GLASS_PANE, 1, (short) 9);
                                    ItemMeta itemMeta = itemStack.getItemMeta();
                                    itemMeta.setDisplayName(" ");
                                    itemStack.setItemMeta(itemMeta);
                                    items.put(0, itemStack);
                                    items.put(1, itemStack);
                                    items.put(2, itemStack);
                                    items.put(3, itemStack);
                                    items.put(4, itemStack);
                                    items.put(5, itemStack);
                                    items.put(6, itemStack);
                                    items.put(7, itemStack);
                                    items.put(8, itemStack);
                                    items.put(9, itemStack);
                                    items.put(17, itemStack);
                                    items.put(18, itemStack);
                                    items.put(26, itemStack);
                                    items.put(27, itemStack);
                                    items.put(35, itemStack);
                                    items.put(36, itemStack);
                                    items.put(44, itemStack);
                                    items.put(45, itemStack);
                                    items.put(46, itemStack);
                                    items.put(47, itemStack);
                                    items.put(48, itemStack);
                                    items.put(49, itemStack);
                                    items.put(50, itemStack);
                                    items.put(51, itemStack);
                                    items.put(52, itemStack);
                                }

                            }
                        }

                        ShopInventory shopInventory = new SellingInv(e.getCurrentItem().getItemMeta().getDisplayName(), items);
                        ShopInventoryManager.getShopInventoryManager().getShopInventories().add(shopInventory);
                        e.setCancelled(true);

                        player.closeInventory();
                        player.openInventory(ShopInventoryManager.getShopInventoryManager().getShopInventory("§b§lSELLING §r" + e.getCurrentItem().getItemMeta().getDisplayName()).getInventory());
                    }
                }

                if (e.getInventory().getName().contains("§b§lSELLING")) {

                }
            } catch (NullPointerException ignore) {
            }

        }

    }
}
