import java.util.Calendar;
import java.util.GregorianCalendar;

/**
 * Class for employee based on person
 * @author Aiden
 */
public class Employee extends Person {
    private String office = " ";
    private double salary = 0;
    private java.util.Calendar dateHired;

    /**
     * constructor for employee including name
     * @param name passed to super to be assigned to name
     */
    public Employee(String name) {
        super(name);
    }

    /**
     * default contructor for employee
     */
    public Employee() {

    }

    /**
     * full constructor for employee that requires all instance and super variables
     * @param name
     * @param address
     * @param phoneNumber
     * @param email
     * @param office
     * @param salary
     * @param dateHired
     */
    public Employee(String name, String address, double phoneNumber, String email, String office, double salary, Calendar dateHired) {
        super(name, address, phoneNumber, email);
        this.office = office;
        this.salary = salary;
        this.dateHired = dateHired;
    }

    /**
     * Override default toString method
     * @return a readable string
     */
    @Override
    public String toString() {
        return ("Employee: " + this.getName());
    }
}

