package fr.newzaz.armacore.gui.telephone.telephone3;

import fr.newzaz.armacore.api.ItemBuilder;
import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

public class TelephoneGUI3 {
	
	public static void openGUI(Player p ) {
		Inventory inv = Bukkit.createInventory(null, 9, "§9Iphone X gold");
		
		ItemStack diamond = new ItemStack(Material.getMaterial(6155));
		ItemMeta diamondMeta = diamond.getItemMeta();
		
		diamondMeta.setDisplayName("§6Taliban");
		diamond.setItemMeta(diamondMeta);
		
		ItemStack diamond1 = new ItemStack(Material.getMaterial(5892));
		ItemMeta diamondMeta1 = diamond1.getItemMeta();
		
		diamondMeta1.setDisplayName("§7Militaire");
		diamond1.setItemMeta(diamondMeta1);
		
		ItemStack diamond2 = new ItemStack(Material.getMaterial(7981));
		ItemMeta diamondMeta2 = diamond1.getItemMeta();
		
		diamondMeta2.setDisplayName("§cBesoin d'aide");
		diamond2.setItemMeta(diamondMeta2);
		
		ItemStack diamond3 = new ItemStack(Material.getMaterial(4458));
		ItemMeta diamondMeta3 = diamond3.getItemMeta();
		
		diamondMeta3.setDisplayName("§aMoney");
		diamond3.setItemMeta(diamondMeta3);

		ItemBuilder item1 = (new ItemBuilder(Material.getMaterial(6375))).setDisplayName("§7Mercenaire");
		
		inv.setItem(0, diamond2);
		inv.setItem(3, diamond);
		inv.setItem(5, diamond1);
		inv.setItem(8, diamond3);
		inv.setItem(4,item1.build());
		
		p.openInventory(inv);
	}

}



