/*
 *
 *  Contributors
 *  @author Brandon Siffer
 *  @author Aiden Schroeder
 *  @author Casee Newton
 *  @author Edison Kaulfuss
 *
 *
 */

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.sql.Array;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * Class to manage inventory of cars for sale
 */
public class CarLot extends ArrayList<Car> {

	//Default getter for inventory
	public ArrayList<Car> getInventory() {
		return this;
	}

	//Default setter for inventory
	public void setInventory(ArrayList<Car> inventory) {
		this.clear();
		for (int i = 0; i < inventory.size(); i++) {
			this.add(inventory.get(i));
		}
	}

	/**
	 * Returns a car based on the input identifier, or returns null if the car is not found
	 *
	 * @param identifier ID of car to be indexed
	 * @return car with given ID or null if not found
	 */
	public Car findCarByIdentifier(String identifier) {

		for (int i = 0; i < this.size(); i++) {
			if (this.get(i).getId().equals(identifier)) {
				return this.get(i);
			}
		}
		return null;
	}

	/**
	 * Creates and returns a new array of cars in Car Lot in the order they were entered into the lot
	 *
	 * @return array of cars in order of entry
	 */
	public ArrayList<Car> getCarsInOrderOfEntry() {
		ArrayList<Car> sortedArrayList = new ArrayList<>(this.size());

		for (int i = this.size() - 1; i >= 0; i--) {
			sortedArrayList.add(this.get(i));
		}

		return sortedArrayList;

	}

	/**
	 * creates a new array list with cars sorted by MPG
	 *
	 * @return the sorted array
	 */
	public ArrayList<Car> getCarsSortedByMPG() {
		ArrayList<Car> sortedArray = new ArrayList<>(this);

		for (int i = 0; i < this.size(); i++) {
			sortedArray.set(i, this.get(i));
		}

		for (int i = 0; i < sortedArray.size(); i++) {

			for (int j = i + 1; j < sortedArray.size(); j++) {
				Car temp = new Car();
				if (sortedArray.get(j).compareMpg(sortedArray.get(i)) == -1) {
					temp = sortedArray.get(i);
					sortedArray.set(i, sortedArray.get(j));
					sortedArray.set(j, temp);
				}
			}
		}

		return sortedArray;
	}

	/**
	 * checks inventory for the car with the highest mpg and returns it
	 *
	 * @return car with highest mpg
	 */
	public Car getCarWithBestMPG() {
		ArrayList<Car> checkMPG = this;
		Car highestMPG = new Car();
		int highest = 0;
		for (Car car : checkMPG) {
			if (car.getMPG() > highest) {
				highest = car.getMPG();
				highestMPG = car;
			}
		}

		return highestMPG;
	}

	/**
	 * Creates a new array of cars in the Car Lot inventory
	 * by highest mileage
	 *
	 * @return car with highest mileage
	 */
	public Car getCarWithHighestMileage() {
		ArrayList<Car> checkMileage = this;
		Car highestMileage = new Car();
		int highest = 0;
		for (Car car : checkMileage) {
			if (car.getMileage() > highest) {
				highest = car.getMileage();
				highestMileage = car;
			}
		}
		return highestMileage;
	}

	/**
	 * Creates an array from the car lot inventory that has all of the
	 * MPG and creates and average of the list to return the average MPG
	 * as a double
	 *
	 * @return the average MPG of all cars from the list
	 */
	public double getAverageMpg() {
		double average = 0.0;
		int sum = 0;
		ArrayList<Car> carList = this;
		int size = carList.size();
		for (Car car : carList) {
			sum += car.getMPG();
		}
		average = sum / (double) size;
		return average;
	}

	/**
	 * Creates a total of all the profit from any car that was sold
	 * from the Car Lot and returns it as a double
	 *
	 * @return total profit of all the cars that have been sold
	 */
	public double getTotalProfit() {
		double totalProfit = 0.0;
		for (Car car : this) {
			if (car.isSold()) {
				totalProfit += car.getProfit();
			}
		}
		return totalProfit;
	}

	/**
	 * Adds a car to the ArrayList with the Car non-blank Car constructor
	 *
	 * @param id         Identifying String of a Car
	 * @param milage     integer indicating current amount of miles on a car
	 * @param mpg        integer indicating amount of miles a car can travel on a gallon of gas on average
	 * @param cost       double indicating cost of acquisition.
	 * @param salesPrice double indicating amount offered to customers
	 */
	public void addCar(String id, int milage, int mpg, double cost, double salesPrice) {

		Car incomingCar = new Car(id, milage, mpg, cost, salesPrice);
		this.add(incomingCar);
	}

	/**
	 * Performs code necessary to sell a car based on the input identifier, throws IllegalArgument Exception if the car is not found
	 *
	 * @param identifier ID of car to be sold
	 * @param priceSold  double indicating the price a Car was sold to a customer for
	 */
	public void sellCar(String identifier, double priceSold) {

		Car workingCar = findCarByIdentifier(identifier);
		try {
			if (workingCar != null) {
				workingCar.sellCar(priceSold);
			} else {
				throw new IllegalArgumentException("Car with this identifier was not found.");
			}
		} catch (IllegalArgumentException e) {
			System.out.print(e.toString());
		}
	}

	/**
	 * Saves current inventory to carlot.txt file
	 * @throws FileNotFoundException if carlot.txt is not found
	 */
	public void saveToDisk() throws FileNotFoundException {

		try {
			File carlot = new File("carlot.txt");
			PrintWriter out = new PrintWriter("carlot.txt");
			for (int i = 0; i < this.size(); i++) {
				out.write(this.get(i).toString() + "\n");
			}
			out.close();
		} catch (FileNotFoundException ex) {
			ex.printStackTrace();
		}

	}

	/**
	 * loads inventory from carlot.txt to current inventory
	 * @throws FileNotFoundException if carlot.txt is not found
	 */
	public void loadFromDisk() throws FileNotFoundException {
		try {
			File file = new File("carlot.txt");
			Scanner input = new Scanner(file);
			String ID = " ";
			int mileage = 0;
			int mpg = 0;
			double cost = 0;
			double salesPrice = 0;
			boolean sold = false;
			double priceSold = 0;
			while (input.hasNextLine()) {
				String s = input.nextLine();
				ID = s.substring(4);
				mileage = Integer.parseInt(input.nextLine().substring(9));
				mpg = Integer.parseInt(input.nextLine().substring(5));
				cost = Double.parseDouble(input.nextLine().substring(6));
				salesPrice = Double.parseDouble(input.nextLine().substring(12));
				sold = Boolean.parseBoolean(input.nextLine().substring(6));
				priceSold = Double.parseDouble(input.nextLine().substring(12));
				this.add(new Car(ID, mileage, mpg, cost, salesPrice));
				if (sold) {
					this.findCarByIdentifier(ID).sellCar(priceSold);
				}
			}
		} catch (FileNotFoundException ex) {
			System.out.println("No carlot.txt file found. Check directory or create a file by saving inventory to disk.");
		}
	}
}
