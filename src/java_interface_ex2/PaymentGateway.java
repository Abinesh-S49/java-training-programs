package java_interface_ex2;

public interface PaymentGateway {
	
	void processPayment();

    double calculateTransactionFee();

    void generateReceipt();

}
