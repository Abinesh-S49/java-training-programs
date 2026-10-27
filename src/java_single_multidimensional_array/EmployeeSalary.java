package java_single_multidimensional_array;

import java.util.Scanner;

public class EmployeeSalary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of employees: ");
        int n = sc.nextInt();

        String[] names = new String[n];
        double[] salaries = new double[n];

        // Get employee details
        for (int i = 0; i < n; i++) {
            sc.nextLine();

            System.out.print("Enter employee name: ");
            names[i] = sc.nextLine();

            System.out.print("Enter employee salary: ");
            salaries[i] = sc.nextDouble();
        }

        // Assume first employee has highest and lowest salary
        int highest = 0;
        int lowest = 0;

        // Find highest and lowest paid employees
        for (int i = 1; i < n; i++) {
            if (salaries[i] > salaries[highest]) {
                highest = i;
            }

            if (salaries[i] < salaries[lowest]) {
                lowest = i;
            }
        }

        // Display highest paid employee
        System.out.println("\nHighest Paid Employee");
        System.out.println("Name: " + names[highest]);
        System.out.println("Salary: " + salaries[highest]);

        // Display lowest paid employee
        System.out.println("\nLowest Paid Employee");
        System.out.println("Name: " + names[lowest]);
        System.out.println("Salary: " + salaries[lowest]);

        sc.close();
    }
}