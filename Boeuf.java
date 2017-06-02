package fr.Voltech74.BoeufBourgignon;

import org.bukkit.plugin.java.JavaPlugin;

public class Boeuf extends JavaPlugin {
	public void onEnable(){
		getCommand("BoeufBourgignon").setExecutor(new CommandeBoeuf());
	}
}

