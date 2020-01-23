package class21;

public class ProfessorBuilder {
	private static String fName;
	private static String lName;
	private static Driver.ProfessorTitle title;
	
	public static void setfName(String fName) {
		ProfessorBuilder.fName = fName;
	} // end setfName
	
	public static void setlName(String lName) {
		ProfessorBuilder.lName = lName;
	} // end setlName
	
	public static void setTitle(Driver.ProfessorTitle title) {
		ProfessorBuilder.title = title;
	} // end setTitle
	
	public static Professor build() {
		return new Professor(fName, lName, title);
	} // end build
} // end ProfessorBuilder