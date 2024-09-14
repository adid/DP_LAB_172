public class Driver {
    private int id;
    private String name;
    private String vehicleType;
    private String location;
    private double rating;
    private int trips;
    private boolean availability;

    public Driver(int id, String name, String vehicleType, String location, double rating, boolean availability) {
        this.id = id;
        this.name = name;
        this.vehicleType = vehicleType;
        this.location = location;
        this.rating = rating;
        this.availability = availability;
    }

    public int getTrips() {
        return trips;
    }

    public int setTrips(int trips){
        this.trips = trips;
    }

    public double getRating() {
        return rating;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }

    public void acceptRide(Trip trip) {
        //code
    }

    public void rateRider(Rider rider, double rating) {
        //code
    }

    public void updateLocation(String newLocation) {
        //code
    }

    public void startTrip(Trip trip) {
        //code
    }

}
