package fr.newzaz.armacore.chat;

import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class StaffChat implements CommandExecutor {

    public boolean onCommand(CommandSender sender, Command cmd, String msg, String[] args) {

        if (sender instanceof Player) {
            Player player = (Player) sender;
            if (player.hasPermission("StaffChat")) {
                if (!(args.length >= 1)) {
                    player.sendMessage("§4[§cArmaCommand§4] §cUsage: /sc <message>");
                    return false;
                }

                StringBuilder chat = new StringBuilder();
                for (String part : args) {
                    chat.append(part + " ");
                }

                for (Player players : Bukkit.getOnlinePlayers()) {
                    if (players.hasPermission("StaffChat")) {
                        players.sendMessage("§6§l[Staff§e§lChat] §8§l: §6§l" + player.getName() + " §8§ §e" + chat.toString());
                    }
                }

            } else player.sendMessage("§cVous n'avez pas accés à cette commande");

        }
        return true;
    }
}


