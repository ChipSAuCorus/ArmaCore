package fr.newzaz.armacore.command;

import fr.newzaz.armacore.Main;
import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.entity.Player;

import java.io.File;

public class WarnCommand implements CommandExecutor {
    File cfile;
    private FileConfiguration config;
    @Override
    public boolean onCommand(CommandSender s, Command cmd, String label, String[] args) {

        if (cmd.getName().equalsIgnoreCase("warnhelp")) {

            if (s instanceof Player) {

                Player p = (Player) s;

                if (p.hasPermission("warns.use")) {

                    if (args.length >= 0) {

                        p.sendMessage("§9==========[ §6ArmaWarn ]==========");

                        p.sendMessage("§b/warnhelp §8: §3Montre les commands.");

                        p.sendMessage("§b/warn <player> <reason> §8: §3Warn un joueur.");

                        p.sendMessage("§b/warncheck <player> §8: §3Check les warns d'un joueur.");
                        p.sendMessage("§b/unwarn <player> §8: §3Permet d'enlever 1 warn.");

                        p.sendMessage("§9==========[ §6ArmaWarn ]==========");

                    }

                } else
                    p.sendMessage("§4[§cArmaWarn§4] §cTu n'as pas la permission pour faire ceci.");

            } else {

                if (args.length >= 0) {

                    s.sendMessage("§9==========[ §6ArmaWarn ]==========");

                    s.sendMessage("§b/warnhelp §8: §3Montre les commands.");

                    s.sendMessage("§b/warn <player> <reason> §8: §3Warn un joueur.");

                    s.sendMessage("§b/warncheck <player> §8: §3Check les warns d'un joueur.");
                    s.sendMessage("§b/unwarn <player> §8: §3Enléve 1 warn du joueur.");

                    s.sendMessage("§9==========[ §6ArmaWarn ]==========");

                }

            }

        } else if (cmd.getName().equalsIgnoreCase("unwarn")) {

            if (s instanceof Player) {

                Player p = (Player) s;

                if (p.hasPermission("warns.use")) {

                    if (args.length == 0)
                        p.sendMessage("§4[§cArmaWarn§4] §cArgument: /unwarn <player>");

                    else {

                        Player t = Bukkit.getPlayer(args[0]);

                        if (t.isOnline() && t != null) {
                            if (getWarnings(t) > 0) {
                                if (getWarnings(t) == 1) {
                                    Main.getInstance().getConfig().set(t.getName() + ".raisons " + getWarnings(t), null);
                                    Main.getInstance().getConfig().set(t.getName() + ".punisseur" + getWarnings(t), null);
                                    setWarnings(t, getWarnings(t) - 1);
                                    Main.getInstance().getConfig().set(t.getName() + ".nombre de warn", null);
                                    Main.getInstance().getConfig().set(t.getName(), null);
                                    Main.getInstance().saveConfig();
                                    Bukkit.broadcastMessage("§4[§cArmaWarn§4] " + t.getName() + " §ca été unwarn par " + s.getName());
                                } else {
                                    Main.getInstance().getConfig().set(t.getName() + ".raisons " + getWarnings(t), null);
                                    Main.getInstance().getConfig().set(t.getName() + ".punisseur" + getWarnings(t), null);
                                    setWarnings(t, getWarnings(t) - 1);
                                    Main.getInstance().saveConfig();

                                    Bukkit.broadcastMessage("§4[§cArmaWarn§4] " + t.getName() + " §ca été unwarn par " + s.getName());
                                }
                            } else {
                                s.sendMessage("§4[§cArmaWarn§4] §cCe joueur n'a pas de warn !");
                            }
                        } else
                            p.sendMessage("§4[§cArmaWarn§4] §cCe joueur n'est pas valide.");

                    }

                } else
                    p.sendMessage("§4[§cArmaWarn§4] §cTu n'as pas la permission pour faire ceci.");

            } else {

                if (args.length <= 1)
                    s.sendMessage("§4[§cArmaWarn§4] §cArgument: /unwarn <player>");

                else {

                    Player t = Bukkit.getPlayer(args[0]);

                    if (t.isOnline() && t != null) {
                        if (getWarnings(t) > 0) {
                            if (getWarnings(t) == 1) {
                                Main.getInstance().getConfig().set(t.getName() + ".raisons " + getWarnings(t), null);
                                Main.getInstance().getConfig().set(t.getName() + ".punisseur" + getWarnings(t), null);
                                setWarnings(t, getWarnings(t) - 1);
                                Main.getInstance().getConfig().set(t.getName() + ".nombre de warn", null);
                                Main.getInstance().getConfig().set(t.getName(), null);
                                Main.getInstance().saveConfig();
                                Bukkit.broadcastMessage("§4[§cArmaWarn§4] " + t.getName() + " §ca été unwarn par " + s.getName());
                            } else {
                                Main.getInstance().getConfig().set(t.getName() + ".raisons " + getWarnings(t), null);
                                Main.getInstance().getConfig().set(t.getName() + ".punisseur" + getWarnings(t), null);
                                setWarnings(t, getWarnings(t) - 1);
                                Main.getInstance().saveConfig();

                                Bukkit.broadcastMessage("§4[§cArmaWarn§4] " + t.getName() + " §ca été unwarn par " + s.getName());
                            }
                        } else {
                            s.sendMessage("§4[§cArmaWarn§4] §cCe joueur n'a pas de warn !");
                        }
                    } else
                        s.sendMessage("§4[§cArmaWarn§4] §cCe joueur n'est pas valide.");

                }

            }

        } else if (cmd.getName().equalsIgnoreCase("warn")) {

            if (s instanceof Player) {

                Player p = (Player) s;

                if (p.hasPermission("warns.use")) {

                    if (args.length <= 1)
                        p.sendMessage("§4[§cArmaWarn§4] §cArgument: /warn <player> <reason>");

                    else {

                        Player t = Bukkit.getPlayer(args[0]);

                        if (t.isOnline() && t != null) {

                            String message = "";

                            for (int i = 1; i < args.length; i++)

                                message = message + args[i] + ' ';

                            setWarnings(t, getWarnings(t) + 1);

                            addReason(t, message);

                            addWarner(t, p.getName());

                            Main.getInstance().saveConfig();

                            Bukkit.broadcastMessage("§4[§cArmaWarn§4] " + t.getName() + " §ca été warn par " + s.getName() + " pour " + message);

                        } else
                            p.sendMessage("§4[§cArmaWarn§4] §cCe joueur n'est pas valide.");

                    }

                } else
                    p.sendMessage("§4[§cArmaWarn§4] §cTu n'as pas la permission pour faire ceci.");

            } else {

                if (args.length <= 1)
                    s.sendMessage("§4[§cArmaWarn§4] §cArgument: /warn <player> <reason>");

                else {

                    Player t = Bukkit.getPlayer(args[0]);

                    if (t.isOnline() && t != null) {

                        String message = "";

                        for (int i = 1; i < args.length; i++)

                            message = message + args[i] + ' ';

                        setWarnings(t, getWarnings(t) + 1);

                        addReason(t, message);

                        addWarner(t, s.getName());

                        Main.getInstance().saveConfig();

                        Bukkit.broadcastMessage("§4[§cArmaWarn§4] " + t.getName() + " §c warn par " + s.getName() + " pour " + message);

                    } else
                        s.sendMessage("§4[§cArmaWarn§4] §cCe joueur n'est pas valide.");

                }

            }

        } else if (cmd.getName().equalsIgnoreCase("warncheck")) {

            if (s instanceof Player) {

                Player p = (Player) s;


                if (p.hasPermission("warns.use")) {

                    if (args.length == 0)
                        p.sendMessage("§4[§cArmaWarn§4] §cArgument: /warncheck <player>");

                    else {

                        Player t = Bukkit.getPlayer(args[0]);

                        if (t.isOnline() && t != null) {

                            String a = "";

                            int t5 = 1;
                            int t6 = getWarnings(t);

                            if (getWarnings(t) > 0) {
                                p.sendMessage(
                                        "§4[§cArmaWarn§4] §9" + t.getName() + " §ca §9" + getWarnings(t) + " §cwarns, pour raison :");
                                do {
                                    p.sendMessage("§9" + t5 + "- §c'" + Main.getInstance().getConfig().getString(t.getName() + ".raisons " + t5) + "`" + " par " + Main.getInstance().getConfig().getString(t.getName() + ".punisseur" + t5));
                                    t5++;
                                } while (t5 <= t6);
                            } else {
                                p.sendMessage("§4[§cArmaWarn§4] §cLe joueur n'a pas de warn");
                            }
                        } else {
                            p.sendMessage("§4[§cArmaWarn§4] Ce joueur n'est pas valide.");

                        }
                    }


                } else
                    p.sendMessage("§4[§cArmaWarn§4] §cTu n'as pas la permission pour faire ceci.");

            } else {

                if (args.length == 0)
                    s.sendMessage("§4[§cArmaWarn§4] §cArgument: /warncheck <player>");

                else {
                    Player p = (Player) s;
                    Player t = Bukkit.getPlayer(args[0]);

                    if (t.isOnline() && t != null) {

                        p.sendMessage("§4[§cArmaWarn§4] §Vas en jeux !");


                    } else {
                        s.sendMessage("§4[§cArmaWarn§4] §cCe joueur n'est pas valide.");

                    }


                }

            }
        }


        return true;

    }

    private void setWarnings(Player p, int warnings) {

        Main.getInstance().getConfig().set(p.getName() + ".nombre de warn", warnings);

        Main.getInstance().saveConfig();

    }

    private int getWarnings(Player p) {

        if (Main.getInstance().getConfig().get(p.getName() + ".nombre de warn") != null) {

            return Main.getInstance().getConfig().getInt(p.getName() + ".nombre de warn");

        } else {

            return 0;

        }

    }

    private void addReason(Player p, String reason) {
        Main.getInstance().getConfig().set(p.getName() + ".raisons " + getWarnings(p), reason);
        Main.getInstance().saveConfig();
    }

    private void addWarner(Player target, String warner) {

        Main.getInstance().getConfig().set(target.getName() + ".punisseur" + getWarnings(target), warner);

    }
}
