package fr.newzaz.armacore.scoreboard;

import net.milkbowl.vault.economy.Economy;
import net.milkbowl.vault.permission.Permission;
import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.plugin.RegisteredServiceProvider;

import java.util.UUID;

/*
 * This file is part of SamaGamesAPI.
 *
 * SamaGamesAPI is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * SamaGamesAPI is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with SamaGamesAPI.  If not, see <http://www.gnu.org/licenses/>.
 */
public class PersonalScoreboard {
    private Player player;
    private final UUID uuid;
    private final ObjectiveSign objectiveSign;
    static Permission perms = null;
    static Economy econ = null;
    private static boolean setupPermissions() {
        RegisteredServiceProvider<Permission> rsp = Bukkit.getServer().getServicesManager()
                .getRegistration(Permission.class);
        perms = rsp.getProvider();
        return perms != null;
    }
    private static boolean setupEconomy() {
        RegisteredServiceProvider<Economy> economyProvider = Bukkit.getServer().getServicesManager()
                .getRegistration(net.milkbowl.vault.economy.Economy.class);
        if (economyProvider != null) {
            econ = economyProvider.getProvider();
        }

        return (econ != null);
    }

    public PersonalScoreboard(Player player){
        this.player = player;
        uuid = player.getUniqueId();
        objectiveSign = new ObjectiveSign("sidebar", "armaplugin");

        reloadData();
        objectiveSign.addReceiver(player);

    }

    public void reloadData(){}

    public void setLines(String ip) {
        if (setupPermissions()&& setupEconomy()) {
            objectiveSign.setDisplayName("§eArmaCraft §8(§7V1.9§8)");

            objectiveSign.setLine(0, "§1");
            objectiveSign.setLine(1,"§6§lStatistiques Joueur");
            objectiveSign.setLine(2, "§7 * Joueurs: §f"+ Bukkit.getOnlinePlayers().size()+"/50");
            objectiveSign.setLine(3, "§7 * Argent: §f" + (int) econ.getBalance(player)+"$");
            objectiveSign.setLine(4,"§2");
            objectiveSign.setLine(5,"§6§lInformations Joueur");
            objectiveSign.setLine(6,"§7 * Grade: §f"+perms.getPrimaryGroup(player));
            objectiveSign.setLine(7,"§3");
            objectiveSign.setLine(8, ip);

            objectiveSign.updateLines();
        }
    }

    public void onLogout(){
        objectiveSign.removeReceiver(Bukkit.getServer().getOfflinePlayer(uuid));
    }
}
