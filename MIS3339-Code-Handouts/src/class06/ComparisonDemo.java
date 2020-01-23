package class06;

public class ComparisonDemo {
	public static void main(String[] args) {
		// Comparing decimal type variables
		// Rounding
		double finalGrade = 89.49;
		if (Math.round(finalGrade) >= 90) {
			System.out.println("You got an A!");
		} else {
			System.out.println("You didn't get an A.");
		} // end else
		
		// Tolerance
		double STANDARD = 1.2;
		double TOLERANCE = 0.1;
		double width = 1.14;
		if (Math.abs(STANDARD - width) < TOLERANCE) {
			System.out.println("Within standards.");
		} else {
			System.out.println("Out of tolerance, try again.");
		} // end else
		
		// Comparing string type variables
		String firstWord = new String("First");
		String secondWord = new String("First");
		// wrong way
		if (firstWord == secondWord) {
			System.out.println("They're the same!");
		} else {
			System.out.println("They're not the same.");
		} // end else
		
		// correct way
		if (firstWord.equals(secondWord)) {
			System.out.println("They're the same!");
		} else {
			System.out.println("They're not the same.");
		} // end else
		
		// wrong way, but it works! <-- this is dangerous, don't follow this example!
		String thirdWord = "First";
		String fourthWord = "First";
		if (thirdWord == fourthWord) {
			System.out.println("They're the same!");
		} else {
			System.out.println("They're not the same.");
		} // end else		
	} // end main
} // end class ComparisonDemo