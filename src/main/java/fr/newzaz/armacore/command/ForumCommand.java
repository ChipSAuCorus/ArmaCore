package fr.newzaz.armacore.command;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class ForumCommand implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String msg, String[] args) {

        if (sender instanceof Player) {
            Player player = (Player) sender;
            player.sendMessage("§4[§cArmaForum§4] §cVoici notre forum: https://heavennetwork.net/forum");
        }


        return false;
    }

}

