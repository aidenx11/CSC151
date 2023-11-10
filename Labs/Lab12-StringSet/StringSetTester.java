/**
 * Class to test the StringSet class.
 * Contains main method.
 * @author Aiden Schroeder
 */
import java.util.*;

public class StringSetTester {
    /**
     * Starts program running and tests the StringSet class based on user input
     * @param args command line inputs
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int numberOfStringsToAdd = 0;

        boolean isValid = false;
        while (!isValid) {
            System.out.println("Please enter the number of Strings you would like to add (minimum of 1, maximum of 15): ");
            numberOfStringsToAdd = input.nextInt();
            input.nextLine();
            if (numberOfStringsToAdd != 0) {
                isValid = true;
            } else {
                System.out.println("Invalid input. Please try again.");
            }
        }

        StringSet s = new StringSet();

        for (int i = 1; i < numberOfStringsToAdd + 1; i++) {
            String stringToAdd;
            System.out.println("Enter string number " + i + ": ");
            stringToAdd = input.nextLine();
            s.add(stringToAdd);
        }

        System.out.println("The size of your StringSet is " + s.size() + " Strings and " + s.numChars() + " total characters.");

        System.out.println("Enter a substring to search for: ");
        String stringToSearchFor = input.nextLine();
        System.out.println("There are " + s.countStrings(stringToSearchFor) + " instances of " + stringToSearchFor + " in your StringSet.");

    }
}
