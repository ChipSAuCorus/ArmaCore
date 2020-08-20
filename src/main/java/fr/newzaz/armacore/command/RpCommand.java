package fr.newzaz.armacore.command;

import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class RpCommand implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String msg, String[] args) {
        if (sender instanceof Player) {
            Player player = (Player) sender;

            if (cmd.getName().equalsIgnoreCase("rp")) {

                if (args.length == 0) {
                    player.sendMessage("§4[§cArmaCommand§4] §cUsage : /rp <message>");
                }

                if (args.length >= 1) {

                    StringBuilder bc = new StringBuilder();
                    for (String part : args) {
                        bc.append(part + " ");
                    }

                    Bukkit.broadcastMessage("§2§l[§aRP§2§l]" + "§a " + player.getName() + " " + bc.toString());
                }
            }
        }
        return true;

    }
}