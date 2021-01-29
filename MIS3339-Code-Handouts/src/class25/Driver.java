package class25;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Scanner;

public class Driver {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		System.out.println("********** WRONG ANSWERS **********");
		System.out.println("********** INTEGER OVERFLOW **********");
		int a = 2000000000;
		int b = 2000000000;
		System.out.println("a + b = " + (a+b));
		System.out.println("********** FLOATING POINT ROUNDING **********");
		float a1 = 1234567.12f;
		float b1 = 7654321.65f;
		System.out.println("a1 + b1 = " + (a1+b1));
		System.out.println("********** DOUBLE IMPRECISION **********");
		double a2 = 1.0;
		double b2 = 1.1;
		System.out.println("a2 - b2 = " + (a2-b2));

		System.out.println("********** CORRECT ANSWERS **********");
		BigInteger a3 = new BigInteger("2000000000");
		BigInteger b3 = new BigInteger("2000000000");
		System.out.println("a3 + b3 = " + a3.add(b3));
		double a4 = 1234567.12;
		double b4 = 7654321.65;
		System.out.println("a4 + b4 = " + (a4+b4));
		BigDecimal a5 = new BigDecimal("1.0");
		BigDecimal b5 = new BigDecimal("1.1");
		System.out.println("a5 - b5 = " + a5.subtract(b5));
		
		System.out.println("********** EXCEPTION EXAMPLE **********");
		//System.out.println("5 / 0 = " + 5/0);
		
		System.out.println("How much sales did we process today?");
		int sales = Integer.valueOf(in.nextLine());
		System.out.println("How many customers did we serve today?");
		int customers = Integer.valueOf(in.nextLine());
		// this line works correctly, but "crashes" if we had 0 sales <-- divide by 0
		System.out.println("The average sale today was: $" + sales/customers);
		
		System.out.println("********** EXCEPTION HANDLING EXAMPLE **********");
		try {
			System.out.println("5 / 0 = " + 5/0);
		} catch (Exception e) {
			System.out.println("oops... this happened: " + e.getMessage());
			e.printStackTrace();
		} // end catch
		
		System.out.println("********** EXCEPTIONAL SITUATION EXAMPLE **********");
		System.out.println("Please enter a number: ");
		int grade = Integer.valueOf(in.nextLine());
		System.out.println("You entered the number: " + grade);
		
		System.out.println("********** EXCEPTIONAL SITUATION SIMPLE EXAMPLE **********");
		try {
			System.out.println("Please enter a number: ");
			int grade2 = Integer.valueOf(in.nextLine());
			System.out.println("You entered the number: " + grade2);
		} catch (Exception e) {
			System.out.println("I said enter a number!");
		} // end catch
		
		System.out.println("********** EXCEPTIONAL SITUATION PROPER EXAMPLE **********");
		boolean keepGoing = true;
		// define grade3 here due to scope!
		int grade3 = 0;
		while (keepGoing) {
			try {
				System.out.println("Please enter a number: ");
				grade3 = Integer.valueOf(in.nextLine()); // if the entry isn't valid, an exception is generated
				// if we make it to this line of code, we know an integer was entered!
				// set the sentinel to let us out of the loop
				keepGoing = false;
			} catch (Exception e) {
				System.out.println("I said enter a number!");
			} // end catch
		} // end while
		System.out.println("You entered the number: " + grade3);

		System.out.println("********** FINALLY EXAMPLE **********");
		boolean keepGoing2 = true;
		// define grade4 here due to scope!
		int grade4 = 0;
		while (keepGoing2) {
			try {
				System.out.println("Please enter a number: ");
				grade4 = Integer.valueOf(in.nextLine()); // if the entry isn't valid, an exception is generated
				// if we make it to this line of code, we know an integer was entered!
				// set the sentinel to let us out of the loop
				keepGoing2 = false;
			} catch (Exception e) {
				System.out.println("I said enter a number!");
			} finally {
				System.out.println("In the finally block!");
			} // end finally
		} // end while
		System.out.println("You entered the number: " + grade4);	
	} // end main
} // end Driver