package horrgs.me.org;

import horrgs.me.org.commands.HPCommands;

import java.util.logging.Logger;

import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.plugin.java.JavaPlugin;

public class harrypotter extends JavaPlugin {
	
	public final Logger logger = Logger.getLogger("Minecraft");
	public static harrypotter plugin;
	private FileConfiguration config;
	
	@Override
	public void onEnable() {
		config = getConfig();
		saveDefaultConfig();
		getCommand("hp").setExecutor(new HPCommands());
	}
	
	@Override
	public void onDisable() {
	}
	

}
