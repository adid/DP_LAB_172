import java.util.List;

public class Rider {
    private int id;
    private String name;
    private String location;
    private double rating = 0;
    private String preferredPaymentMethod;

    public Rider(int id, String name) {
        this.id = id;
        this.name = name;
        this.location = getlocation();
        this.preferredPaymentMethod = getPreferredPaymentMethod();
    }

    public Trip requestRide(String pickupLocation, RideType rideType) {
        String dropOffLocation = setDropOffLocation();
        return new Trip(this,pickupLocation,dropOffLocation,rideType);
    }

    public String setDropOffLocation(){
        return "User Input";
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

}
