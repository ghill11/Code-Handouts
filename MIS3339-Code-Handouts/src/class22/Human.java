package class22;

public abstract class Human {
	private final String fName;
	private final String lName;
	private final String bearID;
	
	public Human(String fName, String lName, String bearID) {
		this.fName = fName;
		this.lName = lName;
		this.bearID = bearID;
	} // end ctor
	
	@Override
	public abstract String toString();
	
	public abstract String doQuiz();

	public String breathe() {
		return this + " breathes.";
	} // end breathe
	
	public String getBearID() {
		return this.bearID;
	} // end getBearID
	
	public String getfName() {
		return this.fName;
	} // end getfName
	
	public String getlName() {
		return this.lName;
	} // end getlName
	
} // end Human