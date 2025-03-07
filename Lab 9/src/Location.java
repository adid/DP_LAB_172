public class Location implements IWidget{
    public String location;
    public int lon;

    public int lat;

    public String getLocation(int lon, int lat){
        setLon(lon);
        setLat(lat);
        // code to fetch location
        return "Updated Location";
    }
    @Override
    public void update() {
        location = getLocation(getLon(), getLat());
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
