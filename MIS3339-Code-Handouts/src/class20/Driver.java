package class20;

public class Driver {

	public static void main(String[] args) {
		// Association example
		System.out.println("ASSOCIATION EXAMPLE");
		System.out.println(Math.sqrt(25.0));
		
		// Aggregation example
		System.out.println("AGGREGATION EXAMPLE");
		Professor advisorOne = new Professor("Jim", "Downey", "ABC123");
		Student stuOne = new Student("Grace", "Hopper", "B0123456", advisorOne);
		Student stuTwo = new Student("Steve", "Jobs", "B0456789", advisorOne);
		System.out.println(stuOne);
		System.out.println(stuTwo);
		
		// Composition example
		System.out.println("COMPOSITION EXAMPLE");
		Course courseOne = new Course("MIS 3339", "Jeff", "Hill", "DEF456");
		courseOne.addStudent(stuOne);
		courseOne.addStudent(stuTwo);
		System.out.println(courseOne);
		
		// Interface example
		System.out.println("INTERFACE EXAMPLE");
		System.out.println(advisorOne.getID());
		System.out.println(stuOne.getID());
		System.out.println(stuTwo.getID());
		
		// Interface as simple type example
		System.out.println("INTERFACE AS SIMPLE TYPE EXAMPLE");
		Identifiable demo = stuOne;
		System.out.println(demo.getID());
	} // end main

} // end Driver