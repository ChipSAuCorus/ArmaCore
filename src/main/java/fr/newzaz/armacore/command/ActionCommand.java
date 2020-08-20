package fr.newzaz.armacore.command;

import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class ActionCommand implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
        if (sender instanceof Player) {
            Player player = (Player) sender;

            if (cmd.getName().equalsIgnoreCase("action")) {

                if (args.length == 0) {
                    player.sendMessage("§4[§cArmaCommand§4] §cUsage : /action <message>");
                }

                if (args.length >= 1) {

                    StringBuilder bc = new StringBuilder();
                    for (String part : args) {
                        bc.append(part + " ");
                    }
                    Bukkit.broadcastMessage("§e[§6Action§e] §6" + player.getName() +" §e: §6" + bc.toString());
                }
            }
        }
        return false;
    }
}
