package fr.newzaz.armacore.events;

import org.bukkit.Material;
import org.bukkit.block.Block;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.block.BlockBreakEvent;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.inventory.ItemStack;

public class FarmEvent implements Listener {
    @EventHandler
    public void onFarm2(PlayerInteractEvent e) {
        Player p = e.getPlayer();
        Block b = e.getClickedBlock();
        Action a = e.getAction();
        ItemStack item = p.getInventory().getItemInMainHand();
        if (b.getTypeId() == 5894) {
            p.getInventory().addItem(new ItemStack(Material.getMaterial(1)));
            e.setCancelled(true);
        }
    }


    @EventHandler
    public void onBreak(BlockBreakEvent event) {
        Player p = event.getPlayer();
        Block b = event.getBlock();
        if (b.getTypeId() == 4166) {
            p.getInventory().addItem(new ItemStack(Material.getMaterial(5007)));
            event.setCancelled(true);
        }
    }

    @EventHandler
    public void onBreak1(BlockBreakEvent event) {
        Player player = event.getPlayer();
        Block block = event.getBlock();
        if (block.getType().equals(Material.IRON_ORE)) {
            player.getInventory().addItem(new ItemStack(Material.IRON_ORE));
            event.setCancelled(true);
        }
    }

}
