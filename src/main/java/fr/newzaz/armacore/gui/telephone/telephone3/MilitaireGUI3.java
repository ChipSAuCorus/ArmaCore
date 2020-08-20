package fr.newzaz.armacore.gui.telephone.telephone3;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.Arrays;

public class MilitaireGUI3 {
	
	public static void openGUI(Player p ) {
		Inventory inv = Bukkit.createInventory(null, 9, "§7Militaire");
		
		ItemStack diamond = new ItemStack(Material.getMaterial(5892));
		ItemMeta diamondMeta = diamond.getItemMeta();
		
		diamondMeta.setDisplayName("§bMétiers");
		diamond.setItemMeta(diamondMeta);
		
		ItemStack diamond1 = new ItemStack(Material.getMaterial(4459));
		ItemMeta diamondMeta1 = diamond1.getItemMeta();
		
		diamondMeta1.setDisplayName("§7Service");
		diamondMeta1.setLore(Arrays.asList("§aClique pour prendre ta prise de service" ,"                 §aet","§are clique pour prendre ta fin de service !"));
		diamond1.setItemMeta(diamondMeta1);
		

		
		inv.setItem(0, diamond);
		inv.setItem(3, diamond1);

		
		p.openInventory(inv);
	}


	


}
