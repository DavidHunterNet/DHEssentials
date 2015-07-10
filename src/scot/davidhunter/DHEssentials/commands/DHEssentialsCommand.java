package scot.davidhunter.DHEssentials.commands;

import java.util.ArrayList;

import net.md_5.bungee.api.ChatColor;

import org.bukkit.command.CommandSender;
import org.bukkit.command.defaults.BukkitCommand;

import scot.davidhunter.DHEssentials.DHEssentials;

public class DHEssentialsCommand extends BukkitCommand {

	public static final String NAME = "dhessentials";
	
	private DHEssentials plugin;
	
	public DHEssentialsCommand(DHEssentials plugin) {
		super(DHEssentialsCommand.NAME);
		
		this.plugin = plugin;
		
		// COMMAND INFO
		this.description = "Welcomes you to the plugin.";
		this.usageMessage = "/dhessentials";
		
		// COMMAND ALIASES
		ArrayList<String> aliases = new ArrayList<String>();
		
		aliases.add("dhe");
		
		this.setAliases(aliases);
	}

	@Override
	public boolean execute(CommandSender sender, String alias, String[] args) {
		
		if( sender.hasPermission("dhessentials.dhessentials") ) {
		
			sender.sendMessage(plugin.getGlobalChatPrefix() + "Welcome to the DHEssentials plugin!");
			
		} else {
			
			sender.sendMessage(plugin.getGlobalChatPrefix() + ChatColor.DARK_RED + "Sorry, you do not have permission!");
			sender.sendMessage(plugin.getGlobalChatPrefix() + ChatColor.DARK_RED + "Missing: " + ChatColor.RED + "dhessentials.dhessentials");
			
		}
		
		return false;
	}

}
