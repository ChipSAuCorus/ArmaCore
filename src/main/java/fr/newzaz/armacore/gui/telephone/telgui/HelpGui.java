package fr.newzaz.armacore.gui.telephone.telgui;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

public class HelpGui {

	public static void openGUI(Player p) {
		Inventory inv = Bukkit.createInventory(null, 9, "§bHelp Menu");

		ItemStack diamond = new ItemStack(Material.getMaterial(6986));
		ItemMeta diamondMeta = diamond.getItemMeta();
	//6986 // 4443 , 6794 , 4290
		diamondMeta.setDisplayName("§6Besoin d'un Développeur");
		diamond.setItemMeta(diamondMeta);

		ItemStack diamond1 = new ItemStack(Material.getMaterial(4443));
		ItemMeta diamondMeta1 = diamond1.getItemMeta();

		diamondMeta1.setDisplayName("§6Besoin d'un Animateur");

		diamond1.setItemMeta(diamondMeta1);
		
		ItemStack diamond2 = new ItemStack(Material.getMaterial(6794));
		ItemMeta diamondMeta2 = diamond2.getItemMeta();

		diamondMeta2.setDisplayName("§6Besoin d'un Builder");

		diamond2.setItemMeta(diamondMeta2);
		
		ItemStack diamond3 = new ItemStack(Material.getMaterial(4290));
		ItemMeta diamondMeta3 = diamond3.getItemMeta();

		diamondMeta3.setDisplayName("§6Besoin d'un Modérateur");

		diamond3.setItemMeta(diamondMeta3);

		inv.setItem(1, diamond);
		inv.setItem(3, diamond1);
		inv.setItem(5, diamond2);
		inv.setItem(7, diamond3);

		p.openInventory(inv);
	}

}
