package pw.juniq.other;

import org.bukkit.configuration.file.YamlConfiguration;

import java.io.File;

public class FileManager {
    public static File MaintenanceFile = new File("plugins/System/maintenance.yml");
    public static YamlConfiguration MaintenanceConfiguration = YamlConfiguration.loadConfiguration(MaintenanceFile);
    public static File UserFile = new File("plugins/System/users.yml");
    public static YamlConfiguration UserConfiguration = YamlConfiguration.loadConfiguration(UserFile);
}
