package java_training_programs;

import java.util.Scanner;

public class Resort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Welcome to Resort");
        System.out.println("1. Standard Room - Rs.2000/day");
        System.out.println("2. Deluxe Room - Rs.3000/day");

        System.out.print("Choose room type: ");
        int room = sc.nextInt();

        int price = 0;

        switch (room) {
            case 1:
                price = 2000;
                System.out.println("Standard Room selected");

                switch (1) {
                    case 1:
                        System.out.print("Enter number of days: ");
                        int days1 = sc.nextInt();

                        if (days1 > 0) {
                            System.out.println(
                                "Total cost = Rs." + (price * days1));
                        } else {
                            System.out.println("Invalid number of days");
                        }
                        break;
                }
                break;

            case 2:
                price = 3000;
                System.out.println("Deluxe Room selected");

                switch (1) {
                    case 1:
                        System.out.print("Enter number of days: ");
                        int days2 = sc.nextInt();

                        if (days2 > 0) {
                            System.out.println(
                                "Total cost = Rs." + (price * days2));
                        } else {
                            System.out.println("Invalid number of days");
                        }
                        break;
                }
                break;

            default:
                System.out.println("Invalid room choice");
        }

        sc.close();
    }
}
