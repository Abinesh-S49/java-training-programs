package java_while_loop;

import java.util.Random;
import java.util.Scanner;

public class NumberGuessing {

	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
	        Random random = new Random();

	        int number = random.nextInt(10) + 1;
	        int guess = 0;
	        int attempts = 0;

	        while (attempts < 3) {
	            System.out.print("Guess a number (1-10): ");
	            guess = sc.nextInt();
	            attempts++;

	            if (guess == number) {
	                System.out.println("Correct! You won.");
	                break;
	            } else {
	                System.out.println("Wrong guess!");
	            }
	        }

	        if (attempts == 3 && guess != number) {
	            System.out.println("You lost! The number was " + number);
	        }

	        sc.close();
	}

}
