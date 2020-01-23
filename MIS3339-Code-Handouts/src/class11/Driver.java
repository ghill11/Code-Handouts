package class11;

public class Driver {

	public static void main(String[] args) {
		// example data member manipulation method 
		Student studentOne = new Student("Grace", true);
		Student studentTwo = new Student("Steve", false);
		
		// example instance "action" method		
		System.out.println(studentOne.describeMe());
		System.out.println(studentTwo.describeMe());
		
		// example using "getter" method
		if (studentOne.isPostBaccalaureate()) {
			System.out.println(studentOne.describeMe() + " and I am a postbacc.");
		} // end if
		if (studentTwo.isPostBaccalaureate()) {
			System.out.println(studentTwo.describeMe() + " and I am a postbacc.");
		} // end if
		
		// example using instanceof conditional test
		if (studentOne instanceof Student) {
			System.out.println(studentOne.describeMe() + " and I am a student.");
		} // end if
		if (studentTwo instanceof Student) {
			System.out.println(studentTwo.describeMe() + " and I am a student.");
		} // end if
	} // end main

} // end Driver