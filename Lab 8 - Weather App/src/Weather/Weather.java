package Weather;

import Location.Location;

public class Weather {
    private double temperature;
    private String weather_condition;
    private Location location;

    public Weather(double temperature, String wc, Location location){
        this.temperature = temperature;
        this.weather_condition = wc;
        this.location = location;
    }

    public void printWeather(){
        System.out.println("Location: " + location.getCity() +
                            "\nTemperature: " + temperature +
                            "\nWeather: " + weather_condition +
                            "\nLatitude: " + location.getLatitude() +
                            "\nLongitude: " + location.getLongitude());
    }
}
