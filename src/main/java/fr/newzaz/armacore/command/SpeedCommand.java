package fr.newzaz.armacore.command;

import fr.newzaz.armacore.utils.Integer;
import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class SpeedCommand implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
        Player p = (Player)sender;
        if(cmd.getName().equalsIgnoreCase("speed")){
            if(args.length == 0){
                p.sendMessage("§4[§cArmaCommand§4] §cArguments: /speed <Int> | /speed <Int> target");
            }
            if(args.length == 1) {
                if (p.hasPermission("armacore.speed")) {
                    if (Integer.isInteger(args[0])) {
                        java.lang.Integer code = java.lang.Integer.valueOf(args[0]);
                        if (code != 0 && code <= 10) {
                            if (p.isFlying()) {
                                p.setFlySpeed(0.1F * code +0.1F);
                                p.sendMessage("§4[§cArmaCommand§4] §cTon speed à été changer !");
                            } else {
                                p.setWalkSpeed(0.1F * code+0.1F);
                                p.sendMessage("§4[§cArmaCommand§4] §cTon speed à été changer !");
                            }
                        }
                    }
                }
            }
            if(args.length == 2) {
                if (p.hasPermission("armacore.speed.set")) {
                    if (Integer.isInteger(args[0])) {
                        java.lang.Integer code = java.lang.Integer.valueOf(args[0]);
                        Player target = Bukkit.getPlayer(args[1]);
                        if(code != 0 && code <=10 && target != null){
                            if (target.isFlying()) {
                                target.setFlySpeed(0.1F*code);
                                p.sendMessage("§4[§cArmaCommand§4] §cTon speed à été changer !");
                            } else {
                                target.setWalkSpeed(0.1F*code);
                                p.sendMessage("§4[§cArmaCommand§4] §cTon speed à été changer !");
                            }
                        }
                    }
                }
            }
        }
        return false;
    }
}
