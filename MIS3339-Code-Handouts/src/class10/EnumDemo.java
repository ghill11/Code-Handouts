package class10;

public class EnumDemo {

	public static void main(String[] args) {
		
		// simple String type traffic light
		System.out.println("---------------------- SIMPLE STRING TRAFFIC LIGHT ----------------------");
		String trafficLight = "Yallow";
		switch (trafficLight) {
			case "Green": System.out.println("Go!"); break;
			case "Yellow": System.out.println("Floor it, you got this!"); break;
			case "Red": System.out.println("Stop!"); break;
			default: System.out.println("The light is broken, follow 4-way stop rules.");
		} // end switch

		// enum demonstration
		System.out.println("---------------------- ENUM TRAFFIC LIGHT ----------------------");
		TrafficLight oakAndI40 = TrafficLight.GREEN;
		switch (oakAndI40) {
			case GREEN: System.out.println("Go!"); break;
			case YELLOW: System.out.println("Floor it, you got this!"); break;
			case RED: System.out.println("Stop!"); break;
			default: System.out.println("The light is broken, follow 4-way stop rules.");
		} // end switch		
	} // end main

} // end EnumDemo