package class07;

import java.util.Random;
import java.util.Scanner;

public class RandomDemo {

	public static void main(String[] args) {
		// random integer generator
		System.out.println("---------------------- RANDOM INTEGER GENERATOR ----------------------");
		Scanner userInput = new Scanner(System.in);
		System.out.println("Please enter the maximum integer you want: ");
		int max = Integer.valueOf(userInput.nextLine()); // this is called function chaining
		Random rng = new Random();
		System.out.println("A random integer between 0 and " + max + " is: " + rng.nextInt(max));
		
		// random integer generator
		System.out.println("---------------------- RANDOM DECIMAL GENERATOR ----------------------");
		double randomDecimal = rng.nextDouble() * 10;
		System.out.println("A random decimal value between 0 and 10 is: " + randomDecimal);
		
		// random generator offsets
		System.out.println("---------------------- RANDOM GENERATOR OFFSETS ----------------------");
		System.out.println("Please enter the minimum integer to generate: ");
		int minimum = Integer.valueOf(userInput.nextLine());
		System.out.println("Please enter the maximum integer to generate: ");
		int maximum = Integer.valueOf(userInput.nextLine());
		int window = maximum - minimum;
		int example = rng.nextInt(window) + minimum;
		System.out.println("A random integer between " + minimum + " and " + maximum + " is: " + example);
		
		System.out.println("Please enter the minimum decimal to generate: ");
		double minimum2 = Double.valueOf(userInput.nextLine());
		System.out.println("Please enter the minimum decimal to generate: ");
		double maximum2 = Double.valueOf(userInput.nextLine());
		double window2 = maximum2 - minimum2;
		double example2 = rng.nextDouble() * window2 + minimum2;
		System.out.println("A random decimal between " + minimum2 + " and " + maximum2 + " is: " + example2);
		
		// Math class functions
		System.out.println("---------------------- MATH CLASS FUNCTIONS ----------------------");
		System.out.println(Math.sqrt(25.0));
		System.out.println(Math.abs(-27));
		System.out.println(Math.pow(2, 3));
		
	} // end RandomDemo

} // end main