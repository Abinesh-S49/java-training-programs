package java_interface;

public class MiniCab extends Customer implements CabBooking {

    public MiniCab(String customerName, double distance) {
        super(customerName, distance);
    }

    @Override
    public void bookRide() {
        System.out.println("Mini Cab booked successfully!");
    }

    @Override
    public double calculateFare() {
        return distance * 10;
    }
}