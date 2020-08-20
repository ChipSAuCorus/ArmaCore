package fr.newzaz.armacore.events;

import fr.newzaz.armacore.Main;
import net.milkbowl.vault.permission.Permission;
import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.plugin.RegisteredServiceProvider;

public class PlayerJoin implements Listener {
    private Permission perms = null;
    private boolean setupPermissions() {
        RegisteredServiceProvider<Permission> rsp = Bukkit.getServer().getServicesManager()
                .getRegistration(Permission.class);
        perms = rsp.getProvider();
        return perms != null;
    }

    @EventHandler
    public void onjoin(PlayerJoinEvent e) {
        Player player = e.getPlayer();
        Main.getInstance().getScoreboardManager().onLogin(player);
        if (setupPermissions()) {
                e.setJoinMessage("§2[§a+§2] §a[" + perms.getPrimaryGroup(player) + "]§a§l " + player.getName() + " §2a rejoint le serveur !");
        }
    }
}
