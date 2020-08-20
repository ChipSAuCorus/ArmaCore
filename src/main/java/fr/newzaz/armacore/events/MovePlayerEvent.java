package fr.newzaz.armacore.events;

import fr.newzaz.armacore.utils.Cuboid;
import org.bukkit.Location;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerMoveEvent;

import java.util.ArrayList;

public class MovePlayerEvent implements Listener {
    public static ArrayList<Player> vm = new ArrayList<>();
    public ArrayList<Player> vt = new ArrayList<>();
    public ArrayList<Player> bt = new ArrayList<>();
    public ArrayList<Player> bm = new ArrayList<>();
    public static ArrayList<Player> capitale = new ArrayList<>();
    @EventHandler
    public void onMove(PlayerMoveEvent e){
        Player p = e.getPlayer();
        Location vm1 = new Location(p.getWorld(),147,0,394);
        Location vm2 = new Location(p.getWorld(),345,255,230);
        Cuboid cuboidvm = new Cuboid(vm1,vm2);
        
        Location vt1 = new Location(p.getWorld(),88,0,491);
        Location vt2 = new Location(p.getWorld(),-58,255,368);
        Cuboid cuboidvt = new Cuboid(vt1,vt2);

        Location bt1 = new Location(p.getWorld(),304,48,729);
        Location bt2 = new Location(p.getWorld(),284,35,711);
        Cuboid cuboidbt = new Cuboid(bt1,bt2);

        Location bm1 = new Location(p.getWorld(),529,0,450);
        Location bm2 = new Location(p.getWorld(),694,255,219);
        Cuboid cuboidbm = new Cuboid(bm1,bm2);

        Location capitale1 = new Location(p.getWorld(),-22,0,-67);
        Location capitale2 = new Location(p.getWorld(),-313,255,211);
        Cuboid cuboidcapitale = new Cuboid(capitale1,capitale2);




        if(cuboidvm.contains(p.getLocation())){
            if(!vm.contains(p)) {
                    p.sendMessage("§a[§2ArmaRegion§a] Tu es rentré(e) dans la Ville Moderne !");
                    vm.add(p);
            }
        }else {
            if(vm.contains(p)) {
                    vm.remove(p);
                    p.sendMessage("§a[§2ArmaRegion§a] §cTu es sortie de la Ville Moderne !");


            }
        }
        if(cuboidvt.contains(p.getLocation())){
            if(!vt.contains(p)) {
                p.sendMessage("§a[§2ArmaRegion§a] Tu es rentré(e) dans la Ville Talibane !");
                vt.add(p);
            }
        }else {
            if(vt.contains(p)) {
                vt.remove(p);
                p.sendMessage("§a[§2ArmaRegion§a] §cTu es sortie de la Ville Talibane !");
            }
        }
        if(cuboidbt.contains(p.getLocation())){
            if(!bt.contains(p)) {
                p.sendMessage("§a[§2ArmaRegion§a] Tu es rentré(e) dans la Base Talibane ! §c§lAttention zone à danger !");
                bt.add(p);
            }
        }else {
            if(bt.contains(p)) {
                bt.remove(p);
                p.sendMessage("§a[§2ArmaRegion§a] §cTu es sortie de la Base Talibane !");
            }
        }
        if(cuboidbm.contains(p.getLocation())){
            if(!bm.contains(p)) {
                p.sendMessage("§a[§2ArmaRegion§a] Tu es rentré(e) dans la Base Militaire !");
                bm.add(p);
            }
        }else {
            if(bm.contains(p)) {
                bm.remove(p);
                p.sendMessage("§a[§2ArmaRegion§a] §cTu es sortie de la Base Militaire !");
            }
        }
        if(cuboidcapitale.contains(p.getLocation())){
            if(!capitale.contains(p)) {
                p.sendMessage("§a[§2ArmaRegion§a] Tu es rentré(e) dans la Capitale !");
                capitale.add(p);
            }
        }else {
            if(capitale.contains(p)) {
                capitale.remove(p);
                p.sendMessage("§a[§2ArmaRegion§a] §cTu es sortie de la Capitale !");
            }
        }
        }

}
