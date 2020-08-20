package fr.newzaz.armacore.events;

import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerDropItemEvent;

public class DropItem implements Listener {
    @EventHandler
    public void onPlayerDropItem(PlayerDropItemEvent event) {
        Player p = event.getPlayer();

        if (event.getItemDrop().getItemStack().getType() == Material.getMaterial(6270)) {
            event.setCancelled(true);
            p.updateInventory();
            p.sendMessage("§4[§cArmaAntiDrop§4]" + " " + "§cTu ne peux pas jeter de Seringue !");
        }
    }
}
