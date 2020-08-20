package fr.newzaz.armacore.command;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.configuration.file.YamlConfiguration;
import org.bukkit.entity.Player;

import java.io.File;
import java.io.IOException;

public class PnjCommand implements CommandExecutor {
    File file = new File("plugins/ArmaCore","pnj.yml");
    YamlConfiguration yamlConfiguration = YamlConfiguration.loadConfiguration(file);
    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
        Player p = (Player)sender;
        if(cmd.getName().equalsIgnoreCase("armacore.pnjset")) {
            if (p.hasPermission("pnj.set")) {
                if (args.length == 0) {
                    p.sendMessage("§4[§cArmaCommand§4] §c/pnj set Militaire/Taliban/FS/UET");
                }
                if (args.length == 1) {
                    if (args[0].equalsIgnoreCase("set")) {
                        p.sendMessage("§4[§cArmaCommand§4] §c/pnj set Militaire/Taliban/FS/UET");
                    }
                }
                if (args.length == 2) {
                    if (args[0].equalsIgnoreCase("set")) {
                        if (args[1].equalsIgnoreCase("militaire")) {
                            int x = p.getLocation().getBlockX();
                            int y = p.getLocation().getBlockY();
                            int z = p.getLocation().getBlockZ();
                            yamlConfiguration.set("Militaire" + ".x", x);
                            yamlConfiguration.set("Militaire" + ".y", y);
                            yamlConfiguration.set("Militaire" + ".z", z);
                            try {
                                yamlConfiguration.save(file);
                            } catch (IOException e) {
                                e.printStackTrace();
                            }
                            p.sendMessage("§4[§cArmaCommand§4] §cPnj Militaire définis");
                        }
                        if (args[1].equalsIgnoreCase("taliban")) {
                            int x = p.getLocation().getBlockX();
                            int y = p.getLocation().getBlockY();
                            int z = p.getLocation().getBlockZ();
                            yamlConfiguration.set("Taliban" + ".x", x);
                            yamlConfiguration.set("Taliban" + ".y", y);
                            yamlConfiguration.set("Taliban" + ".z", z);
                            try {
                                yamlConfiguration.save(file);
                            } catch (IOException e) {
                                e.printStackTrace();
                            }
                            p.sendMessage("§4[§cArmaCommand§4] §cPnj Taliban définis");
                        }
                        if (args[1].equalsIgnoreCase("FS")) {
                            int x = p.getLocation().getBlockX();
                            int y = p.getLocation().getBlockY();
                            int z = p.getLocation().getBlockZ();
                            yamlConfiguration.set("FS" + ".x", x);
                            yamlConfiguration.set("FS" + ".y", y);
                            yamlConfiguration.set("FS" + ".z", z);
                            try {
                                yamlConfiguration.save(file);
                            } catch (IOException e) {
                                e.printStackTrace();
                            }
                            p.sendMessage("§4[§cArmaCommand§4] §cPnj FS définis");
                        }
                        if (args[1].equalsIgnoreCase("UET")) {
                            int x = p.getLocation().getBlockX();
                            int y = p.getLocation().getBlockY();
                            int z = p.getLocation().getBlockZ();
                            yamlConfiguration.set("UET" + ".x", x);
                            yamlConfiguration.set("UET" + ".y", y);
                            yamlConfiguration.set("UET" + ".z", z);
                            try {
                                yamlConfiguration.save(file);
                            } catch (IOException e) {
                                e.printStackTrace();
                            }
                            p.sendMessage("§4[§cArmaCommand§4] §cPnj UET définis");
                        }
                    }
                }
            }
        }
        return false;
    }
}
