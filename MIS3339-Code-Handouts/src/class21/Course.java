package class21;

import java.util.ArrayList;

import class21.Driver.CourseClassification;

public class Course {
	private final String name;
	private final Driver.CourseClassification classification;
	private final ArrayList<Student> students;
	private final Professor prof;
	
	public Course(Professor prof, String name, CourseClassification classification, ArrayList<Student> students) {
		this.prof = prof;
		this.name = name;
		this.classification = classification;
		this.students = students;
	} // end ctor
	
	@Override
	public String toString() {
		String output = "";
		output += this.prof.toString();
		output += " teaches the " + this.classification + " course " + this.name;
		output += " with these students enrolled: ";
		for (Student eachOne: students) {
			// put a comma and a space between each student
			output += eachOne.toString() + ", "; 
		} // end for
		// remove the extra comma and space after the last student
		return output.substring(0, output.length() - 2); 
	} // end toString
} // end Course