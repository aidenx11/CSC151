public class Person {
    private String name = " ";
    private String address = " ";
    private double phoneNumber = 0;
    private String email = " ";
    public Person() {

    }

    public Person(String name) {
        this.name = name;
    }

    public Person(String name, String address, double phoneNumber, String email) {
        this.name = name;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.email = email;
    }

    public String getName() {
        return this.name;
    }

    public String toString() {
        return ("Person: " + name);
    }
}
