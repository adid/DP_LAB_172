public class Driver extends User{
    private RideType vehicleType;
    private double rating;
    private int trips;
    private boolean availability;

    public Driver(int id, String name, RideType vehicleType) {
        super(id , name);
        this.vehicleType = vehicleType;
        this.rating = 0;
        this.availability = false;
    }



    public void setAvailable(Boolean av)
    {
        this.availability= av;
    }

    public int getTrips() {
        return trips;
    }

    public void setTrips(int trips){
        this.trips = trips;
    }

    public double getRating() {
        return rating;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }

    public void acceptRide(Trip trip) {
        setAvailable(false);
        trip.assignDriver(this);
    }

    public void rateRider(Rider rider, double rating) {
        double getRating = rider.getRating();
        int getTrips= rider.getTrips();

        double totalRating = getTrips*getRating + rating;
        int totalTrips = getTrips+1;

        rider.setTrips(totalTrips);
        rider.setRating(totalRating/totalTrips);
    }

    public void startTrip(Trip trip) {
        trip.startTrip();
    }

    @Override
    public void sendNotification(String message) {
        System.out.println("Notification for Driver " + getName() + ": " + message);
    }
}
