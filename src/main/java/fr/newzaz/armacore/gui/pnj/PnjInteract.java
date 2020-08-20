package fr.newzaz.armacore.gui.pnj;

import org.bukkit.configuration.file.YamlConfiguration;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerInteractEntityEvent;

import java.io.File;

public class PnjInteract implements Listener {
    File file = new File("plugins/ArmaCore","pnj.yml");
    YamlConfiguration yamlConfiguration = YamlConfiguration.loadConfiguration(file);



    @EventHandler
    public void onInteract(PlayerInteractEntityEvent e) {
        Player p = e.getPlayer();
        if (e.getRightClicked().getLocation().getBlockX() == yamlConfiguration.getInt("Militaire.x") && e.getRightClicked().getLocation().getBlockY() == yamlConfiguration.getInt("Militaire.y")|| e.getRightClicked().getLocation().getBlockY() == yamlConfiguration.getInt("Militaire.y")+1 && e.getRightClicked().getLocation().getBlockZ() == yamlConfiguration.getInt("Militaire.z")) {
            if(p.hasPermission("mili.militaire")){
                PnjMilitaire.openGUI(p);
            }
        }
        p.sendMessage("t1: "+ e.getRightClicked());
        p.sendMessage("t2: "+ e.getRightClicked().getLocation());
        p.sendMessage("t3: "+ e.getRightClicked().getEntityId());
        p.sendMessage("t4: "+ e.getRightClicked().getType());


    }
}
