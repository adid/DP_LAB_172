public class Trip {
    private int id;
    private String pickupLocation;
    private String dropOffLocation;
    private RideType rideType;
    private String status;
    private double fare;
    private double distance;
    private String rideTime;
    private Rider rider;
    private Driver driver;

    public Trip(Rider rider, String pickupLocation, String dropOffLocation, RideType rideType) {
        this.rider = rider;
        this.pickupLocation = pickupLocation;
        this.dropOffLocation = dropOffLocation;
        this.rideType = rideType;
        this.status = "Pending";
    }

    public void calculateFare() {

        int surge;

        this.fare = rideType.getBaseFare() + distance*50;
    }

    public void assignDriver(Driver driver) {
        this.driver = driver;
        this.status = "Accepted";
        NotificationService.sendNotification("Driver assigned for your trip.");
    }

    public void startTrip() {
        this.status = "In Progress";
        NotificationService.sendNotification("Your trip has started.");
    }

    public void completeTrip() {
        this.status = "Completed";
        calculateFare();
        NotificationService.sendNotification("Your trip is complete.");
    }
}
