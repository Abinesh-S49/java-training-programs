package java_interface_ex2;

public class WalletPayment extends Customer implements PaymentGateway {

    public WalletPayment(String customerName, int orderId, double orderAmount) {

        super(customerName, orderId, orderAmount);
    }

    @Override
    public void processPayment() {

        System.out.println("Payment processed through Digital Wallet");
    }

    @Override
    public double calculateTransactionFee() {

        return 5;
    }

    @Override
    public void generateReceipt() {

        System.out.println("Wallet Payment Receipt Generated");
    }
}
