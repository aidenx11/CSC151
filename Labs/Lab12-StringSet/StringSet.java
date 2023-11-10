/**
 * class to create and modify a StringSet object that can store up to 15 strings.
 * @author Aiden Schroeder
 */
public class StringSet {
    private String[] stringArray = new String[15];
    
    //indicates the number of String objects that the StringSet currently contains

    private int numberOfStrings = 0;

    //no-argument constructor
    public StringSet() {

    }
    // a mutator that adds a String newStr to the StringSet object.  If adding the new String to the String[] succeeds, the add method returns true.
    // If adding the new String to the String[] fails (maybe the array is already full, for example), add returns false.
    boolean add(String newStr) {
        boolean b = false;
        if (numberOfStrings < 15) {
            stringArray[numberOfStrings] = newStr;
            numberOfStrings++;
            b = true;
        }
        return b;
    }

    // a mutator that removes the most-recently added String from the StringSet.  If the StringSet is empty, the method does nothing.
    void pop() {
        stringArray[numberOfStrings - 1] = null;
        numberOfStrings--;
    }


    // an accessor that returns the number of String objects that have been added to this StringSet object
    int size() {
        return numberOfStrings;
    }

    // an accessor that returns the sum of the number of elements that are valid integers.
    int sumValidIntegers() {
        int sum = 0;
        for (int i = numberOfStrings - 1; i >= 0; i--) {
            try {
                sum += Integer.parseInt(stringArray[i]);
            } catch (NumberFormatException e) {
                sum += 0;
            }
        }
        return sum;
    }

    // an accessor that returns the total number of characters in all the Strings that have been added to this StringSet object
    int numChars() {
        int sum = 0;
        for (int i = numberOfStrings - 1; i >= 0; i--) {
            sum += stringArray[i].toCharArray().length;
        }
        return sum;
    }

    // an accessor that returns the number of Strings in the StringSet object that contain a given substring
    int countStrings(String stringToLookFor) {
        int numberOfStringsWithSubstring = 0;
        for (int i = numberOfStrings - 1; i >= 0; i--) {
            if (stringArray[i].contains(stringToLookFor)) {
                numberOfStringsWithSubstring++;
            }
        }
        return numberOfStringsWithSubstring;
    }

}