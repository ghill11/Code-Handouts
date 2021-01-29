package class20;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Course {
	private final Professor prof;
	private final String title;
	private List<Student> students = new ArrayList<Student>();
	
	public Course(String title, String fName, String lName, String id) {
		this.title = title;
		this.prof = new Professor(fName, lName, id);
	} // end ctor
	
	public void addStudent(Student inc) {
		students.add(inc);
	} // end addStudent
	
	public String toString() {
		Collections.sort(students);
		String roster = "";
		for (Student eachOne: students) {
			roster += eachOne + ", ";
		} // end for
		// gets rid of extra comma and space at end
		roster = roster.substring(0, roster.length() - 2);
		return "The course " + this.title + " is taught by " + this.prof
				+ " and includes these students: " + roster;
	} // end toString
} // end Course