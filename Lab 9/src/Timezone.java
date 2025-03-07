public class Timezone implements IWidget{
    public String timezone;
    public int lon;

    public int lat;

    public String getTimezone(int lon, int lat){
        setLon(lon);
        setLat(lat);
        // code to fetch Timezone
        return "Updated Timezone";
    }
    @Override
    public void update() {
        timezone = getTimezone(getLon(), getLat());
    }

    public int getLon() {
        return lon;
    }

    public void setLon(int lon) {
        this.lon = lon;
    }

    public int getLat() {
        return lat;
    }

    public void setLat(int lat) {
        this.lat = lat;
    }
}