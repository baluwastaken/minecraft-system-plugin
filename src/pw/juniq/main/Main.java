package pw.juniq.main;

import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin {
    private static String version = "1.0";
    public void onEnable() {
        System.out.print("System Version " + version + " startet...");
    }

    public void onDisable() {
        System.out.print("System Version " + version + " stoppt...");
    }


}
