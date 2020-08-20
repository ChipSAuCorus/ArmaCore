package fr.newzaz.armacore.runnable;

import net.milkbowl.vault.economy.Economy;
import net.milkbowl.vault.permission.Permission;
import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.plugin.RegisteredServiceProvider;
import org.bukkit.scheduler.BukkitRunnable;

import java.util.Arrays;

public class Salaire extends BukkitRunnable {

    Economy econ = null;
    Permission perms = null;

    private boolean setupEconomy() {
        RegisteredServiceProvider<Economy> economyProvider = Bukkit.getServer().getServicesManager()
                .getRegistration(net.milkbowl.vault.economy.Economy.class);
        if (economyProvider != null) {
            econ = economyProvider.getProvider();
        }

        return (econ != null);
    }

    private boolean setupPermissions() {
        RegisteredServiceProvider<Permission> rsp = Bukkit.getServer().getServicesManager()
                .getRegistration(Permission.class);
        perms = rsp.getProvider();
        return perms != null;
    }

    @Override
    public void run() {

        if (setupEconomy()) {
            if (setupPermissions()) {
                for (Player player : Bukkit.getOnlinePlayers()) {
                    if (perms.playerInGroup(player, "Soldat")) {
                        int salaire = 1500;
                        econ.depositPlayer(player, salaire);
                        player.sendMessage("§a§m§l--------------§a§l[ArmaCraft §e§lSalaire]§e§m§l--------------");
                        player.sendMessage("§aRank : §e" + Arrays.toString(perms.getPlayerGroups(player)) + "§a.");
                        player.sendMessage("§e§m-----------------------");
                        player.sendMessage("§aTu as reçu un salaire de §e" + salaire + "§a$");
                        player.sendMessage("§a§m§l--------------§a§l[ArmaCraft §e§lSalaire]§e§m§l--------------");
                    } else if (perms.playerInGroup(player, "Caporal")) {
                        int salaire = 1600;
                        econ.depositPlayer(player, salaire);
                        player.sendMessage("§a§m§l--------------§a§l[ArmaCraft §e§lSalaire]§e§m§l--------------");
                        player.sendMessage("§aRank : §e" + Arrays.toString(perms.getPlayerGroups(player)) + "§a.");
                        player.sendMessage("§e§m-----------------------");
                        player.sendMessage("§aTu as reçu un salaire de §e" + salaire + "§a$");
                        player.sendMessage("§a§m§l--------------§a§l[ArmaCraft §e§lSalaire]§e§m§l--------------");
                    } else if (perms.playerInGroup(player, "Caporal-Chef")) {
                        int salaire = 1700;
                        econ.depositPlayer(player, salaire);
                        player.sendMessage("§a§m§l--------------§a§l[ArmaCraft §e§lSalaire]§e§m§l--------------");
                        player.sendMessage("§aRank : §e" + Arrays.toString(perms.getPlayerGroups(player)) + "§a.");
                        player.sendMessage("§e§m-----------------------");
                        player.sendMessage("§aTu as reçu un salaire de §e" + salaire + "§a$");
                        player.sendMessage("§a§m§l--------------§a§l[ArmaCraft §e§lSalaire]§e§m§l--------------");
                    } else if (perms.playerInGroup(player, "Sergent")) {
                        int salaire = 1800;
                        econ.depositPlayer(player, salaire);
                        player.sendMessage("§a§m§l--------------§a§l[ArmaCraft §e§lSalaire]§e§m§l--------------");
                        player.sendMessage("§aRank : §e" + Arrays.toString(perms.getPlayerGroups(player)) + "§a.");
                        player.sendMessage("§e§m-----------------------");
                        player.sendMessage("§aTu as reçu un salaire de §e" + salaire + "§a$");
                        player.sendMessage("§a§m§l--------------§a§l[ArmaCraft §e§lSalaire]§e§m§l--------------");
                    } else if (perms.playerInGroup(player, "Sergent-Chef")) {
                        int salaire = 1900;
                        econ.depositPlayer(player, salaire);
                        player.sendMessage("§a§m§l--------------§a§l[ArmaCraft §e§lSalaire]§e§m§l--------------");
                        player.sendMessage("§aRank : §e" + Arrays.toString(perms.getPlayerGroups(player)) + "§a.");
                        player.sendMessage("§e§m-----------------------");
                        player.sendMessage("§aTu as reçu un salaire de §e" + salaire + "§a$");
                        player.sendMessage("§a§m§l--------------§a§l[ArmaCraft §e§lSalaire]§e§m§l--------------");
                    } else if (perms.playerInGroup(player, "Adjudant")) {
                        int salaire = 2000;
                        econ.depositPlayer(player, salaire);
                        player.sendMessage("§a§m§l--------------§a§l[ArmaCraft §e§lSalaire]§e§m§l--------------");
                        player.sendMessage("§aRank : §e" + Arrays.toString(perms.getPlayerGroups(player)) + "§a.");
                        player.sendMessage("§e§m-----------------------");
                        player.sendMessage("§aTu as reçu un salaire de §e" + salaire + "§a$");
                        player.sendMessage("§a§m§l--------------§a§l[ArmaCraft §e§lSalaire]§e§m§l--------------");
                    } else if (perms.playerInGroup(player, "Adjudant-Chef")) {
                        int salaire = 2100;
                        econ.depositPlayer(player, salaire);
                        player.sendMessage("§a§m§l--------------§a§l[ArmaCraft §e§lSalaire]§e§m§l--------------");
                        player.sendMessage("§aRank : §e" + Arrays.toString(perms.getPlayerGroups(player)) + "§a.");
                        player.sendMessage("§e§m-----------------------");
                        player.sendMessage("§aTu as reçu un salaire de §e" + salaire + "§a$");
                        player.sendMessage("§a§m§l--------------§a§l[ArmaCraft §e§lSalaire]§e§m§l--------------");
                    } else if (perms.playerInGroup(player, "Major")) {
                        int salaire = 2200;
                        econ.depositPlayer(player, salaire);
                        player.sendMessage("§a§m§l--------------§a§l[ArmaCraft §e§lSalaire]§e§m§l--------------");
                        player.sendMessage("§aRank : §e" + Arrays.toString(perms.getPlayerGroups(player)) + "§a.");
                        player.sendMessage("§e§m-----------------------");
                        player.sendMessage("§aTu as reçu un salaire de §e" + salaire + "§a$");
                        player.sendMessage("§a§m§l--------------§a§l[ArmaCraft §e§lSalaire]§e§m§l--------------");
                    } else if (perms.playerInGroup(player, "Sous-Lieutenant")) {
                        int salaire = 2300;
                        econ.depositPlayer(player, salaire);
                        player.sendMessage("§a§m§l--------------§a§l[ArmaCraft §e§lSalaire]§e§m§l--------------");
                        player.sendMessage("§aRank : §e" + Arrays.toString(perms.getPlayerGroups(player)) + "§a.");
                        player.sendMessage("§e§m-----------------------");
                        player.sendMessage("§aTu as reçu un salaire de §e" + salaire + "§a$");
                        player.sendMessage("§a§m§l--------------§a§l[ArmaCraft §e§lSalaire]§e§m§l--------------");
                    } else if (perms.playerInGroup(player, "Lieutenant")) {
                        int salaire = 2400;
                        econ.depositPlayer(player, salaire);
                        player.sendMessage("§a§m§l--------------§a§l[ArmaCraft §e§lSalaire]§e§m§l--------------");
                        player.sendMessage("§aRank : §e" + Arrays.toString(perms.getPlayerGroups(player)) + "§a.");
                        player.sendMessage("§e§m-----------------------");
                        player.sendMessage("§aTu as reçu un salaire de §e" + salaire + "§a$");
                        player.sendMessage("§a§m§l--------------§a§l[ArmaCraft §e§lSalaire]§e§m§l--------------");
                    } else if (perms.playerInGroup(player, "Capitaine")) {
                        int salaire = 2500;
                        econ.depositPlayer(player, salaire);
                        player.sendMessage("§a§m§l--------------§a§l[ArmaCraft §e§lSalaire]§e§m§l--------------");
                        player.sendMessage("§aRank : §e" + Arrays.toString(perms.getPlayerGroups(player)) + "§a.");
                        player.sendMessage("§e§m-----------------------");
                        player.sendMessage("§aTu as reçu un salaire de §e" + salaire + "§a$");
                        player.sendMessage("§a§m§l--------------§a§l[ArmaCraft §e§lSalaire]§e§m§l--------------");
                    } else if (perms.playerInGroup(player, "Commandant")) {
                        int salaire = 2600;
                        econ.depositPlayer(player, salaire);
                        player.sendMessage("§a§m§l--------------§a§l[ArmaCraft §e§lSalaire]§e§m§l--------------");
                        player.sendMessage("§aRank : §e" + Arrays.toString(perms.getPlayerGroups(player)) + "§a.");
                        player.sendMessage("§e§m-----------------------");
                        player.sendMessage("§aTu as reçu un salaire de §e" + salaire + "§a$");
                        player.sendMessage("§a§m§l--------------§a§l[ArmaCraft §e§lSalaire]§e§m§l--------------");
                    } else if (perms.playerInGroup(player, "Lieutenant-Colonel")) {
                        int salaire = 2700;
                        econ.depositPlayer(player, salaire);
                        player.sendMessage("§a§m§l--------------§a§l[ArmaCraft §e§lSalaire]§e§m§l--------------");
                        player.sendMessage("§aRank : §e" + Arrays.toString(perms.getPlayerGroups(player)) + "§a.");
                        player.sendMessage("§e§m-----------------------");
                        player.sendMessage("§aTu as reçu un salaire de §e" + salaire + "§a$");
                        player.sendMessage("§a§m§l--------------§a§l[ArmaCraft §e§lSalaire]§e§m§l--------------");
                    } else if (perms.playerInGroup(player, "Colonel")) {
                        int salaire = 2800;
                        econ.depositPlayer(player, salaire);
                        player.sendMessage("§a§m§l--------------§a§l[ArmaCraft §e§lSalaire]§e§m§l--------------");
                        player.sendMessage("§aRank : §e" + Arrays.toString(perms.getPlayerGroups(player)) + "§a.");
                        player.sendMessage("§e§m-----------------------");
                        player.sendMessage("§aTu as reçu un salaire de §e" + salaire + "§a$");
                        player.sendMessage("§a§m§l--------------§a§l[ArmaCraft §e§lSalaire]§e§m§l--------------");
                    } else if (perms.playerInGroup(player, "Général-Brigade")) {
                        int salaire = 2900;
                        econ.depositPlayer(player, salaire);
                        player.sendMessage("§a§m§l--------------§a§l[ArmaCraft §e§lSalaire]§e§m§l--------------");
                        player.sendMessage("§aRank : §e" + Arrays.toString(perms.getPlayerGroups(player)) + "§a.");
                        player.sendMessage("§e§m-----------------------");
                        player.sendMessage("§aTu as reçu un salaire de §e" + salaire + "§a$");
                        player.sendMessage("§a§m§l--------------§a§l[ArmaCraft §e§lSalaire]§e§m§l--------------");
                    } else if (perms.playerInGroup(player, "Général-Division")) {
                        int salaire = 3000;
                        econ.depositPlayer(player, salaire);
                        player.sendMessage("§a§m§l--------------§a§l[ArmaCraft §e§lSalaire]§e§m§l--------------");
                        player.sendMessage("§aRank : §e" + Arrays.toString(perms.getPlayerGroups(player)) + "§a.");
                        player.sendMessage("§e§m-----------------------");
                        player.sendMessage("§aTu as reçu un salaire de §e" + salaire + "§a$");
                        player.sendMessage("§a§m§l--------------§a§l[ArmaCraft §e§lSalaire]§e§m§l--------------");
                    } else if (perms.playerInGroup(player, "Initié-Taliban")) {
                        int salaire = 250;
                        econ.depositPlayer(player, salaire);
                        player.sendMessage("§a§m§l--------------§a§l[ArmaCraft §e§lSalaire]§e§m§l--------------");
                        player.sendMessage("§aRank : §e" + Arrays.toString(perms.getPlayerGroups(player)) + "§a.");
                        player.sendMessage("§e§m-----------------------");
                        player.sendMessage("§aTu as reçu un salaire de §e" + salaire + "§a$");
                        player.sendMessage("§a§m§l--------------§a§l[ArmaCraft §e§lSalaire]§e§m§l--------------");
                    } else if (perms.playerInGroup(player, "soldat-islamiste-Taliban")) {
                        int salaire = 375;
                        econ.depositPlayer(player, salaire);
                        player.sendMessage("§a§m§l--------------§a§l[ArmaCraft §e§lSalaire]§e§m§l--------------");
                        player.sendMessage("§aRank : §e" + Arrays.toString(perms.getPlayerGroups(player)) + "§a.");
                        player.sendMessage("§e§m-----------------------");
                        player.sendMessage("§aTu as reçu un salaire de §e" + salaire + "§a$");
                        player.sendMessage("§a§m§l--------------§a§l[ArmaCraft §e§lSalaire]§e§m§l--------------");
                    } else if (perms.playerInGroup(player, "Conquérant-Qualifa")) {
                        int salaire = 500;
                        econ.depositPlayer(player, salaire);
                        player.sendMessage("§a§m§l--------------§a§l[ArmaCraft §e§lSalaire]§e§m§l--------------");
                        player.sendMessage("§aRank : §e" + Arrays.toString(perms.getPlayerGroups(player)) + "§a.");
                        player.sendMessage("§e§m-----------------------");
                        player.sendMessage("§aTu as reçu un salaire de §e" + salaire + "§a$");
                        player.sendMessage("§a§m§l--------------§a§l[ArmaCraft §e§lSalaire]§e§m§l--------------");
                    } else if (perms.playerInGroup(player, "Sous-Lieutenant-taliban")) {
                        int salaire = 625;
                        econ.depositPlayer(player, salaire);
                        player.sendMessage("§a§m§l--------------§a§l[ArmaCraft §e§lSalaire]§e§m§l--------------");
                        player.sendMessage("§aRank : §e" + Arrays.toString(perms.getPlayerGroups(player)) + "§a.");
                        player.sendMessage("§e§m-----------------------");
                        player.sendMessage("§aTu as reçu un salaire de §e" + salaire + "§a$");
                        player.sendMessage("§a§m§l--------------§a§l[ArmaCraft §e§lSalaire]§e§m§l--------------");
                    } else if (perms.playerInGroup(player, "Bras-droit-taliban")) {
                        int salaire = 750;
                        econ.depositPlayer(player, salaire);
                        player.sendMessage("§a§m§l--------------§a§l[ArmaCraft §e§lSalaire]§e§m§l--------------");
                        player.sendMessage("§aRank : §e" + Arrays.toString(perms.getPlayerGroups(player)) + "§a.");
                        player.sendMessage("§e§m-----------------------");
                        player.sendMessage("§aTu as reçu un salaire de §e" + salaire + "§a$");
                        player.sendMessage("§a§m§l--------------§a§l[ArmaCraft §e§lSalaire]§e§m§l--------------");
                    } else if (perms.playerInGroup(player, "Lieutenant-Taliban")) {
                        int salaire = 875;
                        econ.depositPlayer(player, salaire);
                        player.sendMessage("§a§m§l--------------§a§l[ArmaCraft §e§lSalaire]§e§m§l--------------");
                        player.sendMessage("§aRank : §e" + Arrays.toString(perms.getPlayerGroups(player)) + "§a.");
                        player.sendMessage("§e§m-----------------------");
                        player.sendMessage("§aTu as reçu un salaire de §e" + salaire + "§a$");
                        player.sendMessage("§a§m§l--------------§a§l[ArmaCraft §e§lSalaire]§e§m§l--------------");
                    } else if (perms.playerInGroup(player, "Conseiller-Taliban")) {
                        int salaire = 1000;
                        econ.depositPlayer(player, salaire);
                        player.sendMessage("§a§m§l--------------§a§l[ArmaCraft §e§lSalaire]§e§m§l--------------");
                        player.sendMessage("§aRank : §e" + Arrays.toString(perms.getPlayerGroups(player)) + "§a.");
                        player.sendMessage("§e§m-----------------------");
                        player.sendMessage("§aTu as reçu un salaire de §e" + salaire + "§a$");
                        player.sendMessage("§a§m§l--------------§a§l[ArmaCraft §e§lSalaire]§e§m§l--------------");
                    } else if (perms.playerInGroup(player, "Parrain-Taliban")) {
                        int salaire = 1125;
                        econ.depositPlayer(player, salaire);
                        player.sendMessage("§a§m§l--------------§a§l[ArmaCraft §e§lSalaire]§e§m§l--------------");
                        player.sendMessage("§aRank : §e" + Arrays.toString(perms.getPlayerGroups(player)) + "§a.");
                        player.sendMessage("§e§m-----------------------");
                        player.sendMessage("§aTu as reçu un salaire de §e" + salaire + "§a$");
                        player.sendMessage("§a§m§l--------------§a§l[ArmaCraft §e§lSalaire]§e§m§l--------------");
                    } else if (perms.playerInGroup(player, "Capitaine-Taliban")) {
                        int salaire = 1250;
                        econ.depositPlayer(player, salaire);
                        player.sendMessage("§a§m§l--------------§a§l[ArmaCraft §e§lSalaire]§e§m§l--------------");
                        player.sendMessage("§aRank : §e" + Arrays.toString(perms.getPlayerGroups(player)) + "§a.");
                        player.sendMessage("§e§m-----------------------");
                        player.sendMessage("§aTu as reçu un salaire de §e" + salaire + "§a$");
                        player.sendMessage("§a§m§l--------------§a§l[ArmaCraft §e§lSalaire]§e§m§l--------------");
                    } else if (perms.playerInGroup(player, "Vétéran-taliban")) {
                        int salaire = 1375;
                        econ.depositPlayer(player, salaire);
                        player.sendMessage("§a§m§l--------------§a§l[ArmaCraft §e§lSalaire]§e§m§l--------------");
                        player.sendMessage("§aRank : §e" + Arrays.toString(perms.getPlayerGroups(player)) + "§a.");
                        player.sendMessage("§e§m-----------------------");
                        player.sendMessage("§aTu as reçu un salaire de §e" + salaire + "§a$");
                        player.sendMessage("§a§m§l--------------§a§l[ArmaCraft §e§lSalaire]§e§m§l--------------");
                    } else if (perms.playerHas(player, "pay.staff")) {
                        int salaire = 5000;
                        econ.depositPlayer(player, salaire);
                        player.sendMessage("§a§m§l--------------§a§l[ArmaCraft §e§lSalaire]§e§m§l--------------");
                        player.sendMessage("§aRank : §e" + Arrays.toString(perms.getPlayerGroups(player)) + "§a.");
                        player.sendMessage("§e§m-----------------------");
                        player.sendMessage("§aTu as reçu un salaire de §e" + salaire + "§a$");
                        player.sendMessage("§a§m§l--------------§a§l[ArmaCraft §e§lSalaire]§e§m§l--------------");
                    } else if (perms.playerHas(player, "pay.yt")) {
                        int salaire = 3500;
                        econ.depositPlayer(player, salaire);
                        player.sendMessage("§a§m§l--------------§a§l[ArmaCraft §e§lSalaire]§e§m§l--------------");
                        player.sendMessage("§aRank : §e" + Arrays.toString(perms.getPlayerGroups(player)) + "§a.");
                        player.sendMessage("§e§m-----------------------");
                        player.sendMessage("§aTu as reçu un salaire de §e" + salaire + "§a$");
                        player.sendMessage("§a§m§l--------------§a§l[ArmaCraft §e§lSalaire]§e§m§l--------------");
                    } else if (perms.playerInGroup(player, "initié-uet")) {
                        int salaire = 500;
                        econ.depositPlayer(player, salaire);
                        player.sendMessage("§a§m§l--------------§a§l[ArmaCraft §e§lSalaire]§e§m§l--------------");
                        player.sendMessage("§aRank : §e" + Arrays.toString(perms.getPlayerGroups(player)) + "§a.");
                        player.sendMessage("§e§m-----------------------");
                        player.sendMessage("§aTu as reçu un salaire de §e" + salaire + "§a$");
                        player.sendMessage("§a§m§l--------------§a§l[ArmaCraft §e§lSalaire]§e§m§l--------------");
                    } else if (perms.playerInGroup(player, "soldat-islamiste-uet")) {
                        int salaire = 625;
                        econ.depositPlayer(player, salaire);
                        player.sendMessage("§a§m§l--------------§a§l[ArmaCraft §e§lSalaire]§e§m§l--------------");
                        player.sendMessage("§aRank : §e" + Arrays.toString(perms.getPlayerGroups(player)) + "§a.");
                        player.sendMessage("§e§m-----------------------");
                        player.sendMessage("§aTu as reçu un salaire de §e" + salaire + "§a$");
                        player.sendMessage("§a§m§l--------------§a§l[ArmaCraft §e§lSalaire]§e§m§l--------------");
                    } else if (perms.playerInGroup(player, "Conquérant-Qualifa-UET")) {
                        int salaire = 750;
                        econ.depositPlayer(player, salaire);
                        player.sendMessage("§a§m§l--------------§a§l[ArmaCraft §e§lSalaire]§e§m§l--------------");
                        player.sendMessage("§aRank : §e" + Arrays.toString(perms.getPlayerGroups(player)) + "§a.");
                        player.sendMessage("§e§m-----------------------");
                        player.sendMessage("§aTu as reçu un salaire de §e" + salaire + "§a$");
                        player.sendMessage("§a§m§l--------------§a§l[ArmaCraft §e§lSalaire]§e§m§l--------------");
                    } else if (perms.playerInGroup(player, "sous-lieutenant-uet")) {
                        int salaire = 875;
                        econ.depositPlayer(player, salaire);
                        player.sendMessage("§a§m§l--------------§a§l[ArmaCraft §e§lSalaire]§e§m§l--------------");
                        player.sendMessage("§aRank : §e" + Arrays.toString(perms.getPlayerGroups(player)) + "§a.");
                        player.sendMessage("§e§m-----------------------");
                        player.sendMessage("§aTu as reçu un salaire de §e" + salaire + "§a$");
                        player.sendMessage("§a§m§l--------------§a§l[ArmaCraft §e§lSalaire]§e§m§l--------------");
                    } else if (perms.playerInGroup(player, "Bras-Droit-UET")) {
                        int salaire = 1000;
                        econ.depositPlayer(player, salaire);
                        player.sendMessage("§a§m§l--------------§a§l[ArmaCraft §e§lSalaire]§e§m§l--------------");
                        player.sendMessage("§aRank : §e" + Arrays.toString(perms.getPlayerGroups(player)) + "§a.");
                        player.sendMessage("§e§m-----------------------");
                        player.sendMessage("§aTu as reçu un salaire de §e" + salaire + "§a$");
                        player.sendMessage("§a§m§l--------------§a§l[ArmaCraft §e§lSalaire]§e§m§l--------------");
                    } else if (perms.playerInGroup(player, "Lieutenant-UET")) {
                        int salaire = 1125;
                        econ.depositPlayer(player, salaire);
                        player.sendMessage("§a§m§l--------------§a§l[ArmaCraft §e§lSalaire]§e§m§l--------------");
                        player.sendMessage("§aRank : §e" + Arrays.toString(perms.getPlayerGroups(player)) + "§a.");
                        player.sendMessage("§e§m-----------------------");
                        player.sendMessage("§aTu as reçu un salaire de §e" + salaire + "§a$");
                        player.sendMessage("§a§m§l--------------§a§l[ArmaCraft §e§lSalaire]§e§m§l--------------");
                    } else if (perms.playerInGroup(player, "Conseiller-UET")) {
                        int salaire = 1250;
                        econ.depositPlayer(player, salaire);
                        player.sendMessage("§a§m§l--------------§a§l[ArmaCraft §e§lSalaire]§e§m§l--------------");
                        player.sendMessage("§aRank : §e" + Arrays.toString(perms.getPlayerGroups(player)) + "§a.");
                        player.sendMessage("§e§m-----------------------");
                        player.sendMessage("§aTu as reçu un salaire de §e" + salaire + "§a$");
                        player.sendMessage("§a§m§l--------------§a§l[ArmaCraft §e§lSalaire]§e§m§l--------------");
                    } else if (perms.playerInGroup(player, "Parrain-uet")) {
                        int salaire = 1375;
                        econ.depositPlayer(player, salaire);
                        player.sendMessage("§a§m§l--------------§a§l[ArmaCraft §e§lSalaire]§e§m§l--------------");
                        player.sendMessage("§aRank : §e" + Arrays.toString(perms.getPlayerGroups(player)) + "§a.");
                        player.sendMessage("§e§m-----------------------");
                        player.sendMessage("§aTu as reçu un salaire de §e" + salaire + "§a$");
                        player.sendMessage("§a§m§l--------------§a§l[ArmaCraft §e§lSalaire]§e§m§l--------------");
                    } else if (perms.playerInGroup(player, "Soldat-FST")) {
                        int salaire = 2000;
                        econ.depositPlayer(player, salaire);
                        player.sendMessage("§a§m§l--------------§a§l[ArmaCraft §e§lSalaire]§e§m§l--------------");
                        player.sendMessage("§aRank : §e" + Arrays.toString(perms.getPlayerGroups(player)) + "§a.");
                        player.sendMessage("§e§m-----------------------");
                        player.sendMessage("§aTu as reçu un salaire de §e" + salaire + "§a$");
                        player.sendMessage("§a§m§l--------------§a§l[ArmaCraft §e§lSalaire]§e§m§l--------------");
                    } else if (perms.playerInGroup(player, "Caporal-FST")) {
                        int salaire = 2500;
                        econ.depositPlayer(player, salaire);
                        player.sendMessage("§a§m§l--------------§a§l[ArmaCraft §e§lSalaire]§e§m§l--------------");
                        player.sendMessage("§aRank : §e" + Arrays.toString(perms.getPlayerGroups(player)) + "§a.");
                        player.sendMessage("§e§m-----------------------");
                        player.sendMessage("§aTu as reçu un salaire de §e" + salaire + "§a$");
                        player.sendMessage("§a§m§l--------------§a§l[ArmaCraft §e§lSalaire]§e§m§l--------------");
                    } else if (perms.playerInGroup(player, "Caporal-Chef-FST")) {
                        int salaire = 3000;
                        econ.depositPlayer(player, salaire);
                        player.sendMessage("§a§m§l--------------§a§l[ArmaCraft §e§lSalaire]§e§m§l--------------");
                        player.sendMessage("§aRank : §e" + Arrays.toString(perms.getPlayerGroups(player)) + "§a.");
                        player.sendMessage("§e§m-----------------------");
                        player.sendMessage("§aTu as reçu un salaire de §e" + salaire + "§a$");
                        player.sendMessage("§a§m§l--------------§a§l[ArmaCraft §e§lSalaire]§e§m§l--------------");
                    } else if (perms.playerInGroup(player, "Sergent-FST")) {
                        int salaire = 3500;
                        econ.depositPlayer(player, salaire);
                        player.sendMessage("§a§m§l--------------§a§l[ArmaCraft §e§lSalaire]§e§m§l--------------");
                        player.sendMessage("§aRank : §e" + Arrays.toString(perms.getPlayerGroups(player)) + "§a.");
                        player.sendMessage("§e§m-----------------------");
                        player.sendMessage("§aTu as reçu un salaire de §e" + salaire + "§a$");
                        player.sendMessage("§a§m§l--------------§a§l[ArmaCraft §e§lSalaire]§e§m§l--------------");
                    } else if (perms.playerInGroup(player, "Sergent-Chef-FST")) {
                        int salaire = 4000;
                        econ.depositPlayer(player, salaire);
                        player.sendMessage("§a§m§l--------------§a§l[ArmaCraft §e§lSalaire]§e§m§l--------------");
                        player.sendMessage("§aRank : §e" + Arrays.toString(perms.getPlayerGroups(player)) + "§a.");
                        player.sendMessage("§e§m-----------------------");
                        player.sendMessage("§aTu as reçu un salaire de §e" + salaire + "§a$");
                        player.sendMessage("§a§m§l--------------§a§l[ArmaCraft §e§lSalaire]§e§m§l--------------");
                    } else if (perms.playerInGroup(player, "Adjudant-FST")) {
                        int salaire = 4500;
                        econ.depositPlayer(player, salaire);
                        player.sendMessage("§a§m§l--------------§a§l[ArmaCraft §e§lSalaire]§e§m§l--------------");
                        player.sendMessage("§aRank : §e" + Arrays.toString(perms.getPlayerGroups(player)) + "§a.");
                        player.sendMessage("§e§m-----------------------");
                        player.sendMessage("§aTu as reçu un salaire de §e" + salaire + "§a$");
                        player.sendMessage("§a§m§l--------------§a§l[ArmaCraft §e§lSalaire]§e§m§l--------------");
                    } else if (perms.playerInGroup(player, "Adjudant-Chef-FST")) {
                        int salaire = 5000;
                        econ.depositPlayer(player, salaire);
                        player.sendMessage("§a§m§l--------------§a§l[ArmaCraft §e§lSalaire]§e§m§l--------------");
                        player.sendMessage("§aRank : §e" + Arrays.toString(perms.getPlayerGroups(player)) + "§a.");
                        player.sendMessage("§e§m-----------------------");
                        player.sendMessage("§aTu as reçu un salaire de §e" + salaire + "§a$");
                        player.sendMessage("§a§m§l--------------§a§l[ArmaCraft §e§lSalaire]§e§m§l--------------");
                    } else if (perms.playerInGroup(player, "Major-FST")) {
                        int salaire = 5500;
                        econ.depositPlayer(player, salaire);
                        player.sendMessage("§a§m§l--------------§a§l[ArmaCraft §e§lSalaire]§e§m§l--------------");
                        player.sendMessage("§aRank : §e" + Arrays.toString(perms.getPlayerGroups(player)) + "§a.");
                        player.sendMessage("§e§m-----------------------");
                        player.sendMessage("§aTu as reçu un salaire de §e" + salaire + "§a$");
                        player.sendMessage("§a§m§l--------------§a§l[ArmaCraft §e§lSalaire]§e§m§l--------------");
                    } else if (perms.playerInGroup(player, "Sous-Lieutenant-FST")) {
                        int salaire = 6000;
                        econ.depositPlayer(player, salaire);
                        player.sendMessage("§a§m§l--------------§a§l[ArmaCraft §e§lSalaire]§e§m§l--------------");
                        player.sendMessage("§aRank : §e" + Arrays.toString(perms.getPlayerGroups(player)) + "§a.");
                        player.sendMessage("§e§m-----------------------");
                        player.sendMessage("§aTu as reçu un salaire de §e" + salaire + "§a$");
                        player.sendMessage("§a§m§l--------------§a§l[ArmaCraft §e§lSalaire]§e§m§l--------------");
                    } else if (perms.playerInGroup(player, "Lieutenant-FST")) {
                        int salaire = 6500;
                        econ.depositPlayer(player, salaire);
                        player.sendMessage("§a§m§l--------------§a§l[ArmaCraft §e§lSalaire]§e§m§l--------------");
                        player.sendMessage("§aRank : §e" + Arrays.toString(perms.getPlayerGroups(player)) + "§a.");
                        player.sendMessage("§e§m-----------------------");
                        player.sendMessage("§aTu as reçu un salaire de §e" + salaire + "§a$");
                        player.sendMessage("§a§m§l--------------§a§l[ArmaCraft §e§lSalaire]§e§m§l--------------");
                    } else if (perms.playerInGroup(player, "Capitaine-FST")) {
                        int salaire = 7000;
                        econ.depositPlayer(player, salaire);
                        player.sendMessage("§a§m§l--------------§a§l[ArmaCraft §e§lSalaire]§e§m§l--------------");
                        player.sendMessage("§aRank : §e" + Arrays.toString(perms.getPlayerGroups(player)) + "§a.");
                        player.sendMessage("§e§m-----------------------");
                        player.sendMessage("§aTu as reçu un salaire de §e" + salaire + "§a$");
                        player.sendMessage("§a§m§l--------------§a§l[ArmaCraft §e§lSalaire]§e§m§l--------------");
                    } else if (perms.playerInGroup(player, "Commandant-FST")) {
                        int salaire = 7500;
                        econ.depositPlayer(player, salaire);
                        player.sendMessage("§a§m§l--------------§a§l[ArmaCraft §e§lSalaire]§e§m§l--------------");
                        player.sendMessage("§aRank : §e" + Arrays.toString(perms.getPlayerGroups(player)) + "§a.");
                        player.sendMessage("§e§m-----------------------");
                        player.sendMessage("§aTu as reçu un salaire de §e" + salaire + "§a$");
                        player.sendMessage("§a§m§l--------------§a§l[ArmaCraft §e§lSalaire]§e§m§l--------------");
                    } else if (perms.playerHas(player, "pay.vip")) {
                        int salaire = 2500;
                        econ.depositPlayer(player, salaire);
                        player.sendMessage("§a§m§l--------------§a§l[ArmaCraft §e§lSalaire]§e§m§l--------------");
                        player.sendMessage("§aRank : §e" + Arrays.toString(perms.getPlayerGroups(player)) + "§a.");
                        player.sendMessage("§e§m-----------------------");
                        player.sendMessage("§aTu as reçu un salaire de §e" + salaire + "§a$");
                        player.sendMessage("§a§m§l--------------§a§l[ArmaCraft §e§lSalaire]§e§m§l--------------");
                    } else if (perms.playerHas(player, "pay.vip+")) {
                        int salaire = 4000;
                        econ.depositPlayer(player, salaire);
                        player.sendMessage("§a§m§l--------------§a§l[ArmaCraft §e§lSalaire]§e§m§l--------------");
                        player.sendMessage("§aRank : §e" + Arrays.toString(perms.getPlayerGroups(player)) + "§a.");
                        player.sendMessage("§e§m-----------------------");
                        player.sendMessage("§aTu as reçu un salaire de §e" + salaire + "§a$");
                        player.sendMessage("§a§m§l--------------§a§l[ArmaCraft §e§lSalaire]§e§m§l--------------");
                    } else if (perms.playerHas(player, "pay.donateur")) {
                        int salaire = 6000;
                        econ.depositPlayer(player, salaire);
                        player.sendMessage("§a§m§l--------------§a§l[ArmaCraft §e§lSalaire]§e§m§l--------------");
                        player.sendMessage("§aRank : §e" + Arrays.toString(perms.getPlayerGroups(player)) + "§a.");
                        player.sendMessage("§e§m-----------------------");
                        player.sendMessage("§aTu as reçu un salaire de §e" + salaire + "§a$");
                        player.sendMessage("§a§m§l--------------§a§l[ArmaCraft §e§lSalaire]§e§m§l--------------");
                    }
                }

            }
        }
    }
}
