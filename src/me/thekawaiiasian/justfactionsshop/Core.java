package me.thekawaiiasian.justfactionsshop;

import me.thekawaiiasian.justfactionsshop.commands.ShopCommand;
import me.thekawaiiasian.justfactionsshop.commands.TestCommand;
import me.thekawaiiasian.justfactionsshop.listeners.EntityInteractListener;
import me.thekawaiiasian.justfactionsshop.utils.ConfigFile;
import me.thekawaiiasian.justfactionsshop.utils.hologram.HologramManager;
import me.thekawaiiasian.justfactionsshop.utils.inventory.ShopInventoryManager;
import me.thekawaiiasian.justfactionsshop.utils.npc.NPC;
import me.thekawaiiasian.justfactionsshop.utils.npc.NPCManager;
import me.thekawaiiasian.justfactionsshop.utils.npc.NPCTypes;
import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.plugin.java.JavaPlugin;

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
public class Core extends JavaPlugin{

    private static Core instance;
    private static NPC shopBlockNPC;
    private static NPC shopRaidingNPC;
    private static NPC banterNPC;
    private static NPC combatNPC;
    private static NPC toolsNPC;

    public static Core getInstance() {
        return instance;
    }

    public static NPC getShopBlockNPC() {
        return shopBlockNPC;
    }

    public static NPC getShopRaidingNPC() {
        return shopRaidingNPC;
    }

    public static NPC getBanterNPC() {
        return banterNPC;
    }

    public static NPC getCombatNPC() {
        return combatNPC;
    }

    public static NPC getToolsNPC() {
        return toolsNPC;
    }

    @Override
    public void onEnable() {
        instance = this;

        ConfigFile.reloadConfig();
        ConfigFile.setDefaults();
        ConfigFile.saveConfig();

        getCommand("shop").setExecutor(new ShopCommand());
        getCommand("test").setExecutor(new TestCommand());
        getServer().getPluginManager().registerEvents(new ShopInventoryManager(), this);
        getServer().getPluginManager().registerEvents(new HologramManager(), this);
        getServer().getPluginManager().registerEvents(new NPCManager(), this);
        getServer().getPluginManager().registerEvents(new EntityInteractListener(), this);

        shopBlockNPC = NPCManager.getManager().createNPC(1, "§5BLOCK SHOP", new Location(Bukkit.getWorld("world"), 42.50, 65.50, -139.500, 90, 0), NPCTypes.VILLAGER);
        shopRaidingNPC = NPCManager.getManager().createNPC(2, "§dRAIDING SHOP", new Location(Bukkit.getWorld("world"), 42.50, 65.50, -137.500, 90, 0), NPCTypes.VILLAGER);
        banterNPC = NPCManager.getManager().createNPC(3, "§a§l<<§2NPC§a§l>> §dBanter", new Location(Bukkit.getWorld("world"),1864.500, 70, -842.50, 138, -0), NPCTypes.BLAZE);
        combatNPC = NPCManager.getManager().createNPC(4, "§6§lCOMBAT SHOP", new Location(Bukkit.getWorld("world"), 41.50, 65.50, -140.50, 90, 0), NPCTypes.VILLAGER);
        toolsNPC = NPCManager.getManager().createNPC(5, "§e§lTOOLS SHOP", new Location(Bukkit.getWorld("world"), 41.50, 65.50, -136.50, 90, 0), NPCTypes.VILLAGER);
    }

    @Override
    public void onDisable() {
        shopBlockNPC.destroy();
        shopRaidingNPC.destroy();
        banterNPC.destroy();
        combatNPC.destroy();
        toolsNPC.destroy();
        instance = null;
    }
}
