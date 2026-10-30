package java_interface_ex2;

public class ShoppingPaymentSystem {

    public static void main(String[] args) {

        // UPI Payment
        PaymentGateway upi = new UPIPayment("Aji", 1001, 5000);

        System.out.println("----- UPI PAYMENT -----");

        ((Customer) upi).displayOrderDetails();

        upi.processPayment();

        double upiFee = upi.calculateTransactionFee();

        System.out.println("Transaction Fee: Rs." + upiFee);
        System.out.println("Total Amount: Rs." + (5000 + upiFee));

        upi.generateReceipt();


        // Card Payment
        PaymentGateway card = new CardPayment("Vij", 1002, 8000);

        System.out.println("\n----- CARD PAYMENT -----");

        ((Customer) card).displayOrderDetails();

        card.processPayment();

        double cardFee = card.calculateTransactionFee();

        System.out.println("Transaction Fee: Rs." + cardFee);
        System.out.println("Total Amount: Rs." + (8000 + cardFee));

        card.generateReceipt();


        // Wallet Payment
        PaymentGateway wallet = new WalletPayment("Suj", 1003, 3000);

        System.out.println("\n----- WALLET PAYMENT -----");

        ((Customer) wallet).displayOrderDetails();

        wallet.processPayment();

        double walletFee = wallet.calculateTransactionFee();

        System.out.println("Transaction Fee: Rs." + walletFee);
        System.out.println("Total Amount: Rs." + (3000 + walletFee));

        wallet.generateReceipt();
    }
}