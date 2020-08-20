package fr.newzaz.armacore.gui.telephone.telephone1;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

public class TalibanGui {
	public static void openGUI(Player p ) {
		Inventory inv = Bukkit.createInventory(null, 9, "§6Taliban");
		
		ItemStack diamond = new ItemStack(Material.getMaterial(6155));
		ItemMeta diamondMeta = diamond.getItemMeta();
		//6155
		diamondMeta.setDisplayName("§bMétiers");
		diamond.setItemMeta(diamondMeta);
		inv.setItem(4, diamond);
		p.openInventory(inv);
	}


	

}
