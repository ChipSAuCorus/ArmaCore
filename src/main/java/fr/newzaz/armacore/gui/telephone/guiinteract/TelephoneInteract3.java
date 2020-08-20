package fr.newzaz.armacore.gui.telephone.guiinteract;

import fr.newzaz.armacore.gui.telephone.telephone3.TelephoneGUI3;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.inventory.ItemStack;

public class TelephoneInteract3 implements Listener {

    @EventHandler
    public void onInteract(PlayerInteractEvent e) {
        Player p = e.getPlayer();
        Action a = e.getAction();
        ItemStack item = e.getItem();

        if(item == null || item.getType() != Material.getMaterial(7973)) return;

        if(item.getItemMeta().getDisplayName().equalsIgnoreCase("§9Iphone X Gold")){
            if(a != Action.RIGHT_CLICK_AIR) {


                TelephoneGUI3.openGUI(p);
            }else if(a != Action.RIGHT_CLICK_BLOCK) {

                TelephoneGUI3.openGUI(p);
            }else {
                return;
            }
        }else {
            return;
        }
    }

}

