package ch.superlogical.spigot.plugins.template.util.weather;

import com.google.gson.Gson;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;


public class WeatherUtil {

    private static final String WEATHER_SERVICE_URL = "http://opendata.netcetera.com/smn/smn/";

    public static WeatherStationGson getWeather(String city) throws Exception {

        if (city.length() > 3) {
            throw new Exception("city arg is a bit too long");
        }

        return new Gson().fromJson(httpGet(WEATHER_SERVICE_URL + city), WeatherStationGson.class);
    }


    public static String httpGet(String urlStr) throws IOException {
        URL url = new URL(urlStr);
        HttpURLConnection conn =
                (HttpURLConnection) url.openConnection();

        if (conn.getResponseCode() != 200) {
            throw new IOException(conn.getResponseMessage());
        }

        BufferedReader rd = new BufferedReader(
                new InputStreamReader(conn.getInputStream()));
        StringBuilder sb = new StringBuilder();
        String line;
        while ((line = rd.readLine()) != null) {
            sb.append(line);
        }
        rd.close();

        conn.disconnect();
        return sb.toString();
    }
}
