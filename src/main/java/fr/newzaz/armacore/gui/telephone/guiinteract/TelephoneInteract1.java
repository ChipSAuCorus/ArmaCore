package fr.newzaz.armacore.gui.telephone.guiinteract;

import fr.newzaz.armacore.gui.telephone.telephone1.TelephoneGUI1;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.inventory.ItemStack;

public class TelephoneInteract1 implements Listener {
	
	@EventHandler
	public void onInteract(PlayerInteractEvent e) {
		Player p = e.getPlayer();
		Action a = e.getAction();
		ItemStack item = e.getItem();

		if(item == null || item.getType() != Material.getMaterial(5245)) return;

		if(item.getItemMeta().getDisplayName().equalsIgnoreCase("§9Iphone-6")){
			if(a != Action.RIGHT_CLICK_AIR) {
				
			
			TelephoneGUI1.openGUI(p);
			}else if(a != Action.RIGHT_CLICK_BLOCK) {
				
				TelephoneGUI1.openGUI(p);
			}else {
				return;
			}
		}else {
			return;
		}
	}

}


