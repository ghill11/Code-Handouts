package class13;

import java.util.ArrayList;
import java.util.Collections;

public class Driver {
	public static void main(String[] args) {
		// example data member manipulation method 
		Student studentOne = new Student("Grace", true);
		
		// example instance "action" method		
		System.out.println(studentOne.toString());
		
		// example using "getter" method
		if (studentOne.isPostBaccalaureate()) {
			System.out.println(studentOne.toString() + " and I am a postbacc.");
		} // end if
		
		// example using instanceof conditional test
		if (studentOne instanceof Student) {
			System.out.println(studentOne.toString() + " and I am a student.");
		} // end if
		
		// == v/s .equals() for reference types
		int a = 77;
		int b = 77;
		int c = 78;
		System.out.println("PRIMITIVE == CHECKS");
		if (a == b) { System.out.println("a & b are equal!"); }
		if (a == c) { System.out.println("a & c equal!"); }
				
		// must use new operator to avoid compiler optimizations AKA string interning
		String nameOne = new String("Jane Smith");
		String nameTwo = new String("Jane Smith");
		String nameThree = new String("Jeff Hill");
		System.out.println("REFERENCE == CHECKS");
		if (nameOne == nameTwo) { System.out.println("Jane & Jane are equal!"); }
		if (nameOne == nameThree) { System.out.println("Jane & Jeff are equal!"); }
		System.out.println("REFERENCE .equals() CHECKS");
		if (nameOne.equals(nameTwo)) { System.out.println("Jane & Jane are equal!"); }
		if (nameOne.equals(nameThree)) { System.out.println("Jane & Jeff are equal!"); }
		
		// Professor example
		Professor profOne = new Professor("Jeff","Hill","B123456");
		Professor profTwo = new Professor("Geoffrey","Hill","B123456");
		Professor profThree = new Professor("Jim","Downey","B789012");
		System.out.println(profOne);
		System.out.println(profTwo);
		System.out.println(profThree);
		System.out.println("PROFESSOR == CHECKS");
		if (profOne == profTwo) {System.out.println("Jeff & Geoffrey are equal!"); }
		if (profOne == profThree) {System.out.println("Jeff & Jim are equal!"); }
		System.out.println("PROFESSOR .equals() CHECKS");
		if (profOne.equals(profTwo)) {System.out.println("Jeff & Geoffrey are equal!"); }
		if (profOne.equals(profThree)) {System.out.println("Jeff & Jim are equal!"); }
		
		// .hashCode() example
		System.out.println("PROFESSOR .hashCode() CHECKS");
		System.out.println(profOne.hashCode());
		System.out.println(profTwo.hashCode());
		System.out.println(profThree.hashCode());
		
		// 1D data structure example
		System.out.println("1D DATA STRUCTURE EXAMPLE");
		//ArrayList<String> allNames = new ArrayList<String>(Arrays.asList(new String[]{"Jane","Steve","Ada","Jeff"}));
		ArrayList<String> allNames = new ArrayList<String>();
		allNames.add("Jane");
		allNames.add("Steve");
		allNames.add("Ada");
		allNames.add("Jeff");
		for (String eachOne: allNames) { System.out.println(eachOne); }
		
		// 2D data structure example
		System.out.println("2D DATA STRUCTURE EXAMPLE");
		ArrayList<Professor> allProfs = new ArrayList<Professor>();
		allProfs.add(new Professor("Jeff","Hill","B123456"));
		allProfs.add(new Professor("Brent","Hill","B654987"));
		allProfs.add(new Professor("Jim","Downey","B789012"));
		for (Professor eachOne: allProfs) { System.out.println(eachOne); }
		
		// .compareTo() example
		System.out.println("PROFESSOR .compareTo() CHECKS");
		System.out.println(new Professor("Jeff","Hill","B123456")
				.compareTo(new Professor("Brent","Hill","B654987")));
		System.out.println(new Professor("Jim","Downey","B789012")
				.compareTo(new Professor("Jeff","Hill","B123456")));
		System.out.println(new Professor("Jeff","Hill","B123456")
				.compareTo(new Professor("Geoffrey","Hill","B123456")));
		
		// Collections.sort() example
		System.out.println("Collections.sort() example");
		Collections.sort(allProfs);
		for (Professor eachOne: allProfs) { System.out.println(eachOne); }
		
		// Collections.reverse() example
		System.out.println("Collections.reverse() example");
		Collections.reverse(allProfs);
		for (Professor eachOne: allProfs) { System.out.println(eachOne); }
		
		// .contains() example
		System.out.println("PROFESSOR .contains() CHECKS");
		System.out.println(allProfs.contains(new Professor("Jeff","Hill","B123456")));
	} // end main
} // end Driver