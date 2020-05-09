package pw.juniq.listener;

import org.bukkit.entity.Player;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import pw.juniq.other.FileManager;
import pw.juniq.other.PrefixManager;
import pw.juniq.other.UserIDGenerator;

import java.io.IOException;

public class FirstJoinListener implements Listener {
    public void onFirstJoin(PlayerJoinEvent e) {
        Player p = e.getPlayer();
        if(!p.hasPlayedBefore()) {
            e.setJoinMessage(PrefixManager.Prefix + "§2" + p.getName() + " §aist neu auf dem Netzwerk");
            FileManager.UserConfiguration.set("users." + p.getUniqueId() + ".id", UserIDGenerator.getUserID());
            try {
                FileManager.UserConfiguration.save(FileManager.UserFile);
            } catch (IOException ioException) {
                ioException.printStackTrace();
            }
        }
    }
}
