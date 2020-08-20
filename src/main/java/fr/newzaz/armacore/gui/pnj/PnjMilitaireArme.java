package fr.newzaz.armacore.gui.pnj;

import fr.newzaz.armacore.api.ItemBuilder;
import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;

import java.util.Arrays;

public class PnjMilitaireArme {
    public static void openGUI(Player p) {
        Inventory inv = Bukkit.createInventory(null, 9, "§cArme Militaire");
        ItemBuilder item = (new ItemBuilder(Material.getMaterial(1))).setDisplayName("§7Famas-F1");
        ItemBuilder item1 = (new ItemBuilder(Material.getMaterial(2))).setDisplayName("§7HK-416");
        ItemBuilder item2 = (new ItemBuilder(Material.getMaterial(3))).setDisplayName("§7PGM");
        ItemBuilder item3 = (new ItemBuilder(Material.getMaterial(5))).setDisplayName("§7M249 SAW");
        ItemBuilder itemglock = (new ItemBuilder(Material.getMaterial(6))).setDisplayName("§7Glock-21").setLoreWithList(Arrays.asList("§cArmaPNJ","§c- Clique droit pour acheter les munitions !"));
        ItemBuilder item4 = (new ItemBuilder(Material.getMaterial(7))).setDisplayName("§7Munition Famas-F1");
        ItemBuilder item5 = (new ItemBuilder(Material.getMaterial(8))).setDisplayName("§7Munition HK-416");
        ItemBuilder item6 = (new ItemBuilder(Material.getMaterial(9))).setDisplayName("§7Munition PGM");
        ItemBuilder item7 = (new ItemBuilder(Material.getMaterial(10))).setDisplayName("§7Munition M249 SAW");
        inv.setItem(0, item.build());
        inv.setItem(1, item1.build());
        inv.setItem(2, item2.build());
        inv.setItem(3, item3.build());
        inv.setItem(4, itemglock.build());
        inv.setItem(5, item4.build());
        inv.setItem(6, item5.build());
        inv.setItem(7, item6.build());
        inv.setItem(8, item7.build());
        p.openInventory(inv);
    }
}
/*
 * Infanterie:
 * 7761 famas-f1
 * 7754 Chargeur-Famas-F1
 *
 * 7850 glock
 * 7425 munition-glock
 *
 * Medecin:
 * 7623 Hk-416
 * 7721 Munition
 *
 *Tireur d'élite:
 * 7457 PGM
 * 7750 Munition
 *
 * Appuit:
 * 7786 M249 SAW
 * 7656 Munition
 */