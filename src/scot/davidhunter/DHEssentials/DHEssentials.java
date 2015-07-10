package scot.davidhunter.DHEssentials;

import java.util.logging.Level;

import org.bukkit.plugin.java.JavaPlugin;

public class DHEssentials extends JavaPlugin {

	@Override
	public void onEnable() {
		
		this.getServer().getLogger().log(Level.INFO, "Plugin Enabled!");
		
	}
	
	@Override
	public void onDisable() {
		
		this.getServer().getLogger().log(Level.INFO, "Plugin Disabled!");
		
	}
	
}
