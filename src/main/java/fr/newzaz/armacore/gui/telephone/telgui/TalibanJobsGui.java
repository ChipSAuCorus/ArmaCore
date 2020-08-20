package fr.newzaz.armacore.gui.telephone.telgui;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.Arrays;

public class TalibanJobsGui {
	
	public static void openGUI(Player p ) {
		Inventory inv = Bukkit.createInventory(null, 9, "§bMétiers");
		//6155,7440
		ItemStack diamond = new ItemStack(Material.getMaterial(6155));
		ItemMeta diamondMeta = diamond.getItemMeta();
		
		diamondMeta.setDisplayName("§6Taliban");
		diamond.setItemMeta(diamondMeta);
		
		ItemStack diamond1 = new ItemStack(Material.getMaterial(7440));
		ItemMeta diamondMeta1 = diamond1.getItemMeta();
		
		diamondMeta1.setDisplayName("§8UET");
		diamondMeta1.setLore(Arrays.asList("§cSous recrutement"));
		diamond1.setItemMeta(diamondMeta1);
		

		
		inv.setItem(0, diamond);
		inv.setItem(3, diamond1);

		
		p.openInventory(inv);
	}


	


}
