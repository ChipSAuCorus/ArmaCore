package fr.newzaz.armacore.command;

import org.bukkit.Location;
import org.bukkit.Sound;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class SpawnCommand implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
        Player p = (Player)sender;
        if(sender instanceof Player) {
            if (cmd.getName().equalsIgnoreCase("spawn")) {
                if (p.hasPermission("armacore.spawn")) {
                    Location spawn = new Location(p.getWorld(), 307, 63, 306, 89, -1);
                    p.teleport(spawn);
                    p.playSound(p.getLocation(), Sound.ENTITY_ENDERMEN_TELEPORT, 50, 20);
                }
            }
        }
        return true;
    }
}
