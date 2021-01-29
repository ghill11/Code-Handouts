package class04;

public class VariableDemo {
	public static void main(String[] args) {
		// String concatenation
		System.out.println("Hello class, " + "today we'll learn about data types.");
		
		System.out.println("Today is the " + 3 + "rd day of class.");
		
		System.out.println("Today is the " + 2 + 1 + "rd day of class.");
		
		// Escape sequences
		System.out.println("\tThis is tabbed over. \nThis is on a 2nd line.");
		
		// Variable declarations for each primitive data type
		byte asciiForA = 65;
		short smallNumber = 10000;
		int largeNumber = 2000000000;
		long hugeNumber = 4000000000000000000l;
		float largeDecimalNumber = 123456.7890987f;
		double hugeDecimalNumber = 1234567890.0987654321;
		boolean yesOrNo = true;
		char oneLetter = 'A';
		
		// Variable declarations for String data type
		String firstName = new String("Jeff");
		String lastName = "Hill";
		
		// Wrapper classes, auto-boxing & auto-unboxing
		Integer currentYear = new Integer(2018);
		Integer nextYear = 2019;
		Integer nextPresidentialElectionYear = Integer.parseInt("2020");
		int lastYear = new Integer(2017);
		Integer graduationYear = 2015;
	} // end main
} // end VariableDemo