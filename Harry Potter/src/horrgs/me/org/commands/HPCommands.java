package horrgs.me.org.commands;


import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

public class HPCommands implements CommandExecutor {
	
	
	
	public boolean onCommand(CommandSender sender, Command cmd, String commandLabel, String[] args) {
		Player p = (Player) sender;
		if(!(sender instanceof Player)) {
			sender.sendMessage(ChatColor.RED + "You must be a wizard, witch, or even a sad squib in order to run a Harry Potter command.");
		}
		
		
		
			if(args.length == 1) {
				if(args[0].equalsIgnoreCase("help")) {
					if(sender.hasPermission("harrypotter.user.help")) {
						helpCMD1(sender);
						System.out.println("Player " + sender.getName() + " ran command /hp help successfully.");
					} else {
						NoErrorMSG(sender);
						System.out.println("Player " + sender.getName() + " tried to run command /hp help");
					}
				}
				if(args[0].equalsIgnoreCase("spells")) {
					if(sender.hasPermission("harrypotter.user.spells")) {
						SpellsList1(sender);
						System.out.println("Player " + sender.getName() + " ran command /hp spells successfully.");
					} else {
						NoErrorMSG(sender);
						System.out.println("Player " + sender.getName() + " tried to run command /hp spells");
					}
				}
				if(args[0].equalsIgnoreCase("wand")) {
					if(sender.hasPermission("harrypotter.wand")) {
						System.out.println("Player " + sender.getName() + " ran command /hp wand successfully");
						return true;
						} else {
							NoErrorMSG(sender);
							System.out.println("Player" + sender.getName() + " tried to run command /hp wand");
					}
				}
				
				if(args[0].equalsIgnoreCase("selector")) {
					if(sender.hasPermission("harrypotter.admin.selector")) {
						System.out.println("Player " + sender.getName() + " ran command /hp selector succesfully");
					} else {
						NoErrorMSG(sender);
						System.out.println("Player " + sender.getName() + " tried to run command /hp selector");
					}
				}
				if(args[0].equalsIgnoreCase("version")) {
					Version(sender);
					System.out.println("Player " + sender.getName() + " ran command /hp version successfully");
				}
				if(args[0].equalsIgnoreCase("teach")) {
					if(sender.hasPermission("harrypotter.teach")) {
						SpellsList1(sender);
						System.out.println("Player " + sender.getName() + " ran command /hp teach successfully");
						return true;
					} else {
						NoErrorMSG(sender);
						System.out.println("Player " + sender.getName() + " tried to run command /hp teach");
					}
				}
			}
			if(args.length == 2) {
				//TODO Fix this command, currently broke.
				if(args[0].equalsIgnoreCase("wand")) {
					if(sender.hasPermission("harrypotter.wand.others")) {
						if(Bukkit.getPlayerExact(args[2]) != null) {
							ItemStack PowerfulWand1 = new ItemStack(Material.STICK,1);
							Bukkit.getPlayerExact(args[2]).getInventory().addItem(PowerfulWand1);
						} else {
							Invalid(sender);
							
						}
					} else {
						NoErrorMSG(sender);
					}
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
		sender.sendMessage(ChatColor.DARK_AQUA + "[" + ChatColor.GOLD + "-" + ChatColor.DARK_AQUA + "]" + ChatColor.BLUE + "------------------" + ChatColor.DARK_AQUA + "[" + ChatColor.GOLD + "Harry Potter" + ChatColor.DARK_AQUA + "]" + ChatColor.BLUE + "------------------" + ChatColor.DARK_AQUA + "[" + ChatColor.GOLD + "-" + ChatColor.DARK_AQUA + "]");
		sender.sendMessage(ChatColor.GREEN + "Avada Kedavra");
		sender.sendMessage(ChatColor.GREEN + "Stupefy");
		sender.sendMessage(ChatColor.GREEN + "Lumos");
		sender.sendMessage(ChatColor.GREEN + "Wingardium Leviosa");
		sender.sendMessage(ChatColor.GREEN + "Protego");
		sender.sendMessage(ChatColor.DARK_AQUA + "[" + ChatColor.GOLD + "-" + ChatColor.DARK_AQUA + "]" + ChatColor.BLUE + "------------------" + ChatColor.DARK_AQUA + "[" + ChatColor.GOLD + "Harry Potter" + ChatColor.DARK_AQUA + "]" + ChatColor.BLUE + "------------------" + ChatColor.DARK_AQUA + "[" + ChatColor.GOLD + "-" + ChatColor.DARK_AQUA + "]");
	}
	
	private void NoErrorMSG(CommandSender sender) {
		sender.sendMessage(ChatColor.GOLD + "[" + ChatColor.AQUA + "HarryPotter" + ChatColor.GOLD + "] " + ChatColor.AQUA + "Invalid permissions.");
	}
	
	private void Version(CommandSender sender) {
		sender.sendMessage(ChatColor.DARK_AQUA + "[" + ChatColor.GOLD + "-" + ChatColor.DARK_AQUA + "]" + ChatColor.BLUE + "------------------" + ChatColor.DARK_AQUA + "[" + ChatColor.GOLD + "Harry Potter" + ChatColor.DARK_AQUA + "]" + ChatColor.BLUE + "------------------" + ChatColor.DARK_AQUA + "[" + ChatColor.GOLD + "-" + ChatColor.DARK_AQUA + "]");
		sender.sendMessage(ChatColor.DARK_AQUA + "Developer: " + ChatColor.GOLD + "iiHeroo");
		sender.sendMessage(ChatColor.DARK_AQUA + "Version: " + ChatColor.GOLD + "0.1");
		sender.sendMessage(ChatColor.DARK_AQUA + "Website: " + ChatColor.GOLD + "http://dev.bukkit.org/bukkit-plugins/harry-potter/");
		sender.sendMessage(ChatColor.DARK_AQUA + "Liscense: " + ChatColor.GOLD + "All Rights Reserved");
		sender.sendMessage(ChatColor.DARK_AQUA + "[" + ChatColor.GOLD + "-" + ChatColor.DARK_AQUA + "]" + ChatColor.BLUE + "------------------" + ChatColor.DARK_AQUA + "[" + ChatColor.GOLD + "Harry Potter" + ChatColor.DARK_AQUA + "]" + ChatColor.BLUE + "------------------" + ChatColor.DARK_AQUA + "[" + ChatColor.GOLD + "-" + ChatColor.DARK_AQUA + "]");
	}
	
	private void Invalid(CommandSender sender) {
		sender.sendMessage(ChatColor.DARK_AQUA + "[" + ChatColor.GOLD + "Harry Potter" + ChatColor.DARK_AQUA + "]" + ChatColor.AQUA + "Player can't be found.");
	}
	
	
	
	
}
