package eu.coverxprojects.Website;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class Website
  implements CommandExecutor
{
  private Main plugin;
  
  public Website(Main pl)
  {
    this.plugin = pl;
  }
  
  public boolean onCommand(CommandSender arg0, Command command, String label, String[] args)
  {
    if (!(arg0 instanceof Player))
    {
        String Prefix = ChatColor.translateAlternateColorCodes('&', this.plugin.getConfig().getString("Prefix"));
        String Website = ChatColor.translateAlternateColorCodes('&', this.plugin.getConfig().getString("Website"));
        System.out.println(Prefix + " " + Website);
      return false;
    }
    Player p = (Player)arg0;
    
    String Prefix = ChatColor.translateAlternateColorCodes('&', this.plugin.getConfig().getString("Prefix"));
    String Website = ChatColor.translateAlternateColorCodes('&', this.plugin.getConfig().getString("Website"));
    p.sendMessage(Prefix + " " + Website);
    return false;
  }
}
