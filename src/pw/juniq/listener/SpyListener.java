package pw.juniq.listener;

import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerCommandPreprocessEvent;
import pw.juniq.other.FileManager;
import pw.juniq.other.PrefixManager;

public class SpyListener implements Listener {
    @EventHandler
    public void onCommand(PlayerCommandPreprocessEvent e)
    {
        Player p = e.getPlayer();
        for (Player all : Bukkit.getOnlinePlayers()) {
            if (all.hasPermission("system.spy"))
            {
                int SpyStatus = FileManager.SpyConfiguration.getInt("spy." + p.getUniqueId() + ".status");
                if ((SpyStatus == 1) && (!all.getName().equals(p.getName()))) {
                    all.sendMessage(PrefixManager.Prefix + "§a" + p.getDisplayName() + " §7>> " + e.getMessage());
                }
            }
        }
    }
}
