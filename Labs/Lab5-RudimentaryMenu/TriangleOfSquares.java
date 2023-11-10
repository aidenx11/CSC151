//package was removed to allow program to run independently
import java.util.Scanner;

/** Program to display a triangle of 2n-1 rows of increasing squares
 * @author Schroeder
 */
public class TriangleOfSquares {
	
	/**Starts program running by prompting user for input
	 * 
	 * @param args command line arguments
	 */

	public static void main(String[] args) {
		//Create Scanner object named input
		Scanner input = new Scanner(System.in);
		
		//Prompt user for input and store in integer variable
		System.out.print("Enter a number between 1 and 9, inclusive: ");
		int columns = input.nextInt();
		int rows = 2 * columns - 1;
		
		/**
		 * Determines whether or not cell in a table should be blank or have
		 * a squared number and displays it
		 * 
		 * I am stuck here. I cannot figure out how to create white space
		 * where it is needed in the second half of the triangle. If you can show
		 * me what I am missing, I would really appreciate it! Hopefully this can 
		 * count for some partial credit. I regret not doing this earlier in the week! 
		 */
		for (int i = 1; i < rows + 1; i++) {
			
			for (int j = columns; j > 0; j--) {
				
				if (j > i || i > columns) {
					System.out.print("   ");
				} else if (j <= i) {
					if (j < 4) {
						System.out.print("  " + j * j);
					} else {
						System.out.print(" " + j * j);
					}					
				}
			}

			System.out.println();
			
			}
			
		}
		
	}

