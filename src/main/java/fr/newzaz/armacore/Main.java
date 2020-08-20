package fr.newzaz.armacore;

import fr.newzaz.armacore.command.CommandLag;
import fr.newzaz.armacore.registers.RegisterManager;
import fr.newzaz.armacore.runnable.AutoMessage;
import fr.newzaz.armacore.runnable.Salaire;
import fr.newzaz.armacore.scoreboard.ScoreboardManager;
import fr.newzaz.armacore.scoreboard.ScoreboardTeam;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.configuration.file.YamlConfiguration;
import org.bukkit.plugin.java.JavaPlugin;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;

public class Main extends JavaPlugin {
    private static Main instance;
    File cfile;
    private FileConfiguration config;
    private ScoreboardManager scoreboardManager;

    private ScheduledExecutorService executorMonoThread;
    private ScheduledExecutorService scheduledExecutorService;

    public static Main getInstance() {
        return instance;
    }

    @Override
    public void onEnable() {
        instance = this;
        System.out.println("Le Plugin s'est bien allumé");//300
        new AutoMessage().runTaskTimer(this, 300 * 20L, 300 * 20L);
        new Salaire().runTaskTimer(this, 1800 * 20L, 1800 * 20L);
        CommandLag.AutoClear();
        scheduledExecutorService = Executors.newScheduledThreadPool(16);
        executorMonoThread = Executors.newScheduledThreadPool(1);
        scoreboardManager = new ScoreboardManager();
        new RegisterManager(this).registerListener();
        createFile("backpack");
        createFile("pnj");
        config = getConfig();
        saveConfig();
    }

    @Override
    public void onDisable() {
        System.out.println("Le Plugin s'est bien eteint");
        getScoreboardManager().onDisable();
    }

    private void createFile(String fileName) {
        if (!getDataFolder().exists()) {
            getDataFolder().mkdir();
        }

        File file = new File(getDataFolder(), fileName + ".yml");

        if (!file.exists()) {
            try {
                file.createNewFile();

                if (fileName.equalsIgnoreCase("messages")) {
                    FileConfiguration config = getConfig("messages");
                    config.set("messages", Arrays.asList("§cRecrutement ON : https://www.heavennetwork.net/","§ctest"));

                    save(file, config);
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }

    public File getFile(String fileName) {
        return new File(getDataFolder(), fileName + ".yml");
    }

    public FileConfiguration getConfig(String fileName) {
        return YamlConfiguration.loadConfiguration(getFile(fileName));
    }

    public void save(File file, FileConfiguration config) {
        try {
            config.save(file);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public ScoreboardManager getScoreboardManager() {
        return scoreboardManager;
    }

    public ScheduledExecutorService getExecutorMonoThread() {
        return executorMonoThread;
    }

    public ScheduledExecutorService getScheduledExecutorService() {
        return scheduledExecutorService;
    }

}
