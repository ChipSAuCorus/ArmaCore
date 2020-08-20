package fr.newzaz.armacore.events;

import fr.newzaz.armacore.Main;
import org.bukkit.Bukkit;
import org.bukkit.Effect;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockBreakEvent;
import org.bukkit.event.entity.EntityDamageEvent;
import org.bukkit.event.entity.EntityRegainHealthEvent;
import org.bukkit.event.entity.PlayerDeathEvent;
import org.bukkit.event.player.PlayerInteractEntityEvent;
import org.bukkit.event.player.PlayerMoveEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.plugin.Plugin;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;

import java.util.ArrayList;
import java.util.HashMap;

public class IncapEvents implements Listener, CommandExecutor {
    public ArrayList<String> incapacitated = new ArrayList<>();
    HashMap<String, ItemStack[]> inventory = (HashMap) new HashMap<>();
    private ArrayList<String> cooldown = new ArrayList<>();
    private Main plugin;
    private int repeatingId;
    private int count;
    private long coolDownTime = 0L;
    private int incap = 0;

    public IncapEvents(Main plugin) {
        this.plugin = plugin;
        this.coolDownTime = (long) (10 * 20.0D * 60.0D);
    }

    @EventHandler
    public void BlockBreakCancel(BlockBreakEvent event) {
        if (this.incapacitated.contains(event.getPlayer().getName()))
            event.setCancelled(true);
    }

    @EventHandler
    public void onDamage(EntityDamageEvent e) {
        if (e.getEntity() instanceof Player) {
            Player p = (Player) e.getEntity();
            if (e.getCause() == EntityDamageEvent.DamageCause.FALL) {
                if (this.incapacitated.contains(p)) {
                    e.setCancelled(true);
                }
            }
        }
    }

    @EventHandler
    public void onEntityDamage(EntityDamageEvent event) {
        if (event.getEntity() instanceof Player) {
            Player p = (Player) event.getEntity();
            if (!this.cooldown.contains(p.getName()))
                if (p.getHealth() - event.getDamage() <= 0.0D && !this.incapacitated.contains(p.getName())) {
                    event.setCancelled(true);
                    Incappacitate(p);
                }
        }
    }

    @EventHandler
    public void onRightClickEntity(PlayerInteractEntityEvent event) {
        if (event.getRightClicked() instanceof Player) {
            Player p = (Player) event.getRightClicked();
            Player ep = event.getPlayer();
            if (this.incapacitated.contains(p.getName()) && !this.incapacitated.contains(ep.getName())) {
                        p.setHealth(6);
                        ep.playEffect(ep.getLocation(), Effect.HEART, 15);
                        Bukkit.broadcastMessage("§1[§9ArmaIncapacited§1] §1" + p.getName() + " §9a été réanimer par §1" + ep.getName());
                        p.addPotionEffect(new PotionEffect(PotionEffectType.BLINDNESS, 100, 3));
                        ItemStack[] contents = inventory.get(p.getName());
                        p.getInventory().setContents(contents);
                        inventory.clear();
                        incapacitated.remove(p.getName());
            }
        }
    }

    @EventHandler
    public void onDeath(PlayerDeathEvent event) {
        Player p = event.getEntity();
        if (this.incapacitated.contains(p.getName())) {
            Bukkit.broadcastMessage("§7[§8ArmaIncapacited§7] §8N'a pas eu de réanimation " + p.getName());
            this.incapacitated.remove(p.getName());
            ItemStack[] contents = this.inventory.get(p.getName());
            this.inventory.remove(p.getName(), contents);
        }
        if (this.incapacitated.isEmpty())
            this.plugin.getServer().getScheduler().cancelTask(this.repeatingId);
    }

    @EventHandler
    public void stopHealing(EntityRegainHealthEvent event) {
        if (event.getEntity() instanceof Player) {
            Player p = (Player) event.getEntity();
            if (this.incapacitated.contains(p.getName()))
                event.setCancelled(true);
        }
    }

    @EventHandler
    public void stopMoving(PlayerMoveEvent event) {
        if (this.incapacitated.contains(event.getPlayer().getName())) {
            event.setCancelled(true);
        }
    }


    public void Incappacitate(final Player player) {
        this.incapacitated.add(player.getName());
        Bukkit.broadcastMessage("§4[§cArmaIncapacited§4] §c" + player.getName() + " a été incapacited en x: [" + player.getLocation().getBlockX() + "] y: [" + player.getLocation().getBlockY() + "] z: [" + player.getLocation().getBlockZ() + "] !");
        this.inventory.put(player.getName(), player.getInventory().getContents());
        player.getInventory().clear();
        player.setHealth(20);
        this.repeatingId = this.plugin.getServer().getScheduler().scheduleSyncRepeatingTask((Plugin) this.plugin, new Runnable() {
            public void run() {
                if (IncapEvents.this.incapacitated.contains(player.getName()))
                    player.damage(1.0D);
            }
        }, 1, 60L);
        this.cooldown.add(player.getName());
        this.plugin.getServer().getScheduler().scheduleSyncDelayedTask((Plugin) this.plugin, new Runnable() {
            public void run() {
                IncapEvents.this.cooldown.remove(player.getName());
            }
        }, this.coolDownTime);
    }

    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
        Player p = (Player)sender;
        if(cmd.getName().equalsIgnoreCase("incap")){
            if(args.length == 0){
                p.sendMessage("§4[§cArmaCommand§4] §cArguments: /incap <Player>");
            }
            if(args.length == 1){
                Player target = Bukkit.getPlayer(args[0]);
                if(args[0].equalsIgnoreCase(target.getName())){
                    if(target != null) {
                        if (incapacitated.contains(target.getName())) {
                            ItemStack[] contents = inventory.get(target.getName());
                            target.getInventory().setContents(contents);
                            inventory.clear();
                            incapacitated.remove(target.getName());
                        }else {
                            p.sendMessage("§4[§cArmaCommand§4] §cIl n'est pas incapacited !");
                        }
                    }
                }
            }
        }
        return false;
    }
}
