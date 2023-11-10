//Import arrays class
import java.util.Arrays;


/**
 * Program to calculate a random array of one million numbers from ranging from 0 to 1, non inclusive.
 * Find average of the original array, the array sorted high to low, and the array sorted low to high.
 * Return the values of the averages and decide if they are identical.
 * @author Schroeder
 */
public class AveragingNumbers {

	/**
	 * Generates an array of one million doubles >0 and <1. Sorts the arrays and calculates averages, '
	 * then prints average and if they are identical.
	 * @param args command line arguments
	 */
	public static void main(String[] args) {
		
		/**
		 * Create double array of size one million and fill with random doubles >0 and <1
		 */
		double[] array = new double[1000000];
		for (int i = 0; i < array.length; i++) {
			array[i] = Math.random();
		}
		
		/**
		 * Sorts original array from lowest to highest and highest to lowest, and finds averages of all three
		 */
		double averageRandom = avg(array);
		
		double[] sortedLoToHi = loToHi(array);
		double averageLoToHi = avg(sortedLoToHi);
		
		double[] sortedHiToLo = hiToLo(array);
		double averageHiToLo = avg(sortedHiToLo);
		
		/**
		 * Displays averages of the three arrays
		 */
		System.out.println("Average of one million random numbers: " + averageRandom);
		System.out.println("Average of one million random numbers sorted low to high: " + averageLoToHi);
		System.out.println("Average of one million random numbers sorted high to low: " + averageHiToLo);
		
		/**
		 * Decides if the three averages equal each other and displays result to system output
		 */
		if (averageRandom == averageLoToHi && averageLoToHi == averageRandom) {
			System.out.println("The three averages are identical.");
		} else {
			System.out.println("The three averages are not identical, but they are very close!");
		}
		
	}
	
	/**
	 * Method to sort an array from lowest to highest numbers without altering input array
	 * @param original array of doubles
	 * @return input array sorted from lowest number to highest number
	 */
	public static double[] loToHi(double[] original) {
		
		/**
		 * Creates a copy of input array so as to not alter it
		 */
		double[] lowestToHighest = new double[original.length];
		
		for (int i = 0; i < original.length; i++) {
			lowestToHighest[i] = original[i];
		}
		
		Arrays.sort(lowestToHighest);
		return lowestToHighest;
	}
	
	/**
	 * Method to sort an array from highest to lowest numbers without altering input array
	 * @param original array of doubles
	 * @return input array sorted from highest number to lowest number
	 */
	public static double[] hiToLo(double[] original) {
		
		/**
		 * Creates a copy of input array so as to not alter it
		 */
		double[] highestToLowest = new double[original.length];
		for (int i = 0; i < original.length; i++) {
			highestToLowest[i] = original[i];
		}
		
		/**
		 * Sorts number in array copy from low to high, then swaps the terms to make them high to low
		 */
		highestToLowest = loToHi(highestToLowest);
		for (int i = 0; i < highestToLowest.length / 2; i++) {
			double temp = highestToLowest[i];
			highestToLowest[i] = highestToLowest[highestToLowest.length - 1 - i];
			highestToLowest[highestToLowest.length - 1 - i] = temp;
		}
		
		return highestToLowest;
	}
	
	/**
	 * Method to calculate average of all terms in an array
	 * @param original array of doubles
	 * @return average of sum of terms in input array
	 */
	public static double avg(double[] original) {
		
		/**
		 * Creates variables for average and sum, calculates sum of terms of input array
		 * and then calculates the average of the terms
		 */
		double average;
		double sum = 0;
		for (int i = 0; i < original.length; i++) {
			sum += original[i];
		}
		
		average = (sum / (double)original.length);
		
		return average;
	}
	
	
	
	
	
	
	
}
