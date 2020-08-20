package fr.newzaz.armacore.command;

import org.bukkit.Bukkit;
import org.bukkit.GameMode;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class CreativeCommand implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
        Player p = (Player) sender;

        if(p.hasPermission("essentials.gamemode")) {
            if (args.length >= 1) {
                Player p3 = Bukkit.getPlayer(args[0]);
                p3.setGameMode(GameMode.CREATIVE);
                p3.sendMessage("§2[§aArmaGamemode§2] §aTu est passé en Gamemode Créative");
                p.sendMessage("§2[§aArmaGamemode§2] §aTu as passé " + p3.getName() + " en Gamemode Créative");
            }

            if (args.length == 0) {
                p.setGameMode(GameMode.CREATIVE);
                p.sendMessage("§2[§aArmaGamemode§2] §aTu est passé en Gamemode Créative");
            }
        }else{
            p.sendMessage("§2[§aArmaGamemode§2] §cVous n'avez pas la permission de faire ceci !");
        }

        return true;

    }

}
