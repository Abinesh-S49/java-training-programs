package java_interface;

public class SedanCab extends Customer implements CabBooking {

    public SedanCab(String customerName, double distance) {
        super(customerName, distance);
    }

    @Override
    public void bookRide() {
        System.out.println("Sedan Cab booked successfully!");
    }

    @Override
    public double calculateFare() {
        return distance * 20;
    }
}