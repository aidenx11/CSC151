/**
 * Class for person; parent to all other classes
 * @author Aiden
 */
public class Person {
    private String name = " ";
    private String address = " ";
    private double phoneNumber = 0;
    private String email = " ";

    /**
     * default constructor for a person
     */
    public Person() {

    }

    /**
     * constructor for a person with only a name; used in all subclasses
     * @param name to be assigned to person
     */
    public Person(String name) {
        this.name = name;
    }

    /**
     * Full constructor for person, including all instance variables
     * @param name
     * @param address
     * @param phoneNumber
     * @param email
     */
    public Person(String name, String address, double phoneNumber, String email) {
        this.name = name;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.email = email;
    }

    /**
     * retrieves name of person and passes it to caller; used for tester class
     * @return name of person
     */
    public String getName() {
        return this.name;
    }

    /**
     * Override default toString method
     * @return a readable string
     */
    public String toString() {
        return ("Person: " + name);
    }
}
