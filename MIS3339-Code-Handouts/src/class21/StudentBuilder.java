package class21;

public class StudentBuilder {
	private static String fName;
	private static String lName;
	
	public static void setfName(String fName) {
		StudentBuilder.fName = fName;
	} // end setfName
	
	public static void setlName(String lName) {
		StudentBuilder.lName = lName;
	} // end setlName
	
	public static Student build() {
		return new Student(fName, lName);
	} // end build
} // end StudentBuilder