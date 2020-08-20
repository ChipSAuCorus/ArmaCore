package fr.newzaz.armacore.command;

import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class AideCommand implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
        Player p = (Player)sender;
        if(args.length == 0){
            p.sendMessage("§e[§6ArmaHelp§e] §6/aide <§6§lMessage§6> !");
        }
        if(args.length >= 1){
            StringBuilder aide = new StringBuilder();
            for (String part : args) {
                aide.append(part + " ");
            }

            for (Player players : Bukkit.getOnlinePlayers()) {
                if (players.hasPermission("aide.receive")) {
                    players.sendMessage("§e[§6ArmaAide§e] §6" + p.getName() + " §e: §6" + aide.toString());
                }
            }
        }
        return false;
    }
}
