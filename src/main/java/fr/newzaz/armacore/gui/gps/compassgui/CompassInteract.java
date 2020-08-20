package fr.newzaz.armacore.gui.gps.compassgui;

import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.inventory.ItemStack;

public class CompassInteract implements Listener {
	
	@EventHandler
	public void onInteract(PlayerInteractEvent e) {
		Player p = e.getPlayer();
		Action a = e.getAction();
		ItemStack item = e.getItem();

		if(item == null || item.getType() != Material.COMPASS) return;

		if(item.getItemMeta().getDisplayName().equalsIgnoreCase("§aGPS")){
			if(a != Action.RIGHT_CLICK_AIR) {
				
			
			CompassDirection.openGUI(p);
			}else if(a != Action.RIGHT_CLICK_BLOCK) {
				
				CompassDirection.openGUI(p);
			}else {
				return;
			}
		}
	}

}
