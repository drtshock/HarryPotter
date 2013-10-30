package horrgs.me.org.commands;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class HPCommands implements CommandExecutor {
	
	public boolean onCommand(CommandSender sender, Command cmd, String commandLabel, String[] args) {
		if(!(sender instanceof Player)) {
			sender.sendMessage(ChatColor.RED + "You must be a wizard, witch, or even a sad squib in order to run a Harry Potter command.");
		}
		
			if(args.length == 1) {
				if(args[0].equalsIgnoreCase("help")) {
					helpCMD1(sender);
				}
				if(args[0].equalsIgnoreCase("spells")) {
					SpellsList1(sender);
				}
			}
		
		return false;
	}
	
	private void helpCMD1(CommandSender sender) {
		sender.sendMessage(ChatColor.DARK_AQUA + "[" + ChatColor.GOLD + "-" + ChatColor.DARK_AQUA + "]" + ChatColor.BLUE + "------------------" + ChatColor.DARK_AQUA + "[" + ChatColor.GOLD + "Harry Potter" + ChatColor.DARK_AQUA + "]" + ChatColor.BLUE + "------------------" + ChatColor.DARK_AQUA + "[" + ChatColor.GOLD + "-" + ChatColor.DARK_AQUA + "]");
		sender.sendMessage(ChatColor.GOLD + "/hp wand" + ChatColor.GRAY + " - " + ChatColor.GREEN + "Give's you the highest wand.");
		sender.sendMessage(ChatColor.GOLD + "/hp spells" + ChatColor.GRAY + " - " + ChatColor.GREEN + "Tell's you all the spells.");
		sender.sendMessage(ChatColor.GOLD + "/hp teach [player]" + ChatColor.GRAY + " - " + ChatColor.GREEN + "Teache's a player a spell.");
		sender.sendMessage(ChatColor.GOLD + "/hp unteach [player]" + ChatColor.GRAY + " - " + ChatColor.GREEN + "Unteaches a spell from a player.");
		sender.sendMessage(ChatColor.GOLD + "/hp version" + ChatColor.GRAY + " - " + ChatColor.GREEN + "Tell's you the version of the plugin.");
		sender.sendMessage(ChatColor.GOLD + "/hp buy <spell> [player]" + ChatColor.GRAY + ChatColor.GREEN + "Buy a spell for yourself or a player.");
		sender.sendMessage(ChatColor.DARK_AQUA + "[" + ChatColor.GOLD + "-" + ChatColor.DARK_AQUA + "]" + ChatColor.BLUE + "------------------" + ChatColor.DARK_AQUA + "[" + ChatColor.GOLD + "Harry Potter" + ChatColor.DARK_AQUA + "]" + ChatColor.BLUE + "------------------" + ChatColor.DARK_AQUA + "[" + ChatColor.GOLD + "-" + ChatColor.DARK_AQUA + "]");
	}
	
	private void SpellsList1(CommandSender sender) {
		sender.sendMessage(ChatColor.GREEN + "Avada Kedavra");
		sender.sendMessage(ChatColor.GREEN + "Stupefy");
	}
}
