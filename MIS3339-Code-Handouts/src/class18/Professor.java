package class18;

public class Professor {
	private final String fName;
	private final String lName;
	
	public Professor(String fName, String lName) {
		this.fName = fName;
		this.lName = lName;
	} // end ctor

	public String toString() {
		return this.fName + " " + this.lName;
	} // end toString
} // end Professor