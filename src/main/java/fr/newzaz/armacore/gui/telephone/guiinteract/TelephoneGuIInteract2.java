package fr.newzaz.armacore.gui.telephone.guiinteract;

import fr.newzaz.armacore.events.MovePlayerEvent;
import fr.newzaz.armacore.gui.telephone.telephone1.MilitaireGUI;
import fr.newzaz.armacore.gui.telephone.telephone1.TalibanGui;
import fr.newzaz.armacore.gui.telephone.telephone2.TalibanGui2;
import fr.newzaz.armacore.gui.telephone.telephone3.MilitaireGUI3;
import fr.newzaz.armacore.gui.telephone.telephone3.TalibanGui3;
import fr.newzaz.armacore.gui.telephone.telgui.HelpGui;
import fr.newzaz.armacore.gui.telephone.telgui.MilitaireJobsGui;
import fr.newzaz.armacore.gui.telephone.telgui.TalibanJobsGui;
import net.milkbowl.vault.economy.Economy;
import net.milkbowl.vault.permission.Permission;
import org.bukkit.Bukkit;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.plugin.RegisteredServiceProvider;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class TelephoneGuIInteract2 implements Listener {

    private static final Map<String, Long> cooldowns1 = new HashMap<>();
    static Economy econ = null;
    static Permission perms = null;
    private final Map<String, Long> cooldowns = new HashMap<>();
    private final Map<String, Long> cooldowns0 = new HashMap<>();
    private final Map<String, Long> cooldowns00 = new HashMap<>();
    private final ArrayList<Player> pss = new ArrayList<>();
    private int count;
    private int t;
    private ArrayList<Player> attaqueplayer = new ArrayList<>();

    private static boolean setupEconomy() {
        RegisteredServiceProvider<Economy> economyProvider = Bukkit.getServer().getServicesManager()
                .getRegistration(net.milkbowl.vault.economy.Economy.class);
        if (economyProvider != null) {
            econ = economyProvider.getProvider();
        }

        return (econ != null);
    }

    private static boolean setupPermissions() {
        RegisteredServiceProvider<Permission> rsp = Bukkit.getServer().getServicesManager()
                .getRegistration(Permission.class);
        perms = rsp.getProvider();
        return perms != null;
    }

    @EventHandler
    public static void onClick(InventoryClickEvent e) {
        if (e.getWhoClicked().getType() != EntityType.PLAYER) {
            return;
        }
        Player p = (Player) e.getWhoClicked();

        if (e.getInventory().getName().equals("§9Iphone-6")) {
            if (e.getCurrentItem().getItemMeta() == null) {
                return;
            }

            if (e.getCurrentItem().getItemMeta().getDisplayName().equals("§6Taliban")) {
                TalibanGui.openGUI(p);
                e.setCancelled(true);

            } else {
                return;
            }
        }
    }

    @EventHandler
    public static void onClick1(InventoryClickEvent e) {
        if (e.getWhoClicked().getType() != EntityType.PLAYER) {
            return;
        }
        Player p = (Player) e.getWhoClicked();

        if (e.getInventory().getName().equals("§9Iphone-6")) {
            if (e.getCurrentItem().getItemMeta() == null) {
                return;
            }
            if (e.getCurrentItem().getItemMeta().getDisplayName().equals("§7Militaire")) {
                MilitaireGUI.openGUI(p);
                e.setCancelled(true);

            } else {
                return;
            }
        }
    }

    @EventHandler
    public static void onClick5(InventoryClickEvent e) {
        if (e.getWhoClicked().getType() != EntityType.PLAYER) {
            return;
        }
        Player p = (Player) e.getWhoClicked();

        if (e.getInventory().getName().equals("§6Taliban")) {
            if (e.getCurrentItem().getItemMeta() == null) {
                return;
            }
            if (e.getCurrentItem().getItemMeta().getDisplayName().equals("§bMétiers")) {
                TalibanJobsGui.openGUI(p);
                e.setCancelled(true);

            } else {
                return;
            }
        }
    }

    @EventHandler
    public static void onClick14(InventoryClickEvent e) {
        if (e.getWhoClicked().getType() != EntityType.PLAYER) {
            return;
        }
        Player p = (Player) e.getWhoClicked();

        if (e.getInventory().getName().equals("§7Militaire")) {
            if (e.getCurrentItem().getItemMeta() == null) {
                return;
            }
            if (e.getCurrentItem().getItemMeta().getDisplayName().equals("§bMétiers")) {
                MilitaireJobsGui.openGUI(p);
                e.setCancelled(true);

            } else {
                return;
            }
        }
    }

    @EventHandler
    public static void onClick15(InventoryClickEvent e) {
        if (e.getWhoClicked().getType() != EntityType.PLAYER) {
            return;
        }
        Player p = (Player) e.getWhoClicked();

        if (e.getInventory().getName().equals("§9Iphone-4")) {
            if (e.getCurrentItem().getItemMeta() == null) {
                return;
            }
            if (e.getCurrentItem().getItemMeta().getDisplayName().equals("§6Taliban")) {
                TalibanGui2.openGUI(p);
                e.setCancelled(true);

            } else {
                return;
            }
        }
    }

    @EventHandler
    public static void onClick16(InventoryClickEvent e) {
        if (e.getWhoClicked().getType() != EntityType.PLAYER) {
            return;
        }
        Player p = (Player) e.getWhoClicked();

        if (e.getInventory().getName().equals("§9Iphone X gold")) {
            if (e.getCurrentItem().getItemMeta() == null) {
                return;
            }
            if (e.getCurrentItem().getItemMeta().getDisplayName().equals("§7Militaire")) {
                MilitaireGUI3.openGUI(p);
                e.setCancelled(true);

            } else {
                return;
            }
        }
    }

    @EventHandler
    public static void onClick19(InventoryClickEvent e) {
        if (e.getWhoClicked().getType() != EntityType.PLAYER) {
            return;
        }
        Player p = (Player) e.getWhoClicked();

        if (e.getInventory().getName().equals("§9Iphone X gold")) {
            if (e.getCurrentItem().getItemMeta() == null) {
                return;
            }
            if (e.getCurrentItem().getItemMeta().getDisplayName().equals("§7Mercenaire")) {
                if (setupEconomy()) {
                    if (setupPermissions()) {
                        if (econ.getBalance(p) >= 500000) {
                            econ.withdrawPlayer(p, 500000);
                            perms.playerAddGroup(p, "Mercenaire");
                            Bukkit.broadcastMessage("§c[ArmaRank] Bravo à " + p.getName() + " qui passe Mercenaire !");

                        } else {
                            p.sendMessage("§c[ArmaRank] tu n'as pas assez il te manque " + (500000 - econ.getBalance(p)) + "$");
                            e.setCancelled(true);
                        }
                    }
                }
            } else {
                return;
            }
        }
    }

    @EventHandler
    public static void onClick17(InventoryClickEvent e) {
        if (e.getWhoClicked().getType() != EntityType.PLAYER) {
            return;
        }
        Player p = (Player) e.getWhoClicked();

        if (e.getInventory().getName().equals("§9Iphone X gold")) {
            if (e.getCurrentItem().getItemMeta() == null) {
                return;
            }
            if (e.getCurrentItem().getItemMeta().getDisplayName().equals("§6Taliban")) {
                TalibanGui3.openGUI(p);
                e.setCancelled(true);

            } else {
                return;
            }
        }
    }

    @EventHandler
    public static void onClick2(InventoryClickEvent e) {
        if (e.getWhoClicked().getType() != EntityType.PLAYER) {
            return;
        }
        Player p = (Player) e.getWhoClicked();


        if (e.getInventory().getName().equals("§9Iphone-6") || e.getInventory().getName().equals("§9Iphone-4") || e.getInventory().getName().equals("§9Iphone X gold")) {
            if (e.getCurrentItem().getItemMeta() == null) {
                return;
            }
            if (e.getCurrentItem().getItemMeta().getDisplayName().equals("§cBesoin d'aide")) {
                HelpGui.openGUI(p);
                e.setCancelled(true);

            } else {
                return;
            }
        }
    }

    @EventHandler
    public static void onClick55(InventoryClickEvent e) {
        if (e.getWhoClicked().getType() != EntityType.PLAYER) {
            return;
        }
        Player p = (Player) e.getWhoClicked();

        if (e.getInventory().getName().equals("§bHelp Menu")) {
            if (e.getCurrentItem().getItemMeta() == null) {
                return;
            }
            if (e.getCurrentItem().getItemMeta().getDisplayName().equals("§6Besoin d'un Développeur")) {
                if (cooldowns1.containsKey(p.getName())) {

                    int seconds = 15;
                    long timeleft = ((cooldowns1.get(p.getName()) / 1000) + seconds)
                            - (System.currentTimeMillis() / 1000);
                    if (timeleft > 0) {
                        p.sendMessage(
                                "§4[§cArmaCooldown§4] §cCalme Il te reste " + timeleft + "s pour redemander de l'aide !");
                        e.setCancelled(true);
                        return;
                    }
                }


                cooldowns1.put(p.getName(), System.currentTimeMillis());

                int seconds = 15;

                long timeleft = ((cooldowns1.get(p.getName()) / 1000) + seconds) - (System.currentTimeMillis() / 1000);

                Bukkit.broadcastMessage("§e[§6ArmaHelp§e] " + p.getName() + "§e a besoin d'un développeur !");
                p.closeInventory();
                e.setCancelled(true);
            }
        }
    }

    @EventHandler
    public static void onClick555(InventoryClickEvent e) {
        if (e.getWhoClicked().getType() != EntityType.PLAYER) {
            return;
        }
        Player p = (Player) e.getWhoClicked();

        if (e.getInventory().getName().equals("§bHelp Menu")) {
            if (e.getCurrentItem().getItemMeta() == null) {
                return;
            }
            if (e.getCurrentItem().getItemMeta().getDisplayName().equals("§6Besoin d'un Animateur")) {
                if (cooldowns1.containsKey(p.getName())) {

                    int seconds = 15;
                    long timeleft = ((cooldowns1.get(p.getName()) / 1000) + seconds)
                            - (System.currentTimeMillis() / 1000);
                    if (timeleft > 0) {
                        p.sendMessage(
                                "§4[§cArmaCooldown§4] §cCalme Il te reste " + timeleft + "s pour redemander de l'aide !");
                        e.setCancelled(true);
                        return;
                    }
                }


                cooldowns1.put(p.getName(), System.currentTimeMillis());

                int seconds = 15;

                long timeleft = ((cooldowns1.get(p.getName()) / 1000) + seconds) - (System.currentTimeMillis() / 1000);

                Bukkit.broadcastMessage("§e[§6ArmaHelp§e] " + p.getName() + "§e a besoin d'un animateur !");
                p.closeInventory();
                e.setCancelled(true);
            }
        }
    }

    @EventHandler
    public static void onClick5555(InventoryClickEvent e) {
        if (e.getWhoClicked().getType() != EntityType.PLAYER) {
            return;
        }
        Player p = (Player) e.getWhoClicked();

        if (e.getInventory().getName().equals("§bHelp Menu")) {
            if (e.getCurrentItem().getItemMeta() == null) {
                return;
            }
            if (e.getCurrentItem().getItemMeta().getDisplayName().equals("§6Besoin d'un Builder")) {
                if (cooldowns1.containsKey(p.getName())) {

                    int seconds = 15;
                    long timeleft = ((cooldowns1.get(p.getName()) / 1000) + seconds)
                            - (System.currentTimeMillis() / 1000);
                    if (timeleft > 0) {
                        p.sendMessage(
                                "§4[§cArmaCooldown§4] §cCalme Il te reste " + timeleft + "s pour redemander de l'aide !");
                        e.setCancelled(true);
                        return;
                    }
                }


                cooldowns1.put(p.getName(), System.currentTimeMillis());

                int seconds = 15;

                long timeleft = ((cooldowns1.get(p.getName()) / 1000) + seconds) - (System.currentTimeMillis() / 1000);

                Bukkit.broadcastMessage("§e[§6ArmaHelp§e] " + p.getName() + "§e a besoin d'un builder !");
                p.closeInventory();
                e.setCancelled(true);
            }
        }
    }

    @EventHandler
    public static void onClick55555(InventoryClickEvent e) {
        if (e.getWhoClicked().getType() != EntityType.PLAYER) {
            return;
        }
        Player p = (Player) e.getWhoClicked();

        if (e.getInventory().getName().equals("§bHelp Menu")) {
            if (e.getCurrentItem().getItemMeta() == null) {
                return;
            }
            if (e.getCurrentItem().getItemMeta().getDisplayName().equals("§6Besoin d'un Modérateur")) {
                if (cooldowns1.containsKey(p.getName())) {

                    int seconds = 15;
                    long timeleft = ((cooldowns1.get(p.getName()) / 1000) + seconds)
                            - (System.currentTimeMillis() / 1000);
                    if (timeleft > 0) {
                        p.sendMessage(
                                "§4[§cArmaCooldown§4] §cCalme Il te reste " + timeleft + "s pour redemander de l'aide !");
                        e.setCancelled(true);
                        return;
                    }
                }


                cooldowns1.put(p.getName(), System.currentTimeMillis());

                int seconds = 15;

                long timeleft = ((cooldowns1.get(p.getName()) / 1000) + seconds) - (System.currentTimeMillis() / 1000);

                Bukkit.broadcastMessage("§e[§6ArmaHelp§e] " + p.getName() + "§e a besoin d'un modérateur !");
                p.closeInventory();
                e.setCancelled(true);
            }
        }
    }

    @EventHandler
    public static void onClick7(InventoryClickEvent e) {
        if (e.getWhoClicked().getType() != EntityType.PLAYER) {
            return;
        }
        Player p = (Player) e.getWhoClicked();

        if (e.getInventory().getName().equals("§bMétiers")) {
            if (e.getCurrentItem().getItemMeta() == null) {
                return;
            }
            if (e.getCurrentItem().getItemMeta().getDisplayName().equals("§7Militaire")) {
                if (setupPermissions()) {
                    if (perms.playerInGroup(p, "default")) {

                        Bukkit.broadcastMessage(
                                "§c[Grades] §6Bravo à " + p.getName() + " qui deviens §8Soldat Militaire");
                        perms.playerAddGroup(p, "soldat");
                        p.closeInventory();

                        e.setCancelled(true);
                    } else {
                        e.setCancelled(true);
                        p.sendMessage("§4[§cArmaTéléphone§4] §cTu n'es pas Civil");
                        p.closeInventory();
                    }
                }
            }
        }
    }

    @EventHandler
    public void onClick6(InventoryClickEvent e) {
        if (e.getWhoClicked().getType() != EntityType.PLAYER) {
            return;
        }
        Player p = (Player) e.getWhoClicked();

        if (e.getInventory().getName().equals("§9Iphone-6") || e.getInventory().getName().equals("§9Iphone-4") || e.getInventory().getName().equals("§9Iphone X gold")) {
            e.setCancelled(true);
            if (e.getCurrentItem().getItemMeta() == null) {
                return;
            }
            if (e.getCurrentItem().getItemMeta().getDisplayName().equals("§aMoney")) {
                e.setCancelled(true);

                Bukkit.dispatchCommand(p, "bal " + p.getName());
                p.closeInventory();

            } else {
                return;
            }
        }
    }

    @EventHandler
    public void onClick8(InventoryClickEvent e) {
        if (e.getWhoClicked().getType() != EntityType.PLAYER) {
            return;
        }
        Player p = (Player) e.getWhoClicked();

        if (e.getInventory().getName().equals("§bMétiers")) {
            if (e.getCurrentItem().getItemMeta() == null) {
                return;
            }
            if (e.getCurrentItem().getItemMeta().getDisplayName().equals("§bFST")) {
                e.setCancelled(true);
                p.sendMessage("§4[§cArmaDiscord§4] §cVoici le Discord FST: https://discord.gg/far3EKR");
                p.closeInventory();
            }

        }


    }

    @EventHandler
    public void onClick9(InventoryClickEvent e) {
        if (e.getWhoClicked().getType() != EntityType.PLAYER) {
            return;
        }
        Player p = (Player) e.getWhoClicked();

        if (e.getInventory().getName().equals("§bMétiers")) {
            if (e.getCurrentItem().getItemMeta() == null) {
                return;
            }
            if (e.getCurrentItem().getItemMeta().getDisplayName().equals("§8UET")) {
                e.setCancelled(true);
                p.sendMessage("§4[§cArmaDiscord§4] §cVoici le Discord FST: https://discord.gg/Rx6NPjD");
                p.closeInventory();
            }
        }
    }

    @EventHandler
    public void onClick10(InventoryClickEvent e) {
        if (e.getWhoClicked().getType() != EntityType.PLAYER) {
            return;
        }
        Player p = (Player) e.getWhoClicked();

        if (e.getInventory().getName().equals("§bMétiers")) {
            if (e.getCurrentItem().getItemMeta() == null) {
                return;
            }
            if (e.getCurrentItem().getItemMeta().getDisplayName().equals("§6Taliban")) {
                if (perms.playerInGroup(p, "default")) {

                    e.setCancelled(true);
                    Bukkit.broadcastMessage("§c[Grades] §6Bravo à " + p.getName() + " qui deviens §6Initié-Taliban");
                    perms.playerAddGroup(p, "initié-taliban");
                    p.closeInventory();
                    e.setCancelled(true);
                } else {
                    p.sendMessage("§4[§cArmaTéléphone§4] §cTu n'es pas Civil");
                    e.setCancelled(true);
                    p.closeInventory();
                }
            }
        }

    }

    @EventHandler
    public void onClick11(InventoryClickEvent e) {
        if (e.getWhoClicked().getType() != EntityType.PLAYER) {
            return;
        }
        Player p = (Player) e.getWhoClicked();


        if (e.getInventory().getName().equals("§6Taliban")) {
            if (e.getCurrentItem().getItemMeta() == null) {
                return;
            }
            if (e.getCurrentItem().getItemMeta().getDisplayName().equals("§7Attaque Ville Moderne")) {
                if (p.hasPermission("tali.attaque")) {
                    if (cooldowns.containsKey(p.getName())) {

                        int seconds = 60 * 15;
                        long timeleft = ((cooldowns.get(p.getName()) / 1000) + seconds)
                                - (System.currentTimeMillis() / 1000);
                        if (timeleft > 0) {
                            p.sendMessage(
                                    "§4[§cArmaCooldown§4] §cIl te reste " + timeleft / 60 + "m pour utiliser ton Attaque !");
                            p.closeInventory();
                            e.setCancelled(true);
                            return;
                        }
                    }

                    if (MovePlayerEvent.vm.contains(p)) {
                        cooldowns.put(p.getName(), System.currentTimeMillis());

                        int seconds = 60 * 15;

                        long timeleft = ((cooldowns.get(p.getName()) / 1000) + seconds) - (System.currentTimeMillis() / 1000);


                        p.sendMessage("§4[§cArmaCooldown§4] §cTu as utilisé ton Attaque tu dois attendre " + timeleft / 60
                                + " minutes pour la réutiliser");

                        Bukkit.broadcastMessage("§f[§6Ville Moderne§f] §4La Ville Moderne est attaquée !");
                        Bukkit.broadcastMessage(
                                "§f[§6Ville Moderne§f] §bN'oubliez pas, une attaque toutes les 15 minutes !");
                        p.closeInventory();
                        e.setCancelled(true);
                    } else {
                        p.sendMessage("§4[§cArmaRegion§4] §cTu doit être dans la Ville Moderne pour attaqué !");
                        p.closeInventory();
                        e.setCancelled(true);
                    }
                } else {
                    p.sendMessage("§4[§cArmaTéléphone§4] §cTu n'es pas Taliban/uet");
                    e.setCancelled(true);
                    p.closeInventory();
                }
            }
        }
    }

    @EventHandler
    public void onClick112(InventoryClickEvent e) {
        if (e.getWhoClicked().getType() != EntityType.PLAYER) {
            return;
        }
        Player p = (Player) e.getWhoClicked();


        if (e.getInventory().getName().equals("§6Taliban")) {
            if (e.getCurrentItem().getItemMeta() == null) {
                return;
            }
            if (e.getCurrentItem().getItemMeta().getDisplayName().equals("§7Attaque Capitale")) {
                if (p.hasPermission("tali.attaque")) {
                    if (cooldowns0.containsKey(p.getName())) {

                        int seconds = 60 * 30;
                        long timeleft = ((cooldowns0.get(p.getName()) / 1000) + seconds)
                                - (System.currentTimeMillis() / 1000);
                        if (timeleft > 0) {
                            p.sendMessage(
                                    "§4[§cArmaCooldown§4] §cIl te reste " + timeleft / 60 + "m pour utiliser ton Attaque !");
                            p.closeInventory();
                            e.setCancelled(true);
                            return;
                        }
                    }

                    if (MovePlayerEvent.capitale.contains(p)) {
                        cooldowns0.put(p.getName(), System.currentTimeMillis());

                        int seconds = 60 * 15;

                        long timeleft = ((cooldowns0.get(p.getName()) / 1000) + seconds) - (System.currentTimeMillis() / 1000);


                        p.sendMessage("§4[§cArmaCooldown§4] §cTu as utilisé ton Attaque tu dois attendre " + timeleft / 60
                                + " minutes pour la réutiliser");

                        Bukkit.broadcastMessage("§5[§dAmbassade§5] §dLa Capitale est attaquée !");


                        p.closeInventory();
                        e.setCancelled(true);
                    } else {
                        p.sendMessage("§4[§cArmaRegion§4] §cTu doit être dans la Capitale pour attaquer !");
                        p.closeInventory();
                        e.setCancelled(true);
                    }
                } else {
                    p.sendMessage("§4[§cArmaTéléphone§4] §cTu n'es pas Taliban/uet");
                    e.setCancelled(true);
                    p.closeInventory();
                }
            }
        }
    }

    @EventHandler
    public void onClick111(InventoryClickEvent e) {
        if (e.getWhoClicked().getType() != EntityType.PLAYER) {
            return;
        }
        Player p = (Player) e.getWhoClicked();


        if (e.getInventory().getName().equals("§6Taliban")) {
            if (e.getCurrentItem().getItemMeta() == null) {
                return;
            }
            if (e.getCurrentItem().getItemMeta().getDisplayName().equals("§7Attaque Banque")) {
                if (p.hasPermission("tali.attaque")) {
                    if (cooldowns00.containsKey(p.getName())) {

                        int seconds = 60 * 60;
                        long timeleft = ((cooldowns00.get(p.getName()) / 1000) + seconds)
                                - (System.currentTimeMillis() / 1000);
                        if (timeleft > 0) {
                            p.sendMessage(
                                    "§4[§cArmaCooldown§4] §cIl te reste " + timeleft / 60 + "m pour utiliser ton Attaque !");
                            p.closeInventory();
                            e.setCancelled(true);
                            return;
                        }
                    }


                    cooldowns00.put(p.getName(), System.currentTimeMillis());

                    int seconds = 60 * 60;

                    long timeleft = ((cooldowns00.get(p.getName()) / 1000) + seconds) - (System.currentTimeMillis() / 1000);


                    p.sendMessage("§4[§cArmaCooldown§4] §cTu as utilisé ton Attaque tu dois attendre " + timeleft / 60
                            + " minutes pour la réutiliser");

                    Bukkit.broadcastMessage("§1[§9Banque§1] §9La Banque ce fait Attaquer ! Besoin de toute les unités à la banque !");

                    p.closeInventory();
                    e.setCancelled(true);

                } else {
                    p.sendMessage("§4[§cArmaTéléphone§4] §cTu n'es pas Taliban/uet");
                    e.setCancelled(true);
                    p.closeInventory();
                }
            }
        }
    }

    @EventHandler
    public void onClick12(InventoryClickEvent e) {
        if (e.getWhoClicked().getType() != EntityType.PLAYER) {
            return;
        }
        Player p = (Player) e.getWhoClicked();

        if (e.getInventory().getName().equals("§7Militaire")) {
            e.setCancelled(true);
            if (e.getCurrentItem().getItemMeta() == null) {
                return;
            }
            if (e.getCurrentItem().getItemMeta().getDisplayName().equals("§7Service")) {
                e.setCancelled(true);
                if (p.hasPermission("mili.militaire"))

                    if (pss.contains(p)) {
                        Bukkit.dispatchCommand(p, "Militaire" + " §7Prend sa fin de service !");
                        pss.remove(p);
                        p.closeInventory();
                        e.setCancelled(true);
                    } else {

                        Bukkit.dispatchCommand(p, "Militaire" + " §7Prend son service !");
                        pss.add(p);
                        p.closeInventory();
                        e.setCancelled(true);
                    }

                p.closeInventory();
                e.setCancelled(true);

            } else {

            }
        }
    }

    @EventHandler
    public void onClick13(InventoryClickEvent e) {
        if (e.getWhoClicked().getType() != EntityType.PLAYER) {
            return;
        }
        Player p = (Player) e.getWhoClicked();

        if (e.getInventory().getName().equals("§bMétiers")) {
            e.setCancelled(true);
            if (e.getCurrentItem().getItemMeta() == null) {
                return;
            }
            if (e.getCurrentItem().getItemMeta().getDisplayName().equals("§8GIGN")) {
                e.setCancelled(true);
                p.closeInventory();
                p.sendMessage("§cVoici le discord du GIGN : https://discord.gg/b9MR6Zh");

            } else {
                return;
            }
        }
    }
}