package class18;

public class Student implements Comparable<Student> {
	private final String fName;
	private final String lName;
	
	public Student(String fName, String lName) {
		this.fName = fName;
		this.lName = lName;
	} // end ctor
	
	public String getfName() {
		return this.fName;
	} // end getfName
	
	public String getlName() {
		return this.lName;
	} // end getlName

	public String toString() {
		return this.getfName() + " " + this.getlName();
	} // end toString

	@Override
	public int compareTo(Student o) {
		return this.getlName().compareTo(o.getlName());
	} // end compareTo
} // end Student