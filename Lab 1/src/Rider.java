import java.util.List;

public class Rider {
    private int id;
    private String name;
    private String location;
    private double rating;
    private PaymentMethod preferredPaymentMethod;

    private int trips;

    public Rider(int id, String name) {
        this.id = id;
        this.name = name;
        this.rating = 0;
        this.location = getlocation();
    }

    public Trip requestRide(String pickupLocation, String dropOffLocation ,RideType rideType) {
        return new Trip(this,pickupLocation,dropOffLocation,rideType);
    }

    public void rateDriver(Driver driver, double rating) {
        double getRating = driver.getRating();
        int getTrips= driver.getTrips();

        double totalRating = getTrips*getRating + rating;
        int totalTrips = getTrips+1;
        driver.setTrips(totalTrips);

        driver.setRating(totalRating/totalTrips);
    }

    public void setPreferredPaymentMethod(PaymentMethod preferredPaymentMethod) {
        this.preferredPaymentMethod = preferredPaymentMethod;
    }

    public void makePayment(double amount) {
        preferredPaymentMethod.processPayment(amount);
    }
    public String getlocation() {
        location = "Google map jeta bolbe";
        return location;
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

}
