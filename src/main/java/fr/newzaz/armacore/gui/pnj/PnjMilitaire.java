package fr.newzaz.armacore.gui.pnj;

import fr.newzaz.armacore.api.ItemBuilder;
import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;

import java.util.Arrays;

public class PnjMilitaire {
    public static void openGUI(Player p) {
        Inventory inv = Bukkit.createInventory(null, 9, "§cPnj Militaire");
        ItemBuilder item = (new ItemBuilder(Material.getMaterial(5550))).setDisplayName("§7Armure").setLoreWithList(Arrays.asList("§cArmaPNJ","§c- Ceci te couteras 400$"));
        ItemBuilder item1 = (new ItemBuilder(Material.getMaterial(4549))).setDisplayName("§7Arme").setLoreWithList(Arrays.asList("§cArmaPNJ","§c- Clique pour choisir ta classe !"));
        inv.setItem(0, item.build());
        inv.setItem(2, item1.build());
        p.openInventory(inv);
    }
}
