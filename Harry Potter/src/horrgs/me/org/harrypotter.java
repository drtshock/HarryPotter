package horrgs.me.org;

import horrgs.me.org.commands.HPCommands;

import java.util.logging.Logger;

import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.plugin.java.JavaPlugin;

public class harrypotter extends JavaPlugin {
	
	public final Logger logger = Logger.getLogger("Minecraft");
	public static harrypotter plugin;
	private FileConfiguration config;
	private FileConfiguration spells;
	
	@Override
	public void onEnable() {
		config = getConfig();
		saveDefaultConfig();
		getCommand("hp").setExecutor(new HPCommands(null));
		System.out.println("[HarryPotter] Harry Potter plugin v0.1 being enabled.");
		HPCommands second = new HPCommands(this);
	}
	
	@Override
	public void onDisable() {
		System.out.println("[HarryPotter] Harry Potter plugin v0.1 being disabled.");
	}
	
	public FileConfiguration getSpellsConfig() {
		return spells;
	}
	
	

}
