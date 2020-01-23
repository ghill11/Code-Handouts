package class04;

public class LogicalControlDemo {
	public static void main(String[] args) {
		// Boolean logic
		System.out.println(18 > 20);
		System.out.println(18 < 20);
		System.out.println(18 == 20);
		System.out.println(18 != 20);
		System.out.println(18 >= 20);
		System.out.println(18 <= 20);
		
		// Selection control structure
		if (18 > 21) {
			System.out.println("This never happens.");
		} // end if
		
		if (18 > 21) {
			System.out.println("This never happens.");
		} else {
			// explicitly do nothing
		} // end else
		
		if (18 > 21) {
			System.out.println("This never happens.");
		} else {
			System.out.println("This is a silly example.");
		} // end else
		
		// Complex conditional tests
		int age = 17;
		boolean citizen = true;
		if (age >= 18 && citizen == true) {
			System.out.println("You can vote!");
		} else {
			System.out.println("You can't vote!");
		} // end else
		
		// Logical negation
		if (!(age >= 18) || !(citizen == true)) {
			System.out.println("You can't vote!");
		} else {
			System.out.println("You can vote!");
		} // end else
		
		// Conditional range testing
		double grade = 89.49;
		if (grade >= 89.5) {
			System.out.println("You got an A!");
		} else if (grade >= 79.5) {
			System.out.println("You got a B!");
		} else if (grade >= 69.5) {
			System.out.println("You got a C!");
		} else if (grade >= 59.5) {
			System.out.println("You got a D!");
		} else {
			System.out.println("You failed, see you next semester.");
		} // end else

		// Nested conditional testing
		int recipe = 1;
		int temp = 352;
		if (recipe == 1) {
			if (temp >= 350) {
				System.out.println("Ready to bake!");
			} else {
				System.out.println("Not ready to bake.");
			} // end else
		} // end if
	} // end main
} // end LogicalControlDemo