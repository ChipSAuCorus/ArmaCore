package fr.newzaz.armacore.events;

import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerDropItemEvent;


public class FixBackPack implements Listener {

    @EventHandler
    public void onInteract(PlayerDropItemEvent e) {
        Player p = e.getPlayer();
        if (e.getItemDrop().getItemStack().getType().equals(Material.getMaterial(5139))) {
            e.setCancelled(true);
            p.sendMessage("§4[§cArmaInterdiction§4] §cInterdiction de drop un Backpack !");
            p.updateInventory();
        }

    }

}

