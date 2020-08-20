package fr.newzaz.armacore.registers;

import fr.newzaz.armacore.Main;
import fr.newzaz.armacore.chat.*;
import fr.newzaz.armacore.command.*;
import fr.newzaz.armacore.command.CommandLag;
import fr.newzaz.armacore.command.HelpCommand;
import fr.newzaz.armacore.events.*;
import fr.newzaz.armacore.gui.gps.compassgui.CompassGUIInteract;
import fr.newzaz.armacore.gui.gps.compassgui.CompassInteract;
import fr.newzaz.armacore.gui.pnj.PnjGuiInteract;
import fr.newzaz.armacore.gui.pnj.PnjInteract;
import fr.newzaz.armacore.gui.telephone.guiinteract.TelephoneGuIInteract2;
import fr.newzaz.armacore.gui.telephone.guiinteract.TelephoneInteract1;
import fr.newzaz.armacore.gui.telephone.guiinteract.TelephoneInteract2;
import fr.newzaz.armacore.gui.telephone.guiinteract.TelephoneInteract3;

public class RegisterManager {

    private final Main main;

    public RegisterManager(Main main) {
        this.main = main;
    }

    public void registerListener(){

        //Listeners

        main.getServer().getPluginManager().registerEvents(new ReportsEvents(), main);
        main.getServer().getPluginManager().registerEvents(new MovePlayerEvent(),main);
        main.getServer().getPluginManager().registerEvents(new FarmEvent(), main);
        main.getServer().getPluginManager().registerEvents(new FixBackPack(), main);
        main.getServer().getPluginManager().registerEvents(new FallEvent(), main);
        main.getServer().getPluginManager().registerEvents(new PlayerJoin(), main);
        main.getServer().getPluginManager().registerEvents(new PlayerQuit(), main);
        main.getServer().getPluginManager().registerEvents(new DeathEvent(), main);
        main.getServer().getPluginManager().registerEvents(new DropItem(), main);
        main.getServer().getPluginManager().registerEvents(new InteractPlayer(), main);
        main.getServer().getPluginManager().registerEvents(new InventoryListeners(main), main);
        main.getServer().getPluginManager().registerEvents(new IncapEvents(main), main);
        main.getServer().getPluginManager().registerEvents(new TelephoneGuIInteract2(), main);
        main.getServer().getPluginManager().registerEvents(new TelephoneInteract1(), main);
        main.getServer().getPluginManager().registerEvents(new TelephoneInteract2(), main);
        main.getServer().getPluginManager().registerEvents(new TelephoneInteract3(), main);
        main.getServer().getPluginManager().registerEvents(new CompassGUIInteract(), main);
        main.getServer().getPluginManager().registerEvents(new CompassInteract(), main);
        main.getServer().getPluginManager().registerEvents(new PnjInteract(),main);
        main.getServer().getPluginManager().registerEvents(new PnjGuiInteract(main),main);
        main.getServer().getPluginManager().registerEvents(new ChatEvent(),main);

        //Commands

        new RegisterCommands("clearlag",new CommandLag(),main);
        new RegisterCommands("help",new HelpCommand(),main);
        new RegisterCommands("militaire",new MiliChat(),main);
        new RegisterCommands("taliban",new TaliChat(),main);
        new RegisterCommands("sc",new StaffChat(),main);
        new RegisterCommands("an",new AnnonceChat(),main);
        new RegisterCommands("annonce",new AnnonceChat2(),main);
        new RegisterCommands("bc",new StopCommand(),main);
        new RegisterCommands("broadcast",new StopCommand(),main);
        new RegisterCommands("rp",new RpCommand(),main);
        new RegisterCommands("discord",new DiscordCommand(),main);
        new RegisterCommands("gmc",new CreativeCommand(),main);
        new RegisterCommands("gms",new SurvivalCommand(),main);
        new RegisterCommands("gm",new gmCommandStop(),main);
        new RegisterCommands("gamemode",new gmCommandStop(),main);
        new RegisterCommands("forum",new ForumCommand(),main);
        new RegisterCommands("site",new SiteCommand(),main);
        new RegisterCommands("report",new ReportsCommand(),main);
        new RegisterCommands("warn",new WarnCommand(),main);
        new RegisterCommands("warncheck",new WarnCommand(),main);
        new RegisterCommands("unwarn",new WarnCommand(),main);
        new RegisterCommands("aide",new AideCommand(),main);
        new RegisterCommands("action",new ActionCommand(),main);
        new RegisterCommands("me",new StopCommand(),main);
        new RegisterCommands("armachat",new ChatEvent(),main);
        new RegisterCommands("tp",new TeleportCommand(),main);
        new RegisterCommands("tphere",new TeleportCommand(),main);
        new RegisterCommands("speed",new SpeedCommand(),main);
        new RegisterCommands("delwarp",new WarpCommand(),main);
        new RegisterCommands("setwarp",new WarpCommand(),main);
        new RegisterCommands("warp",new WarpCommand(),main);
        new RegisterCommands("incap", new IncapEvents(main),main);
        new RegisterCommands("scoreboard", new ScoreboardCommand(),main);
        new RegisterCommands("sb", new ScoreboardCommand(),main);
        new RegisterCommands("ArmaCore", new ArmaCoreCommand(),main);
        new RegisterCommands("spawn",new SpawnCommand(),main);
        new RegisterCommands("pnj",new PnjCommand(),main);
        new RegisterCommands("Configchat",new ChatEvent(),main);
    }
}
