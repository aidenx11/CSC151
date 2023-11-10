//package was removed to allow program to run independently

/**
 * import Scanner
 */
import java.util.Scanner;
 /**
  * Program to manipulate a given string in various ways, as long as the string is longer than seven characters
  * 
  * @author Schroeder
  */
public class StringManipulation {
	
	/**
	 * Starts program, prompts user to enter string, then manipulates it.
	 * @param args command line arguments
	 */
	public static void main(String[] args) {
		
		/**
		 * Creates and initializes scanner named input using default system input
		 */
		Scanner input = new Scanner(System.in);
		
		/**
		 * Prompts user for a string and stores in variable 
		 * If string is shorter than 7 characters, prints error and ends processing
		 * If string is longer than 7 characters, perform various manipulations
		 */
		System.out.println("Enter a line of text: ");
		String s = input.nextLine();
		
		if (s.length() < 7) {
			System.out.println("The input is too short.");
		}
		else {
			
			/**
			 * Determines if input has any leading or trailing whitespace and prints result
			 */
			if (s.equals(s.trim())) {
				System.out.println("The original String has no leading or trailing whitespace.");
			}
			else {
				System.out.println("The original String has leading or trailing whitespace.");
			}
			
			/**
			 * Swaps first two and last five characters of input and prints result
			 */
			String firstTwo = s.substring(0,2);
			String lastFive = s.substring(s.length() - 5);
			System.out.println("First two and last five characters swapped: " + lastFive + s.substring(2, (s.length() - 5)) + firstTwo);
			
			/**
			 * Prints input in all uppercase
			 */
			System.out.println("In uppercase: " + s.toUpperCase());
			
			/**
			 * Detects if the input has an odd or even number of characters
			 * If odd, tells user it is odd. If even, prints middle two characters
			 */
			if (s.length() % 2 == 0) {
				String middleTwo = s.substring((s.length() / 2) - 1, ((s.length() / 2) + 1));
				System.out.println("Middle two characters: " + middleTwo);
			}
			else {
				System.out.println("The line has an odd number of characters");
			}
			
			/**
			 * Prints compareTo results of comparing input in all lowercase to original
			 */
			System.out.println("Results of compareTo: " + s.compareTo(s.toLowerCase()));
			
			/**
			 * Determines if first half of input equals last half, then prints result
			 */
			String firstHalf = s.substring(0, s.length() / 2);
			String secondHalf = s.substring(s.length() / 2);
			if (firstHalf.equalsIgnoreCase(secondHalf)) {
				System.out.println("The first half of " + s + " is the same as the second half (excluding case)");
			}
			else {
				System.out.println("The first half of \"" + s + "\" is not the same as the second half");
			}
			
			/**
			 * Prints input with the first 'e', 'E', 's', or 'S' removed; whichever occurs first
			 */
			int EIndex = s.indexOf('E');
			int eIndex = s.indexOf('e');
			int SIndex = s.indexOf('S');
			int sIndex = s.indexOf('s');
			if ((EIndex < eIndex || eIndex == -1) && (EIndex < sIndex || sIndex == -1) && (EIndex < SIndex || SIndex == -1) && EIndex != -1) {
				System.out.println("Input with the first 'e', 'E', 's', or 'S' removed: " + s.substring(0 , EIndex) + s.substring(EIndex + 1));
			}
			else if ((sIndex < eIndex || eIndex == -1) && (sIndex < EIndex || EIndex == -1) && (sIndex < SIndex || SIndex == -1) && sIndex != -1) {
				System.out.println("Input with the first 'e', 'E', 's', or 'S' removed: " + s.substring(0 , sIndex) + s.substring(sIndex + 1));
			}
			else if ((eIndex < EIndex || EIndex == -1) && (eIndex < sIndex || sIndex == -1) && (eIndex < SIndex || SIndex == -1) && eIndex != -1) {
				System.out.println("Input with the first 'e', 'E', 's', or 'S' removed: " + s.substring(0 , eIndex) + s.substring(eIndex + 1));
			}
			else if ((SIndex < EIndex || EIndex == -1) && (SIndex < sIndex || sIndex == -1) && (SIndex < eIndex || eIndex == -1) && SIndex != -1) {
				System.out.println("Input with the first 'e', 'E', 's', or 'S' removed: " + s.substring(0 , SIndex) + s.substring(SIndex + 1));
			}
		}
		
		/**
		 * Exits Scanner object
		 */
		input.close();
	}
}
