
import java.util.ArrayList;
/**
 * Class for Team objects for BBall 3x3 program
 * @author Aiden Schroeder
 */
public class Team {
	private ArrayList<Player> myTeam;
	private int nextOpenPosition; //unnecessary for the way I approached this, 
	//but the doc asks for it to be included
	
	//no arg constructor for team
	public Team() {
		myTeam = new ArrayList<Player>();
	}
	
	/**
	 * adds a given player to the team object
	 * @param player to be added
	 */
	public void add(Player player) {
		myTeam.add(player);
	}
	
	/**
	 * returns the players on the team
	 * @return a string of players on this team
	 */
	public Player[] getCurrentTeamMembers() {
		return (Player[]) myTeam.toArray();
	}
	
	/**
	 * calculates the average height of the team in inches
	 * @return average height of the team in inches
	 */
	public int averageHeight() {
		int totalHeight = 0;
		for (int i = 0; i < myTeam.size(); i++) {
			totalHeight += myTeam.get(i).getHeight();
		}
		double averageHeight = totalHeight / myTeam.size();
		return (int) averageHeight;
	}
	//returns a human readable string of the players in the team
	public String toString() {
		return myTeam.toString();
	}
}
