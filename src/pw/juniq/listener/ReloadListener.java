package pw.juniq.listener;

import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerCommandPreprocessEvent;
import pw.juniq.other.PrefixManager;

public class ReloadListener implements Listener {
    @EventHandler
    public void onReload(PlayerCommandPreprocessEvent e)
    {
        Player p = e.getPlayer();
        if ((e.getMessage().equalsIgnoreCase("/rl")) || (e.getMessage().equalsIgnoreCase("/reload"))) {
            if (p.hasPermission("system.admin"))
            {
                e.setCancelled(true);
                Bukkit.broadcastMessage(PrefixManager.Prefix + "�aDer Server wird reloadet");
                Bukkit.broadcastMessage(PrefixManager.Prefix + "�cBitte �4�nNICHT�r �cbewegen");
                Bukkit.reload();
                Bukkit.broadcastMessage(PrefixManager.Prefix + "�aReload abgeschlossen");
                Bukkit.broadcastMessage(PrefixManager.Prefix + "�aIhr k�nnt euch nun wieder bewegen");
            }
            else
            {
                e.setCancelled(true);
                p.sendMessage(PrefixManager.NoPerm);
            }
        }
    }
}