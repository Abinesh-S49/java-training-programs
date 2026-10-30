package java_interface;

public class AutoCab extends Customer implements CabBooking {

    public AutoCab(String customerName, double distance) {
        super(customerName, distance);
    }

    @Override
    public void bookRide() {
        System.out.println("Auto Cab booked successfully!");
    }

    @Override
    public double calculateFare() {
        return distance * 15;
    }
}