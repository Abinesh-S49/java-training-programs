package java_single_multidimensional_array;

import java.util.Scanner;

public class HouseRentCalculation {

    // Method to calculate rent
    double calculateRent(double monthlyRent, int months) {
        return monthlyRent * months;
    }

    // Method to return lease amount
    double calculateLease(double leaseAmount) {
        return leaseAmount;
    }

    // Method to display house details
    void display(String name, String type, double amount) {
        System.out.println("\nOwner Name: " + name);
        System.out.println("House Type: " + type);
        System.out.println("Total Amount: Rs." + amount);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        HouseRentCalculation h = new HouseRentCalculation();

        System.out.print("Enter number of houses: ");
        int n = sc.nextInt();

        String[] owner = new String[n];
        String[] type = new String[n];
        double[] amount = new double[n];

        // Input using for loop
        for (int i = 0; i < n; i++) {

            System.out.println("\n--- House " + (i + 1) + " ---");

            System.out.print("Enter owner name: ");
            owner[i] = sc.next();

            System.out.println("1. 1 BHK");
            System.out.println("2. 2 BHK");
            System.out.println("3. Lease House");

            System.out.print("Choose house type (1-3): ");
            int choice = sc.nextInt();

            if (choice == 1) {

                type[i] = "1 BHK";
                double rent = 8000;

                System.out.println("1 BHK Rent = Rs.8000 per month");

                System.out.print("Enter number of months: ");
                int months = sc.nextInt();

                amount[i] = h.calculateRent(rent, months);

            } else if (choice == 2) {

                type[i] = "2 BHK";
                double rent = 12000;

                System.out.println("2 BHK Rent = Rs.12000 per month");

                System.out.print("Enter number of months: ");
                int months = sc.nextInt();

                amount[i] = h.calculateRent(rent, months);

            } else if (choice == 3) {

                type[i] = "Lease House";

                amount[i] = h.calculateLease(500000);

                System.out.println("Lease Amount = Rs.500000");

            } else {

                System.out.println("Invalid choice! Please try again.");
                i--;
            }
        }

        // Display all house details
        System.out.println("\n===== HOUSE REPORT =====");

        for (int i = 0; i < n; i++) {
            h.display(owner[i], type[i], amount[i]);
        }

        sc.close();
    }
}