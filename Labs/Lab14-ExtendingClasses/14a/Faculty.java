import java.util.Calendar;

/**
 * Class for faculty based on employee (parent is person)
 * @author Aiden
 */
public class Faculty extends Employee {

    private java.util.Calendar officeHours;

    private String rank = " ";

    /**
     * Constructor for faculty including name
     * @param name passed to super to be assigned to name
     */
    public Faculty(String name) {
        super(name);
    }

    /**
     * Full constructor for faculty, including all instance and super variables
     * @param name
     * @param address
     * @param phoneNumber
     * @param email
     * @param office
     * @param salary
     * @param dateHired
     * @param officeHours
     * @param rank
     */
    public Faculty(String name, String address, double phoneNumber, String email, String office, double salary, Calendar dateHired,
                   Calendar officeHours, String rank) {
        super(name, address, phoneNumber, email, office, salary, dateHired);
        this.officeHours = officeHours;
        this.rank = rank;
    }

    /**
     * Override default toString method
     * @return a readable string
     */
    @Override
    public String toString() {
        return ("Faculty: " + this.getName());
    }
}
