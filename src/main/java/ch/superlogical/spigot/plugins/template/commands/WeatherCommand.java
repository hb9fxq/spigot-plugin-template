package ch.superlogical.spigot.plugins.template.commands;

import ch.superlogical.spigot.plugins.template.MainPlugin;
import ch.superlogical.spigot.plugins.template.util.weather.WeatherStationGson;
import ch.superlogical.spigot.plugins.template.util.weather.WeatherUtil;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import static ch.superlogical.spigot.plugins.template.SuperlogicalConstants.CMD_STR_BERN;

/**
 * Created by int_wkf on 12/11/16.
 */
public class WeatherCommand implements CommandExecutor {

    MainPlugin parentPlugin;

    public WeatherCommand(MainPlugin plugin) {
        this.parentPlugin = plugin;
    }

    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
        String cmdName = cmd.getName().toLowerCase();

        if (!cmdName.equals(CMD_STR_BERN) || !(sender instanceof Player)) {
            return false;
        }

        try {

            Player senderPlayer = (Player) sender;
            WeatherStationGson bernerWetter = WeatherUtil.getWeather("BER");
            senderPlayer.sendMessage(String.format("Das Wetter an der Station [%s]: ==>  Temp [%s] Wind km/h [%s] Luftfeuchtigkeit [%s%%]", bernerWetter.getStation().getName(), bernerWetter.getTemperature(), bernerWetter.getWindSpeed(), bernerWetter.getHumidity()));

        } catch (Exception e) {
            e.printStackTrace();
        }

        return true;
    }
}
