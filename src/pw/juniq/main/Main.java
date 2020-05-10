package pw.juniq.main;

import org.bukkit.Bukkit;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;
import pw.juniq.listener.*;

public class Main extends JavaPlugin {
    private static String version = "1.0";
    PluginManager pm = Bukkit.getServer().getPluginManager();
    public void onEnable() {
        System.out.print("System Version " + version + " startet...");
        this.pm.registerEvents(new FirstJoinListener(), this);
        this.pm.registerEvents(new JoinListener(), this);
        this.pm.registerEvents(new QuitListener(), this);
        this.pm.registerEvents(new UnknownCommandListener(), this);
    }

    public void onDisable() {
        System.out.print("System Version " + version + " stoppt...");
    }


}
