//**********************************************************
// Programmer: Dr. Jeff Hill
// Example Assignment - 05/10/2016 - 15 minutes
//
// Description: This class demonstrates the expected coding
//  conventions including formatting, comments and naming.
//
// Integrity Statement: I pledge that this program represents my own
//  unique programming code. I further pledge that this 
//  program was created specifically to satisfy the requirements
//  specified in the assignment listed above. I received help
//  from Dr. Jim Downey in designing and debugging my program.
//*********************************************************

package class02;

public class ConventionsExample {

    // define and initialize global variables
    private static String variableOne = "Dr.";
    private static String variableTwo = "Jeff Hill";
    private static int age = 42;
    private final static int YEARGRADUATED = 1998;

    // this method is the entry point when the program is executed
    public static void main(String[] args) {
        System.out.println("My name is " + variableOne + " " + variableTwo
            + " and I am " + age + " years old. I " + " graduated in " + 
            YEARGRADUATED + " with a degree in MIS.");
        System.out.println("This is a second line of text in the output.");
    } // end method main
} // end class ConventionsExample