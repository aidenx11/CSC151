/**
 * Class to generate, modify, and manage cars in the CarLot project
 * @author Aiden Schroeder
 * @author Brandon Siffer
 * @author Casee Newton
 * @author Edison Kaulfuss
 */

public class Car
{

	// define the variables used in the Car class's constructor
	// initialize to default values
	private String id = "";
	private int mileage = 0;
	private int mpg = 0;
	private double cost = 0;
	private double salesPrice = 0;
	private boolean sold = false;
	private double priceSold = 0;
	private double profit = 0;

	//no-arg constructor for car class
	public Car()
	{

	}

	/**
	 * argument constructor for car class to be initialized to input values
	 * @param id car id
	 * @param mileage amount of miles on car
	 * @param mpg miles per gallon of car
	 * @param cost price dealership paid for car
	 * @param salesPrice price dealership lists car for
	 */
	public Car(String id, int mileage, int mpg, double cost, double salesPrice)
	{
		this.id = id; // set the car's ID as a string
		this.mileage = mileage; // set the car's mileage as an integer
		this.mpg = mpg; // set the car's miles per gallon as an integer
		this.cost = cost; // set the car's cost as a double
		this.salesPrice = salesPrice; // set the car's sales price as a double
	}

	//returns price the dealership paid for the car
	public double getCost()
	{
		return cost;
	}

	//returns car id
	public String getId()
	{
		return id;
	}

	//returns mileage on car
	public int getMileage()
	{
		return mileage;
	}

	//returns mpg of car
	public int getMPG()
	{
		return mpg;
	}

	//return price car sold for, 0 if not sold yet
	public double getPriceSold()
	{
		return priceSold;
	}


	//returns profit from car, 0 if not sold yet
	public double getProfit()
	{
		return profit;
	}

	//Returns sales price of car
	public double getSalesPrice()
	{
		return salesPrice;
	}

	//Returns whether or not car is sold
	public boolean isSold()
	{
		return sold;
	}

	/**
	 * Changes car ID
	 * @param id for id to be changed to
	 */
	public void setId(String id)
	{
		this.id = id;
	}

	/**
	 * Changes car mileage
	 * @param mileage for mileage to be changed to
	 */
	public void setMileage(int mileage)
	{
		this.mileage = mileage;
	}

	/**
	 * Changes car MPG
	 * @param mpg for mpg to be changed to
	 */
	public void setMpg(int mpg)
	{
		this.mpg = mpg;
	}

	/**
	 * Changes car cost
	 * @param cost for cost to be changed to
	 */
	public void setCost(double cost)
	{
		this.cost = cost;
	}

	/**
	 * Changes sales price of car
	 * @param salesPrice for price to be changed to
	 */
	public void setSalesPrice(double salesPrice)
	{
		this.salesPrice = salesPrice;
	}

	/**
	 * Marks car as sold
	 * @param sold whether or not the car is sold
	 */
	public void setSold(boolean sold)
	{
		this.sold = sold;

	}

	/**
	 * Sets price car was sold for
	 * @param priceSold price car was sold for
	 */
	public void setPriceSold(double priceSold)
	{
		this.priceSold = priceSold;
	}

	/**
	 * Marks car as sold, sets sold for price and calculates profit
	 * @param priceSold
	 */
	public void sellCar(double priceSold)
	{
		this.setPriceSold(priceSold);
		profit = priceSold - this.getCost();
		this.setSold(true);
	}

	/**
	 * compares mpg of this car to another car
	 * @param otherCar car's mpg to compare this car to
	 * @return -1 if other car's mpg is higher than this car, 1 if vice-versa, and 0 if they are the same
	 */
	public int compareMpg(Car otherCar)
	{
		if (this.getMPG() > otherCar.getMPG()) {
			return 1;
		} else if (this.getMPG() == otherCar.getMPG()) {
			return 0;
		} else {
			return -1;
		}
	}

	/**
	 * compares mileage of this car to another car
	 * @param otherCar car to be compared to this car
	 * @return -1 if other car's mileage is higher than this car, 1 if vice-versa, and 0 if they are the same
	 */
	public int compareMileage(Car otherCar)
	{
		if (this.getMileage() > otherCar.getMileage()) {
			return 1;
		} else if (this.getMileage() == otherCar.getMileage()) {
			return 0;
		} else {
			return -1;
		}
	}

	/**
	 * compares sales price of this car to another car
	 * @param otherCar car to be compared to this car
	 * @return -1 if other car's sales price is higher than this car, 1 if vice-versa, and 0 if they are the same
	 */
	public int comparePrice(Car otherCar)
	{
		if (this.getSalesPrice() > otherCar.getSalesPrice()) {
			return 1;
		} else if (this.getSalesPrice() == otherCar.getSalesPrice()) {
			return 0;
		} else {
			return -1;
		}
	}

	/**
	 * returns human readable version of the attributes of this car
	 */
	@Override
	public String toString()
	{
		return ("ID: " + this.getId() + "\nMileage: " + this.getMileage() + "\nMPG: "
				+ this.getMPG() + "\nCost: " + this.getCost() + "\nSales Price: " + this.getSalesPrice()
				+ "\nSold? " + this.isSold() + "\nPrice Sold: " + this.getPriceSold());
	}

}