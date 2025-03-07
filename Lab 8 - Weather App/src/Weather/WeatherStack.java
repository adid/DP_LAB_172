package Weather;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

import Location.Location;
import org.json.JSONObject;

public class WeatherStack {
    private static final String WEATHERSTACK_API_KEY = "230f5a5057217a5ef2dc1f7746360d22";

    public static Weather getWeather(Location location) {
        try {
            String urlString = "http://api.weatherstack.com/current?access_key=" + WEATHERSTACK_API_KEY + "&query=" + location.getCity();
            HttpURLConnection conn = (HttpURLConnection) new URL(urlString).openConnection();
            conn.setRequestMethod("GET");

            BufferedReader reader = new BufferedReader(new InputStreamReader(conn.getInputStream()));
            StringBuilder response = new StringBuilder();
            String line;
            while ((line = reader.readLine()) != null) {
                response.append(line);
            }
            reader.close();

            JSONObject jsonResponse = new JSONObject(response.toString());
            double temperature = jsonResponse.getJSONObject("current").getDouble("temperature");
            String weatherConditions = jsonResponse.getJSONObject("current").getString("weather_descriptions");

            return new Weather(temperature, weatherConditions, location);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

}
