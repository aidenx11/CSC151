
/**
 * Class for Player objects 
 * @author Aiden Schroeder
 */
public class Player {
	private String name = "";
	private int height = 0;
	
	//no-arg constructor
	public Player() {
		
	}
	
	/**
	 * constructor for specific team member
	 * @param name of player
	 * @param height of player in inches
	 */
	public Player(String name, int height) {
		this.name = name;
		this.height = height;
	}

	//returns name of this player
	public String getName() {
		return name;
	}

	/**
	 * sets name of player
	 * @param name to be set
	 */
	public void setName(String name) {
		this.name = name;
	}

	//returns height of player
	public int getHeight() {
		return height;
	}

	/**
	 * sets height of player
	 * @param height to be set in inches
	 */
	public void setHeight(int height) {
		this.height = height;
	}
	
	//returns human readable string of player's name and height
	public String toString() {
		return ("Name: " + this.getName() + "Height: " + this.getHeight() + " inches\n");
	}
}
