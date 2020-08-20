package fr.newzaz.armacore.command;

import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.Sound;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.configuration.file.YamlConfiguration;
import org.bukkit.entity.Player;

import java.io.File;
import java.io.IOException;

public class WarpCommand implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
        Player p = (Player) sender;
        File file = new File("plugins/ArmaCore","warps.yml");
        YamlConfiguration yamlConfiguration = YamlConfiguration.loadConfiguration(file);
        if (cmd.getName().equalsIgnoreCase("delwarp")) {
            if (p.hasPermission("armacore.warp.delwarp")) {
                if (args.length == 1) {

                    if (yamlConfiguration.getString(args[0]) != null) {
                        yamlConfiguration.set(args[0], null);
                        p.sendMessage("§e[§6ArmaWarp§e] §eTu as supprimé le warp : " + args[0]);
                        try {
                            yamlConfiguration.save(file);
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                    } else {
                        p.sendMessage("§4[§cArmaCommand§4] §cLe warp que tu as définis n'est pas valide !");
                    }
                } else {
                    p.sendMessage("§4[§cArmaCommand§4] §c/delwarp <Warp>");
                }
            } else {
                p.sendMessage("§4[§cArmaCommand§4] §cTu n'as pas la permission pour faire ceci");
            }
        }
        if(cmd.getName().equalsIgnoreCase("setwarp")){
            if (p.hasPermission("armacore.warp.setwarp")) {
                if (args.length == 1) {
                    String world = p.getWorld().getName();
                    double x = p.getLocation().getX();
                    double y = p.getLocation().getY();
                    double z = p.getLocation().getZ();
                    double yaw = p.getLocation().getYaw();
                    double pitch = p.getLocation().getPitch();
                    yamlConfiguration.set(String.valueOf(args[0]) + ".world", world);
                    yamlConfiguration.set(String.valueOf(args[0]) + ".x", Double.valueOf(x));
                    yamlConfiguration.set(String.valueOf(args[0]) + ".y", Double.valueOf(y));
                    yamlConfiguration.set(String.valueOf(args[0]) + ".z", Double.valueOf(z));
                    yamlConfiguration.set(String.valueOf(args[0]) + ".yaw", Double.valueOf(yaw));
                    yamlConfiguration.set(String.valueOf(args[0]) + ".pitch", Double.valueOf(pitch));
                    try {
                        yamlConfiguration.save(file);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                    p.sendMessage("§4[§cArmaCommand§4] §cTu as bien crée le warp §4" + args[0]+ " §c!");
                } else {
                    p.sendMessage("§4[§cArmaCommand§4] §c/setwarp <Warp>");
                }
            } else {
                p.sendMessage("§4[§cArmaCommand§4] §cTu n'as pas la permission pour faire ceci");
            }
        }
        if(cmd.getName().equalsIgnoreCase("warp")){
            if (p.hasPermission("armacore.warp.warp")) {
                if(args.length == 0){
                    int i = 0;
                    p.sendMessage("§cList des warps :");
                    for (String key : yamlConfiguration.getKeys(true)) {
                        if (!key.contains(".")) {
                            i++;
                            p.sendMessage( "§c" + i + ". §6'" + key + "'");
                        }
                    }
                    i = 0;
                }
                if (args.length == 1) {
                    if (yamlConfiguration.getString(args[0]) != null) {
                        String world = yamlConfiguration.getString(String.valueOf(args[0]) + ".world");
                        double x = yamlConfiguration.getDouble(String.valueOf(args[0]) + ".x");
                        double y = yamlConfiguration.getDouble(String.valueOf(args[0]) + ".y");
                        double z = yamlConfiguration.getDouble(String.valueOf(args[0]) + ".z");
                        double yaw = yamlConfiguration.getDouble(String.valueOf(args[0]) + ".yaw");
                        double pitch = yamlConfiguration.getDouble(String.valueOf(args[0]) + ".pitch");
                        Location loc = new Location(Bukkit.getWorld(world), x, y, z);
                        loc.setPitch((float)pitch);
                        loc.setYaw((float)yaw);
                        p.teleport(loc);
                        p.sendMessage( "§4[§cArmaCommand§4] §cTu as été téléporter sur le warp " + args[0]);
                        p.playSound(p.getLocation(), Sound.ENTITY_ENDERMEN_TELEPORT,80,20);
                    } else {
                        p.sendMessage("§4[§cArmaCommand§4] §cLe warp que tu as choisis n'existe pas !");
                    }
                } else {
                    p.sendMessage("§4[§cArmaCommand§4] §c/warp <Warp>");
                }
            } else {
                p.sendMessage("§4[§cArmaCommand§4] §cTu n'as pas la permission pour faire ceci");
            }
        }
            return false;

    }
}
