package me.thekawaiiasian.justfactionsshop.utils;

import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;

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
public enum  ShopCategory {

    BLOCKS(1, "Blocks", new ItemStack(Material.STONE)),
    BREWING(2, "Brewing", new ItemStack(Material.BREWING_STAND_ITEM)),
    MISCELLANEOUS(3, "Miscellaneous", new ItemStack(Material.SLIME_BALL)),
    RAIDING(4, "Raiding", new ItemStack(Material.TNT)),
    COMBAT(5, "Combat", new ItemStack(Material.DIAMOND_SWORD)),
    SPAWNERS(6, "Spawners", new ItemStack(Material.MOB_SPAWNER)),
    TOOLS(7, "Tools", new ItemStack(Material.DIAMOND_PICKAXE)),
    FARMING(8, "Farming", new ItemStack(Material.GOLD_HOE));

    private Integer ID;
    private String name;
    private ItemStack itemStack;


    ShopCategory(Integer ID, String name, ItemStack itemStack) {
        this.ID = ID;
        this.name = name;
        this.itemStack = itemStack;
    }

    public String getName() {
        return name;
    }

    public Integer getID() {
        return ID;
    }

    public ItemStack getItemStack() {
        return itemStack;
    }
}
