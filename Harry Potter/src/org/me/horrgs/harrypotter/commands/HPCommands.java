package org.me.horrgs.harrypotter.commands;


import org.me.horrgs.harrypotter.harrypotter;

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
	
	harrypotter plugin;
	public HPCommands(harrypotter plugin) {
		this.plugin = plugin;
	}
	
	
	
	public boolean onCommand(CommandSender sender, Command cmd, String commandLabel, String[] args) {
		Player player = (Player) sender;
		
		if(args.length < 1) {
			Args(sender);
		}
		
		
			if(args.length == 1) {
				if(args[0].equalsIgnoreCase("help")) {
					if(sender.hasPermission("harrypotter.user.help")) {
						helpCMD1(sender);
						System.out.println("[HarryPotter]" + " Player " + sender.getName() + " ran command /hp help successfully.");
					} else {
						NoErrorMSG(sender);
						System.out.println("[HarryPotter]" + " Player " + sender.getName() + " tried to run command /hp help");
					}
				}
				if(args[0].equalsIgnoreCase("spells")) {
					if(sender.hasPermission("harrypotter.user.spells")) {
						SpellsList1(sender);
						System.out.println("[HarryPotter]" + " Player " + sender.getName() + " ran command /hp spells successfully.");
					} else {
						NoErrorMSG(sender);
						System.out.println("[HarryPotter]" + " Player " + sender.getName() + " tried to run command /hp spells");
					}
				}
				
				if(args[0].equalsIgnoreCase("selector")) {
					if(sender.hasPermission("harrypotter.admin.selector")) {
						System.out.println("[HarryPotter]" + " Player " + sender.getName() + " ran command /hp selector succesfully");
					} else {
						NoErrorMSG(sender);
						System.out.println("[HarryPotter]" + " Player " + sender.getName() + " tried to run command /hp selector");
					}
				}
				if(args[0].equalsIgnoreCase("version")) {
					Version(sender);
					System.out.println("[HarryPotter]" + " Player " + sender.getName() + " ran command /hp version successfully");
				}
				if(args[0].equalsIgnoreCase("teach")) {
					if(sender.hasPermission("harrypotter.teach")) {
						SpellsList1(sender);
						System.out.println("[HarryPotter]" + " Player " + sender.getName() + " ran command /hp teach successfully");
						return true;
					} else {
						NoErrorMSG(sender);
						System.out.println("[HarryPotter]" + "Player " + sender.getName() + " tried to run command /hp teach");
					}
				}
				if(args[0].equalsIgnoreCase("wand")) {
					if(sender.hasPermission("harrypotter.admin.wand")) {
						ItemStack PwrWand = new ItemStack(Material.STICK, 1);
						ItemMeta namePwrWand = PwrWand.getItemMeta();
				        namePwrWand.setDisplayName("Elder Wand");
				        PwrWand.setItemMeta(namePwrWand);
				        player.getInventory().addItem(PwrWand);
					} else {
						NoErrorMSG(sender);
					}
				}
				if(args[0].equalsIgnoreCase("whois")) {
					if(sender.hasPermission("harrypotter.admin.whois")) {
						Args(sender);
					} else {
						NoErrorMSG(sender);
					}
				}
			}
			if(args.length == 2) {
				if(args[0].equalsIgnoreCase("whois")) {
					if(sender.hasPermission("harrypotter.admin.whois")) {
						if(Bukkit.getPlayerExact(args[1]) != null) {
							sender.sendMessage(ChatColor.DARK_AQUA + "[" + ChatColor.GOLD + "-" + ChatColor.DARK_AQUA + "]" + ChatColor.BLUE + "------------------" + ChatColor.DARK_AQUA + "[" + ChatColor.GOLD + "Harry Potter" + ChatColor.DARK_AQUA + "]" + ChatColor.BLUE + "------------------" + ChatColor.DARK_AQUA + "[" + ChatColor.GOLD + "-" + ChatColor.DARK_AQUA + "]");
						    sender.sendMessage(ChatColor.GOLD + "Name: " + ChatColor.GREEN + args[1]);
						    sender.sendMessage(ChatColor.GOLD + "Wand: " + ChatColor.GREEN);
						    sender.sendMessage(ChatColor.GOLD + "Year: " + ChatColor.GREEN);
						    sender.sendMessage(ChatColor.DARK_AQUA + "[" + ChatColor.GOLD + "-" + ChatColor.DARK_AQUA + "]" + ChatColor.BLUE + "------------------" + ChatColor.DARK_AQUA + "[" + ChatColor.GOLD + "Harry Potter" + ChatColor.DARK_AQUA + "]" + ChatColor.BLUE + "------------------" + ChatColor.DARK_AQUA + "[" + ChatColor.GOLD + "-" + ChatColor.DARK_AQUA + "]");
						} else {
						    	TgtNull(sender);
						        System.out.println("[HarryPotter]" + " Player " + sender.getName() + " tried to run command /hp whois");
						        System.out.println("with permission, but the player couldn't be found.");
						    }
						} else {
							NoErrorMSG(sender);
					        System.out.println("[HarryPotter]" + " Player " + sender.getName() + " tried to run command /hp whois");
						}
				}
				if(args[0].equalsIgnoreCase("wand")) {
					if(sender.hasPermission("harrypottter.admin.wand")) {
						if(Bukkit.getPlayerExact(args[1]) != null) {
							ItemStack PwrWand = new ItemStack(Material.STICK, 1);
							ItemMeta namePwrWand = PwrWand.getItemMeta();
					        namePwrWand.setDisplayName("Elder Wand");
					        PwrWand.setItemMeta(namePwrWand);
					        player.getInventory().addItem(PwrWand);
					        return true;
							} else {
								TgtNull(sender);
								return true;
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
		sender.sendMessage(ChatColor.GOLD + "/hp whois <player>" + ChatColor.GRAY + " - " + ChatColor.GREEN + "Tell's HarryPotter related info about the player.");
		sender.sendMessage(ChatColor.GOLD + "/hp wand [player]" + ChatColor.GRAY + " - " + ChatColor.GREEN +  "Gives the selected player the Elder Wand");
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
	
	private void TgtNull(CommandSender sender) {
		sender.sendMessage(ChatColor.DARK_AQUA + "[" + ChatColor.GOLD + "Harry Potter" + ChatColor.DARK_AQUA + "]" + ChatColor.AQUA + " Player can't be found.");
	}
	private void Args(CommandSender sender) {
		sender.sendMessage(ChatColor.DARK_AQUA + "[" + ChatColor.GOLD + "-" + ChatColor.DARK_AQUA + "]" + ChatColor.BLUE + "------------------" + ChatColor.DARK_AQUA + "[" + ChatColor.GOLD + "Harry Potter" + ChatColor.DARK_AQUA + "]" + ChatColor.BLUE + "------------------" + ChatColor.DARK_AQUA + "[" + ChatColor.GOLD + "-" + ChatColor.DARK_AQUA + "]");
		sender.sendMessage(ChatColor.RED + "[WARNING] " + ChatColor.AQUA + "Invalid arguments! For a list of commands please do /hp help");
		sender.sendMessage(ChatColor.DARK_AQUA + "[" + ChatColor.GOLD + "-" + ChatColor.DARK_AQUA + "]" + ChatColor.BLUE + "------------------" + ChatColor.DARK_AQUA + "[" + ChatColor.GOLD + "Harry Potter" + ChatColor.DARK_AQUA + "]" + ChatColor.BLUE + "------------------" + ChatColor.DARK_AQUA + "[" + ChatColor.GOLD + "-" + ChatColor.DARK_AQUA + "]");
	}
	
	
	
	
}

