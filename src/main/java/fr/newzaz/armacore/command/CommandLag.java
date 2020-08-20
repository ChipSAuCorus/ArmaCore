package fr.newzaz.armacore.command;

import fr.newzaz.armacore.Main;
import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Entity;
import org.bukkit.entity.Item;
import org.bukkit.entity.Player;

import java.util.List;

public class CommandLag implements CommandExecutor {
    public static int AutoRemove = 60 * 30;

    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String msg, String[] args) {
        if (sender instanceof Player) {
            Player p = (Player) sender;
            if (p.hasPermission("Clearlag.use")) {
                if (args.length == 0) {
                    p.sendMessage("§7§m<-------------------->§6 ClearLag §7§m<-------------------->");
                    p.sendMessage("");
                    p.sendMessage("§6/clearlag info §7- Informations sur la ram du serveur");
                    p.sendMessage("§6/clearlag clear §7- Supprimer les items au sol");
                    p.sendMessage("");
                    p.sendMessage("§7§m<-------------------->§6 ClearLag §7§m<-------------------->");

                }

                if (args.length == 1) {
                    if (args[0].equalsIgnoreCase("info")) {
                        Runtime ram = Runtime.getRuntime();
                        p.sendMessage("§7§m<-------------------->§6 ClearLag §7§m<-------------------->");
                        p.sendMessage("");
                        p.sendMessage("§6Ram utilisé: §7" + (ram.totalMemory() - ram.freeMemory()) / 1048576L + "MB");
                        p.sendMessage("§6Ram Disponible: §7" + (ram.maxMemory() / 1048576L - (ram.totalMemory() - ram.freeMemory()) / 1048576) + "MB");
                        p.sendMessage("§6Ram Max: §7" + ram.maxMemory() / 1048576L + "MB");
                        p.sendMessage("§6ClearLag dans: §7" + AutoRemove + " §6Secondes");
                        p.sendMessage("");
                        p.sendMessage("§7§m<-------------------->§6 ClearLag §7§m<-------------------->");

                    }
                    if (args[0].equalsIgnoreCase("clear")) {
                        List<Entity> entity = p.getWorld().getEntities();

                        int count = 0;
                        for (Entity current : entity) {
                            if (current instanceof Item) {
                                count++;
                                current.remove();
                            }
                        }
                        Bukkit.broadcastMessage("§7[§6ArmaLag§7] §6" + count + " §7Items ont été retirer");
                    }
                }

            } else {
                p.sendMessage("§7[§6ArmaLag§7] Désoler, Vous n'avez pas cette permission.");
            }
        }
        return true;
    }

    public static void AutoClear() {

        Bukkit.getScheduler().scheduleAsyncRepeatingTask(Main.getInstance(), new Runnable() {

            @Override
            public void run() {
                if (AutoRemove > 0) {

                    if (AutoRemove == 60 * 30) {
                        Bukkit.broadcastMessage("§7[§6ArmaLag§7] Suppression des Items au sol dans §6" + AutoRemove / 60
                                + " §7Minutes");
                    }
                    if (AutoRemove == 60 * 15) {
                        Bukkit.broadcastMessage("§7[§6ArmaLag§7] Suppression des Items au sol dans §6" + AutoRemove / 60
                                + " §7Minutes");
                    }
                    if (AutoRemove == 60 * 5) {
                        Bukkit.broadcastMessage("§7[§6ArmaLag§7] Suppression des Items au sol dans §6" + AutoRemove / 60
                                + " §7Minutes");
                    }
                    if (AutoRemove == 30) {
                        Bukkit.broadcastMessage(
                                "§7[§6ArmaLag§7] Suppression des Items au sol dans §6" + AutoRemove + " §7Secondes");
                    }
                    if (AutoRemove == 5) {
                        Bukkit.broadcastMessage(
                                "§7[§6ArmaLag§7] Suppression des Items au sol dans §6" + AutoRemove + " §7Secondes");
                    }
                    if (AutoRemove == 4) {
                        Bukkit.broadcastMessage(
                                "§7[§6ArmaLag§7] Suppression des Items au sol dans §6" + AutoRemove + " §7Secondes");
                    }
                    if (AutoRemove == 3) {
                        Bukkit.broadcastMessage(
                                "§7[§6ArmaLag§7] Suppression des Items au sol dans §6" + AutoRemove + " §7Secondes");
                    }
                    if (AutoRemove == 2) {
                        Bukkit.broadcastMessage(
                                "§7[§6ArmaLag§7] Suppression des Items au sol dans §6" + AutoRemove + " §7Secondes");
                    }
                    if (AutoRemove == 1) {
                        Bukkit.broadcastMessage(
                                "§7[§6ArmaLag§7] Suppression des Items au sol dans §6" + AutoRemove + " §7Secondes");
                    }
                    if (AutoRemove <= 0) {
                        List<Entity> entity = Bukkit.getWorld("world").getEntities();

                        int count = 0;
                        for (Entity current : entity) {
                            if (current instanceof Item) {
                                count++;
                                current.remove();
                            }
                        }
                        Bukkit.broadcastMessage("§7[§6ArmaLag§7] §6" + count + " §7Items ont été retirer");
                        AutoRemove = 60 * 30;
                    }
                    AutoRemove--;
                }

            }

        }, 20, 20);

    }

}
