package me.iiYoyo.Discord;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin {
	
	@Override 
	public void onEnable() {
		// startup
		// reloads
		// plugin reloads
	}
	
	@Override 
	public void onDisable() {
		// shutdown
		// reloads
		// plugin reloads
	}

	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
		if (label.equalsIgnoreCase("discord")) {
			if (sender instanceof Player) {
				//player
				Player player = (Player) sender;
				player.sendMessage(ChatColor.translateAlternateColorCodes('&', "&#557DFFhttps://discord.gg/wAMCGtz"));
			    return true;
		}
		else {
		    // console
			sender.sendMessage("https://discord.gg/wAMCGtz");
			return true;
		}
	}
	
	return false;
}

}