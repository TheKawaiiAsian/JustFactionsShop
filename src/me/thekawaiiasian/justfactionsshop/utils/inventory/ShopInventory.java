package me.thekawaiiasian.justfactionsshop.utils.inventory;

import me.thekawaiiasian.justfactionsshop.utils.ShopCategory;
import org.bukkit.Bukkit;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;

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
public abstract class ShopInventory {

    private String name;
    private Integer size;
    private Inventory inventory;
    private HashMap<Integer, ItemStack> itemStacks;
    private ShopCategory shopCategory;

    public ShopInventory(String name, Integer size, HashMap<Integer, ItemStack> itemStacks, ShopCategory shopCategory) {
        this.name = name;
        this.size = size;
        this.inventory = Bukkit.createInventory(null, size, name);
        this.itemStacks = itemStacks;
        this.shopCategory = shopCategory;
    }

    public String getName() {
        return name;
    }

    public Inventory getInventory() {
        this.inventory.clear();
        for (Integer i : itemStacks.keySet()) {
            this.inventory.setItem(i, itemStacks.get(i));
        }
        return inventory;
    }

    public HashMap<Integer, ItemStack> getItemStacks() {
        return itemStacks;
    }

    public ShopCategory getShopCategory() {
        return shopCategory;
    }

    public Integer getSize() {
        return size;
    }
}
