package net.beocraft.mobs;

import org.bukkit.entity.EntityType;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityExplodeEvent;

public class EntityExplode implements Listener {

    @EventHandler
    public void onEntityExplodeEvent(EntityExplodeEvent event) {
        EntityType type = event.getEntity().getType();
        if (type == EntityType.CREEPER || type == EntityType.FIREBALL) {
            event.setCancelled(true);
        }
    }
}
