package me.thekawaiiasian.justfactionsshop.utils.inventory;

import me.thekawaiiasian.justfactionsshop.utils.ShopCategory;
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
public class ShopInv extends ShopInventory{

    public ShopInv() {
        super("§6§lSHOP", 9, itemStacks, null);
    }

    private static HashMap<Integer, ItemStack> itemStacks = new HashMap<>();


    {
        for (ShopCategory shopCategory : ShopCategory.values()) {

            ItemMeta itemMeta = shopCategory.getItemStack().getItemMeta();
            itemMeta.setDisplayName("§7" + shopCategory.getName());
            shopCategory.getItemStack().setItemMeta(itemMeta);

            itemStacks.put(shopCategory.getID() - 1, shopCategory.getItemStack());
        }
    }

    {
        ItemStack itemStack = new ItemStack(Material.REDSTONE_BLOCK);
        ItemMeta itemMeta = itemStack.getItemMeta();
        itemMeta.setDisplayName("§c§lCLOSE SHOP");
        itemStack.setItemMeta(itemMeta);

        itemStacks.put(8, itemStack);
    }
}
