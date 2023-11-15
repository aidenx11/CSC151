/**
 * Class for staff based on employee (parent is person)
 * @author Aiden
 */
public class Staff extends Employee{
    private String title = " ";

    /**
     * Constructor for staff including name
     * @param name passed to super to assign a name
     */
    public Staff(String name) {
        super(name);
    }

    /**
     * Default constructor for staff
     */
    public Staff() {

    }
    /**
     * Override default toString method
     * @return a readable string
     */
    @Override
    public String toString() {
        return ("Staff: " + this.getName());
    }
}
