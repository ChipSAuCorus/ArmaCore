package fr.newzaz.armacore.gui.gps.compassgui;

import fr.newzaz.armacore.api.ItemBuilder;
import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;

public class CompassDirection {
    public static void openGUI(Player p) {
        Inventory inv = Bukkit.createInventory(null, 27, "§9GPS");
        ItemBuilder item = (new ItemBuilder(Material.getMaterial(5897))).setDisplayName("§7Base-Militaire");
        ItemBuilder item1 = (new ItemBuilder(Material.getMaterial(6586))).setDisplayName("§7Base-FST");
        ItemBuilder item3 = (new ItemBuilder(Material.getMaterial(6155))).setDisplayName("§7Base-Talibane");
        ItemBuilder item11 = (new ItemBuilder(Material.getMaterial(45))).setDisplayName("§6Capital");
        ItemBuilder item4 = (new ItemBuilder(Material.getMaterial(7440))).setDisplayName("§7Base-UET");
        ItemBuilder item5 = (new ItemBuilder(Material.getMaterial(7952))).setDisplayName("§7Ville Moderne");
        ItemBuilder item6 = (new ItemBuilder(Material.getMaterial(5555))).setDisplayName("§7Petrole");
        ItemBuilder item7 = (new ItemBuilder(Material.getMaterial(15))).setDisplayName("§7Mine de Fer");
        ItemBuilder item8 = (new ItemBuilder(Material.getMaterial(160))).setDisplayName("§9<->");
        ItemBuilder item9 = (new ItemBuilder(Material.getMaterial(160))).setDisplayName("§9<->");
        ItemBuilder item10 = (new ItemBuilder(Material.getMaterial(160))).setDisplayName("§9<->");
        ItemBuilder item12 = (new ItemBuilder(Material.getMaterial(7928))).setDisplayName("§7Café");
        inv.setItem(0, item9.build());
        inv.setItem(1, item8.build());
        inv.setItem(2, item10.build());
        inv.setItem(3, item.build());
        inv.setItem(4, item1.build());
        inv.setItem(5, item11.build());
        inv.setItem(6, item10.build());
        inv.setItem(7, item8.build());
        inv.setItem(8, item9.build());
        inv.setItem(9, item9.build());
        inv.setItem(10, item8.build());
        inv.setItem(11, item10.build());
        inv.setItem(12, item6.build());
        inv.setItem(13, item12.build());
        inv.setItem(14, item7.build());
        inv.setItem(15, item10.build());
        inv.setItem(16, item8.build());
        inv.setItem(17, item9.build());
        inv.setItem(18, item9.build());
        inv.setItem(19, item8.build());
        inv.setItem(20, item10.build());
        inv.setItem(21, item3.build());
        inv.setItem(22, item5.build());
        inv.setItem(23, item4.build());
        inv.setItem(24, item10.build());
        inv.setItem(25, item8.build());
        inv.setItem(26, item9.build());
        p.openInventory(inv);
    }
}