package class13;

import java.util.Objects;

public class Professor implements Comparable<Professor> {
	private final String fName;
	private final String lName;
	private final String bearID;
	
	public Professor(String fName, String lName, String bearID) {
		this.fName = fName;
		this.lName = lName;
		this.bearID = bearID;
	} // end ctor
	
	public String toString() {
		return "Hi, my name is " + this.fName + " " + this.lName +
				" and my Bear ID is: " + this.bearID;
	} // end toString
	
	public boolean equals(Object inc) {
		if (inc instanceof Professor) {
			return this.bearID.equals(((Professor)inc).bearID);
		} else {
			return false;
		} // end else
	} // end equals
	
	public int hashCode() {
		return Objects.hash(this.bearID);
	} // end hashCode
	
	public int compareTo(Professor inc) {
		return this.bearID.compareTo(inc.bearID);
	} // end compareTo
} // end class Professor