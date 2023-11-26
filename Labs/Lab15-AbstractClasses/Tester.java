


public class Tester {

	public static void main(String[] args) {
		Vehicle bicycle = new Bicycle();
		System.out.println(bicycle.getVehicleType());
		for(Tire t : bicycle.getTires()) {
			System.out.println(t.getSize());
		}

		Vehicle dragster = new Dragster();
		System.out.println(dragster.getVehicleType());
		for(Tire t : dragster.getTires()) {
			System.out.println(t.getSize());
		}
	
	}

}
