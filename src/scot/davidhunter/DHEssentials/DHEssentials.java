package scot.davidhunter.DHEssentials;

import java.util.logging.Level;

import org.bukkit.ChatColor;
import org.bukkit.plugin.java.JavaPlugin;

public class DHEssentials extends JavaPlugin {

	private final String globalChatPrefix = ChatColor.GOLD + "[" + ChatColor.RED + "DHEssentials" + ChatColor.GOLD + "] " + ChatColor.GRAY;
	
	@Override
	public void onEnable() {
		
		this.getLogger().log(Level.INFO, "Plugin Enabled!");
		
	}
	
	@Override
	public void onDisable() {
		
		this.getLogger().log(Level.INFO, "Plugin Disabled!");
		
	}
	
	public String getGlobalChatPrefix() {
		
		return this.globalChatPrefix;
		
	}
	
}
