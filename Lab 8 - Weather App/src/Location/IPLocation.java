package Location;

import org.json.JSONObject;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Scanner;

public class IPLocation {
    private static final String IPSTACK_API_KEY = "08a74f5a3e82eba08296a1b5750d0b9d";

    public static Location getLocationByIP() throws Exception {
        // Step 1: Get user's IP address
        URL url = new URL("http://api.ipify.org/");
        HttpURLConnection conn = (HttpURLConnection) url.openConnection();
        conn.setRequestMethod("GET");

        Scanner sc = new Scanner(url.openStream());
        String ip = sc.next();
        sc.close();

        // Step 2: Get location details from IPStack using IP
        url = new URL("http://api.ipstack.com/" + ip + "?access_key=" + IPSTACK_API_KEY);
        conn = (HttpURLConnection) url.openConnection();
        conn.setRequestMethod("GET");

        sc = new Scanner(url.openStream());
        StringBuilder inline = new StringBuilder();
        while (sc.hasNext()) {
            inline.append(sc.nextLine());
        }
        sc.close();

        // Step 3: Parse JSON response to extract location information
        JSONObject json = new JSONObject(inline.toString());
        String city = json.getString("city");
        double latitude = json.getDouble("latitude");
        double longitude = json.getDouble("longitude");

        return new Location(city, latitude, longitude);
    }
}
