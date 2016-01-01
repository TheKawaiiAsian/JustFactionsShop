package me.thekawaiiasian.justfactionsshop.utils;

import me.thekawaiiasian.justfactionsshop.Core;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.configuration.file.YamlConfiguration;

import java.io.File;
import java.io.IOException;
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
public class ConfigFile {

    private static FileConfiguration config = null;
    private static File file = null;

    public static void reloadConfig() {
        if (file == null) {
            file = new File(Core.getInstance().getDataFolder(), "config.yml");
        }
        config = YamlConfiguration.loadConfiguration(file);
    }

    public static FileConfiguration getConfig() {
        if (config == null) {
            reloadConfig();
        }
        return config;
    }

    public static void saveConfig() {
        if (config == null || file == null) {
            return;
        }
        try {
            getConfig().save(file);
        } catch (IOException ex) {
            System.out.println("Error when saving " + file);
            ex.printStackTrace();
        }
    }

    public static void setDefaults() {

        HashMap<String, Object> keys = new HashMap<>();

        for (ShopItems shopItems : ShopItems.values()) {
            keys.put("Shop." + shopItems.getName() + ".Buy", 1);
            keys.put("Shop." + shopItems.getName() + ".Sell", 2);
        }

        config.addDefaults(keys);
        config.options().copyDefaults(true);
        saveConfig();
    }
}
