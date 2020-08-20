package fr.newzaz.armacore.events;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.PlayerDeathEvent;

public class DeathEvent implements Listener {
    @EventHandler
    public void onDeath(PlayerDeathEvent e) {
        Player p = e.getEntity();
        Player t = p.getKiller();
            e.setDeathMessage("§b§l[§bArma§9Death§9§l] §b§l" + p.getName() + " §9a été tué par §b§l" + t.getName() + " §9avec un(e) §b§l" + t.getItemInHand().getType().name());

    }
}
