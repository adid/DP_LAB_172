import java.util.List;

public class Rider {
    private int id;
    private String name;
    private String location;
    private double rating;
    private String preferredPaymentMethod;

    private int trips;

    public Rider(int id, String name) {
        this.id = id;
        this.name = name;
        this.rating = 0;
        this.location = getlocation();
        this.preferredPaymentMethod = getPreferredPaymentMethod();
    }

    public Trip requestRide(String pickupLocation, String dropOffLocation ,RideType rideType) {
        return new Trip(this,pickupLocation,dropOffLocation,rideType);
    }

    public String getlocation() {
        location = "Google map jeta bolbe";
        return location;
    }

    public String getPreferredPaymentMethod(){
        return preferredPaymentMethod;
    }

    public void rateDriver(Driver driver, double rating) {
        double getRating = driver.getRating();
        int getTrips= driver.getTrips();

        double totalRating = getTrips*getRating + rating;
        int totalTrips = getTrips+1;
        driver.setTrips(totalTrips);

        driver.setRating(totalRating/totalTrips);
    }

    public void makePayment(PaymentMethod paymentMethod, double amount) {
        //code
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
