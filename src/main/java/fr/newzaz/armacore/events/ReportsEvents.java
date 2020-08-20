package fr.newzaz.armacore.events;

import org.bukkit.Bukkit;
import org.bukkit.entity.HumanEntity;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;

public class ReportsEvents implements Listener {

    @EventHandler
    public void onClick(InventoryClickEvent e) {
        if (e.getCurrentItem() == null) return;

        Player player = (Player) e.getWhoClicked();

        switch (e.getCurrentItem().getType()) {

            case IRON_SWORD:
                if (e.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase("§cNo RP")) {
                    e.setCancelled(true);
                    player.closeInventory();
                    sendToMods(e.getCurrentItem().getItemMeta().getDisplayName(), e.getInventory().getName().substring(12), e.getWhoClicked());
                    player.sendMessage("§9[§bArmaSignalement§9] §bVous avez report §9" + e.getInventory().getName().substring(12) + " §bPour §c" + e.getCurrentItem().getItemMeta().getDisplayName());
                }
                break;

            case DIAMOND_SWORD:
                if (e.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase("§cFreeKill")) {
                    e.setCancelled(true);
                    player.closeInventory();
                    sendToMods(e.getCurrentItem().getItemMeta().getDisplayName(), e.getInventory().getName().substring(12), e.getWhoClicked());
                    player.sendMessage("§9[§bArmaSignalement§9] §bVous avez report §9" + e.getInventory().getName().substring(12) + " §bPour §c" + e.getCurrentItem().getItemMeta().getDisplayName());
                }
                break;
            case IRON_HOE:
                if (e.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase("§cInsulte")) {
                    e.setCancelled(true);
                    player.closeInventory();
                    sendToMods(e.getCurrentItem().getItemMeta().getDisplayName(), e.getInventory().getName().substring(12), e.getWhoClicked());
                    player.sendMessage("§9[§bArmaSignalement§9] §bVous avez report §9" + e.getInventory().getName().substring(12) + " §bPour §c" + e.getCurrentItem().getItemMeta().getDisplayName());
                }
                break;
            case DIAMOND_HOE:
                if (e.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase("§cInsulte Raciste")) {
                    e.setCancelled(true);
                    player.closeInventory();
                    sendToMods(e.getCurrentItem().getItemMeta().getDisplayName(), e.getInventory().getName().substring(12), e.getWhoClicked());
                    player.sendMessage("§9[§bArmaSignalement§9] §bVous avez report §9" + e.getInventory().getName().substring(12) + " §bPour §c" + e.getCurrentItem().getItemMeta().getDisplayName());
                }
                break;
            case ANVIL:
                if (e.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase("§cMéta Gaming")) {
                    e.setCancelled(true);
                    player.closeInventory();
                    sendToMods(e.getCurrentItem().getItemMeta().getDisplayName(), e.getInventory().getName().substring(12), e.getWhoClicked());
                    player.sendMessage("§9[§bArmaSignalement§9] §bVous avez report §9" + e.getInventory().getName().substring(12) + " §bPour §c" + e.getCurrentItem().getItemMeta().getDisplayName());
                }
                break;
            case GOLD_SWORD:
                if (e.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase("§cCheat")) {
                    e.setCancelled(true);
                    player.closeInventory();
                    sendToMods(e.getCurrentItem().getItemMeta().getDisplayName(), e.getInventory().getName().substring(12), e.getWhoClicked());
                    player.sendMessage("§9[§bArmaSignalement§9] §bVous avez report §9" + e.getInventory().getName().substring(12) + " §bPour §c" + e.getCurrentItem().getItemMeta().getDisplayName());
                }
                break;
            case PAPER:
                if (e.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase("§cAutres")) {
                    e.setCancelled(true);
                    player.closeInventory();
                    sendToMods(e.getCurrentItem().getItemMeta().getDisplayName(), e.getInventory().getName().substring(12), e.getWhoClicked());
                    player.sendMessage("§9[§bArmaSignalement§9] §bVous avez report §9" + e.getInventory().getName().substring(12) + " §bPour §c" + e.getCurrentItem().getItemMeta().getDisplayName());
                }
                break;


            default:
                break;
        }
    }

    private void sendToMods(String reason, String targetName, HumanEntity humanEntity) {
        for (Player players : Bukkit.getOnlinePlayers()) {
            if (players.hasPermission("mod.receive")) {
                players.sendMessage("§9[§bArmaSignalement§9] §bLe joueur " + targetName + " a été signalé pour " + reason + " §bpar §9" + humanEntity.getName());
            }
        }

    }

}
