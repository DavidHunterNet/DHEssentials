package scot.davidhunter.DHEssentials;

import java.util.logging.Level;

import org.bukkit.plugin.java.JavaPlugin;

public class DHEssentials extends JavaPlugin {

	private final String globalChatPrefix = "[DHEssentials] ";
	
	@Override
	public void onEnable() {
		
		this.getServer().getLogger().log(Level.INFO, this.globalChatPrefix + "Plugin Enabled!");
		
	}
	
	@Override
	public void onDisable() {
		
		this.getServer().getLogger().log(Level.INFO, this.globalChatPrefix + "Plugin Disabled!");
		
	}
	
	public String getGlobalChatPrefix() {
		
		return this.globalChatPrefix;
		
	}
	
}
