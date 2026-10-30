package java_interface;

public class Customer {

    String customerName;
    double distance;

    // Constructor
    public Customer(String customerName, double distance) {
        this.customerName = customerName;
        this.distance = distance;
    }

    // Display customer details
    public void displayCustomerDetails() {
        System.out.println("Customer Name: " + customerName);
        System.out.println("Travel Distance: " + distance + " KM");
    }
}