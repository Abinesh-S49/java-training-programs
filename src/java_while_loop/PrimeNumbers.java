package java_while_loop;

import java.util.Scanner;

public class PrimeNumbers {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        int i = 2;
        boolean prime = true;

        if (n <= 1) {
            prime = false;
        }

        while (i <= n / i && prime) {
            if (n % i == 0) {
                prime = false;
            }
            i++;
        }

        if (prime) {
            System.out.println("Prime number");
        } else {
            System.out.println("Not a prime number");
        }

        sc.close();
	}

}
