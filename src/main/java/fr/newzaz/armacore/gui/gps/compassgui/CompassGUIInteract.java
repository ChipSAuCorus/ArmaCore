package fr.newzaz.armacore.gui.gps.compassgui;

import net.milkbowl.vault.permission.Permission;
import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.plugin.RegisteredServiceProvider;

public class CompassGUIInteract implements Listener {

	
	static Permission perms = null;
	
    private static boolean setupPermissions() {
        RegisteredServiceProvider<Permission> rsp = Bukkit.getServer().getServicesManager().getRegistration(Permission.class);
        perms = rsp.getProvider();
        return perms != null;
    }
    
    @EventHandler
    public static void onClick0(InventoryClickEvent e) {
    	if(e.getWhoClicked().getType() != EntityType.PLAYER) {
    		return;
    	}
    	Player p = (Player)e.getWhoClicked();
    	
    	if(e.getInventory().getName().equals("§9GPS")) {
			if(e.getCurrentItem().getItemMeta() == null){
				return;
			}
    		if(e.getCurrentItem().getItemMeta().getDisplayName().equals("§7Ville Moderne")) {
    			
    			Location vm = new Location(p.getWorld(),203,63,388);
    			p.setCompassTarget(vm);
    			e.setCancelled(true);
    			p.closeInventory();

    }else {
    return;
    }
    	}
    }
    
    @EventHandler
    public static void onClick1(InventoryClickEvent e) {
    	if(e.getWhoClicked().getType() != EntityType.PLAYER) {
    		return;
    	}
    	Player p = (Player)e.getWhoClicked();
    	
    	if(e.getInventory().getName().equals("§9GPS")) {
			if(e.getCurrentItem().getItemMeta() == null){
				return;
			}
    		if(e.getCurrentItem().getItemMeta().getDisplayName().equals("§7Base-Militaire")) {
    			if(setupPermissions()) {
    				if(perms.playerInGroup(p, "Soldat")) {
    			Location bm = new Location(p.getWorld(),527,63,431);
    			p.setCompassTarget(bm);
    			e.setCancelled(true);
    			p.closeInventory();
    				}else {
        				p.sendMessage("§4[§cArmaGPS§4] §CTu n'es pas Militaire !");
        				e.setCancelled(true);
        				p.closeInventory();
    				}
    			}
    }else {
    return;
    }
    	}
    }
    
    
    
    @EventHandler
    public static void onClick2(InventoryClickEvent e) {
    	if(e.getWhoClicked().getType() != EntityType.PLAYER) {
    		return;
    	}
    	Player p = (Player)e.getWhoClicked();
    	
    	if(e.getInventory().getName().equals("§9GPS")) {
			if(e.getCurrentItem().getItemMeta() == null){
				return;
			}
    		if(e.getCurrentItem().getItemMeta().getDisplayName().equals("§7Base-Talibane")) {
    			if(setupPermissions()) {
    				if(perms.playerInGroup(p, "initié-taliban")) {
    			
    			Location bt = new Location(p.getWorld(),-14,80,622);
    			p.setCompassTarget(bt);
    			e.setCancelled(true);
    			p.closeInventory();
    			}else {
    				p.sendMessage("§4[§cArmaGPS§4] §CTu n'es pas Taliban !");
    				e.setCancelled(true);
    				p.closeInventory();
    			}
    			}
    }else {
    return;
    }
    	}
    }
    @EventHandler
    public static void onClick3(InventoryClickEvent e) {
    	if(e.getWhoClicked().getType() != EntityType.PLAYER) {
    		return;
    	}
    	Player p = (Player)e.getWhoClicked();
    	
    	if(e.getInventory().getName().equals("§9GPS")) {
			if(e.getCurrentItem().getItemMeta() == null){
				return;
			}
    		if(e.getCurrentItem().getItemMeta().getDisplayName().equals("§7Base-UET")) {
    			if(setupPermissions()) {
    				if(perms.playerInGroup(p, "initié-Uet")) {
    			
    			Location bu = new Location(p.getWorld(),444,62,607);
    			p.setCompassTarget(bu);
    			e.setCancelled(true);
    			p.closeInventory();
    			}else {
    				p.sendMessage("§4[§cArmaGPS§4] §CTu n'es pas UET !");
    				e.setCancelled(true);
    				p.closeInventory();
    			}
    			}
    }else {
    return;
    }
    	}
    }
    @EventHandler
    public static void onClick4(InventoryClickEvent e) {
    	if(e.getWhoClicked().getType() != EntityType.PLAYER) {
    		return;
    	}
    	Player p = (Player)e.getWhoClicked();
    	
    	if(e.getInventory().getName().equals("§9GPS")) {
			if(e.getCurrentItem().getItemMeta() == null){
				return;
			}
    		if(e.getCurrentItem().getItemMeta().getDisplayName().equals("§7Base-FST")) {
    			if(setupPermissions()) {
    				if(perms.playerInGroup(p, "Soldat-FST")) {
    			
    			Location bf = new Location(p.getWorld(),577,72,513);
    			p.setCompassTarget(bf);
    			e.setCancelled(true);
    			p.closeInventory();
    			}else {
    				p.sendMessage("§4[§cArmaGPS§4] §CTu n'es pas FST !");
    				e.setCancelled(true);
    				p.closeInventory();
    			}
    			}
    }else {
    return;
    }
    	}
    }
    @EventHandler
    public static void onClick4a0(InventoryClickEvent e) {
    	if(e.getWhoClicked().getType() != EntityType.PLAYER) {
    		return;
    	}
    	Player p = (Player)e.getWhoClicked();
    	
    	if(e.getInventory().getName().equals("§9GPS")) {
			if(e.getCurrentItem().getItemMeta() == null){
				return;
			}
    		if(e.getCurrentItem().getItemMeta().getDisplayName().equals("§6Capital")) {

    			
    			Location bf = new Location(p.getWorld(),-103,63,126);
    			p.setCompassTarget(bf);
    			e.setCancelled(true);
    			p.closeInventory();
    }else {
    return;
    }
    	}
    }
    
    @EventHandler
    public static void onClick5(InventoryClickEvent e) {
    	if(e.getWhoClicked().getType() != EntityType.PLAYER) {
    		return;
    	}
    	Player p = (Player)e.getWhoClicked();
    	
    	if(e.getInventory().getName().equals("§9GPS")) {
			if(e.getCurrentItem().getItemMeta() == null){
				return;
			}
    		if(e.getCurrentItem().getItemMeta().getDisplayName().equals("§7Petrole")) {
    			
    			Location pt = new Location(p.getWorld(),-91,68,426);
    			p.setCompassTarget(pt);
    			e.setCancelled(true);
    			p.closeInventory();

    }else {
    return;
    }
    	}
    }
    
    @EventHandler
    public static void onClick6(InventoryClickEvent e) {
    	if(e.getWhoClicked().getType() != EntityType.PLAYER) {
    		return;
    	}
    	Player p = (Player)e.getWhoClicked();
    	
    	if(e.getInventory().getName().equals("§9GPS")) {
			if(e.getCurrentItem().getItemMeta() == null){
				return;
			}
    		if(e.getCurrentItem().getItemMeta().getDisplayName().equals("§7Mine de Fer")) {
    			
    			Location mf = new Location(p.getWorld(),345,61,566);
    			p.setCompassTarget(mf);
    			e.setCancelled(true);
    			p.closeInventory();

    }else {
    return;
    }
    	}
    }
    
    @EventHandler
    public static void onClick7(InventoryClickEvent e) {
    	if(e.getWhoClicked().getType() != EntityType.PLAYER) {
    		return;
    	}
    	Player p = (Player)e.getWhoClicked();
    	
    	if(e.getInventory().getName().equals("§9GPS")) {
			if(e.getCurrentItem().getItemMeta() == null){
				return;
			}
    		if(e.getCurrentItem().getItemMeta().getDisplayName().equals("§9<->")) {
    			e.setCancelled(true);
    		}else {
    		    return;
    		    }
    		    	}
    		    }
    @EventHandler
    public static void onClick8(InventoryClickEvent e) {
    	if(e.getWhoClicked().getType() != EntityType.PLAYER) {
    		return;
    	}
    	Player p = (Player)e.getWhoClicked();
    	
    	if(e.getInventory().getName().equals("§9GPS")) {
			if(e.getCurrentItem().getItemMeta() == null){
				return;
			}
    		if(e.getCurrentItem().getItemMeta().getDisplayName().equals("§7Café")) {
    			
    			Location mf = new Location(p.getWorld(),-117,63,248);
    			p.setCompassTarget(mf);
    			e.setCancelled(true);
    			p.closeInventory();

    }else {
    return;
    }
    	}
    }
}
