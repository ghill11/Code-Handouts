package class07;

import java.util.Scanner;

public class UserInteractionDemo {

	public static void main(String[] args) {
		// simple user interaction
		System.out.println("---------------------- SIMPLE USER INTERACTION ----------------------");
		Scanner userInput = new Scanner(System.in);
		System.out.println("Please enter your first name: ");
		String fName = userInput.nextLine();
		System.out.println("Hello " + fName + ", nice to meet you.");
		
		// interaction with data conversion
		System.out.println("---------------------- INTERACTION WITH DATA CONVERSION ----------------------");
		System.out.println("Please enter your age in years: ");
		String age = userInput.nextLine();
		System.out.println("In 10 years you will be " + (Integer.valueOf(age) + 10) + " years old.");
		
		// string manipulations
		System.out.println("---------------------- STRING MANIPULATIONS ----------------------");
		System.out.println(fName.toUpperCase());
		System.out.println(fName.toLowerCase());
		System.out.println(fName.substring(2));
		System.out.println(fName.charAt(2));
		
	} // end main

} // end UserInteractionDemo