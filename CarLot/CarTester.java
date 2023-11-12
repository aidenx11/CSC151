
/**
 * Class to test methods and constructors in car class
 * @author Schroeder
 */
public class CarTester {

	/**
	 * Starts program running and tests methods in car class, printing results to system out
	 * @param args command line arguments
	 */
	public static void main(String[] args) {

		//Test constructors
		Car car1 = new Car();
		Car car2 = new Car("2018 Subaru Crosstrek", 86735, 33, 16000, 21000);

		//Test toString() method
		System.out.println("\nCar 1 to a string: \n" + car1.toString());
		System.out.println("\nCar 2 to a string: \n" + car2.toString());

		//Test sellCar() method
		System.out.println("\nSelling car 2...");
		car2.sellCar(23000);
		System.out.println("\nWas car 2 sold? " + (car2.isSold() ? "yes" : "no") + "\nProfit from car 2: " + car2.getProfit() + "\nHow much did car 2 sell for? " + car2.getPriceSold());

		//Generate 3 new cars to use for testing of comparison methods
		Car car3 = new Car("Car 3", 10000, 17, 12000, 15000);
		Car car4 = new Car("Car 4", 15000, 25, 17000, 20000);
		Car car5 = new Car("Car 5", 15000, 25, 17000, 20000);

		//Print attributes of 3 new cars to console
		System.out.println("\nCar 3 to a string: \n" + car3.toString());
		System.out.println("\nCar 4 to a string: \n" + car4.toString());
		System.out.println("\nCar 5 to a string: \n" + car5.toString());


		//Test compareMileage() method
		System.out.println("\nDoes car 4 have higher mileage than car 3? ");
		switch (car4.compareMileage(car3)){
		case 1: System.out.print("Yes\n"); break;
		case 0: System.out.print("They are the same.\n"); break;
		case -1: System.out.print("No\n"); break;
		}

		System.out.println("\nDoes car 3 have higher mileage than car 4? ");
		switch (car3.compareMileage(car4)){
		case 1: System.out.print("Yes\n"); break;
		case 0: System.out.print("They are the same.\n"); break;
		case -1: System.out.print("No\n"); break;
		}

		System.out.println("\nDoes car 4 have higher mileage than car 5? ");
		switch (car4.compareMileage(car5)){
		case 1: System.out.print("Yes\n"); break;
		case 0: System.out.print("They are the same.\n"); break;
		case -1: System.out.print("No\n"); break;
		}


		//Test compareMpg() method
		System.out.println("\nDoes car 4 have higher MPG than car 3? ");
		switch (car4.compareMpg(car3)){
			case 1: System.out.print("Yes\n"); break;
			case 0: System.out.print("They are the same.\n"); break;
			case -1: System.out.print("No\n"); break;
			}

		System.out.println("\nDoes car 3 have higher MPG than car 4? ");
		switch (car3.compareMpg(car4)){
		case 1: System.out.print("Yes\n"); break;
		case 0: System.out.print("They are the same.\n"); break;
		case -1: System.out.print("No\n"); break;
		}

		System.out.println("\nDoes car 4 have higher MPG than car 5? ");
		switch (car4.compareMpg(car5)){
		case 1: System.out.print("Yes\n"); break;
		case 0: System.out.print("They are the same.\n"); break;
		case -1: System.out.print("No\n"); break;
		}


		//Test comparePrice() method
		System.out.println("\nDoes car 4 have higher price than car 3? ");
		switch (car4.comparePrice(car3)){
			case 1: System.out.print("Yes\n"); break;
			case 0: System.out.print("They are the same.\n"); break;
			case -1: System.out.print("No\n"); break;
			}

		System.out.println("\nDoes car 3 have higher price than car 4? ");
		switch (car3.comparePrice(car4)){
		case 1: System.out.print("Yes\n"); break;
		case 0: System.out.print("They are the same.\n"); break;
		case -1: System.out.print("No\n"); break;
		}

		System.out.println("\nDoes car 4 have higher Price than car 5? ");
		switch (car4.comparePrice(car5)){
		case 1: System.out.print("Yes\n"); break;
		case 0: System.out.print("They are the same.\n"); break;
		case -1: System.out.print("No\n"); break;
		}


	}

}
