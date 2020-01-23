package class07;

import java.util.ArrayList;

public class SimpleDataStructureDemo {

	public static void main(String[] args) {
		// array
		System.out.println("---------------------- ARRAY ----------------------");
		int[] lotsOfNumbers = new int[5];
		lotsOfNumbers[0] = 5;
		lotsOfNumbers[1] = 10;
		lotsOfNumbers[2] = 15;
		lotsOfNumbers[3] = 20;
		lotsOfNumbers[4] = 25;
		System.out.println(lotsOfNumbers[0] + ", " + lotsOfNumbers[1] + ", "  + lotsOfNumbers[2] + ", "  + 
			lotsOfNumbers[3] + ", "  + lotsOfNumbers[4]);
		
		// array initializer list
		System.out.println("---------------------- ARRAY INITIALIZER LIST ----------------------");
		int[] lotsOfNumbers2 = {10, 20, 30, 40, 50};
		System.out.println(lotsOfNumbers2[0] + ", " + lotsOfNumbers2[1] + ", "  + lotsOfNumbers2[2] + ", "  + 
			lotsOfNumbers2[3] + ", "  + lotsOfNumbers2[4]);
		
		// arraylist
		System.out.println("---------------------- ARRAYLIST ----------------------");
		ArrayList<Integer> allNumbers = new ArrayList<Integer>();
		allNumbers.add(100);
		allNumbers.add(200);
		allNumbers.add(300);
		allNumbers.add(400);
		allNumbers.add(500);
		System.out.println(allNumbers.get(0) + ", " + allNumbers.get(1) + ", " + allNumbers.get(2) + ", " + 
			allNumbers.get(3) + ", " + allNumbers.get(4));
	} // end main

} // end SimpleDataStructureDemo