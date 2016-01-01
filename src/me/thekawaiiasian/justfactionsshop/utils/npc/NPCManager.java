package me.thekawaiiasian.justfactionsshop.utils.npc;

import org.bukkit.Location;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDamageEvent;

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
public class NPCManager implements Listener{

    private static List<NPC> npcs = new ArrayList<>();
    private static NPCManager npcManager;

    public NPCManager() {
    }

    public static NPCManager getManager() {
        if (npcManager == null) {
            npcManager = new NPCManager();
        }
        return npcManager;
    }

    public NPC createNPC (Integer ID, String name, Location location, NPCTypes npcTypes) {

        NPC npc = new NPC(ID, name, location, npcTypes);
        npcs.add(npc);
        return npc;
    }


    public NPC getNPC(Integer ID) {
        for (NPC npc : getNpcs()) {
            if (npc.getID() == ID) {
                return npc;
            }
        }
        return null;
    }


    public List<NPC> getNpcs() {
        return npcs;
    }

    @EventHandler
    public void onEntityInteract(EntityDamageEvent e) {

        for (NPC npc : npcs) {
            if (e.getEntity().equals(npc.getEntity())) {
                e.setCancelled(true);
            }
        }
    }
}
