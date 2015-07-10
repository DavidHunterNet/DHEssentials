package scot.davidhunter.DHEssentials;

import org.bukkit.ChatColor;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.event.player.PlayerQuitEvent;

public class PlayerListener implements Listener {

	private DHEssentials plugin;
	
	public PlayerListener(DHEssentials plugin) {
		
		this.plugin = plugin;
		
	}
	
	@EventHandler
	public void onPlayerJoin(PlayerJoinEvent event) {
		
		event.setJoinMessage(plugin.getGlobalChatPrefix() + ChatColor.BOLD + event.getPlayer().getDisplayName() + ChatColor.GRAY + " has joined the server!");
		
	}
	
	@EventHandler
	public void onPlayerQuit(PlayerQuitEvent event) {
		
		event.setQuitMessage(plugin.getGlobalChatPrefix() + ChatColor.BOLD + event.getPlayer().getDisplayName() + ChatColor.GRAY + " has left the server!");
		
	}
	
}
