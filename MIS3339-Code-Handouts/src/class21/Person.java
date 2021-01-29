package class21;

public class Person {
	private final String fName;
	private final String lName;
	private final String bearID;
	
	public Person(String incfName, String inclName, String incBearID) {
		this.fName = incfName;
		this.lName = inclName;
		this.bearID = incBearID;
	} // end ctor
	
	@Override
	public String toString() {
		return this.fName + " " + this.lName + " ID: " + this.bearID;
	} // end toString
} // end Person