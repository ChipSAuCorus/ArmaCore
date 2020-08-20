package fr.newzaz.armacore.command;

import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.Sound;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class TeleportCommand implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
        Player p = (Player)sender;
        if(p instanceof Player){
            if(cmd.getName().equals("tp")) {
                if (p.hasPermission("armacore.tp")) {
                    if (args.length == 0) {
                        p.sendMessage("§1[ArmaCommand] §9Arguments: /tp <Player> ");
                    }
                    if (args.length == 1) {
                        Player target = Bukkit.getPlayer(args[0]);
                        if (target == null) {
                            p.sendMessage("§1[ArmaCommand] §9Arguments: /tp <Player>");
                        } else {
                            if (target == p) {
                                p.sendMessage("§1[ArmaCommand] §9Arguments: /tp <Player>");
                            } else {
                                Location tlocation = new Location(target.getWorld(), target.getLocation().getX(), target.getLocation().getY(), target.getLocation().getZ());
                                p.teleport(tlocation);
                                p.sendMessage("§1[ArmaCommand] §9Tu as été téléporté(e) sur §9§l" + target.getName());
                                p.playSound(p.getLocation(), Sound.ENTITY_ENDERMEN_TELEPORT, 50, 20);
                            }
                        }
                    }
                }
            }
            if(cmd.getName().equals("tphere")){
                if(p.hasPermission("armacore.tphere")) {
                    if (args.length == 0) {
                        p.sendMessage("§1[ArmaCommand] §9Arguments: /tphere <Player> ");
                    }
                    if (args.length == 1) {

                        Player target = Bukkit.getPlayer(args[0]);
                        if (target == null) {
                            p.sendMessage("§1[ArmaCommand] §9Arguments: /tphere <Player>");
                        } else {
                            if (target == p) {
                                p.sendMessage("§1[ArmaCommand] §9Arguments: /tphere <Player>");
                            } else {
                                Location plocation = new Location(p.getWorld(), p.getLocation().getX(), p.getLocation().getY(), p.getLocation().getZ());
                                target.teleport(plocation);
                                p.sendMessage("§1[ArmaCommand] §9Bravo tu as téléporté(e) §9§l" + target.getName() + " §9sur toi");
                                target.playSound(p.getLocation(), Sound.ENTITY_ENDERMEN_TELEPORT, 50, 20);
                                target.sendMessage("§1[ArmaCommand] §9tu as été téléporté(e) par §9§l" + target.getName());
                            }
                        }
                    }
                }
            }
        }
        return false;
    }
}
