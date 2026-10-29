package java_polymorphism;


class CarRental {

    // 1. Rental based on hours
    void calculateRental(int hrs) {
        double amountPerHour = 200;
        double totalAmount = hrs * amountPerHour;

        System.out.println("Hourly Rental");
        System.out.println("Hours: " + hrs);
        System.out.println("Total Amount: Rs. " + totalAmount);
    }

    // 2. Rental based on days
    void calculateRental(boolean isDaily, int days) {

        double amountPerDay = 1500;

        if (isDaily) {
            double totalAmount = days * amountPerDay;

            System.out.println("\nDaily Rental");
            System.out.println("Days: " + days);
            System.out.println("Total Amount: Rs. " + totalAmount);
        } else {
            System.out.println("Daily rental is not selected");
        }
    }

    // 3. Rental with or without a driver
    void calculateRental(int days, double amountPerDay,
                         boolean isDriver) {

        double driverChargePerDay = 500;
        double totalAmount = days * amountPerDay;

        if (isDriver) {
            totalAmount = totalAmount
                    + (days * driverChargePerDay);
        }

        System.out.println("\nRental With Driver Option");
        System.out.println("Days: " + days);
        System.out.println("Amount Per Day: Rs. " + amountPerDay);
        System.out.println("Driver Required: " + isDriver);
        System.out.println("Total Amount: Rs. " + totalAmount);
    }
}

public class Example1_Overloading {

    public static void main(String[] args) {

        CarRental car = new CarRental();

        // Rental for hours
        car.calculateRental(5);

        // Rental for days
        car.calculateRental(true, 3);

        // Rental for days with a driver
        car.calculateRental(2, 2000, true);
    }
}
