package me.thekawaiiasian.justfactionsshop.utils.hologram;

import me.thekawaiiasian.justfactionsshop.Core;
import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.World;
import org.bukkit.entity.ArmorStand;
import org.bukkit.entity.Entity;
import org.bukkit.entity.EntityType;

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
public class Hologram {

    private Integer ID;
    private Location loc;
    private List<String> lines = new ArrayList<>();
    private List<ArmorStand> stands = new ArrayList<>();
    private double distanceBetweenHolograms = 0.24;

    public Hologram(Integer ID, String... lines) {
        this.ID = ID;

        for (String s : lines) {
            addLine(s);
        }
    }

    public Integer getID() {
        return ID;
    }

    public Location getLoc() {
        return loc;
    }

    public List<String> getLines() {
        return lines;
    }

    public List<ArmorStand> getStands() {
        return stands;
    }

    public double getDistanceBetweenHolograms() {
        return distanceBetweenHolograms;
    }

    public void addLine (String ... lines) {
        for (String line : lines) {
            this.lines.add(line);
        }
    }

    public void display (Location loc) {
        this.loc = loc;
        moveTo(loc);
    }

    public void display(Location loc, long l) {
        final long time = System.currentTimeMillis() + l;

        moveTo(loc);

        Bukkit.getScheduler().scheduleSyncRepeatingTask(Core.getInstance(), new Runnable() {

            public void run() {
                if (System.currentTimeMillis() >= time) {
                    destroy();
                }
            }

        }, 0L, 20L);
    }

    public void moveTo(Location loc) {
        stands.clear();
        this.loc = loc;
        Location spawnLocation = loc;

        for (String s : lines) {
            spawnLocation.setY(spawnLocation.getY() - distanceBetweenHolograms);
            ArmorStand entity = (ArmorStand) loc.getWorld().spawnEntity(spawnLocation, EntityType.ARMOR_STAND);
            entity.setGravity(false);
            entity.setCanPickupItems(false);
            entity.setSmall(true);
            entity.setArms(false);
            entity.setBasePlate(false);
            entity.setCustomName(s);
            entity.setCustomNameVisible(true);
            entity.setVisible(false);
            stands.add(entity);
        }
    }

    public void update() {
        moveTo(loc);
    }

    public void destroy() {
        for (World world : Bukkit.getWorlds()) {
            for (Entity entity : world.getEntities()) {
                for (ArmorStand stand : stands) {
                    if (entity.equals(stand)) {
                        entity.remove();
                    }
                }
            }
        }
    }
}
