package class20;

public class Professor implements Identifiable {
	private final String fName;
	private final String lName;
	private final String id;
	
	public Professor(String fName, String lName, String id) {
		this.fName = fName;
		this.lName = lName;
		this.id = id;
	} // end ctor
	
	@Override
	public String getID() {
		return this.id;
	} // end getID

	public String toString() {
		return this.fName + " " + this.lName;
	} // end toString
} // end Professor