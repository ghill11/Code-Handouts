package class21;

import java.util.Scanner;

public class Driver {

	public enum ProfessorTitle {DR, MR, MS};
	public enum CourseClassification {LOWERDIVISION, UPPERDIVISION, GRADUATE};
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("What is the name of this course?");
		CourseBuilder.setName(in.nextLine());
		System.out.println("Is this course (1) Lower Division, (2) Upper Division, (3) Graduate?");
		switch (in.nextLine()) {
			case "1": CourseBuilder.setClassification(CourseClassification.LOWERDIVISION); break;
			case "2": CourseBuilder.setClassification(CourseClassification.UPPERDIVISION); break;
			default: CourseBuilder.setClassification(CourseClassification.GRADUATE); break;
		} // end switch
		System.out.println("What is the professor's first name?");
		ProfessorBuilder.setfName(in.nextLine());
		System.out.println("What is the professor's last name?");
		ProfessorBuilder.setlName(in.nextLine());
		System.out.println("Is this professor (1) Dr. (2) Ms. (3) Mr.?");
		switch (in.nextLine()) {
			case "1": ProfessorBuilder.setTitle(ProfessorTitle.DR); break;
			case "2": ProfessorBuilder.setTitle(ProfessorTitle.MS); break;
			default: ProfessorBuilder.setTitle(ProfessorTitle.MR); break;
		} // end switch
		CourseBuilder.setProf(ProfessorBuilder.build());
		boolean keepGoing = false;
		do {
			System.out.println("What is the student's first name?");
			StudentBuilder.setfName(in.nextLine());
			System.out.println("What is the student's last name?");
			StudentBuilder.setlName(in.nextLine());
			CourseBuilder.addStudent(StudentBuilder.build());
			System.out.println("Is there another student to add to the roster? (Y/N)");
			if (in.nextLine().equalsIgnoreCase("Y")) {
				keepGoing = true;
			} else {
				keepGoing = false;
			} // end else
		} while (keepGoing);
		Course java = CourseBuilder.build();
		System.out.println(java.toString());
	} // end main
} // end class Driver