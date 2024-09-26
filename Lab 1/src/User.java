public abstract class User implements NotificationService{
    private int id;
    private String name;
    private String location;


    public User(int id, String name) {
        this.id = id;
        this.name = name;
        this.location = getLocation();
    }
    public abstract void sendNotification(String message);

    public String getLocation() {
        location = "Google map jeta bolbe";
        return location;
    }

    public void updateLocation(String newLocation) {
        this.location = newLocation;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }
}