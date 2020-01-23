package class07;

public class ExpressionDemo {

	public static void main(String[] args) {
		int operandOne = 18;
		int operandTwo = 7;
		double operandThree = 18;
		double operandFour = 7;
		
		// basic math operators
		System.out.println("---------------------- BASIC MATH OPERATORS ----------------------");
		System.out.println(operandOne + operandTwo);
		System.out.println(operandOne - operandTwo);
		System.out.println(operandOne * operandTwo);
		System.out.println(operandOne / operandTwo);
		System.out.println(operandOne % operandTwo);
		System.out.println(operandThree / operandFour);

		// math with string concatenation
		System.out.println("---------------------- MATH WITH STRING CONCATENATION ----------------------");
		System.out.println("18 + 7 = " + operandOne + operandTwo); // wrong
		System.out.println("18 + 7 = " + (operandOne + operandTwo)); // correct
		
		// counting
		System.out.println("---------------------- COUNTING ----------------------");
		int counter = 0;
		counter = counter + 1;
		System.out.println(counter);
		counter += 1;
		System.out.println(counter);
		System.out.println(counter++);
		System.out.println(++counter);
		System.out.println(counter);
		
		// data conversions
		System.out.println("---------------------- DATA CONVERSIONS ----------------------");
		int operandFive = 16;
		int operandSix = 8;
		double resultOne = operandFive + operandSix; // widening
		System.out.println(resultOne);
		double operandSeven = 16.2;
		double operandEight = 8.4;
		int resultTwo = (int)operandSeven + (int)operandEight; // narrowing
		System.out.println(resultTwo);
		String operandNine = "16";
		String operandTen = "8";
		int resultThree = Integer.valueOf(operandNine) + Integer.valueOf(operandTen); // parsing
		System.out.println(resultThree);
		
	} // end main

} // end ExpressionsDemo