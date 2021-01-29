package class21;

public class PersonBuilder {
	private static String builderfName;
	private static String builderlName;
	private static String builderBearID;
	
	public static Person build() {
		return new Person(builderfName, builderlName, builderBearID);
	} // end build
	
	public static void setfName(String incfName) {
		builderfName = incfName;
	} // end setfName

	public static void setlName(String inclName) {
		builderlName = inclName;
	} // end setfName

	public static void setBearID(String incBearID) {
		builderBearID = incBearID;
	} // end setfName
} // end PersonBuilder
