package java_single_multidimensional_array;

import java.util.Scanner;

public class ATM {

    static int balance = 5000;

    static Scanner sc = new Scanner(System.in);

    // Method to check balance
    static void checkBalance() {
        System.out.println("Balance = Rs." + balance);
    }

    // Method to deposit money
    static void deposit() {
        System.out.print("Enter deposit amount: ");
        int amount = sc.nextInt();

        if (amount > 0) {
            balance = balance + amount;
            System.out.println("Deposit successful");
            System.out.println("New Balance = Rs." + balance);
        } else {
            System.out.println("Invalid amount");
        }
    }

    // Method to withdraw money
    static void withdraw() {
        System.out.print("Enter withdrawal amount: ");
        int amount = sc.nextInt();

        if (amount > 0 && amount <= balance) {
            balance = balance - amount;
            System.out.println("Withdrawal successful");
            System.out.println("New Balance = Rs." + balance);
        } else {
            System.out.println("Invalid amount or insufficient balance");
        }
    }

    public static void main(String[] args) {

        int choice;

        do {
            System.out.println("\n===== ATM MENU =====");
            System.out.println("1. Check Balance");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Exit");

            System.out.print("Choose an option: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    checkBalance();
                    break;

                case 2:
                    deposit();
                    break;

                case 3:
                    withdraw();
                    break;

                case 4:
                    System.out.println("Thank you for using ATM");
                    break;

                default:
                    System.out.println("Invalid choice");
            }

        } while (choice != 4);

        sc.close();
    }
}
