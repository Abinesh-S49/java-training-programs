package java_training_programs;

import java.util.Scanner;

public class ATM {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int balance = 5000;

        System.out.println("1. Check Balance");
        System.out.println("2. Deposit");
        System.out.println("3. Withdraw");
        System.out.println("4. Exit");

        System.out.print("Choose an option: ");
        int choice = sc.nextInt();

        switch (choice) {
            case 1:
                System.out.println("Balance = Rs." + balance);
                break;

            case 2:
                System.out.print("Enter deposit amount: ");
                int deposit = sc.nextInt();

                if (deposit > 0) {
                    balance = balance + deposit;
                    System.out.println("New Balance = Rs." + balance);
                } else {
                    System.out.println("Invalid amount");
                }
                break;

            case 3:
                System.out.print("Enter withdrawal amount: ");
                int withdraw = sc.nextInt();

                if (withdraw > 0 && withdraw <= balance) {
                    balance = balance - withdraw;
                    System.out.println("New Balance = Rs." + balance);
                } else {
                    System.out.println("Invalid amount or insufficient balance");
                }
                break;

            case 4:
                System.out.println("Thank you for using ATM");
                break;

            default:
                System.out.println("Invalid choice");
        }

        sc.close();
    }
}
