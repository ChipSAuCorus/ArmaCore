package fr.newzaz.armacore.gui.telephone.telephone3;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.Arrays;

public class TalibanGui3 {
	public static void openGUI(Player p ) {
		Inventory inv = Bukkit.createInventory(null, 9, "§6Taliban");
		
		ItemStack diamond = new ItemStack(Material.getMaterial(6155));
		ItemMeta diamondMeta = diamond.getItemMeta();
		
		diamondMeta.setDisplayName("§bMétiers");
		diamond.setItemMeta(diamondMeta);
		
		ItemStack diamond1 = new ItemStack(Material.getMaterial(4484));
		ItemMeta diamondMeta1 = diamond1.getItemMeta();
		
		diamondMeta1.setDisplayName("§7Attaque Ville Moderne");
		diamondMeta1.setLore(Arrays.asList("§aClique pour attaquer la ville moderne"));
		diamond1.setItemMeta(diamondMeta1);

		ItemStack diamond2 = new ItemStack(Material.getMaterial(4491));
		ItemMeta diamondMeta2 = diamond2.getItemMeta();

		diamondMeta2.setDisplayName("§7Attaque Banque");
		diamondMeta2.setLore(Arrays.asList("§aClique pour attaquer la Banque"));
		diamond2.setItemMeta(diamondMeta2);

		ItemStack diamond3 = new ItemStack(Material.getMaterial(8008));
		ItemMeta diamondMeta3 = diamond3.getItemMeta();

		diamondMeta3.setDisplayName("§7Attaque Capitale");
		diamondMeta3.setLore(Arrays.asList("§aClique pour attaquer la capitale"));
		diamond3.setItemMeta(diamondMeta3);





		inv.setItem(1, diamond);
		inv.setItem(3, diamond1);
		inv.setItem(5,diamond2);
		inv.setItem(7, diamond3);

		
		p.openInventory(inv);
	}


	

}
