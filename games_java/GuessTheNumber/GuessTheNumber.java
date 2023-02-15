package games_java.GuessTheNumber;

import java.util.Scanner;

public class GuessTheNumber {
	public static void main(String[] args) {
		// create the user input scanner object
		Scanner sc = new Scanner(System.in);

		// your code goes here!
		double num = Math.random() * 100;
		num = Math.floor(num) + 1;

		int guess = 0;

		while (guess != num) {
			System.out.println("Guess the Number 1-100");
			guess = sc.nextInt();
			if (guess == num) {
				System.out.println("u got this");
			} else if (guess < num) {
				System.out.println("your guess was too low");
			} else if (guess > num) {
				System.out.println("your guess was too high");
			}
		}

		sc.close(); // close the scanner
		System.exit(0); // exit the program
	}
}
