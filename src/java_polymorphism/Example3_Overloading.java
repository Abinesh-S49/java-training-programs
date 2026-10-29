package java_polymorphism;


class BankAccount {

    // 1. Deposit using cash
    void deposit(double amount) {
        System.out.println("Cash Deposit");
        System.out.println("Amount: Rs. " + amount);
        System.out.println("Cash deposited successfully");
    }

    // 2. Deposit using cheque
    void deposit(double amount, int chequeNo) {
        System.out.println("\nCheque Deposit");
        System.out.println("Amount: Rs. " + amount);
        System.out.println("Cheque Number: " + chequeNo);
        System.out.println("Cheque deposited successfully");
    }

    // 3. Deposit using UPI
    void deposit(double amount, String upiId, String bankName) {
        System.out.println("\nUPI Deposit");
        System.out.println("Amount: Rs. " + amount);
        System.out.println("UPI ID: " + upiId);
        System.out.println("Bank Name: " + bankName);
        System.out.println("UPI deposit successful");
    }
}

public class Example3_Overloading {

    public static void main(String[] args) {

        BankAccount account = new BankAccount();

        // Cash deposit
        account.deposit(5000);

        // Cheque deposit
        account.deposit(10000, 123456);

        // UPI deposit
        account.deposit(2500, "abinesh@upi", "IDFC Bank");
    }
}
