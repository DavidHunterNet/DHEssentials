package scot.davidhunter.DHEssentials;

import java.util.logging.Level;

import org.bukkit.ChatColor;
import org.bukkit.craftbukkit.v1_8_R3.CraftServer;
import org.bukkit.plugin.java.JavaPlugin;

import scot.davidhunter.DHEssentials.commands.DHEssentialsCommand;

public class DHEssentials extends JavaPlugin {

	private final String globalChatPrefix = ChatColor.GOLD + "[" + ChatColor.RED + "DHEssentials" + ChatColor.GOLD + "] " + ChatColor.GRAY;
	
	@Override
	public void onEnable() {
		
		this.getLogger().log(Level.INFO, "Plugin Enabled!");
		
		((CraftServer) this.getServer()).getCommandMap().register(DHEssentialsCommand.NAME, new DHEssentialsCommand(this));
		
		this.getServer().getPluginManager().registerEvents(new PlayerListener(this), this);
		
	}
	
	@Override
	public void onDisable() {
		
		this.getLogger().log(Level.INFO, "Plugin Disabled!");
		
	}
	
	public String getGlobalChatPrefix() {
		
		return this.globalChatPrefix;
		
	}
	
}
