package me.thekawaiiasian.justfactionsshop.utils.hologram;

import org.bukkit.entity.ArmorStand;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerArmorStandManipulateEvent;

import java.util.ArrayList;
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
public class HologramManager implements Listener{

    private static List<Hologram> holograms = new ArrayList<>();
    private static HologramManager hologramManager;

    public static HologramManager getHologramManager() {
        if (hologramManager == null) {
            hologramManager = new HologramManager();
        }
        return hologramManager;
    }

    public Hologram getHologram(Integer ID) {
        for (Hologram hologram : holograms) {
            if (hologram.getID().equals(ID)) {
                return hologram;
            }
        }
        return null;
    }

    public Hologram createHologram(Integer ID, String... lines) {
        Hologram hologram = new Hologram(ID, lines);
        holograms.add(hologram);
        return hologram;
    }

    public void removeHologram(Integer ID) {
        if (getHologram(ID) != null) {
            Hologram hologram = getHologram(ID);
            hologram.destroy();
            holograms.remove(hologram);
        }
    }

    @EventHandler
    public void onArmorStandManipulation(PlayerArmorStandManipulateEvent e) {
        for (Hologram hologram : holograms) {
            for (ArmorStand stand : hologram.getStands()) {
                if (stand.equals(e.getRightClicked())) {
                    e.setCancelled(true);
                }
            }
        }
    }
}
