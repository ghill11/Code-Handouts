package class22;

public class Student extends Human {

	public Student(String fName, String lName, String bearID) {
		super(fName, lName, bearID);
	} // end ctor
	
	@Override
	public String doQuiz() {
		return "My answer is: " + Math.random();
	} // end doQuiz
	
	@Override
	public String toString() {
		return "This student named " + this.getfName() + " " + this.getlName() +
				" Bear ID #: " + this.getBearID();
	} // end toString
} // end Student