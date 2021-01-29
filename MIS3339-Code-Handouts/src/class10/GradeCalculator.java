package class10;

import java.util.ArrayList;

public class GradeCalculator {
	
	public static final int TOTALPOINTSINCLASS = 300;
	
	public static int doSum(ArrayList<Integer> grades) {
		int runningTally = 0;
		for (double eachOne: grades) {
			runningTally += eachOne;
		} // end for
		return runningTally;
	} // end doSum
} // end GradeCalculator