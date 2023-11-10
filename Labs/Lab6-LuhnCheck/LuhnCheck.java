import java.util.Scanner;


/**
 * Program to check validity of a credit card number entered in command prompt
 * @author Schroeder
 */
public class LuhnCheck {

	
	/**
	 * Prompts user for credit card number and returns bank and validity
	 * @param args command line arguments
	 */
	public static void main(String[] args) {
		//Create scanner named input
		Scanner input = new Scanner(System.in);
		
		//Prompt user for card number and store in long variable
		System.out.println("Enter the card number to be verified: ");
		long number = input.nextLong();
		
		
		//Display validity of card number or error if input is invalid/cannot be matched to a bank
		String cardType = "";
		if (getSize(number) >= 13 && getSize(number) <= 16) {
			
			if (prefixMatched(number, 4)) {
				cardType = "Visa";
			} else if (prefixMatched(number, 5)) {
				cardType = "MasterCard";
			} else if (prefixMatched(number, 37)) {
				cardType = "American Express";
			} else if (prefixMatched(number, 6)) {
				cardType = "Discover";
			}
			
			if (cardType != "") {
				System.out.println("Your " + cardType + " card is " + (isValid(number) ? "valid." : "invalid."));
			} else {
				System.out.println("Your card could not be matched with a bank. Make sure your card begins with either 4, 5, 6, or 37.");
			}
		} else {
			
			System.out.println("Your input is invalid. Card numbers must be between 13 and 16 digits.");
		}
		
		//Close Scanner
		input.close();
		
	}
	
	/**
	 * Returns true if card number is valid and vice versa
	 * @param number credit card number
	 * @return validity of card number
	 */
	public static boolean isValid(long number) {
		boolean isTrue = false;
		
		if ((sumOfDoubleEvenPlace(number) + sumOfOddPlace(number)) % 10 == 0) {
			isTrue = true;
		}
		
		return isTrue;
	}
	
	
	/**
	 * Determines sum of even place numbers in card number
	 * @param number card number
	 * @return sum of doubled even place numbers
	 */
	public static int sumOfDoubleEvenPlace(long number) {
		
		String numberString = Long.toString(number);
		int sum = 0;
		
		for (int i = 0; i < getSize(number); i += 2) {
			sum += getDigit((numberString.charAt(i) - 48) * 2);
		}
		
		return sum;
	}

	
	/**
	 * Determines if a given number is greater than a single digit. If so, adds the digits together
	 * @param number number to analyze
	 * @return input if number is less than 10, added digits if number is greater than 9
	 */
	public static int getDigit(int number) {
		
		int num = number;
		int digit = 0;
		
		while (num > 0) {
			digit += num % 10;
			num /= 10;
		}
		
		return digit;
	}
	
	
	/**
	 * Adds odd place numbers from card number together
	 * @param number card number
	 * @return sum of odd places
	 */
	public static int sumOfOddPlace(long number) {
		
		int sum = 0;
		String numberString = Long.toString(number);
		
		for (int i = 1; i < getSize(number); i += 2) {
			sum += getDigit(numberString.charAt(i) - 48);
		}
		
		return sum;
	}
	
	
	/**
	 * Determines if the number given matches the given prefix
	 * @param number number to find prefix of
	 * @param d prefix to check for
	 * @return whether or not prefix matches number
	 */
	public static boolean prefixMatched(long number, int d) {
		
		boolean matched = false;
		
		if (d == getPrefix(number, Integer.toString(d).length())) {
			matched = true;
		}
		
		return matched;
	}
	
	
	/**
	 * Gets number of digits in input
	 * @param d number to find size of
	 * @return number of digits in number
	 */
	public static int getSize(long d) {
		
		String dString = Long.toString(d);
		int size = dString.length();
		
		
		return size;
	}
	
	/**
	 * Returns the first k number of digits in number. If number.length() < k, return number
	 * @param number card number
	 * @param k number of characters requested
	 * @return first k digits of number or number, depending
	 */
	public static long getPrefix(long number, int k) {
		
		long prefix;
		String numberString = Long.toString(number);
		
		if (numberString.length() < k) {
			prefix = number;
		} else {
			prefix = Long.parseLong(numberString.substring(0 , k));
		}
		
		return prefix;
	}
	
}
