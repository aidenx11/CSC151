import java.util.Calendar;

public class Faculty extends Employee {

    private java.util.Calendar officeHours;

    private String rank = " ";

    public Faculty(String name) {
        super(name);
    }
    public Faculty(String name, String address, double phoneNumber, String email, String office, double salary, Calendar dateHired,
                   Calendar officeHours, String rank) {
        super(name, address, phoneNumber, email, office, salary, dateHired);
        this.officeHours = officeHours;
        this.rank = rank;
    }

    @Override
    public String toString() {
        return ("Faculty: " + this.getName());
    }
}
