public class Student extends Person {
    private final String CLASS_STATUS = " ";

    public Student(String name) {
        super(name);
    }
    public Student(String name, String address, double phoneNumber, String email) {
        super(name, address, phoneNumber, email);
    }

    @Override
    public String toString() {
        return ("Student: " + this.getName());
    }
}
