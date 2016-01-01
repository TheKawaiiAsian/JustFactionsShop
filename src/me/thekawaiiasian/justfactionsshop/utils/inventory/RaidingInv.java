package me.thekawaiiasian.justfactionsshop.utils.inventory;

import me.thekawaiiasian.justfactionsshop.utils.ShopCategory;
import me.thekawaiiasian.justfactionsshop.utils.ShopItems;
import org.bukkit.Material;
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
public class RaidingInv extends ShopInventory {

    public RaidingInv() {
        super("§5§lRAIDING", 18, itemStacks, ShopCategory.RAIDING);
    }

    private static HashMap<Integer, ItemStack> itemStacks = new HashMap<>();


    {
        ItemStack itemStack = new ItemStack(Material.ARROW);
        ItemMeta itemMeta = itemStack.getItemMeta();
        itemMeta.setDisplayName("§7§lBACK");
        itemStack.setItemMeta(itemMeta);
        itemStacks.put(17, itemStack);
    }

    {
        for (ShopItems shopItems : ShopItems.values()) {

            if (shopItems.getShopCategory().equals(ShopCategory.RAIDING)) {

                ItemMeta itemMeta = shopItems.getItemStack().getItemMeta();
                itemMeta.setDisplayName("§7" + shopItems.getName());
                List<String> lore = new ArrayList<>();
                lore.add("§3Buy Price: §7" + shopItems.getBuyPrice());
                lore.add("§bSell Price: §7" + shopItems.getSellPrice());
                lore.add("§7§oLeft Click to Sell | Right Click to Buy");
                itemMeta.setLore(lore);
                shopItems.getItemStack().setItemMeta(itemMeta);
                itemStacks.put(shopItems.getInventorySlot(), shopItems.getItemStack());


            }
        }

    }
}
