public class RideType {
    private String type;
    private double baseFare;
    private int capacity;

    public RideType(String type, double baseFare, int capacity) {
        this.type = type;
        this.baseFare = baseFare;
        this.capacity = capacity;
    }

    public double getBaseFare() {
        return baseFare;
    }
}
