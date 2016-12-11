package ch.superlogical.spigot.plugins.template.util;

import ch.superlogical.spigot.plugins.template.util.weather.WeatherStationGson;
import ch.superlogical.spigot.plugins.template.util.weather.WeatherUtil;
import org.junit.Test;

import static org.junit.Assert.assertTrue;

/**
 * Created by int_wkf on 12/11/16.
 */
public class WeatherUtilTest {
    @Test
    public void getWeather() throws Exception {

        // given
        String cityString = "BER";

        // when
        WeatherStationGson weatherResponse = WeatherUtil.getWeather(cityString);

        // then
        assertTrue(weatherResponse.getStation().getName().contains("Zollikofen"));
    }

}