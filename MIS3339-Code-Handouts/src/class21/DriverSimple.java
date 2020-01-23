package class21;

public class DriverSimple {

	public static void main(String[] args) {
		PersonBuilder.setfName("Jeff");
		PersonBuilder.setlName("Hill");
		PersonBuilder.setBearID("B010101234");
		Person me = PersonBuilder.build();
		System.out.println(me);
	} // end main
} // end DriverSimple