public class Staff extends Employee{
    private String title = " ";

    public Staff(String name) {
        super(name);
    }

    @Override
    public String toString() {
        return ("Staff: " + this.getName());
    }
}
