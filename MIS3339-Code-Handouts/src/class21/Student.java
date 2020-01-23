package class21;

public class Student implements Comparable<Student>{
	private final String fName;
	private final String lName;
	
	public Student(String fName, String lName) {
		this.fName = fName;
		this.lName = lName;
	} // end ctor
	
	public String toString() {
		return this.fName + " " + this.lName;
	} // end toString
	
	@Override
	public int compareTo(Student inc) {
		return this.lName.compareTo(inc.lName);
	} // end compareTo
} // end Student