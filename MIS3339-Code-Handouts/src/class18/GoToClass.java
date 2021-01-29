package class18;

public class GoToClass {

	private enum Semester { SUMMER, FALL, SPRING };
	
	private static Semester getCurrentSemester() {
		return Semester.SPRING;
	} // end getCurrentSemester
	
	private static boolean isSnowDay() {
		return false;
	} // end isSnowDay
	
	private static void goClass() {
		if (!isSnowDay()) {
			System.out.println("Get to class!");
		} else {
			goHome();
		} // end else
	} // end goClass
	
	private static void goHome() {
		System.out.println("Go back home!");
	} // end goHome
	
	private static void checkRightDay() {
        // 1 = Sunday ... 7 = Saturday
        int today = java.util.Calendar.getInstance().get(java.util.Calendar.DAY_OF_WEEK);
		Semester now = getCurrentSemester();
		if (now == Semester.FALL) {
			if (today == 3 || today == 5) {
				goClass();
			} else {
				goHome();
			} // end else
		} else if (now == Semester.SPRING) {
			if (today == 2 || today == 4) {
				goClass();
			} else {
				goHome();
			} // end else
		} else if (now == Semester.SUMMER) {
			if (today == 2 || today == 3 || today == 4 || today == 5 || today == 6) {
				goClass();
			} else {
				goHome();
			} // end else
		} // end else if
	} // end checkRightDay
	
	public static void main(String[] args) {
		checkRightDay();
	} // end main
} // end GoToClass