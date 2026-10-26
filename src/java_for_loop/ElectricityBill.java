package java_for_loop;

import java.util.Scanner;

public class ElectricityBill {

	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);

	        double totalBill = 0;

	        for (int month = 1; month <= 6; month++) {
	            System.out.print("Enter units for month " + month + ": ");
	            int units = sc.nextInt();

	            double bill = units * 5;
	            totalBill = totalBill + bill;

	            System.out.println("Bill = Rs. " + bill);
	        }

	        System.out.println("Total bill for 6 months = Rs. " + totalBill);

	        sc.close();
	}

}
