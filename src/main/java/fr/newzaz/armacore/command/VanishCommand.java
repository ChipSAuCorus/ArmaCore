package fr.newzaz.armacore.command;

import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.player.PlayerJoinEvent;

import java.util.ArrayList;

public class VanishCommand implements CommandExecutor {
    public ArrayList<Player> vanished = new ArrayList<Player>();

    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {

        if (!(sender instanceof Player)) {
            sender.sendMessage("§cTu n'es pas un joueur !");
        }

        Player player = (Player) sender;


        if (cmd.getName().equalsIgnoreCase("vanish") || cmd.getName().equalsIgnoreCase("v")) {

            if (!vanished.contains(player)) {
                for (Player pl : Bukkit.getServer().getOnlinePlayers()) {
                    pl.hidePlayer(player);

                    vanished.add(player);
                }
                Bukkit.broadcast("§d[§5ArmaVanish§d] §5" + player.getName() + " §dest maintenant en §5Vanish §d!", "vanish.use");
                return true;

            } else {
                for (Player pl : Bukkit.getServer().getOnlinePlayers()) {
                    pl.showPlayer(player);
                    vanished.remove(player);
                }

                Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "god " + player.getName());

                Bukkit.broadcast("§d[§5ArmaVanish§d] §5" + player.getName() + " §dn'est plus en §5Vanish §d", "vanish.use");
                return true;


            }
        }


        return false;
    }

    @EventHandler
    public void onJoin(PlayerJoinEvent e) {
        Player player = e.getPlayer();
        for (Player players : Bukkit.getOnlinePlayers()) {
            if (!vanished.contains(players)) {
                player.hidePlayer(players);
            }

        }
    }


}
