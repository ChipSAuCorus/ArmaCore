package fr.newzaz.armacore.gui.telephone.telgui;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.Arrays;

public class MilitaireJobsGui {
	
	public static void openGUI(Player p ) {
		Inventory inv = Bukkit.createInventory(null, 9, "§bMétiers");
		
		ItemStack diamond = new ItemStack(Material.getMaterial(5866));
		ItemMeta diamondMeta = diamond.getItemMeta();
		//5898 , 6586,5897
		diamondMeta.setDisplayName("§7Militaire");
		diamond.setItemMeta(diamondMeta);
		
		ItemStack diamond1 = new ItemStack(Material.getMaterial(6586));
		ItemMeta diamondMeta1 = diamond1.getItemMeta();
		
		diamondMeta1.setDisplayName("§bFST");
		diamondMeta1.setLore(Arrays.asList("§cSous recrutement"));
		
		diamond1.setItemMeta(diamondMeta1);
		
		ItemStack diamond2 = new ItemStack(Material.getMaterial(5897));
		ItemMeta diamondMeta2 = diamond2.getItemMeta();
		
		diamondMeta2.setDisplayName("§8GIGN");
		diamondMeta2.setLore(Arrays.asList("§cSous Recrutement !"));
		diamond2.setItemMeta(diamondMeta2);
		
		

		
		inv.setItem(0, diamond);
		inv.setItem(3, diamond1);
		inv.setItem(5, diamond2);

		
		p.openInventory(inv);
	}


	


}
