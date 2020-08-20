package fr.newzaz.armacore.chat;

import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class TaliChat implements CommandExecutor {

    public boolean onCommand(CommandSender sender, Command cmd, String msg, String[] args) {

        if (sender instanceof Player) {
            Player player = (Player) sender;
            if (player.hasPermission("taliban.taliban")) {
                if (!(args.length >= 1)) {
                    player.sendMessage("§4[§cArmaCommand§4] §cUsage: /taliban <message>");
                    return false;
                }

                StringBuilder mili = new StringBuilder();
                for (String part : args) {
                    mili.append(part + " ");
                }

                for (Player players : Bukkit.getOnlinePlayers()) {
                    if (players.hasPermission("taliban.taliban")) {
                        players.sendMessage("§6§l[Radio Talibane] §6§l§ §6" + player.getName() + " §e: §e" + mili.toString());
                    }
                }

            } else player.sendMessage("§cVous n'avez pas accés à cette commande");
        }

        return true;
    }

}