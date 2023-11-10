import java.util.Scanner;

/** 
 * Program to present a 5 option menu and ask for user input
 * @author Schroeder
 */
public class MenuProgram {

	/**
	 * Starts Program running and presents menu
	 * @param args command line arguments
	 */
	public static void main(String[] args) {
		//Create scanner named input
		Scanner input = new Scanner(System.in);
		
		//Create option variable for upcoming loop
		int option;
		
		/**
		 * Begin loop, show menu, and ask for user input
		 * If zero is entered, exit program. Otherwise, tell user what option was chosen and await further input.
		 */
		do {
			
			for (int i = 0; i < 6; i++) {
				if (i == 0) {
					System.out.println("[0] to Exit");
				} else {
					System.out.println("[" + i + "] Option " + i);
				}
			}
			
			System.out.println("Enter a number from 0 to 5 : ");
			option = input.nextInt();
			switch (option) {
			case 0: break;
			case 1:
			case 2:
			case 3:
			case 4:
			case 5: System.out.println("You selected option " + option);
					System.out.println("Press any key and then enter to continue");
					String temp = input.next();
					break;
			}
			
		} while (option >= 1 && option <=5);
		
		//Displays exit message
		System.out.println("Goodbye!");
	}

}
