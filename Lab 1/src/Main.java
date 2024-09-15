public class Main {
    public static void main(String[] args) {

        // Create a few RideTypes (Carpool, Luxury, Bike)
        RideType carpool = new RideType("Carpool", "Shared", 50.0, 10.0, 5.0, 4);
        RideType luxury = new RideType("Luxury", "Default", 200.0, 15.0, 10.0, 4);
        RideType bike = new RideType("Bike", "Default", 30.0, 5.0, 3.0, 1);

        // Create Riders
        Rider rider1 = new Rider(1, "Alvee");
        Rider rider2 = new Rider(2, "Mehedi");

        // Create Drivers
        Driver driver1 = new Driver(1, "Nirjhar", carpool);
        Driver driver2 = new Driver(2, "Nahiyan", luxury);
        Driver driver3 = new Driver(3, "Mahin", bike);

        // Assign Payment Methods for Riders
        PaymentMethod cardPayment = new CreditCard("1234-5678-9876-5432", "Mehedi", "12/25", 123);
        rider2.setPreferredPaymentMethod(cardPayment);

        PaymentMethod paypalPayment = new PayPal("alvee@madman.com");
        rider1.setPreferredPaymentMethod(paypalPayment);

        // Riders Request Rides
        Trip trip1 = rider1.requestRide("Mirpur", "BoardBazar", carpool);
        Trip trip2 = rider2.requestRide("Banani", "Uttara", bike);

        // Drivers Accept Rides
        driver1.acceptRide(trip1);
        driver3.acceptRide(trip2);

        // Trips start and complete
        trip1.startTrip();
        trip1.completeTrip(50, 50);
        rider1.makePayment(trip1.calculateFare());

        trip2.startTrip();
        trip2.completeTrip(70, 70);
        rider2.makePayment(trip2.calculateFare());

        // Riders rate drivers, Drivers rate riders
        rider1.rateDriver(driver1, 5.0);
        driver1.rateRider(rider1, 4.5);

        rider2.rateDriver(driver3, 4.0);
        driver3.rateRider(rider2, 4.8);

        System.out.println("Ratings: ");
        System.out.print("Driver ");
        System.out.println(driver1.getName() + " " + driver1.getRating());
        System.out.print("Driver ");
        System.out.println(driver3.getName() + " " + driver3.getRating());
        System.out.print("Rider ");
        System.out.println(rider1.getName() + " " + rider1.getRating());
        System.out.print("Rider ");
        System.out.println(rider2.getName() + " " + rider2.getRating());

        // Admin
        Admin admin = new Admin(1, "Adid");
        admin.trips.add(trip1);
        admin.trips.add(trip2);

        System.out.println("-- Admin --");
        System.out.println("Trip History: ");
        admin.viewTripHistory();

        System.out.println("Trip History for a specific Rider (Bob): ");
        admin.viewTripHistory(rider1);

        System.out.println("Trip History for a specific Driver (Alice): ");
        admin.viewTripHistory(driver1);
    }
}
