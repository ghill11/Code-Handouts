package class10;

import java.text.DecimalFormat;
import java.util.ArrayList;

public class Driver {
	public static void main(String[] args) {
		System.out.println("*************** SINGULAR CONCEPT ***************");
		Projector.turnOn();
		Projector.turnOff();
		
		System.out.println("*************** UTILITY CONCEPT ***************");
		ArrayList<Integer> grades = new ArrayList<Integer>();
		grades.add(78);
		grades.add(64);
		grades.add(84);
		DecimalFormat df = new DecimalFormat("0.00");
		System.out.println("The grade average is: " + 
				df.format((double)GradeCalculator.doSum(grades) / grades.size()));
		
		System.out.println("*************** CONSTANT DEMO ***************");
		System.out.println("The course average is: " + 
			df.format((double)GradeCalculator.doSum(grades) / GradeCalculator.TOTALPOINTSINCLASS * 100));
	} // end main
} // end Driver