package scot.davidhunter.DHEssentials.commands;

import org.bukkit.command.CommandSender;
import org.bukkit.command.defaults.BukkitCommand;

import scot.davidhunter.DHEssentials.DHEssentials;

public class DHEssentialsCommand extends BukkitCommand {

	public static final String NAME = "dhessentials";
	
	private DHEssentials plugin;
	
	public DHEssentialsCommand(DHEssentials plugin) {
		super(DHEssentialsCommand.NAME);
		
		this.plugin = plugin;
	}

	@Override
	public boolean execute(CommandSender sender, String alias, String[] args) {
		
		sender.sendMessage(plugin.getGlobalChatPrefix() + "Welcome to the DHEssentials plugin!");
		
		return false;
	}

}
