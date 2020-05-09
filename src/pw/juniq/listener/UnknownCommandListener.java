package pw.juniq.listener;

import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerCommandPreprocessEvent;
import org.bukkit.help.HelpTopic;
import pw.juniq.other.PrefixManager;

public class UnknownCommandListener implements Listener {
    @EventHandler
    public void onUnknown(PlayerCommandPreprocessEvent e)
    {
        if (!e.isCancelled())
        {
            Player p = e.getPlayer();
            String msg = e.getMessage().split(" ")[0];
            HelpTopic topic = Bukkit.getServer().getHelpMap().getHelpTopic(msg);
            if (topic == null)
            {
                e.setCancelled(true);
                p.sendMessage(PrefixManager.Prefix + "§cDer Befehl §4" + msg + " §cexistiert nicht");
            }
        }
    }
}