package class22;

import java.util.ArrayList;

public class Driver {

	public static void main(String[] args) {
		Professor me = new Professor("Jeff","Hill","B012345ABC");
		System.out.println(me);
		System.out.println(me.doQuiz());
		
		Student you = new Student("Grace","Hopper","B0987654ZYX");
		System.out.println(you);
		System.out.println(you.doQuiz());
		
		Human studentOne = new Student("Steve","Jobs","B123456QWR");
		System.out.println(studentOne.breathe());
		System.out.println(me.breathe());
		System.out.println(you.breathe());
		
		System.out.println(studentOne);
		System.out.println(studentOne.doQuiz());

		System.out.println("******************** POLYMORPHIC COLLECTION DEMO ********************");
		ArrayList<Human> roster = new ArrayList();
		roster.add(me);
		roster.add(you);
		roster.add(studentOne);
		
		for (Human eachOne: roster) {
			System.out.println(eachOne.toString());
			System.out.println(eachOne.doQuiz());
			System.out.println(eachOne.breathe());
		} // end for
	} // end main
} // end Driver