
import java.util.Scanner;

/**
 * Class for Game object for BBall 3x3 program; contains main method
 * @author Aiden Schroeder
 */
public class Game {
	private static Scanner input = new Scanner(System.in);
	
	/**
	 * prompts user for inputs for names and heights of players and creates a team
	 * @return team with players from user input
	 */
	private static Team fillRoster() {
		Team team = new Team();
		String name;
		int height;
		
		for (int i = 1; i < 4; i++) {
			System.out.println("Enter team member " + i + ": ");
			System.out.println("Name: ");
			name = input.next();
			System.out.println("Height: ");
			height = input.nextInt();

			team.add(new Player(name, height));
		}
		
		input.close();
		return team;
	}
	
	/**
	 * starts program running and prompts user to enter teams, then outputs the 
	 * rosters and which team is taller
	 * @param args command line arguments
	 */
	public static void main(String[] args) {
		Team home;
		Team visitor;
		
		System.out.println("Enter the home team\n");
		home = Game.fillRoster();
		System.out.println("\nEnter the visiting team\n");
		visitor = Game.fillRoster();
		
		if (home.averageHeight() > visitor.averageHeight()) {
			System.out.println("The home team is taller.");
			System.out.println("Taller team roster: " + home.toString());
			System.out.println("Shorter team roster: " + visitor.toString());
		} else {
			System.out.println("The visiting team is taller.");
			System.out.println("Taller team roster: " + visitor.toString());
			System.out.println("Shorter team roster: " + home.toString());
		}
		
	}
	
}


