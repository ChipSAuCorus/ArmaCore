package fr.newzaz.armacore.command;

import fr.newzaz.armacore.api.ItemBuilder;
import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;

public class ReportsCommand implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {


        if (!(sender instanceof Player)) {
            sender.sendMessage("Seul un joueur peut executer cette commande");
            return false;
        }

        Player player = (Player) sender;

        if (label.equalsIgnoreCase("report")) {
            if (args.length != 1) {
                player.sendMessage("§cVeuillez saisir le pseudo d'un joueur");
                return false;
            }

            String targetName = args[0];

            if (Bukkit.getPlayer(targetName) == null) {
                player.sendMessage("§cCe joueur n'est pas connecter");
            }
            Player target = Bukkit.getPlayer(targetName);

            Inventory inv = Bukkit.createInventory(null, 18, "§bReport: §c" + target.getName());

            ItemBuilder item = new ItemBuilder(Material.IRON_SWORD).setDisplayName("§cNo RP");
            ItemBuilder item1 = new ItemBuilder(Material.DIAMOND_SWORD).setDisplayName("§cFreekill");
            ItemBuilder item2 = new ItemBuilder(Material.IRON_HOE).setDisplayName("§cInsulte");
            ItemBuilder item3 = new ItemBuilder(Material.DIAMOND_HOE).setDisplayName("§cInsulte Raciste");
            ItemBuilder item4 = new ItemBuilder(Material.ANVIL).setDisplayName("§cMéta Gaming");
            ItemBuilder item5 = new ItemBuilder(Material.GOLD_SWORD).setDisplayName("§cCheat");
            ItemBuilder item6 = new ItemBuilder(Material.PAPER).setDisplayName("§cAutres");
            inv.setItem(0, item.build());
            inv.setItem(1, item1.build());
            inv.setItem(2, item2.build());
            inv.setItem(3, item3.build());
            inv.setItem(4, item4.build());
            inv.setItem(5, item5.build());
            inv.setItem(6, item6.build());
            player.openInventory(inv);
        }
        return false;
    }

}
