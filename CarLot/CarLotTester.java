import java.io.FileNotFoundException;

/*
 * Class for testing the CarLot class
 * @Author: Brandon Siffer
 * @author Aiden Schroeder
 */
public class CarLotTester {

	public static void main(String[] args) throws FileNotFoundException {
		
		//Create a variable referencing the car lot's inventory
		CarLot inventory = new CarLot();
		
		//generate a new car object and add it to the car lot
		System.out.println("Adding '2018 Subaru Crosstrek' to the car lot.");
		inventory.addCar("2018 Subaru Crosstrek", 86735, 33, 16000, 21000);
		
		//show the added car inside of the car lot
		System.out.println("\nThe current Lot's inventory: ");
		System.out.println(inventory.getInventory());
		
		//generate a second car and add it to the car lot
		System.out.println("\nAdding '2006 Honda Accord' to the car lot.");
		inventory.addCar("2006 Honda Accord", 176324, 21, 4000, 5000);
		
		//show the added car inside of the car lot
		System.out.println("\nThe current Lot's inventory: ");
		System.out.println(inventory.getInventory());
		
		//test the findCarByIdentifier method for car1
		System.out.println("\nTesting the findCarByIdentifier method on first car");
		Car temp = inventory.findCarByIdentifier("2018 Subaru Crosstrek");
		System.out.println(temp);
		
		//test the findCarByIdentifier method for car2
		System.out.println("\nTesting the findCarByIdentifier method on second car");
		Car temp2 = inventory.findCarByIdentifier("2006 Honda Accord");
		System.out.println(temp2);
		
		//test the findCarByIdentifier method to check for the null exception
		System.out.println("\nTesting the findCarByIdentifier method on nonexistent car");
		Car temp3 = inventory.findCarByIdentifier("2010 Toyota Camry");
		if (temp3 != null) {
			System.out.println(temp3);
		} 
		else {
			System.out.println("There is no such car found in the inventory!");
		}
		
		//test out the getCarsInOrderOfEntry method
		System.out.println("\nTesting the getCarsInOrderOfEntry method");
		try {
			System.out.println(inventory.getCarsInOrderOfEntry());
		}
		catch (Exception e) {
			System.out.print(e.toString());
		}
		
		//test out the getCarsSortedByMPG method
		System.out.println("\nTesting the getCarsSortedByMPG method");
		try {
			System.out.println(inventory.getCarsSortedByMPG());
		}
		catch (Exception e) {
			System.out.print(e.toString());
		}
		
		//test the getCarWithHighestMileage method
		System.out.println("\n\nTesting the getCarWithHighestMileage method: ");
		System.out.println(inventory.getCarWithHighestMileage());
		
		//test the getCarWithBestMPG method
		System.out.println("\n\nTesting the getCarWithBestMPG method: ");
		System.out.println(inventory.getCarWithBestMPG());
		
		
		//test the getAverageMPG method
		System.out.println("\nTesting the getAverageMPG method: ");
		System.out.println("Average MPG of cars on lot: " + inventory.getAverageMpg());
		
		//test out the sellCar method
		System.out.println("\n\nSelling the Subaru to test sellCar method");
		inventory.sellCar("2018 Subaru Crosstrek", 20000);
		
		//test out the sellCar method
		System.out.println("\n\nAttempting a sale for a nonexistent car to test sellCar method");
		inventory.sellCar("2010 Toyota Camry", 10000);
		
		//show the price sold modified on the car's object
		System.out.println("\n\nThe car '2018 Subaru Crosstrek' sold for: " + inventory.findCarByIdentifier("2018 Subaru Crosstrek").getPriceSold());
		
		//show the car lot inventory
		System.out.println("\nThe current Lot's inventory: ");
		System.out.println(inventory.getInventory());
		
		//test the getTotalProfit method
		System.out.println("\nTesting the getTotalProfit method: ");
		System.out.println(inventory.getTotalProfit());

		//test loadFromDisk() and saveToDisk() methods
		System.out.println("Saving current inventory...");
		inventory.saveToDisk();
		System.out.println("Loading saved inventory...");
		inventory.loadFromDisk();
		System.out.println("Displaying loaded inventory...");
		System.out.println(inventory.getInventory());

		//test edit() method
		System.out.println("Set ID of the 2018 Subaru Crosstrek to null using edit()");
		inventory.edit(inventory.findCarByIdentifier("2018 Subaru Crosstrek"));

	}

}
