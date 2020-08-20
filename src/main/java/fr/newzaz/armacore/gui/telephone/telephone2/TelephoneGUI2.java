package fr.newzaz.armacore.gui.telephone.telephone2;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

public class TelephoneGUI2 {
	
	public static void openGUI(Player p ) {
		Inventory inv = Bukkit.createInventory(null, 9, "§9Iphone-4");
		
		ItemStack diamond = new ItemStack(Material.getMaterial(6155));
		ItemMeta diamondMeta = diamond.getItemMeta();
		
		diamondMeta.setDisplayName("§6Taliban");
		diamond.setItemMeta(diamondMeta);
		


		ItemStack diamond2 = new ItemStack(Material.getMaterial(7981));
		ItemMeta diamondMeta2 = diamond2.getItemMeta();
		
		diamondMeta2.setDisplayName("§cBesoin d'aide");
		diamond2.setItemMeta(diamondMeta2);
		
		ItemStack diamond3 = new ItemStack(Material.getMaterial(4458));
		ItemMeta diamondMeta3 = diamond3.getItemMeta();
		
		diamondMeta3.setDisplayName("§aMoney");
		diamond3.setItemMeta(diamondMeta3);
		
		inv.setItem(1, diamond);
		inv.setItem(4, diamond2);
		inv.setItem(7, diamond3);
		
		p.openInventory(inv);
	}

}



