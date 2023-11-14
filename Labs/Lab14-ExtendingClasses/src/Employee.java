import java.util.Calendar;
import java.util.GregorianCalendar;
public class Employee extends Person {
    private String office = " ";
    private double salary = 0;
    private java.util.Calendar dateHired;

    public Employee(String name) {
        super(name);
    }

    public Employee() {

    }


    public Employee(String name, String address, double phoneNumber, String email, String office, double salary, Calendar dateHired) {
        super(name, address, phoneNumber, email);
        this.office = office;
        this.salary = salary;
        this.dateHired = dateHired;
    }

    @Override
    public String toString() {
        return ("Employee: " + this.getName());
    }
}

