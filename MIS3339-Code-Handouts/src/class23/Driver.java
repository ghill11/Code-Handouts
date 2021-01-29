package class23;

import java.text.DecimalFormat;
import java.util.ArrayList;

public class Driver {

	public static void main(String[] args) {
		System.out.println("************** BASE SETUP **************");
		ArrayList<Product> shoppingCart = new ArrayList();
		shoppingCart.add(new Foodstuff("Chips", 4.99));
		shoppingCart.add(new Medicine("Motrin", 8.99));
		shoppingCart.add(new HouseholdGood("Paper Towels", 2.49));
		for (Product eachOne: shoppingCart) {
			System.out.println(eachOne.toString());
		} // end for
		
		System.out.println("************** POLYMORPHIC INTERFACES **************");
		Taxable taxOne = new Foodstuff("Ramen Noodles", 0.99);
		Taxable taxTwo = new HouseholdGood("Toilet Paper", 1.49);
		System.out.println("The tax for " + taxOne.toString() + " is: $" + taxOne.calcSalesTax());
		System.out.println("The tax for " + taxTwo.toString() + " is: $" + taxTwo.calcSalesTax());

		// Because Medicine is not Taxable, it precludes us from putting everything in a
		// collection of type Taxable and calculating taxes the easy way

		// The next two lines of code are invalid
		//Taxable taxThree = new Medicine("Tylenol", 9.99);
		//System.out.println("The tax for " + taxThree.toString() + " is: $" + taxThree.calcSalesTax());
		
		System.out.println("************** EXPLICIT TYPE CASTING **************");
		// This line of code is invalid, taxOne is type Taxable and can't "see" the .getName() method
		//System.out.println("The name value contained in taxOne is: " + (taxOne.getName()));
		
		// By explicitly type casting it as a Product, we can now "see" the .getName() method
		System.out.println("The name value contained in taxOne is: " + ((Product)taxOne).getName());
		
		System.out.println("************** instanceof EXAMPLE **************");
		System.out.println("The variable taxOne is a Product: " + (taxOne instanceof Product));
		System.out.println("The variable taxOne is a Foodstuff: " + (taxOne instanceof Foodstuff));
		System.out.println("The variable taxOne is a Taxable: " + (taxOne instanceof Taxable));
		System.out.println("The variable taxOne is a Medicine: " + (taxOne instanceof Medicine));
		System.out.println("The variable taxOne is a HouseholdGood: " + (taxOne instanceof HouseholdGood));
		
		System.out.println("************** POLYMORPHIC INTERFACES, COLLECTION & instanceof **************");
		for (Product eachOne: shoppingCart) {
			double taxValue = 0;
			if (eachOne instanceof Taxable) {
				taxValue = ((Taxable)eachOne).calcSalesTax();
			} // end if
			DecimalFormat df = new DecimalFormat("0.00");
			System.out.println(eachOne.toString() + " sales tax is: $" + df.format(taxValue));
		} // end for		
	} // end main
} // end Driver