package fr.newzaz.armacore.events;

import fr.newzaz.armacore.utils.Integer;
import org.bukkit.Bukkit;
import org.bukkit.Sound;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.configuration.file.YamlConfiguration;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.AsyncPlayerChatEvent;
import org.bukkit.scheduler.BukkitTask;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;

public class ChatEvent implements Listener, CommandExecutor {
    public static ArrayList<String> chatplayer = new ArrayList<>();
    File file1 = new File("plugins/ArmaCore","Chat.yml");
    YamlConfiguration yamlConfiguration1 = YamlConfiguration.loadConfiguration(file1);
    public HashMap<String,Long> cooldownchat = new HashMap<>();
    BukkitTask count;
    int t = 0;
    @EventHandler
    public void onMessage(AsyncPlayerChatEvent e){
        Player p = e.getPlayer();
        for(Player po : Bukkit.getOnlinePlayers()){
            if(e.getMessage().contains(po.getName())) {
                    if (chatplayer.contains(po.getName())) {
                        p.sendMessage("§6[§eArmaMessage§6] §e§l" + po.getName() + " a désactivé les mentions !");
                        p.playSound(p.getLocation(), Sound.BLOCK_ANVIL_PLACE,30,20);
                    } else {
                        e.setMessage(e.getMessage().replaceAll(po.getName(), "§a@" + po.getName() + "§r"));
                        po.sendMessage("§6[§eArmaMessage§6] §e§l" + p.getName() + " §eta mentionnée dans le chat !");
                        po.playSound(po.getLocation(), Sound.ENTITY_PLAYER_LEVELUP, 20, 20);
                }
            }
            if(e.getMessage().contains("fdp")){
                e.setMessage(e.getMessage().replaceAll("fdp", "§c***§r"));
                sendModération(p.getName(),"fdp");
            }
            if(e.getMessage().contains("pd")){
                e.setMessage(e.getMessage().replaceAll("pd", "§c**§r"));
                sendModération(p.getName(),"pd");
            }
            if(e.getMessage().contains("enculer")){
                e.setMessage(e.getMessage().replaceAll("enculer", "§c******§r"));
                sendModération(p.getName(),"enculer");
            }
            if(e.getMessage().contains("ntm")){
                e.setMessage(e.getMessage().replaceAll("ntm", "§c***§r"));
                sendModération(p.getName(),"ntm");
            }
        }
        if(e.getMessage().equalsIgnoreCase("ArmaCoreHelp")){
            e.setMessage("§4Bonjour, tu as trouvé un easter egg ! Ce plugin à été développé par NєωƵ_ΛƵ#7736");
        }
        if(e.getMessage().equalsIgnoreCase("chiencasse")){
            e.setMessage("§cMais tu me connais toi ? " + p.getName() + " ahahaha Chien de la casse !");
        }
                if (cooldownchat.containsKey(p.getName())) {
                            int seconds = yamlConfiguration1.getInt("cooldown");
                            long timeleft = ((cooldownchat.get(p.getName()) / 1000) + seconds)
                                    - (System.currentTimeMillis() / 1000);
                            if (timeleft > 0) {
                                p.sendMessage("§9[Arma§bChat] §9Oh att un peux !");
                                e.setCancelled(true);
                                return;
                        }
                }
        cooldownchat.put(p.getName(), System.currentTimeMillis());
    }

    private void sendModération(String p,String s) {
        for(Player po : Bukkit.getOnlinePlayers()){
            if(po.hasPermission("mod.receive")){
                po.sendMessage("§6[§eArmaMessage§6] §c§l" +p +" §cà envoyez §c§l"+ s);
            }
        }
    }


    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
        Player p = (Player)sender;
        if(p instanceof Player){
        if(cmd.getName().equalsIgnoreCase("armachat")) {
            if (args.length == 0) {
                p.sendMessage("§4[§cArmaCommand§4] §c/ArmaChat §aon§c/§4off");
            }
            if (args.length == 1) {
                if (args[0].equalsIgnoreCase("on")) {
                    if (chatplayer.contains(p.getName())){
                        p.sendMessage("§4[§cArmaCommand§4] §cTu as activé les mentions !");
                        chatplayer.remove(p.getName());
                    }else {
                        p.sendMessage("§4[§cArmaCommand§4] §cTu as déjà activé les mentions ! fait /armachat §4off §cpour les désactivées !");
                    }
                }
                if(args[0].equalsIgnoreCase("off")){
                    if (chatplayer.contains(p.getName())){
                        p.sendMessage("§4[§cArmaCommand§4] §cTu as déjà désactivé les mentions ! fait /armachat §aon §cpour les activées !");
                    }else {
                        p.sendMessage("§4[§cArmaCommand§4] §cTu as désactivé les mentions !");
                        chatplayer.add(p.getName());
                    }
                }
            }
            if(args.length > 1){
                p.sendMessage("§4[§cArmaCommand§4] §c/ArmaChat §aon§c/§4off");
            }
        }
        if(cmd.getName().equalsIgnoreCase("ConfigChat")){
            if(args.length == 0){
                p.sendMessage("§4[§cArmaCommand§4] §c/configchat cooldown <Nombre>");
            }
            if(args.length == 1) {
                if (args[0].equalsIgnoreCase("cooldown")) {
                    p.sendMessage("§4[§cArmaCommand§4] §cEcrit le nombre que seconde que tu veux");
                }
            }
            if(args.length == 2){
                if(args[0].equalsIgnoreCase("cooldown")){
                    if(Integer.isInteger(args[1])){
                        yamlConfiguration1.set("cooldown",args[1]);
                        try {
                            yamlConfiguration1.save(file1);
                        }catch (IOException e){
                            e.printStackTrace();
                        }
                        p.sendMessage("§4[§cArmaCommand§4] §cCooldown config set");
                    }
                }
            }
        }
        }
        return false;
    }
}
