package me.thekawaiiasian.justfactionsshop.commands;

import com.mojang.authlib.GameProfile;
import me.thekawaiiasian.justfactionsshop.Core;
import net.minecraft.server.v1_8_R3.*;
import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.craftbukkit.v1_8_R3.CraftServer;
import org.bukkit.craftbukkit.v1_8_R3.CraftWorld;
import org.bukkit.craftbukkit.v1_8_R3.entity.CraftPlayer;
import org.bukkit.entity.Player;

import java.util.UUID;

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
public class TestCommand implements CommandExecutor{

    private EntityPlayer npc;

    @Override
    public boolean onCommand(CommandSender commandSender, Command command, String s, String[] strings) {

        Player player = (Player) commandSender;

        MinecraftServer nmsServer = ((CraftServer) Bukkit.getServer()).getServer();
        WorldServer nmsWorld = ((CraftWorld) Bukkit.getWorld("world")).getHandle();
        npc = new EntityPlayer(nmsServer, nmsWorld, new GameProfile(UUID.randomUUID(), "TheKawaiiAsian"), new PlayerInteractManager(nmsWorld));

        Player target = Bukkit.getPlayer("FenceGate");

        npc.setLocation(target.getLocation().getX(), target.getLocation().getY(), target.getLocation().getZ(), 0, 0);

        for (Player all : Bukkit.getOnlinePlayers()) {
            PlayerConnection connection = ((CraftPlayer) all).getHandle().playerConnection;
            connection.sendPacket(new PacketPlayOutPlayerInfo(PacketPlayOutPlayerInfo.EnumPlayerInfoAction.ADD_PLAYER, npc));
            connection.sendPacket(new PacketPlayOutNamedEntitySpawn(npc));

        }

        Bukkit.getScheduler().scheduleSyncDelayedTask(Core.getInstance(), new Runnable() {
            @Override
            public void run() {


            }
        }, 40L);

        return true;
    }
}
