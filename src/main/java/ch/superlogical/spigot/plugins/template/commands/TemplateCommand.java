package ch.superlogical.spigot.plugins.template.commands;

import ch.superlogical.spigot.plugins.template.MainPlugin;
import org.bukkit.Bukkit;
import org.bukkit.World;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import static ch.superlogical.spigot.plugins.template.SuperlogicalConstants.CMD_STR_SUPERLOGICAL;
import static org.bukkit.Bukkit.getLogger;
import static org.bukkit.Bukkit.getServer;


public class TemplateCommand implements CommandExecutor {

    MainPlugin parentPlugin;

    public TemplateCommand(MainPlugin plugin) {
        this.parentPlugin = plugin;
    }

    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
        String cmdName = cmd.getName().toLowerCase();

        if (!cmdName.equals(CMD_STR_SUPERLOGICAL)) {
            return false;
        }

        Bukkit.getScheduler().runTaskAsynchronously(parentPlugin, () -> {

            String infoMessage = String.format("Hi all, the superlogical command was called asynchronously. Provided by %s (%s)", parentPlugin.getName(), parentPlugin.getDescription().getDescription());

            getLogger().info(infoMessage);

            for (World w : getServer().getWorlds()) {

                for (Player p : w.getPlayers()) {
                    if (p.hasPermission("permission.node")) {

                        getLogger().info("  ==> Sending info text message to " + p.getDisplayName());
                        p.sendMessage(infoMessage);
                    }
                }
            }
        });

        return true;
    }
}
