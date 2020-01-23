package class18;

public class Driver {
	
	public static void independentStudy(int year, Professor incProf, Student incStu) {
		System.out.println("In " + year + ", " + incProf.toString() + 
				" taught " + incStu.toString() + ".");
	} // end independentStudy
	
	public static void independentStudy(int year, String semester, Professor incProf, Student incStu) {
		System.out.println("In the " + semester + " semester of " + year + ", " + incProf.toString() + 
				" taught " + incStu.toString() + ".");
	} // end independentStudy
	
	public static void printThis(String inc) {
		System.out.println("I printed the word: " + inc);
	} // end printThis
	
	public static void printThis(int inc) {
		System.out.println("I printed the integer: " + inc);
	} // end printThis
	
	public static void calculateAvg(int grade1, int grade2, int grade3) {
		double avg = (grade1 + grade2 + grade3) / 3.0;
		System.out.println("The average for this series is: " + avg);
	} // end calculateAvg

	public static void calculateAvg(int grade1, int grade2, int grade3, int grade4) {
		double avg = (grade1 + grade2 + grade3 + grade4) / 4.0;
		System.out.println("The average for this series is: " + avg);
	} // end calculateAvg
	
	public static void betterCalculateAvg(int...grades) {
		int sum = 0;
		for (int eachOne: grades) {
			sum += eachOne;
		} // end for
		double avg = sum / (double) grades.length;
		System.out.println("The average for this series is: " + avg);
	} // end betterCalculateAvg

	public static void main(String[] args) {
		// example multiple parameter method
		System.out.println("EXAMPLE MULTIPLE PARAMETER METHOD");
		Student stuOne = new Student("Grace","Hopper");
		Professor profOne = new Professor("Jeff","Hill");
		independentStudy(2018, profOne, stuOne);
		
		// example method overloading
		System.out.println("EXAMPLE METHOD OVERLOADING");
		independentStudy(2018, "fall", profOne, stuOne);
		printThis("Hello");
		printThis(42);
		
		// example variable length arguments
		System.out.println("EXAMPLE VARIABLE LENGTH ARGUMENTS");
		calculateAvg(50, 75, 100);
		calculateAvg(60, 70, 80, 90);
		betterCalculateAvg(50, 75, 100);
		betterCalculateAvg(60, 70, 80, 90);
	} // end main
} // end Driver