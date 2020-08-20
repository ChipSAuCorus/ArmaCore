package fr.newzaz.armacore.command;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class ArmaCoreCommand implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
        Player p = (Player)sender;
        if(cmd.getName().equalsIgnoreCase("armacore")){
            if(args.length == 0){
                p.sendMessage("§4§m§l--------------§4§l[ArmaCore §c§lPlugin]§c§m§l--------------");
                p.sendMessage("§1");
                p.sendMessage("§bBonjour " +p.getName() + " je m'appelle NewZ_AZ et je suis le développeur de ce plugin cette commande te list tout le contenue de mon plugin !");
                p.sendMessage("§bPour voir toutes les commandes présente sur le serveur fait /armacore listcmds");
                p.sendMessage("§bPour voir tous les events présent sur le serveur fait /armacore listevents");
                p.sendMessage("§bPour voir toutes les infos sur mon plugin fait /armacore info");
                p.sendMessage("§bPour changer la config de certaine chose fait /armacore config");
                p.sendMessage("§bPour voir le patch-notes fait /armacore patchnotes");
                p.sendMessage("§2");
                p.sendMessage("§4§m§l--------------§4§l[ArmaCore §c§lPlugin]§c§m§l--------------");
            }
            if(args.length == 1){
                if(args[0].equalsIgnoreCase("listcmds")){
                    p.sendMessage("§4§m§l--------------§4§l[ArmaCore §c§lPlugin]§c§m§l--------------");
                    p.sendMessage("§1");
                    p.sendMessage("§b/armacore commande qui list tout le contenue du plugin !");
                    p.sendMessage("§b/help commande qui permet d'aider les joueurs");
                    p.sendMessage("§b/clearlag commande qui permet de faire un clearlag des items");
                    p.sendMessage("§b/militaire commande qui permet de discuter entre militaire");
                    p.sendMessage("§b/taliban commande qui permet de discuter entre taliban");
                    p.sendMessage("§b/sc commande qui permet de parler entre staff");
                    p.sendMessage("§b/an /annonce commandes qui permet de faire une annonce all/civil");
                    p.sendMessage("§b/bc /broadcast commandes bloquée");
                    p.sendMessage("§b/rp commande qui permet de parler de chose rp");
                    p.sendMessage("§b/discord /forum /site commandes qui donne le lien du discord/forum/site");
                    p.sendMessage("§b/gmc /gms commandes qui permet de ce mettre en créative/survie");
                    p.sendMessage("§b/gm /gamemode commandes bloquée");
                    p.sendMessage("§b/report commande qui permet de report des joueurs au staff !");
                    p.sendMessage("§b/warn /warncheck /unwarn commande qui permet au staff de warn / check les warns / unwarn des joueurs");
                    p.sendMessage("§b/aide commande qui permet de demander de l'aide");
                    p.sendMessage("§b/action commande qui permet de faire une action");
                    p.sendMessage("§b/me commande bloquée");
                    p.sendMessage("§b/armachat commande qui permet d'activé / désactivé les mentions du chat");
                    p.sendMessage("§b/tp /tphere commandes qui permet de ce tp à / tp à nous un joueur");
                    p.sendMessage("§b/speed commande qui permet de changer le speed de minecraft");
                    p.sendMessage("§b/warp /setwarp /delwarp commandes qui permet de ce tp à / mettre / supprimer un warp");
                    p.sendMessage("§b/incap commande qui permet de ce revive");
                    p.sendMessage("§b/scoreboard /sb commandes qui permet d'activer / désactiver le scoreboard");
                    p.sendMessage("§2");
                    p.sendMessage("§4§m§l--------------§4§l[ArmaCore §c§lPlugin]§c§m§l--------------");
                }
                if(args[0].equalsIgnoreCase("listevents")){
                    p.sendMessage("§4§m§l--------------§4§l[ArmaCore §c§lPlugin]§c§m§l--------------");
                    p.sendMessage("§1");
                    p.sendMessage("§bReportsEvents event qui permet que le menu du /report fasse quelque chose");
                    p.sendMessage("§bMovePlayerEvent event qui permet de voir la position du joueur pour faire certaine chose ex: pseudo rentre dans la vm");
                    p.sendMessage("§bFarmEvent event qui permet le farm sur le serveur");
                    p.sendMessage("§bFixBackPack event qui permet l'antiduplication");
                    p.sendMessage("§bFallEvent event qui permet le no rp");
                    p.sendMessage("§bPlayerJoinEvent event qui permet de mettre le message de join");
                    p.sendMessage("§bPlayerQuit event qui permet de mettre le message de leave");
                    p.sendMessage("§bDeathEvent event qui permet de mettre le message de mort");
                    p.sendMessage("§bDropItem event qui permet l'antidrop des medkits");
                    p.sendMessage("§bInteractPlayer event qui permet le cooldown medkit");
                    p.sendMessage("§bInventoryListeners event en cours de création ...");
                    p.sendMessage("§bIncapEvents event qui permet l'incapacited");
                    p.sendMessage("§bTelephone... event qui permet de faire tout le téléphone");
                    p.sendMessage("§bCompass... event qui permet de faire tout le gps");
                    p.sendMessage("§bPnj... event qui permet de faire tout les menu pnj");
                    p.sendMessage("§bChatEvent event qui permet de check les messages envoyer");
                    p.sendMessage("§2");
                    p.sendMessage("§4§m§l--------------§4§l[ArmaCore §c§lPlugin]§c§m§l--------------");
                }
                if(args[0].equalsIgnoreCase("info")){
                    p.sendMessage("§4§m§l--------------§4§l[ArmaCore §c§lPlugin]§c§m§l--------------");
                    p.sendMessage("§1");
                    p.sendMessage("§bNom: ArmaCore");
                    p.sendMessage("§bVersion: 2.0");
                    p.sendMessage("§bAuteur: NewZ_AZ");
                    p.sendMessage("§bCommencé en decembre 2019");
                    p.sendMessage("§2");
                    p.sendMessage("§4§m§l--------------§4§l[ArmaCore §c§lPlugin]§c§m§l--------------");
                }
                if(args[0].equalsIgnoreCase("config")){
                    p.sendMessage("§4§m§l--------------§4§l[ArmaCore §c§lPlugin]§c§m§l--------------");
                    p.sendMessage("§1");
                    p.sendMessage("§bEn cours de création !");
                    p.sendMessage("§2");
                    p.sendMessage("§4§m§l--------------§4§l[ArmaCore §c§lPlugin]§c§m§l--------------");
                }
                if(args[0].equalsIgnoreCase("patchnotes")){
                    p.sendMessage("§4§m§l--------------§4§l[ArmaCore §c§lPlugin]§c§m§l--------------");
                    p.sendMessage("§1");
                    p.sendMessage("§b21/07/20 : ");
                    p.sendMessage("§bAjout de la commande /armacore");
                    p.sendMessage("§2");
                    p.sendMessage("§4§m§l--------------§4§l[ArmaCore §c§lPlugin]§c§m§l--------------");
                }
            }
        }
        return false;
    }
}
