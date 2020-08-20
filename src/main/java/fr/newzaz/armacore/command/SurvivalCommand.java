package fr.newzaz.armacore.command;

import org.bukkit.Bukkit;
import org.bukkit.GameMode;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class SurvivalCommand implements CommandExecutor {

    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {

        Player p = (Player) sender;

        if(p.hasPermission("essentials.gamemode")) {
            if (args.length >= 0) {
                p.setGameMode(GameMode.SURVIVAL);
                p.sendMessage("§2[§aArmaGamemode§2] §aTu est passé en Gamemode Survival");
            } else if (args.length >= 1) {


                String p2 = args[0];

                Player p3 = Bukkit.getPlayer(p2);
                p3.setGameMode(GameMode.SURVIVAL);
                p3.sendMessage("§2[§aArmaGamemode§2] §aTu as était passer en Gamemode Survival");
                p.sendMessage("§2[§aArmaGamemode§2] §aTu as passé " + p3.getName() + " en Gamemode Survival");
            }
        }else{
            p.sendMessage("§2[§aArmaGamemode§2] §cVous n'avez pas la permission de faire ceci !");
        }

        return true;
    }


}
