package fr.newzaz.armacore.events;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDamageEvent;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;

public class FallEvent implements Listener {
    @EventHandler
    public void onDamage(EntityDamageEvent e) {
        if (e.getEntity() instanceof Player) {
            Player p = (Player) e.getEntity();
            if (e.getCause() == EntityDamageEvent.DamageCause.FALL) {
                if (!p.getLocation().getBlock().getType().equals(Material.SAND) || !p.getLocation().getBlock().getType().equals(Material.GRAVEL)) {
                    if (p.getFallDistance() >= 8) {
                        p.addPotionEffect(new PotionEffect(PotionEffectType.SLOW, 600, 30));
                        Bukkit.broadcastMessage("§6[§eArmaFall§6] §e" + p.getName() + " §6ses cassé la jambe en §e x:"
                                + p.getLocation().getBlockX() + " , y:" + p.getLocation().getBlockY() + " , z:"
                                + p.getLocation().getBlockZ() + " §6avec §e" + p.getFallDistance() + " §6blocks de chute");
                    }
                } else {
                    if (p.getFallDistance() >= 12) {
                        p.addPotionEffect(new PotionEffect(PotionEffectType.SLOW, 600, 30));
                        Bukkit.broadcastMessage("§6[§eArmaFall§6] §e" + p.getName() + " §6ses cassé la jambe en §e x:"
                                + p.getLocation().getBlockX() + " , y:" + p.getLocation().getBlockY() + " , z:"
                                + p.getLocation().getBlockZ() + " §6avec §e" + p.getFallDistance() + " §6blocks de chute");
                    }
                }
            }
        }
    }
}
