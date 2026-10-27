package java_single_multidimensional_array;

import java.util.Scanner;

public class PatientTemperature {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of patients: ");
        int n = sc.nextInt();

        String[] names = new String[n];
        double[] temperature = new double[n];

        // Get patient details
        for (int i = 0; i < n; i++) {
            sc.nextLine();

            System.out.print("Enter patient name: ");
            names[i] = sc.nextLine();

            System.out.print("Enter temperature in Celsius: ");
            temperature[i] = sc.nextDouble();
        }

        // Check temperature
        System.out.println("\n===== PATIENT TEMPERATURE REPORT =====");

        for (int i = 0; i < n; i++) {
            System.out.println("\nPatient Name: " + names[i]);
            System.out.println("Temperature: " + temperature[i] + " C");

            if (temperature[i] >= 38.0) {
                System.out.println("Status: Fever");
                System.out.println("Decision: Medical review required");
            } else {
                System.out.println("Status: No fever detected");
                System.out.println("Decision: Continue the prescribed treatment as directed");
            }
        }

        sc.close();
    }
}