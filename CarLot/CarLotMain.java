/*
 *	This is the main user interface for the Car Lot program.
 *	This program will read user input and utilize the CarLot and Car classes
 *  to build and instance of CarLot allowing the user to add and sell Car objects
 *  to and from the lot.
 *  
 *  @author Brandon Siffer
 *  @author Aiden Schroeder
 *  @author Casee Newton
 *  @author Edison Kaulfuss
 *
 */

import java.io.FileNotFoundException;
import java.util.*;

public class CarLotMain {
		/*
		 * This is the main method for the CarLot program
		 * where the user inputs/sells Car objects to a CarLot.
		 * 
		 * @param args not used
		 */
		public static void main(String[] args) throws FileNotFoundException {
			//create a scanner for taking user input
			Scanner input = new Scanner(System.in);
			int option = 0;
			//create a new CarLot inventory for Car objects to be added
			CarLot inventory = new CarLot();
			do {
				System.out.println("""
                        [0] Exit
                        [1] Add a car to inventory
                        [2] Sell a car from inventory
                        [3] List inventory by order of acquisition
                        [4] List Inventory From Best MPG to Worst MPG
                        [5] Display car with best MPG
                        [6] Display car with the highest mileage
                        [7] Display overall MPG for the entire inventory
                        [8] Display profit for all sold cars
                        [9] Load Inventory from disk
                        [10] Save Inventory to disk
                        Enter a number from 0 to 10 :\s""");
				//checking to see if the user input is a valid option from the displayed list
				boolean validInput = false;
				option = input.nextInt();
				
				while (!validInput) {
					
					if (option > -1 && option < 11) {
						
					validInput = true;
					
					} else {
						
					System.out.println("Invalid input. Enter only a single integer from 0 to 8.");
					option = input.nextInt();
					
					}
				}
				//using a switch to run based on the user's input option
				switch (option) {
				//exits the program
				case 0: 
					System.out.println("Exiting program...");
					System.exit(0);
					break;
				//adds a car to the CarLot based on user input	
				case 1: 
					System.out.print("Enter the car's identifier, e.g. 2005 Honda Civic: ");
					input.nextLine();
					String id = input.nextLine();
					System.out.print("Enter the car's Mileage as an integer, e.g. 102000: ");
					int mileage = input.nextInt();
					System.out.print("Enter the car's miles per gallon rating as an integer, e.g. 22: ");
					int mpg = input.nextInt();
					System.out.print("Enter the amount paid to obtain the car including cents, e.g. 22000.00: ");
					double cost = input.nextDouble();
					System.out.print("Enter the list price of the car including cents, e.g. 25000.00: ");
					double salesPrice = input.nextDouble();
					inventory.addCar(id,  mileage,  mpg,  cost,  salesPrice);
					System.out.println("The " + id + " was added to the inventory.");
					break;
				//sells a car that the user selects based on ID input
				case 2:
					System.out.print("Enter the car's identifier, e.g. 2005 Honda Civic: ");
					input.nextLine();
					String id_case2 = input.nextLine();
					System.out.print("Enter the price the car was sold for including cents, e.g. 15000.00 ");
					double soldPrice = input.nextDouble();
					inventory.sellCar(id_case2, soldPrice);
					break;
				//lists the inventory within the CarLot
				case 3:
					ArrayList<Car> case3_array = inventory.getCarsInOrderOfEntry();
					for (int i = 0; i < case3_array.size(); i++) {
						System.out.println(case3_array.get(i).toString());
					}
					
					break;
				//lists the CarLot's inventory sorted by best Miles Per Gallon rating of the cars	
				case 4:
					ArrayList<Car> case4_array = inventory.getCarsSortedByMPG();
					for (int i = 0; i < case4_array.size(); i++) {
						System.out.println(case4_array.get(i).toString());
					}
					break;
				//this displays a car with the highest miles per gallon rating currently on the lot	
				case 5:
					System.out.println("Highest MPG car on the lot: " + inventory.getCarWithBestMPG());
					break;
				//this displays a car with the highest total mileage currently on the lot	
				case 6:
					System.out.println("Highest mileage car on the lot: " + inventory.getCarWithHighestMileage());
					break;
				//this will display the total average miles per gallon rating of all cars currently on the lot	
				case 7:
					System.out.println("Average MPG for all inventory: " + inventory.getAverageMpg());	
					break;
				//this will return the total amount of profit generated from sales of cars on the lot	
				case 8:
					System.out.println("Total profit for all cars sold: " + inventory.getTotalProfit());
					break;
				case 9:
					System.out.println("Loading Data from carlot.txt...");
					inventory.loadFromDisk();
					break;
				case 10:
					System.out.println("Saving data to carlot.txt...");
					inventory.saveToDisk();
					break;
				}
			} while (option != 0);
			//closing the scanner object
			input.close();
	}

}