package class09;

import java.util.Random;

public class MethodDemo {
	
	public static void doSomething() {
		System.out.println("Doing something.");
	} // end doSomething
	
	public static void stepOne() {
		System.out.println("Step one completed!");
		stepTwo();
	} // end stepOne
	
	public static void stepTwo() {
		System.out.println("Step two completed!");
		stepThree();
	} // end stepTwo
	
	public static void stepThree() {
		System.out.println("Step three completed!");
	} // end stepThree
	
	public static int getRandomInteger() {
		Random rng = new Random();
		return rng.nextInt();
	} // end getRandomInteger
	
	public static void squareIt(int inc) {
		System.out.println(inc + " squared is: " + (inc*inc));
	} // end squareIt
	
	public static int squareItTwo(int inc) {
		return inc*inc;
	} // end squareItTwo
	
	public static void scopeExample(int youCantSeeMe) {
		
	} // end badExample
	
	public static void scopeExampleTwo(int youCantSeeMe) {
		System.out.println(youCantSeeMe);
	} // end scopeExampleTwo
	
	public static void main(String[] args) {
		doSomething();
		doSomething();
		stepOne();
		System.out.println("A random integer: " + getRandomInteger());
		int myRandomInt = getRandomInteger();
		System.out.println("Another random integer is: " + myRandomInt);
		squareIt(5);
		int squareMe = 5;
		System.out.println(squareMe + " squared is: " + squareItTwo(squareMe));
		//System.out.println(youCantSeeMe); // youCantSeeMe is not in scope here!
		scopeExampleTwo(656724);
	} // end main
	
} // end MethodDemo