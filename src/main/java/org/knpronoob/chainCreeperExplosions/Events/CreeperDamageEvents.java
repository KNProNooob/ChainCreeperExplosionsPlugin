package org.knpronoob.chainCreeperExplosions.Events;

import org.bukkit.EntityEffect;
import org.bukkit.entity.Creeper;
import org.bukkit.entity.EntityType;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockBreakEvent;
import org.bukkit.event.entity.*;
import org.bukkit.event.player.PlayerBedLeaveEvent;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.event.player.PlayerKickEvent;
import org.bukkit.event.player.PlayerQuitEvent;
import org.bukkit.metadata.MetadataValue;

public class CreeperDamageEvents implements Listener {

    @EventHandler
    public void onEntityDamageEvent(EntityDamageEvent event){
        if(event.getEntity().getType() == EntityType.CREEPER){
            var cause = event.getCause();
            Creeper creeper = (Creeper) event.getEntity();
            if(!creeper.isPowered()){
                if(cause == EntityDamageEvent.DamageCause.FIRE || cause == EntityDamageEvent.DamageCause.FIRE_TICK){
                    creeper.ignite();
                }
            }

            if(cause == EntityDamageEvent.DamageCause.ENTITY_EXPLOSION || cause == EntityDamageEvent.DamageCause.BLOCK_EXPLOSION){
                creeper.ignite();
            }

        }
    }
    
}
