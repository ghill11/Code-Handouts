package class23;

public abstract class Product {
	private final String name;
	private final double price;
	
	public Product(String incName, double incPrice) {
		this.name = incName;
		this.price = incPrice;
	} // end ctor
	
	public String getName() {
		return this.name;
	} // end getName
	
	public double getPrice() {
		return this.price;
	} // end getPrice
	
	@Override
	public String toString() {
		// % indicates a format string pattern
		// 0$ indicates the argument index
		// s indicates that the argument is a String 
		// 15 represents the minimal width of the String
		return "$" + this.price + String.format("%0$"+15+"s", this.name);
	} // end toString
} // end Product