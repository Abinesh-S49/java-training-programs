package java_interface;

public class CabBookingSystem {

    public static void main(String[] args) {

        // Mini Cab Booking
        MiniCab mini = new MiniCab("Aji", 10);

        System.out.println("----- MINI CAB -----");

        mini.displayCustomerDetails();
        mini.bookRide();

        System.out.println("Total Fare: Rs." + mini.calculateFare());


        // Auto Cab Booking
        AutoCab auto = new AutoCab("Vij", 10);

        System.out.println("\n----- AUTO CAB -----");

        auto.displayCustomerDetails();
        auto.bookRide();

        System.out.println("Total Fare: Rs." + auto.calculateFare());


        // Sedan Cab Booking
        SedanCab sedan = new SedanCab("Suj", 10);

        System.out.println("\n----- SEDAN CAB -----");

        sedan.displayCustomerDetails();
        sedan.bookRide();

        System.out.println("Total Fare: Rs." + sedan.calculateFare());
    }
}