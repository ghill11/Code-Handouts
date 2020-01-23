package class22;

public class Professor extends Human {

	public Professor(String fName, String lName, String bearID) {
		super(fName, lName, bearID);
	} // end ctor
	
	@Override
	public String doQuiz() {
		return "What is the square root of PI?";
	} // end doQuiz

	@Override
	public String toString() {
		return "This professor named " + this.getfName() + " " + this.getlName() +
				" Bear ID #: " + this.getBearID();
	} // end toString
} // end Professor