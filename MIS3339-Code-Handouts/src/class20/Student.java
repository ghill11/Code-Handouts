package class20;

public class Student implements Comparable<Student>, Identifiable {
	private final String fName;
	private final String lName;
	private final String id;
	private final Professor advisor;
	
	public Student(String fName, String lName, String id, Professor advisor) {
		this.fName = fName;
		this.lName = lName;
		this.id = id;
		this.advisor = advisor;
	} // end ctor
	
	public String getfName() {
		return this.fName;
	} // end getfName
	
	@Override
	public String getID() {
		return this.id;
	} // end getID
	
	public String getlName() {
		return this.lName;
	} // end getlName
	
	public String toString() {
		return this.getfName() + " " + this.getlName() + 
				", advised by " + this.advisor;
	} // end toString
	
	@Override
	public int compareTo(Student o) {
		return this.getlName().compareTo(o.getlName());
	} // end compareTo
} // end Student