package class13;

public class Student {
	private final String fName;
	private final boolean postBaccalaureate;
	
	public Student(String fName, boolean postBaccalaureate) {
		this.fName = fName;
		this.postBaccalaureate = postBaccalaureate;
	} // end ctor

	public String toString() {
		return "Hi, my name is " + this.fName;
	} // end toString
	
	public boolean isPostBaccalaureate() {
		return this.postBaccalaureate;
	} // end isPostBaccalaureate
	
} // end Student