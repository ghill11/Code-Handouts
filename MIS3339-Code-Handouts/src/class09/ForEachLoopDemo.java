package class09;

import java.util.ArrayList;
import java.util.Arrays;

public class ForEachLoopDemo {
	
	public static void main(String[] args) {
		String monthString = "January, February, March, April, May, June, July, "
				+ "August, September, October, November, December"; 
		
		// easy way to split a String into an ArrayList
		ArrayList<String> months = new ArrayList<String>(Arrays.asList(monthString.split(", ")));
		
		// enhanced for loop example
		System.out.println("---------------------- ENHANCED FOR LOOP ----------------------");
		for (String eachOne: months) {
			System.out.println(eachOne);
		} // end for
		
		// traditional loop example
		System.out.println("---------------------- TRADITIONAL FOR LOOP ----------------------");
		for (int i = 0; i < months.size(); i++) {
			System.out.println(months.get(i));
		} // end for
		
	} // end main
	
} // end ForEachLoopDemo