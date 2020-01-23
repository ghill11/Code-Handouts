package class06;

public class IterationDemo {

	public static void main(String[] args) {
		// While loop
		int criteria = 5;
		while (criteria < 10) {
			System.out.println("In the loop, criteria is: " + criteria);
			criteria += 1;
		} // end while

		// For loop
		int maxTimes = 4;
		for (int i = 0; i <= maxTimes; i++) {
			System.out.println(i + " cycles of the loop.");
		} // end for

		// Do loop
		boolean moreItems = true;
		int counter = 0;
		do {
			System.out.println("BEEP! Scanned 1 item, " + counter++ + " total items.");
			if (counter > 10) {
				moreItems = false;
			} // end if
		} while (moreItems == true);
		
		// Switch
		String trafficLight = "Yellow";
		switch (trafficLight) {
			case "Green": System.out.println("Go!"); break;
			case "Yellow": System.out.println("Floor it, you got this!"); break;
			case "Red": System.out.println("Stop!"); break;
			default: System.out.println("The light is broken, follow 4-way stop rules.");
		} // end switch
		
		// Ternary operator
		int threshold = 72;
		int reading = 68;
		String feels = (reading < threshold)? "cold" : "hot";
		System.out.println("Today sure is " + feels + ".");
		
		// Nested ternary operator
		int coldThreshold = 45;
		int hotThreshold = 85;
		int today = 95;
		String feelsLike = (today < coldThreshold)? "cold" : 
			((today > hotThreshold)? "hot" : "warm");
		System.out.println("Today sure is " + feelsLike + ".");
		
	} // end main
} // end IterationDemo