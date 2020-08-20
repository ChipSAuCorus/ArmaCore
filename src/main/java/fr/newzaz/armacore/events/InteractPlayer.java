package fr.newzaz.armacore.events;

import org.bukkit.Material;
import org.bukkit.block.Block;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;

import java.util.HashMap;
import java.util.Map;

public class InteractPlayer implements Listener {
    private final Map<String, Long> cooldowns = new HashMap<>();
    @EventHandler
    public void onClickMedkit(PlayerInteractEvent event) {
        Action action = event.getAction();
        Player player = event.getPlayer();
        ItemStack item = event.getItem();

        if (item == null || item.getType() != Material.getMaterial(5716) || item.getType() != Material.getMaterial(5718))
            return;
        if (action == Action.RIGHT_CLICK_AIR || action == Action.RIGHT_CLICK_BLOCK) {
            if (item.getType() == Material.getMaterial(5716) || item.getType() == Material.getMaterial(5718)) {
                if (cooldowns.containsKey(player.getName())) {

                    int seconds = 4;
                    long timeleft = ((cooldowns.get(player.getName()) / 1000) + seconds)
                            - (System.currentTimeMillis() / 1000);
                    if (timeleft > 0) {
                        player.sendMessage(
                                "§4[§cArmaCooldown§4] §cIl te reste " + timeleft + "s pour utiliser ton medkit !");
                        event.setCancelled(true);
                        return;
                    }
                }
            }
        }

        cooldowns.put(player.getName(), System.currentTimeMillis());

        int seconds = 4;

        long timeleft = ((cooldowns.get(player.getName()) / 1000) + seconds) - (System.currentTimeMillis() / 1000);
        if (action == Action.RIGHT_CLICK_AIR || action == Action.RIGHT_CLICK_BLOCK) {

            player.sendMessage("§4[§cArmaCooldown§4] §cTu as utilisé ton Medkit tu dois attendre " + timeleft
                    + " secondes pour le réutiliser");
        }

    }

    int t2 = 0;

    @EventHandler
    public void OnMedkit(PlayerInteractEvent e) {
        Player p = e.getPlayer();

        Action a = e.getAction();

        if (a == Action.RIGHT_CLICK_AIR || a == Action.RIGHT_CLICK_BLOCK) {
            if (p.getInventory().getItemInHand().getType().equals(Material.getMaterial(5716))) {

                p.removePotionEffect(PotionEffectType.SLOW);
            }
        }
    }

    @EventHandler
    public void onClickPeyote(PlayerInteractEvent event) {
        Action action = event.getAction();
        Player player = event.getPlayer();
        ItemStack item = event.getItem();

        if (item == null || item.getType() != Material.getMaterial(7992))
            return;
        if (action == Action.RIGHT_CLICK_AIR) {
            if (item.getType() == Material.getMaterial(7992)) {
                if (cooldowns.containsKey(player.getName())) {

                    int seconds = 30;
                    long timeleft = ((cooldowns.get(player.getName()) / 1000) + seconds)
                            - (System.currentTimeMillis() / 1000);
                    if (timeleft > 0) {
                        player.sendMessage(
                                "§4[§cArmaCooldown§4] §cIl te reste " + timeleft + "s pour utiliser ton Join !");
                        event.setCancelled(true);
                        return;
                    }
                }
            }
        }

        cooldowns.put(player.getName(), System.currentTimeMillis());

        int seconds = 30;

        long timeleft = ((cooldowns.get(player.getName()) / 1000) + seconds) - (System.currentTimeMillis() / 1000);
        if (action == Action.RIGHT_CLICK_AIR) {

            player.sendMessage("§4[§cArmaCooldown§4] §cTu as utilisé ton join tu dois attendre " + timeleft
                    + " secondes pour le réutiliser");
            player.addPotionEffect(new PotionEffect(PotionEffectType.SPEED, 100, 2));
            player.addPotionEffect(new PotionEffect(PotionEffectType.CONFUSION, 160, 3));
            player.getInventory().remove(item);
        }

    }

    @EventHandler
    public void onTrafic(PlayerInteractEvent e) {
        Player p = e.getPlayer();
        Action a = e.getAction();
        Block item = e.getClickedBlock();
        if (item == null || item.getType() != Material.getMaterial(711))
            return;
        if (item.getType() == Material.getMaterial(711)) {
            if (a == Action.RIGHT_CLICK_BLOCK) {
                if (p.hasPermission("panneau.use")) {
                    e.setCancelled(false);
                } else {

                    if (item.getType() == Material.getMaterial(711)) {
                        if (a == Action.RIGHT_CLICK_BLOCK) {

                            e.setCancelled(true);
                            p.sendMessage(
                                    "§4[§cArmaInterdiction§4] §cDésoler tu n'as pas le droit de changer le panneau");
                            p.closeInventory();
                        }
                    }
                }
            }
        }
    }
}
