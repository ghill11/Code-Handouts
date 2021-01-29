package class23;

public class HouseholdGood extends Product implements Taxable {

	public HouseholdGood(String incName, double incPrice) {
		super(incName, incPrice);
	} // end ctor

	@Override
	public double calcSalesTax() {
		return this.getPrice() * Taxable.SALESTAXRATE;
	} // end calcSalesTax
} // end HouseholdGood