package me.thekawaiiasian.justfactionsshop.utils.npc;

import me.thekawaiiasian.justfactionsshop.utils.hologram.Hologram;
import net.minecraft.server.v1_8_R3.NBTTagCompound;
import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.World;
import org.bukkit.craftbukkit.v1_8_R3.entity.CraftEntity;
import org.bukkit.entity.Blaze;
import org.bukkit.entity.Entity;
import org.bukkit.entity.Villager;

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
public class NPC {

    private Integer ID;
    private String name;
    private Location location;
    private Entity entity;
    private NPCTypes npcTypes;
    private Hologram hologram;


    public NPC(Integer ID, String name, Location location, NPCTypes npcTypes) {

        this.ID = ID;
        this.name = name;
        this.location = location;
        this.npcTypes = npcTypes;

        switch (npcTypes) {

            case VILLAGER:
                Villager villager = location.getWorld().spawn(location, Villager.class);
                villager.setRemoveWhenFarAway(false);
                villager.setCanPickupItems(false);
                this.entity = villager;
                break;
            case ZOMBIE:
                break;
            case BLAZE:
                Blaze blaze = location.getWorld().spawn(location, Blaze.class);
                blaze.setRemoveWhenFarAway(false);
                blaze.setCanPickupItems(false);
                this.entity = blaze;
                break;
        }

        net.minecraft.server.v1_8_R3.Entity nmsEntity = ((CraftEntity) this.entity).getHandle();
        NBTTagCompound tag = nmsEntity.getNBTTag();
        if (tag == null) {
            tag = new NBTTagCompound();
        }
        nmsEntity.c(tag);
        tag.setInt("NoAI", 1);
        nmsEntity.f(tag);

        hologram = new Hologram(ID, new String[]{name});
        hologram.display(new Location(location.getWorld(), location.getX(), location.getY() + 1.1, location.getZ()));
    }


    public Integer getID() {
        return ID;
    }

    public String getName() {
        return name;
    }

    public Location getLocation() {
        return location;
    }

    public Entity getEntity() {
        return entity;
    }

    public NPCTypes getNpcTypes() {
        return npcTypes;
    }

    public Hologram getHologram() {
        return hologram;
    }

    public void destroy() {
        for (World world : Bukkit.getWorlds()) {
            for (Entity entity : world.getEntities()) {
                if (entity.equals(this.entity)) {
                    entity.remove();
                    hologram.destroy();
                }
            }
        }
    }

}
