package fr.newzaz.armacore.chat;

import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class AnnonceChat2 implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String msg, String[] args) {


        Player player = (Player) sender;

        if (cmd.getName().equalsIgnoreCase("annonce")) {
            if (player.hasPermission("annonce.use")) {
                if (args.length == 0) {
                    player.sendMessage("§4[§cArmaCommand§4] §cUsage : /annonce <message>");
                }

                if (args.length >= 1) {

                    StringBuilder bc = new StringBuilder();
                    for (String part : args) {
                        bc.append(part + " ");
                    }

                    Bukkit.broadcastMessage("§c§l[§4Annonce Civil§c§l] " + "§c" + bc.toString());
                }
            }
        }else {
            player.sendMessage("§4[§cArmaCommand§4] §cTu n'as pas la permission pour faire ceci !");
        }

        return true;

    }

}
