package ch.superlogical.spigot.plugins.template;

import ch.superlogical.spigot.plugins.template.commands.TemplateCommand;
import org.bukkit.plugin.java.JavaPlugin;

import static ch.superlogical.spigot.plugins.template.SuperlogicalConstants.CMD_STR_SUPERLOGICAL;

public class MainPlugin extends JavaPlugin {

    @Override
    public void onDisable() {
        getLogger().info("onDisable called");
    }

    @Override
    public void onEnable() {

        getLogger().info("onEnable called");
        getCommand(CMD_STR_SUPERLOGICAL).setExecutor(new TemplateCommand(this));
    }
}
