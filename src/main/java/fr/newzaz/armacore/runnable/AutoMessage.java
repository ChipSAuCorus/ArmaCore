package fr.newzaz.armacore.runnable;

import fr.newzaz.armacore.Main;
import org.bukkit.Bukkit;
import org.bukkit.scheduler.BukkitRunnable;

import java.util.List;


public class AutoMessage extends BukkitRunnable {

    private int i = 0;

    private List<String> message =  Main.getInstance().getConfig("message").getStringList("messages");

    @Override
    public void run() {
        if (!message.isEmpty()) {
            if(message.size() < i) {
                Bukkit.broadcastMessage("§9[§bArmaAutoMessage§9]§b " + message.get(i));
                i++;
            }
        }
    }
}
