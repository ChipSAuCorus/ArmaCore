package fr.newzaz.armacore.events;


import fr.newzaz.armacore.Main;
import org.bukkit.Material;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerItemHeldEvent;
import org.bukkit.inventory.ItemStack;

import java.util.Arrays;
import java.util.Random;

public class InventoryListeners implements Listener {

    private static FileConfiguration config;
    private final Main pl;

    public InventoryListeners(Main main) {
        this.pl = main;
        config = pl.getConfig("backpack");
    }

    @EventHandler
    public void lore(PlayerItemHeldEvent e) {
        Player p = e.getPlayer();
        ItemStack item = p.getInventory().getItem(e.getPreviousSlot());
        ItemStack item1 = p.getInventory().getItem(e.getNewSlot());
        Random randomGenerator = new Random();
        int id = randomGenerator.nextInt(9999);

        if (item == null || !item.hasItemMeta()) return;
        if (item1 == null || !item1.hasItemMeta()) return;
        if (item.getType().equals(Material.getMaterial(4113)) && !item.getItemMeta().hasLore()) {
            item.getItemMeta().setLore(Arrays.asList("§9[ArmaBackpack]", "Propriétaire : " + p.getName(), "§9- Id: #" + id));
            config.set("#" + id + " - " + p.getName(), id);
        }
        if (item1.getType().equals(Material.getMaterial(4113)) && !item1.getItemMeta().hasLore()) {
            item1.getItemMeta().setLore(Arrays.asList("§9[ArmaBackpack]", "§9- Propriétaire : " + p.getName(), "§9- Id: #" + id));
            config.set("#" + id + " - " + p.getName(), id);
        }

        if (item.getType().equals(Material.getMaterial(7953)) && !item.getItemMeta().hasLore()) {
            item.getItemMeta().setLore(Arrays.asList("§9[ArmaPermis]", "Propriétaire : " + p.getName(), "§9- Id: #" + id));
            config.set("#" + id + " - " + p.getName(), id);
            p.updateInventory();
        }
        if (item1.getType().equals(Material.getMaterial(7953)) && !item1.getItemMeta().hasLore()) {
            item1.getItemMeta().setLore(Arrays.asList("§9[ArmaPermis]", "§9- Propriétaire : " + p.getName(), "§9- Id: #" + id));
            config.set("#" + id + " - " + p.getName(), id);
            p.updateInventory();
        }
        if (item.getType().equals(Material.getMaterial(7946)) && !item.getItemMeta().hasLore()) {
            item.getItemMeta().setLore(Arrays.asList("§9[ArmaPermis]", "Propriétaire : " + p.getName(), "§9- Id: #" + id));
            config.set("#" + id + " - " + p.getName(), id);
            p.updateInventory();
        }
        if (item1.getType().equals(Material.getMaterial(7946)) && !item1.getItemMeta().hasLore()) {
            item1.getItemMeta().setLore(Arrays.asList("§9[ArmaPermis]", "§9- Propriétaire : " + p.getName(), "§9- Id: #" + id));
            config.set("#" + id + " - " + p.getName(), id);
            p.updateInventory();
        }
    }
}
