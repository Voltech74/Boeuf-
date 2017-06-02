package fr.Voltech74.BoeufBourgignon;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class CommandeBoeuf implements CommandExecutor {

	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String msg, String[] args) {
		if (sender instanceof Player) {
			Player p = (Player) sender;
			if (args.length == 1) {
				try {
					Player target = Bukkit.getPlayerExact(args[0]);
					Bukkit.broadcastMessage(
							ChatColor.AQUA + p.getName() + ChatColor.BLUE + " a envoyé un BoeufBourgignon à "
									+ ChatColor.AQUA + target.getName() + ChatColor.BLUE + " !");
				} catch (Exception e) {
					p.sendMessage(ChatColor.RED + "Ce joueur n'est pas connecté !");
				}
			} else {
				p.sendMessage(ChatColor.RED + "Erreur. Essayez : /BoeufBourgignon <Joueur>");
			}
		} else {
			if (args.length == 1) {
				try {
					Player target = Bukkit.getPlayerExact(args[0]);
					Bukkit.broadcastMessage(ChatColor.BLUE +
							"Un " + ChatColor.AQUA + "Administrateur" + ChatColor.BLUE + " a envoyé un BoeufBourgignon à "
									+ ChatColor.AQUA + target.getName() + ChatColor.BLUE + " !");
				} catch (Exception e) {
					System.out.println(ChatColor.RED + "Ce joueur n'est pas connecté !");
				}
			} else {
				System.out.println(ChatColor.RED + "Erreur. Essayez : /BoeufBourgignon <Joueur>");
			}
		}
		return false;
	}

}
