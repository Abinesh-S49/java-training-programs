package java_interface_ex2;

public class UPIPayment extends Customer implements PaymentGateway {

    public UPIPayment(String customerName, int orderId, double orderAmount) {

        super(customerName, orderId, orderAmount);
    }

    @Override
    public void processPayment() {

        System.out.println("Payment processed through UPI");
    }

    @Override
    public double calculateTransactionFee() {

        return orderAmount * 0.01;
    }

    @Override
    public void generateReceipt() {

        System.out.println("UPI Payment Receipt Generated");
    }
}
