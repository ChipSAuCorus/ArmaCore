package fr.newzaz.armacore.gui.pnj;

import fr.newzaz.armacore.Main;
import net.milkbowl.vault.economy.Economy;
import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.plugin.RegisteredServiceProvider;

public class PnjGuiInteract implements Listener {
    static Economy econ = null;

    public PnjGuiInteract(Main main) {
    }

    private static boolean setupEconomy() {
        RegisteredServiceProvider<Economy> economyProvider = Bukkit.getServer().getServicesManager()
                .getRegistration(net.milkbowl.vault.economy.Economy.class);
        if (economyProvider != null) {
            econ = economyProvider.getProvider();
        }

        return (econ != null);
    }

    @EventHandler
    public static void PnjClick(InventoryClickEvent e) {
        if (e.getCurrentItem() == null) return;
        Player player = (Player) e.getWhoClicked();
        if (e.getInventory().getName().equalsIgnoreCase("§cPnj Militaire")) {
            switch (e.getCurrentItem().getTypeId()) {
                case 11:
                    if (e.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase("§7Armure")) {
                        if (setupEconomy()) {
                            e.setCancelled(true);
                            if (econ.getBalance(player) >= 400) {
                                if (player.getInventory().getArmorContents().length == 0) {
                                    econ.withdrawPlayer(player, 400);
                                    player.getInventory().setHelmet(new ItemStack(Material.getMaterial(5550)));
                                    player.getInventory().setChestplate(new ItemStack(Material.getMaterial(5548)));
                                    player.getInventory().setLeggings(new ItemStack(Material.getMaterial(5492)));
                                    player.getInventory().setBoots(new ItemStack(Material.getMaterial(5556)));
                                    player.sendMessage("§4[§cArmaPNJ§4] §cTu as reçu ton armure !");
                                } else {
                                    player.sendMessage("§cOhoho tu ne doit pas avoir d'armure dans ton slot fait pour ça !");
                                }
                            } else {
                                player.sendMessage("§cTu n'as pas assez il te manque " + (400 - econ.getBalance(player)) + "$");
                            }
                        }
                    }
                    break;
                case 12:
                    if (e.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase("§7Arme")) {
                        PnjMilitaireArme.openGUI(player);
                        e.setCancelled(true);
                    }
                    break;
                default:
                    break;
            }
        }
        if (e.getInventory().getName().equalsIgnoreCase("§cArme Militaire")) {
            switch (e.getCurrentItem().getTypeId()) {

                case 7761:
                    if (e.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase("§7Famas-F1")) {
                        if (setupEconomy()) {
                                e.setCancelled(true);
                                if (econ.getBalance(player) >= 7000) {
                                    if (player.getInventory().getContents().toString().contains("null")) {
                                        econ.withdrawPlayer(player, 7000);
                                        player.getInventory().addItem(new ItemStack(Material.getMaterial(7761)));
                                    }
                                }
                            }
                        }
                case 7623:
                    if(e.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase("§7HK-416")){
                        if(setupEconomy()){
                            e.setCancelled(true);
                            if(econ.getBalance(player) >= 7000){
                                if(player.getInventory().getContents().toString().contains("null")){
                                    econ.withdrawPlayer(player,7000);
                                    player.getInventory().addItem(new ItemStack(Material.getMaterial(7623)));
                                }
                            }
                        }
                    }
                case 7457:
                    if(e.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase("§7PGM")){
                        if(setupEconomy()){
                            e.setCancelled(true);
                            if(econ.getBalance(player) >= 7000){
                                if(player.getInventory().getContents().toString().contains("null")){
                                    econ.withdrawPlayer(player,7000);
                                    player.getInventory().addItem(new ItemStack(Material.getMaterial(7457)));
                                }
                            }
                        }
                    }
                case 7786:
                    if(e.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase("§7M249 SAW")){
                        if (setupEconomy()){
                            e.setCancelled(true);
                            if(econ.getBalance(player) >=7000){
                                if(player.getInventory().getContents().toString().contains("null")){
                                    econ.withdrawPlayer(player,7000);
                                    player.getInventory().addItem(new ItemStack(Material.getMaterial(7786)));
                                }
                            }
                        }
                    }
                    }
            }
        }
    }

