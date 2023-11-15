/**
 * Class for student based on person
 * @author Aiden
 */
public class Student extends Person {
    private final String CLASS_STATUS = " ";

    /**
     * Constructor for student that accepts a name
     * @param name passed to super to assign name
     */
    public Student(String name) {
        super(name);
    }

    /**
     * Full constructor for student including all super variables
     * @param name
     * @param address
     * @param phoneNumber
     * @param email
     */
    public Student(String name, String address, double phoneNumber, String email) {
        super(name, address, phoneNumber, email);
    }

    /**
     * Override default toString method
     * @return a readable string
     */
    @Override
    public String toString() {
        return ("Student: " + this.getName());
    }
}
