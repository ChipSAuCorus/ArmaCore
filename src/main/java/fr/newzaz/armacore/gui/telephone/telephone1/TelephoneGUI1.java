package fr.newzaz.armacore.gui.telephone.telephone1;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

public class TelephoneGUI1 {
	
	public static void openGUI(Player p ) {
		Inventory inv = Bukkit.createInventory(null, 9, "§9Iphone-6");
		
		ItemStack diamond = new ItemStack(Material.getMaterial(6155));
		ItemMeta diamondMeta = diamond.getItemMeta();
		//6155
		diamondMeta.setDisplayName("§6Taliban");
		diamond.setItemMeta(diamondMeta);
		
		ItemStack diamond1 = new ItemStack(Material.getMaterial(5892));
		ItemMeta diamondMeta1 = diamond1.getItemMeta();
		//5892
		diamondMeta1.setDisplayName("§7Militaire");
		diamond1.setItemMeta(diamondMeta1);
		
		ItemStack diamond2 = new ItemStack(Material.getMaterial(7981));
		ItemMeta diamondMeta2 = diamond1.getItemMeta();
		//7981
		diamondMeta2.setDisplayName("§cBesoin d'aide");
		diamond2.setItemMeta(diamondMeta2);
		
		ItemStack diamond3 = new ItemStack(Material.getMaterial(4458));
		ItemMeta diamondMeta3 = diamond3.getItemMeta();
		//4458
		diamondMeta3.setDisplayName("§aMoney");
		diamond3.setItemMeta(diamondMeta3);
		
		inv.setItem(0, diamond2);
		inv.setItem(3, diamond);
		inv.setItem(5, diamond1);
		inv.setItem(8, diamond3);
		
		p.openInventory(inv);
	}

}



