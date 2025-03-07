import Location.Location;
import Location.IPLocation;
import Location.GeoLocation;
import Weather.Weather;
import Weather.WeatherStack;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Select location method: 1. By IP, 2. By City, 3. Exit");
            int choice = scanner.nextInt();
            scanner.nextLine();

            if (choice == 3) break;

            Location location = null;
            if (choice == 1) {
                location = IPLocation.getLocationByIP();
            } else if (choice == 2) {
                System.out.print("Enter city name: ");
                String city = scanner.nextLine();
                location = GeoLocation.getLocationByCity(city);
            }

            if(location!= null){
                System.out.println("City: " + location.getCity() + "\nLatitude: " + location.getLatitude() + "\nLongitude: " + location.getLongitude());

                Weather weather = WeatherStack.getWeather(location);
                weather.printWeather();
            }
        }
        scanner.close();
    }
}