package fr.newzaz.armacore.command;

import fr.newzaz.armacore.Main;
import fr.newzaz.armacore.scoreboard.ScoreboardManager;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class ScoreboardCommand implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
        Player p = (Player)sender;
        if(cmd.getName().equalsIgnoreCase("scoreboard") || cmd.getName().equalsIgnoreCase("sb")){
        if(args.length == 0){
            p.sendMessage("§4[§cArmaCommand§4] §cArguments: /scoreboard §aon§c/§4off §c| /sb §aon§c/§4off");
        }
        if(args.length == 1){
            if(args[0].equalsIgnoreCase("on")){
                if(ScoreboardManager.scoreboards.containsKey(p.getUniqueId())) {
                    p.sendMessage("§4[§cArmaCommand§4] §cTon scoreboard est déjà actif !");
                }else {
                    Main.getInstance().getScoreboardManager().onLogin(p);
                    p.sendMessage("§4[§cArmaCommand§4] §cTon scoreboard est maintenant actif !");
                }
            }
            if(args[0].equalsIgnoreCase("off")){
                if(ScoreboardManager.scoreboards.containsKey(p.getUniqueId())){
                    Main.getInstance().getScoreboardManager().onLogout(p);
                    p.sendMessage("§4[§cArmaCommand§4] §cTon scoreboard est maintenant inactif !");
                }else {
                    p.sendMessage("§4[§cArmaCommand§4] §cTon scoreboard est déjà désactivé !");
                }
            }
        }

        }
        return false;
    }
}
