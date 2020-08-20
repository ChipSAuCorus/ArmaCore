package fr.newzaz.armacore.command;

import net.md_5.bungee.api.chat.ClickEvent;
import net.md_5.bungee.api.chat.ComponentBuilder;
import net.md_5.bungee.api.chat.HoverEvent;
import net.md_5.bungee.api.chat.TextComponent;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class HelpCommand implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
        Player p = (Player) sender;
        if (cmd.getName().equalsIgnoreCase("help")) {
            if (args.length != 1) {
                TextComponent m1 = new TextComponent("§6[§e>§6]");
                m1.setHoverEvent(new HoverEvent(HoverEvent.Action.SHOW_TEXT,new ComponentBuilder("allez à la page 2").create()));
                m1.setClickEvent(new ClickEvent(ClickEvent.Action.RUN_COMMAND,"/help 2"));
                p.sendMessage("§7§m<------------->§6 ArmaHelp §7§m<------------->");
                p.sendMessage("");
                p.sendMessage("§6Page 1 : Sommaire");
                p.sendMessage("§6Page 2 : Qu'est-ce que le Military RP");
                p.sendMessage("§6Page 3 : Qu'est-ce que les UET");
                p.sendMessage("§6Page 4 : Qu'est-ce que les talibans");
                p.sendMessage("§6Page 5 : Qu'est-ce que les Militaires");
                p.sendMessage("§6Page 6 : Qu'est-ce que les FST");
                p.sendMessage("");
                p.spigot().sendMessage(m1);
            } else {
                if (args[0].equalsIgnoreCase("2")) {
                    TextComponent m1 = new TextComponent("§6[§e>§6]");
                    m1.setHoverEvent(new HoverEvent(HoverEvent.Action.SHOW_TEXT,new ComponentBuilder("allez à la page 3").create()));
                    m1.setClickEvent(new ClickEvent(ClickEvent.Action.RUN_COMMAND,"/help 3"));
                    TextComponent m2 = new TextComponent("§6[§e<§6]");
                    m2.setHoverEvent(new HoverEvent(HoverEvent.Action.SHOW_TEXT,new ComponentBuilder("allez à la page principale").create()));
                    m2.setClickEvent(new ClickEvent(ClickEvent.Action.RUN_COMMAND,"/help"));
                    p.sendMessage("");
                    p.sendMessage("");
                    p.sendMessage("§7§m<------------->§6 ArmaHelp §7§m<------------->");
                    p.sendMessage("");
                    p.sendMessage("§6Le military rp est un serveur front de guerre, soit, taliban contre militaire avec du fight principalement");
                    p.sendMessage("");
                    p.spigot().sendMessage(m2, m1);
                }
                if (args[0].equalsIgnoreCase("3")) {
                    TextComponent m1 = new TextComponent("§6[§e>§6]");
                    m1.setHoverEvent(new HoverEvent(HoverEvent.Action.SHOW_TEXT,new ComponentBuilder("allez à la page 4").create()));
                    m1.setClickEvent(new ClickEvent(ClickEvent.Action.RUN_COMMAND,"/help 4"));
                    TextComponent m2 = new TextComponent("§6[§e<§6]");
                    m2.setHoverEvent(new HoverEvent(HoverEvent.Action.SHOW_TEXT,new ComponentBuilder("allez à la page 2").create()));
                    m2.setClickEvent(new ClickEvent(ClickEvent.Action.RUN_COMMAND,"/help 2"));
                    p.sendMessage("");
                    p.sendMessage("");
                    p.sendMessage("§7§m<------------->§6 ArmaHelp §7§m<------------->");
                    p.sendMessage("");
                    p.sendMessage("§6L'Unité d'Elite Talibane, ils sont la pour contrôlé tout la zone de guerre, allié au Talibans, ils ont des entrainements hors norme afin de se distinguer des autres, ils choissent le meilleur pour une unité meilleur.");
                    p.sendMessage("");
                    p.spigot().sendMessage(m2,m1);
                }
                if (args[0].equalsIgnoreCase("4")) {
                    TextComponent m1 = new TextComponent("§6[§e>§6]");
                    m1.setHoverEvent(new HoverEvent(HoverEvent.Action.SHOW_TEXT,new ComponentBuilder("allez à la page 5").create()));
                    m1.setClickEvent(new ClickEvent(ClickEvent.Action.RUN_COMMAND,"/help 5"));
                    TextComponent m2 = new TextComponent("§6[§e<§6]");
                    m2.setHoverEvent(new HoverEvent(HoverEvent.Action.SHOW_TEXT,new ComponentBuilder("allez à la page 3").create()));
                    m2.setClickEvent(new ClickEvent(ClickEvent.Action.RUN_COMMAND,"/help 3"));
                    p.sendMessage("");
                    p.sendMessage("");
                    p.sendMessage("§7§m<------------->§6 ArmaHelp §7§m<------------->");
                    p.sendMessage("");
                    p.sendMessage("§6Les talibans, le groupe terroriste des débutant, lourdement armé, Ils attaquent la douane, Braquent la banque, ou prennent en otage des personnalités afin de montré leurs puissances, de plus ils sont allié aux U.E.T..");
                    p.sendMessage("");
                    p.spigot().sendMessage(m2,m1);
                }
                if (args[0].equalsIgnoreCase("5")) {
                    TextComponent m1 = new TextComponent("§6[§e>§6]");
                    m1.setHoverEvent(new HoverEvent(HoverEvent.Action.SHOW_TEXT,new ComponentBuilder("allez à la page 6").create()));
                    m1.setClickEvent(new ClickEvent(ClickEvent.Action.RUN_COMMAND,"/help 6"));
                    TextComponent m2 = new TextComponent("§6[§e<§6]");
                    m2.setHoverEvent(new HoverEvent(HoverEvent.Action.SHOW_TEXT,new ComponentBuilder("allez à la page 4").create()));
                    m2.setClickEvent(new ClickEvent(ClickEvent.Action.RUN_COMMAND,"/help 4"));
                    p.sendMessage("");
                    p.sendMessage("");
                    p.sendMessage("§7§m<------------->§6 ArmaHelp §7§m<------------->");
                    p.sendMessage("");
                    p.sendMessage("§6Les Militaires, l'Armée, des hommes lourdement, ils défendent la douane, sécurisent la Banque, dissuade des prises d'otage, en étant les allié des F.S.T., tous est de leur coté");
                    p.sendMessage("");
                    p.spigot().sendMessage(m2,m1);
                }
                if (args[0].equalsIgnoreCase("6")) {
                    TextComponent m2 = new TextComponent("§6[§e<§6]");
                    m2.setHoverEvent(new HoverEvent(HoverEvent.Action.SHOW_TEXT,new ComponentBuilder("allez à la page 5").create()));
                    m2.setClickEvent(new ClickEvent(ClickEvent.Action.RUN_COMMAND,"/help 5"));
                    p.sendMessage("");
                    p.sendMessage("");
                    p.sendMessage("§7§m<------------->§6 ArmaHelp §7§m<------------->");
                    p.sendMessage("");
                    p.sendMessage("§6Les Forces Spéciales de Terre, des hommes lourdement armé, surentrainé, préparé aux situations les plus périlleuses , ils neutralise, interroge, tout ce qu'il attrape, avec comme seul but : supprimé la menace terroriste.");
                    p.sendMessage("");
                    p.spigot().sendMessage(m2);

                }
            }
        }


        return true;
    }
}
