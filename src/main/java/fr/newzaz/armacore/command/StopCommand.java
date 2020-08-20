package fr.newzaz.armacore.command;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class StopCommand implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String msg, String[] args) {

        if (sender instanceof Player) {
            Player player = (Player) sender;
            if (cmd.getName().equalsIgnoreCase("bc") || cmd.getName().equalsIgnoreCase("Broadcast")) {
                player.sendMessage("§4[§cArmaCommand§4] §c/an <Message>");
            } else if (cmd.getName().equalsIgnoreCase("me")) {
                player.sendMessage("§4[§cArmaCommand§4] §c/action <Message>");
            }
        }

        return false;
    }

}

