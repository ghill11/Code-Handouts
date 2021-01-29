package class21;

import class21.Driver.ProfessorTitle;

public class Professor {
	private final String fName;
	private final String lName;
	private final Driver.ProfessorTitle title;
	
	public Professor(String fName, String lName, ProfessorTitle title) {
		this.fName = fName;
		this.lName = lName;
		this.title = title;
	} // end ctor
	
	@Override
	public String toString() {
		return this.title + " " + this.fName + " " + this.lName;
	} // end toString
} // end Professor