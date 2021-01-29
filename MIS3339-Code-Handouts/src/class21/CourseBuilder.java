package class21;

import java.util.ArrayList;
import java.util.Collections;

public class CourseBuilder {
	private static Professor prof;
	private static String name;
	private static Driver.CourseClassification classification;
	private static ArrayList<Student> students = new ArrayList<Student>();
	
	public static void setProf(Professor prof) {
		CourseBuilder.prof = prof;
	} // end setProf
	
	public static void setName(String name) {
		CourseBuilder.name = name;
	} // end setName
	
	public static void setClassification(Driver.CourseClassification classification) {
		CourseBuilder.classification = classification;
	} // end setClassification
	
	public static void addStudent(Student inc) {
		students.add(inc);
		Collections.sort(students);
	} // end setStudents
	
	public static Course build() {
		Course temp = new Course(prof, name, classification, students);
		students = new ArrayList<Student>();
		return temp;
	} // end build
} // end CourseBuilder