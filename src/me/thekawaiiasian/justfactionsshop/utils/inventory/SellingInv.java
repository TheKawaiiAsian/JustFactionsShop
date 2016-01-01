package me.thekawaiiasian.justfactionsshop.utils.inventory;

import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.HashMap;

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
public class SellingInv extends ShopInventory{

    public SellingInv(String name, HashMap<Integer, ItemStack> itemStacks) {
        super("§b§lSELLING §r" + name, 54, itemStacks, null);

        {
            ItemStack itemStack = new ItemStack(Material.ARROW);
            ItemMeta itemMeta = itemStack.getItemMeta();
            itemMeta.setDisplayName("§7§lBACK");
            itemStack.setItemMeta(itemMeta);
            itemStacks.put(53, itemStack);
        }

    }

}
