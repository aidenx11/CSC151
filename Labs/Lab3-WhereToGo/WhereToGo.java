/**
 * Package is omitted for simple processing
 * Import Scanner
 */
import java.util.Scanner;

/**
 * Program to choose whether user should go to cinema, go shopping, or stay in.
 * Choice based on whether their parents are visiting, weather is good, and if they are rich.
 * 
 * @author Schroeder
 */
public class WhereToGo {
	
	/**
	 * Starts the program running, asks whether three conditions are true, then decides where to go.
	 * @param args command line arguments
	 */
	public static void main(String[] args) {
		
		/**
		 * Creates new Scanner object named input
		 */
		Scanner input = new Scanner(System.in);
		
		/**
		 * Prompts user to respond whether or not their parents are home, they are rich, and if the weather is good
		 * Stores responses in integer variables
		 */
		System.out.println("Are your parents visiting? Type 0 for yes, 1 for no: ");
		int areParentsVisiting = input.nextInt();
		System.out.println("Is the weather nice? Type 0 for good weather, 1 for bad weather: ");
		int isWeatherGood = input.nextInt();
		System.out.println("Are you rich? Type 0 for rich, 1 for poor: ");
		int isRich = input.nextInt();
		
		/**
		 * Decides what the user should do (Stay home, go to cinema, or go shopping) and displays result
		 */
		if (areParentsVisiting == isWeatherGood && (isRich + areParentsVisiting) != 2) {
			System.out.println("You should go to the cinema!");
		}
		else if (isRich + isWeatherGood >= 1) {
			System.out.println("You should stay in.");
		}
		else {
			System.out.println("You should go shopping!");
		}
			
		/**
		 * Closes Scanner object named input
		 */
		input.close();
	}
}
