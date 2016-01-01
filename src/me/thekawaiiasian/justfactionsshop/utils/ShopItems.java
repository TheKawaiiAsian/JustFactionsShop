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
public enum ShopItems {

    //BLOCKS
    STONE("Stone", new ItemStack(Material.STONE),  0, ConfigFile.getConfig().getInt("Shop.Stone.Buy"), ConfigFile.getConfig().getInt("Shop.Stone.Sell"), ShopCategory.BLOCKS),
    COBBLESTONE("Cobblestone", new ItemStack(Material.COBBLESTONE), 1, ConfigFile.getConfig().getInt("Shop.Cobblestone.Buy"), ConfigFile.getConfig().getInt("Shop.Cobblestone.Sell"), ShopCategory.BLOCKS),
    MOSS_STONE("Moss Stone", new ItemStack(Material.MOSSY_COBBLESTONE), 2, ConfigFile.getConfig().getInt("Shop.Moss Stone.Buy"), ConfigFile.getConfig().getInt("Shop.Moss Stone.Sell"), ShopCategory.BLOCKS),
    STONE_BRICKS("Stone Brick", new ItemStack(Material.SMOOTH_BRICK), 3, ConfigFile.getConfig().getInt("Shop.Stone Brick.Buy"), ConfigFile.getConfig().getInt("Shop.Stone Brick.Sell"), ShopCategory.BLOCKS),
    CRACKED_STONE_BRICKS("Cracked Stone Brick", new ItemStack(Material.SMOOTH_BRICK, 1, (short) 2), 4, ConfigFile.getConfig().getInt("Shop.Cracked Stone Brick.Buy"), ConfigFile.getConfig().getInt("Shop.Cracked Stone Brick.Sell"), ShopCategory.BLOCKS),
    CHISELED_STONE_BRICKS("Chiseled Stone Brick", new ItemStack(Material.SMOOTH_BRICK, 1,(short) 3), 5, ConfigFile.getConfig().getInt("Shop.Chiseled Stone Brick.Buy"), ConfigFile.getConfig().getInt("Shop.Chiseled Stone Brick.Sell"), ShopCategory.BLOCKS),
    GRAVEL("Gravel", new ItemStack(Material.GRAVEL), 6,  ConfigFile.getConfig().getInt("Shop.Gravel.Buy"), ConfigFile.getConfig().getInt("Shop.Gravel.Sell"), ShopCategory.BLOCKS),
    PACKEDICE("Packed Ice", new ItemStack(Material.PACKED_ICE), 7,  ConfigFile.getConfig().getInt("Shop.Packed Ice.Buy"), ConfigFile.getConfig().getInt("Shop.Packed Ice.Sell"), ShopCategory.BLOCKS),
    SAND("Sand", new ItemStack(Material.SAND), 8,  ConfigFile.getConfig().getInt("Shop.Sand.Buy"), ConfigFile.getConfig().getInt("Shop.Sand.Sell"), ShopCategory.BLOCKS),
    SANDSTONE("Sandstone", new ItemStack(Material.SANDSTONE), 9,  ConfigFile.getConfig().getInt("Shop.Sandstone.Buy"), ConfigFile.getConfig().getInt("Shop.Sandstone.Sell"), ShopCategory.BLOCKS),
    CHISELED_SANDSTONE("Chiseled Sandstone", new ItemStack(Material.SANDSTONE, 1,(short)1), 10, ConfigFile.getConfig().getInt("Shop.Chiseled Sandstone.Buy"), ConfigFile.getConfig().getInt("Shop.Chiseled Sandstone.Sell"), ShopCategory.BLOCKS),
    SMOOTH_SANDSTONE("Smooth Sandstone", new ItemStack(Material.SANDSTONE, 1,(short)2), 11, ConfigFile.getConfig().getInt("Shop.Smooth Sandstone.Buy"), ConfigFile.getConfig().getInt("Shop.Smooth Sandstone.Sell"), ShopCategory.BLOCKS),
    RED_SAND("Red Sand", new ItemStack(Material.SAND, 1,(short)1), 12,  ConfigFile.getConfig().getInt("Shop.Red Sand.Buy"), ConfigFile.getConfig().getInt("Shop.Red Sand.Sell"), ShopCategory.BLOCKS),
    RED_SANDSTONE("Red Sandstone", new ItemStack(Material.RED_SANDSTONE), 13,  ConfigFile.getConfig().getInt("Shop.Red Sandstone.Buy"), ConfigFile.getConfig().getInt("Shop.Red Sandstone.Sell"), ShopCategory.BLOCKS),
    SMOOTH_RED_SANDSTONE("Smooth Red Sandstone", new ItemStack(Material.RED_SANDSTONE, 1,(short)2), 14, ConfigFile.getConfig().getInt("Shop.Smooth Red Sandstone.Buy"), ConfigFile.getConfig().getInt("Shop.Smooth Red Sandstone.Sell"), ShopCategory.BLOCKS),
    ICE("Ice", new ItemStack(Material.ICE), 15,  ConfigFile.getConfig().getInt("Shop.Ice.Buy"), ConfigFile.getConfig().getInt("Shop.Ice.Sell"), ShopCategory.BLOCKS),
    OAK_WOOD("Oak Wood", new ItemStack(Material.LOG), 16,  ConfigFile.getConfig().getInt("Shop.Oak Wood.Buy"), ConfigFile.getConfig().getInt("Shop.Oak Wood.Sell"), ShopCategory.BLOCKS),
    SPRUCE_WOOD("Spruce Wood", new ItemStack(Material.LOG, 1,(short)1), 17,  ConfigFile.getConfig().getInt("Shop.Spruce Wood.Buy"), ConfigFile.getConfig().getInt("Shop.Spruce Wood.Sell"), ShopCategory.BLOCKS),
    BIRCH_WOOD("Birch Wood", new ItemStack(Material.LOG, 1,(short)2), 18,  ConfigFile.getConfig().getInt("Shop.Birch Wood.Buy"), ConfigFile.getConfig().getInt("Shop.Birch Wood.Sell"), ShopCategory.BLOCKS),
    JUNGLE_WOOD("Jungle Wood", new ItemStack(Material.LOG, 1,(short)3), 19,  ConfigFile.getConfig().getInt("Shop.Jungle Wood.Buy"), ConfigFile.getConfig().getInt("Shop.Jungle Wood.Sell"), ShopCategory.BLOCKS),
    ACACIA_WOOD("Acacia Wood", new ItemStack(Material.LOG_2), 20,  ConfigFile.getConfig().getInt("Shop.Acacia Wood.Buy"), ConfigFile.getConfig().getInt("Shop.Acacia Wood.Sell"), ShopCategory.BLOCKS),
    DARK_OAK_WOOD("Dark Oak Wood", new ItemStack(Material.LOG_2, 1,(short)1), 21,  ConfigFile.getConfig().getInt("Shop.Dark Oak Wood.Buy"), ConfigFile.getConfig().getInt("Shop.Dark Oak Wood.Sell"), ShopCategory.BLOCKS),
    OBSIDIAN("Obsidian", new ItemStack(Material.OBSIDIAN), 22,  ConfigFile.getConfig().getInt("Shop.Obsidian.Buy"), ConfigFile.getConfig().getInt("Shop.Obsidian.Sell"), ShopCategory.BLOCKS),
    END_STONE("End Stone", new ItemStack(Material.ENDER_STONE), 23,  ConfigFile.getConfig().getInt("Shop.End Stone.Buy"), ConfigFile.getConfig().getInt("Shop.End Stone.Sell"), ShopCategory.BLOCKS),
    SNOW("Snow", new ItemStack(Material.SNOW_BLOCK), 24,  ConfigFile.getConfig().getInt("Shop.Snow.Buy"), ConfigFile.getConfig().getInt("Shop.Snow.Sell"), ShopCategory.BLOCKS),
    OAK_Planks("Oak Wood Planks", new ItemStack(Material.WOOD), 25,  ConfigFile.getConfig().getInt("Shop.Oak Wood Planks.Buy"), ConfigFile.getConfig().getInt("Shop.Oak Wood Planks.Sell"), ShopCategory.BLOCKS),
    SPRUCE_Planks("Spruce Wood Planks", new ItemStack(Material.WOOD, 1,(short)1), 26,  ConfigFile.getConfig().getInt("Shop.Spruce Wood Planks.Buy"), ConfigFile.getConfig().getInt("Shop.Spruce Wood Planks.Sell"), ShopCategory.BLOCKS),
    BIRCH_Planks("Birch Wood Planks", new ItemStack(Material.WOOD, 1,(short)2), 27,  ConfigFile.getConfig().getInt("Shop.Birch Wood Planks.Buy"), ConfigFile.getConfig().getInt("Shop.Birch Wood Planks.Sell"), ShopCategory.BLOCKS),
    JUNGLE_Planks("Jungle Wood Planks", new ItemStack(Material.WOOD, 1,(short)3), 28,  ConfigFile.getConfig().getInt("Shop.Jungle Wood Planks.Buy"), ConfigFile.getConfig().getInt("Shop.Jungle Wood Planks.Sell"), ShopCategory.BLOCKS),
    ACACIA_Planks("Acacia Wood Planks", new ItemStack(Material.WOOD, 1,(short)4), 29,  ConfigFile.getConfig().getInt("Shop.Acacia Wood Planks.Buy"), ConfigFile.getConfig().getInt("Shop.Acacia Wood Planks.Sell"), ShopCategory.BLOCKS),
    DARK_Planks("Dark Wood Planks", new ItemStack(Material.WOOD, 1,(short)5), 30,  ConfigFile.getConfig().getInt("Shop.Dark Wood Planks.Buy"), ConfigFile.getConfig().getInt("Shop.Dark Wood Planks.Sell"), ShopCategory.BLOCKS),
    Soul_Sand("Soul Sand", new ItemStack(Material.SOUL_SAND), 31,  ConfigFile.getConfig().getInt("Shop.Soul Sand.Buy"), ConfigFile.getConfig().getInt("Shop.Soul Sand.Sell"), ShopCategory.BLOCKS),
    Glowstone("Glowstone", new ItemStack(Material.GLOWSTONE), 32,  ConfigFile.getConfig().getInt("Shop.Glowstone.Buy"), ConfigFile.getConfig().getInt("Shop.Glowstone.Sell"), ShopCategory.BLOCKS),
    Clay("Clay", new ItemStack(Material.CLAY), 33,  ConfigFile.getConfig().getInt("Shop.Clay.Buy"), ConfigFile.getConfig().getInt("Shop.Clay.Sell"), ShopCategory.BLOCKS),
    Quartz_block("Block Of Quartz", new ItemStack(Material.QUARTZ_BLOCK), 34,  ConfigFile.getConfig().getInt("Shop.Block Of Quartz.Buy"), ConfigFile.getConfig().getInt("Shop.Block Of Quartz.Sell"), ShopCategory.BLOCKS),
    Chiseled_Quartz_Block("Chiseled Quartz Block", new ItemStack(Material.QUARTZ_BLOCK, 1,(short)1), 35, ConfigFile.getConfig().getInt("Shop.Chiseled Quartz Block.Buy"), ConfigFile.getConfig().getInt("Shop.Chiseled Quartz Block.Sell"), ShopCategory.BLOCKS),
    PILLAR_QUARTZ_BLOCK("Pillar Quartz Block", new ItemStack(Material.QUARTZ_BLOCK, 1,(short)2), 36, ConfigFile.getConfig().getInt("Shop.Pillar Quartz Block.Buy"), ConfigFile.getConfig().getInt("Shop.Pillar Quartz Block.Sell"), ShopCategory.BLOCKS),
    JACKOLANTERN("Jack O' Lantern", new ItemStack(Material.JACK_O_LANTERN), 37, ConfigFile.getConfig().getInt("Shop.Jack O' Lantern.Buy"), ConfigFile.getConfig().getInt("Shop.Jack O' Lantern.Sell"), ShopCategory.BLOCKS),
    PUMPKIN("Pumpkin", new ItemStack(Material.PUMPKIN), 38, ConfigFile.getConfig().getInt("Shop.Pumpkin.Buy"), ConfigFile.getConfig().getInt("Shop.Pumpkin.Sell"), ShopCategory.BLOCKS),
    MELON("Melon", new ItemStack(Material.MELON), 39, ConfigFile.getConfig().getInt("Shop.Melon.Buy"), ConfigFile.getConfig().getInt("Shop.Melon.Sell"), ShopCategory.BLOCKS),
    NETHERBRICK("Nether Brick", new ItemStack(Material.NETHER_BRICK), 40, ConfigFile.getConfig().getInt("Shop.Nether Brick.Buy"), ConfigFile.getConfig().getInt("Shop.Nether Brick.Sell"), ShopCategory.BLOCKS),
    NETHERRACKS("Netherrack", new ItemStack(Material.NETHERRACK), 41, ConfigFile.getConfig().getInt("Shop.Netherrack.Buy"), ConfigFile.getConfig().getInt("Shop.Netherrack.Sell"), ShopCategory.BLOCKS),
    BRICKS("Bricks", new ItemStack(Material.BRICK), 42, ConfigFile.getConfig().getInt("Shop.Bricks.Buy"), ConfigFile.getConfig().getInt("Shop.Bricks.Sell"), ShopCategory.BLOCKS),
    DIRT("Dirt", new ItemStack(Material.DIRT), 43, ConfigFile.getConfig().getInt("Shop.Dirt.Buy"), ConfigFile.getConfig().getInt("Shop.Dirt.Sell"), ShopCategory.BLOCKS),
    GRASS("Grass Block", new ItemStack(Material.GRASS), 44, ConfigFile.getConfig().getInt("Shop.Grass Block.Buy"), ConfigFile.getConfig().getInt("Shop.Grass Block.Sell"), ShopCategory.BLOCKS),
    PODZOL("Podzol", new ItemStack(Material.DIRT, 1,(short)2), 45, ConfigFile.getConfig().getInt("Shop.Podzol.Buy"), ConfigFile.getConfig().getInt("Shop.Podzol.Sell"), ShopCategory.BLOCKS),
    MYCELIUM("Mycelium", new ItemStack(Material.MYCEL), 46, ConfigFile.getConfig().getInt("Shop.Mycelium.Buy"), ConfigFile.getConfig().getInt("Shop.Mycelium.Sell"), ShopCategory.BLOCKS),
    SPONGE("Sponge", new ItemStack(Material.SPONGE), 47, ConfigFile.getConfig().getInt("Shop.Sponge.Buy"), ConfigFile.getConfig().getInt("Shop.Sponge.Sell"), ShopCategory.BLOCKS),
    BOOKSHELF("Bookshelf", new ItemStack(Material.BOOKSHELF), 48, ConfigFile.getConfig().getInt("Shop.Bookshelf.Buy"), ConfigFile.getConfig().getInt("Shop.Bookshelf.Sell"), ShopCategory.BLOCKS),
    HAYBALE("Hay bale", new ItemStack(Material.HAY_BLOCK), 49, ConfigFile.getConfig().getInt("Shop.Hay bale.Buy"), ConfigFile.getConfig().getInt("Shop.Hay bale.Sell"), ShopCategory.BLOCKS),

    //RAIDING
    TNT("TNT", new ItemStack(Material.TNT), 0, ConfigFile.getConfig().getInt("Shop.TNT.Buy"), ConfigFile.getConfig().getInt("Shop.TNT.Sell"), ShopCategory.RAIDING),
    Dispenser("Dispenser", new ItemStack(Material.DISPENSER), 1, ConfigFile.getConfig().getInt("Shop.Dispenser.Buy"), ConfigFile.getConfig().getInt("Shop.Dispenser.Sell"), ShopCategory.RAIDING),
    RedstoneTorch("Redstone Torch", new ItemStack(Material.REDSTONE_TORCH_ON), 2, ConfigFile.getConfig().getInt("Shop.Redstone Torch.Buy"), ConfigFile.getConfig().getInt("Shop.Redstone Torch.Sell"), ShopCategory.RAIDING),
    Button("Button", new ItemStack(Material.STONE_BUTTON), 3, ConfigFile.getConfig().getInt("Shop.Stone Button.Buy"), ConfigFile.getConfig().getInt("Shop.Stone Button.Sell"), ShopCategory.RAIDING),
    RedstoneRepeater("Redstone Repeater", new ItemStack(Material.DIODE), 4, ConfigFile.getConfig().getInt("Shop.Redstone Repeater.Buy"), ConfigFile.getConfig().getInt("Shop.Redstone Repeater.Sell"), ShopCategory.RAIDING),
    Redstone("Redstone", new ItemStack(Material.REDSTONE), 5, ConfigFile.getConfig().getInt("Shop.Redstone.Buy"), ConfigFile.getConfig().getInt("Shop.Redstone.Sell"), ShopCategory.RAIDING),
    Lever("Lever", new ItemStack(Material.LEVER), 6, ConfigFile.getConfig().getInt("Shop.Lever.Buy"), ConfigFile.getConfig().getInt("Shop.Lever.Sell"), ShopCategory.RAIDING),
    Water("Water Bucket", new ItemStack(Material.WATER_BUCKET), 7, ConfigFile.getConfig().getInt("Shop.Water Bucket.Buy"), ConfigFile.getConfig().getInt("Shop.Water Bucket.Sell"), ShopCategory.RAIDING),
    CobWeb("Cobweb", new ItemStack(Material.WEB), 8, ConfigFile.getConfig().getInt("Shop.Cobweb.Buy"), ConfigFile.getConfig().getInt("Shop.Cobweb.Sell"), ShopCategory.RAIDING),
    Piston("Piston", new ItemStack(Material.PISTON_BASE), 9, ConfigFile.getConfig().getInt("Shop.Piston.Buy"), ConfigFile.getConfig().getInt("Shop.Piston.Sell"), ShopCategory.RAIDING),
    COMPARATOR("Comparator", new ItemStack(Material.REDSTONE_COMPARATOR), 10, ConfigFile.getConfig().getInt("Shop.Comparator.Buy"), ConfigFile.getConfig().getInt("Shop.Comparator.Sell"), ShopCategory.RAIDING),

    //COMBAT
    LEATHER_HELMET("Leather Helmet", new ItemStack(Material.LEATHER_HELMET), 0, ConfigFile.getConfig().getInt("Shop.Leather Helmet.Buy"), ConfigFile.getConfig().getInt("Shop.Leather Helmet.Sell"), ShopCategory.COMBAT),
    LEATHER_CHESTPLATE("Leather Chestplate", new ItemStack(Material.LEATHER_CHESTPLATE), 1, ConfigFile.getConfig().getInt("Shop.Leather Chestplate.Buy"), ConfigFile.getConfig().getInt("Shop.Leather Chestplate.Sell"), ShopCategory.COMBAT),
    LEATHER_LEGGINGS("Leather Leggings", new ItemStack(Material.LEATHER_LEGGINGS), 2, ConfigFile.getConfig().getInt("Shop.Leather Leggings.Buy"), ConfigFile.getConfig().getInt("Shop.Leather Leggings.Sell"), ShopCategory.COMBAT),
    LEATHER_BOOTS("Leather Boots", new ItemStack(Material.LEATHER_BOOTS), 3, ConfigFile.getConfig().getInt("Shop.Leather Boots.Buy"), ConfigFile.getConfig().getInt("Shop.Leather Boots.Sell"), ShopCategory.COMBAT),

    GOLDEN_HELMET("Golden Helmet", new ItemStack(Material.GOLD_HELMET), 4, ConfigFile.getConfig().getInt("Shop.Golden Helmet.Buy"), ConfigFile.getConfig().getInt("Shop.Golden Helmet.Sell"), ShopCategory.COMBAT),
    GOLDEN_CHESTPLATE("Golden Chestplate", new ItemStack(Material.GOLD_CHESTPLATE), 5, ConfigFile.getConfig().getInt("Shop.Golden Chestplate.Buy"), ConfigFile.getConfig().getInt("Shop.Golden Chestplate.Sell"), ShopCategory.COMBAT),
    GOLDEN_LEGGINGS("Golden Leggings", new ItemStack(Material.GOLD_LEGGINGS), 6, ConfigFile.getConfig().getInt("Shop.Golden Leggings.Buy"), ConfigFile.getConfig().getInt("Shop.Golden Leggings.Sell"), ShopCategory.COMBAT),
    GOLDEN_BOOTS("Golden Boots", new ItemStack(Material.GOLD_BOOTS), 7, ConfigFile.getConfig().getInt("Shop.Golden Boots.Buy"), ConfigFile.getConfig().getInt("Shop.Golden Boots.Sell"), ShopCategory.COMBAT),

    CHAIN_HELMET("Chain Helmet", new ItemStack(Material.CHAINMAIL_HELMET), 8, ConfigFile.getConfig().getInt("Shop.Chain Helmet.Buy"), ConfigFile.getConfig().getInt("Shop.Chain Helmet.Sell"), ShopCategory.COMBAT),
    CHAIN_CHESTPLATE("Chain Chestplate", new ItemStack(Material.CHAINMAIL_CHESTPLATE), 9, ConfigFile.getConfig().getInt("Shop.Chain Chestplate.Buy"), ConfigFile.getConfig().getInt("Shop.Chain Chestplate.Sell"), ShopCategory.COMBAT),
    CHAIN_LEGGINGS("Chain Leggings", new ItemStack(Material.CHAINMAIL_LEGGINGS), 10, ConfigFile.getConfig().getInt("Shop.Chain Leggings.Buy"), ConfigFile.getConfig().getInt("Shop.Chain Leggings.Sell"), ShopCategory.COMBAT),
    CHAIN_BOOTS("Chain Boots", new ItemStack(Material.CHAINMAIL_BOOTS), 11, ConfigFile.getConfig().getInt("Shop.Chain Boots.Buy"), ConfigFile.getConfig().getInt("Shop.Chain Boots.Sell"), ShopCategory.COMBAT),

    IRON_HELMET("Iron Helmet", new ItemStack(Material.IRON_HELMET), 12, ConfigFile.getConfig().getInt("Shop.Iron Helmet.Buy"), ConfigFile.getConfig().getInt("Shop.Iron Helmet.Sell"), ShopCategory.COMBAT),
    IRON_CHESTPLATE("Iron Chestplate", new ItemStack(Material.IRON_CHESTPLATE), 13, ConfigFile.getConfig().getInt("Shop.Iron Chestplate.Buy"), ConfigFile.getConfig().getInt("Shop.Iron Chestplate.Sell"), ShopCategory.COMBAT),
    IRON_LEGGINGS("Iron Leggings", new ItemStack(Material.IRON_LEGGINGS), 14, ConfigFile.getConfig().getInt("Shop.Iron Leggings.Buy"), ConfigFile.getConfig().getInt("Shop.Iron Leggings.Sell"), ShopCategory.COMBAT),
    IRON_BOOTS("Iron Boots", new ItemStack(Material.IRON_BOOTS), 15, ConfigFile.getConfig().getInt("Shop.Iron Boots.Buy"), ConfigFile.getConfig().getInt("Shop.Iron Boots.Sell"), ShopCategory.COMBAT),

    DIAMOND_HELMET("Diamond Helmet", new ItemStack(Material.DIAMOND_HELMET), 16, ConfigFile.getConfig().getInt("Shop.Diamond Helmet.Buy"), ConfigFile.getConfig().getInt("Shop.Diamond Helmet.Sell"), ShopCategory.COMBAT),
    DIAMOND_CHESTPLATE("Diamond Chestplate", new ItemStack(Material.DIAMOND_CHESTPLATE), 17, ConfigFile.getConfig().getInt("Shop.Diamond Chestplate.Buy"), ConfigFile.getConfig().getInt("Shop.Diamond Chestplate.Sell"), ShopCategory.COMBAT),
    DIAMOND_LEGGINGS("Diamond Leggings", new ItemStack(Material.DIAMOND_LEGGINGS), 18, ConfigFile.getConfig().getInt("Shop.Diamond Leggings.Buy"), ConfigFile.getConfig().getInt("Shop.Diamond Leggings.Sell"), ShopCategory.COMBAT),
    DIAMOND_BOOTS("Diamond Boots", new ItemStack(Material.DIAMOND_BOOTS), 19, ConfigFile.getConfig().getInt("Shop.Diamond Boots.Buy"), ConfigFile.getConfig().getInt("Shop.Diamond Boots.Sell"), ShopCategory.COMBAT),

    WOOD_SWORD("Wood Sword", new ItemStack(Material.WOOD_SWORD), 20, ConfigFile.getConfig().getInt("Shop.Wood Sword.Buy"), ConfigFile.getConfig().getInt("Shop.Wood Sword.Sell"), ShopCategory.COMBAT),
    STONE_SWORD("Stone Sword", new ItemStack(Material.STONE_SWORD), 21, ConfigFile.getConfig().getInt("Shop.Stone Sword.Buy"), ConfigFile.getConfig().getInt("Shop.Stone Sword.Sell"), ShopCategory.COMBAT),
    GOLDEN_SWORD("Golden Sword", new ItemStack(Material.GOLD_SWORD), 22, ConfigFile.getConfig().getInt("Shop.Golden Sword.Buy"), ConfigFile.getConfig().getInt("Shop.Golden Sword.Sell"), ShopCategory.COMBAT),
    IRON_SWORD("Iron Sword", new ItemStack(Material.IRON_SWORD), 23,ConfigFile.getConfig().getInt("Shop.Iron Sword.Buy"), ConfigFile.getConfig().getInt("Shop.Iron Sword.Sell"), ShopCategory.COMBAT),
    DIAMOND_SWORD("Diamond Sword", new ItemStack(Material.DIAMOND_SWORD), 24, ConfigFile.getConfig().getInt("Shop.Diamond Sword.Buy"), ConfigFile.getConfig().getInt("Shop.Diamond Sword.Sell"), ShopCategory.COMBAT),

    BOW("Bow", new ItemStack(Material.BOW), 25, ConfigFile.getConfig().getInt("Shop.Bow.Buy"), ConfigFile.getConfig().getInt("Shop.Bow.Sell"), ShopCategory.COMBAT),


    //TOOLS
    ;



    private String name;
    private ItemStack itemStack;
    private Integer inventorySlot;
    private Integer buyPrice;
    private Integer sellPrice;
    private ShopCategory shopCategory;

    ShopItems(String name, ItemStack itemStack, Integer inventorySlot, Integer buyPrice, Integer sellPrice, ShopCategory shopCategory) {
        this.name = name;
        this.itemStack = itemStack;
        this.inventorySlot = inventorySlot;
        this.buyPrice = buyPrice;
        this.sellPrice = sellPrice;
        this.shopCategory = shopCategory;
    }

    public String getName() {
        return name;
    }

    public ItemStack getItemStack() {
        return itemStack;
    }

    public Integer getInventorySlot() {
        return inventorySlot;
    }

    public Integer getBuyPrice() {
        return buyPrice;
    }

    public Integer getSellPrice() {
        return sellPrice;
    }

    public ShopCategory getShopCategory() {
        return shopCategory;
    }
}
