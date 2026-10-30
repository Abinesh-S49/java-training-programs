package java_interface_ex2;

public class Customer {
	
	String customerName;
    int orderId;
    double orderAmount;

    // Constructor
    public Customer(String customerName, int orderId, double orderAmount) {

        this.customerName = customerName;
        this.orderId = orderId;
        this.orderAmount = orderAmount;
    }

    // Display order details
    public void displayOrderDetails() {

        System.out.println("Customer Name: " + customerName);
        System.out.println("Order ID: " + orderId);
        System.out.println("Order Amount: Rs." + orderAmount);
    }

}
