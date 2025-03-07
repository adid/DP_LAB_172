package Location;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

import org.json.JSONObject;

public class GeoLocation{
    private static final String WEATHERSTACK_API_KEY = "230f5a5057217a5ef2dc1f7746360d22";

    public static Location getLocationByCity (String city) {
        try {
            String urlString = "http://api.weatherstack.com/current?access_key=" + WEATHERSTACK_API_KEY + "&query=" + city;
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
            JSONObject location = new JSONObject("location");

            double latitude = location.getDouble("lat");
            double longitude = location.getDouble("lon");

            return new Location(city, latitude, longitude);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

}
