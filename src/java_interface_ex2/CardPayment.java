package java_interface_ex2;

public class CardPayment extends Customer implements PaymentGateway {

    public CardPayment(String customerName, int orderId, double orderAmount) {

        super(customerName, orderId, orderAmount);
    }

    @Override
    public void processPayment() {

        System.out.println("Payment processed through Debit/Credit Card");
    }

    @Override
    public double calculateTransactionFee() {

        return orderAmount * 0.02;
    }

    @Override
    public void generateReceipt() {

        System.out.println("Card Payment Receipt Generated");
    }
}