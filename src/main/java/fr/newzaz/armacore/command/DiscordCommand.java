package fr.newzaz.armacore.command;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class DiscordCommand implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String msg, String[] args) {

        if (sender instanceof Player) {
            Player player = (Player) sender;
            player.sendMessage("§4[§cArmaDiscord§4] §cVoici le discord du network: https://discord.gg/kDc5e9t et le discord du serveur : https://discord.gg/6KxDmJj");
        }


        return false;
    }

}
