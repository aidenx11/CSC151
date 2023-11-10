/**
 * class for purse object
 * @author Aiden Schroeder
 */
public class Purse {
	
	//Declare and initialize instance variables
	private int pounds = 0;
	private int shillings = 0;
	private int pence = 0;
	
	//No-arg constructor for Purse class
	public Purse() {
		
	}
	
	/**
	 * adds pounds to purse
	 * @param poundsToAdd amount of pounds to add
	 */
	public void addPounds(int poundsToAdd) {
		pounds += poundsToAdd;
	}
	
	/**
	 * adds shillings to purse
	 * @param shillingsToAdd amount of shillings to add
	 */
	public void addShillings(int shillingsToAdd) {
		shillings += shillingsToAdd;
		
		while (shillings >= 20) {
			addPounds(1);
			shillings -= 20;
		}
	}
	
	/**
	 * adds pence to purse
	 * @param penceToAdd amount of pence to add
	 */
	public void addPence(int penceToAdd) {
		pence += penceToAdd;
		
		while (pence >= 12) {
			addShillings(1);
			pence -= 12;
		}
	}
	
	/**
	 * @return amount of pounds in purse
	 */
	public int getPounds() {
		return pounds;
	}
	
	/**
	 * @return amount of shillings in purse
	 */
	public int getShillings() {
		return shillings;
	}

	/**
	 * @return amount of pence in purse
	 */
	public int getPence() {
		return pence;
	}
	
	
	/**
	 * subtracts specified amount of money from purse
	 * @param poundsToRemove amount of pounds to remove
	 * @param shillingsToRemove amount of shillings to remove
	 * @param penceToRemove amount of pence to remove
	 */
	public void spend(int poundsToRemove, int shillingsToRemove, int penceToRemove) {
		
		pounds -= poundsToRemove;
		
		shillings -= shillingsToRemove;
		
		while (shillings < 0) {
			pounds--;
			shillings += 20;
		}
		
		pence -= penceToRemove;
		
		while (pence < 0) {
			shillings--;
			pence += 12;
		}

	}
	
	/**
	 * returns a string containing the contents of purse in a human readable format
	 */
	public String toString() {
		return ("Pounds: " + this.getPounds() + "\nShillings: " + this.getShillings() + "\nPence: " + this.getPence());
	}
	
}