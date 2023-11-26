import java.util.ArrayList;

/**
 * Class for Dragster that extends vehicle
 * @author Aiden Schroeder
 */
public class Dragster extends Vehicle {

    /**
     * default constructor that assigns vehicle type as dragster
     */
    public Dragster() {
        super("dragster");
    }

    /**
     * returns an arraylist of tires in the vehicle
     * @return tires in the vehicle
     */
    public ArrayList<Tire> getTires() {
        ArrayList<Tire> tires = new ArrayList<Tire>(4);
        return tires;
    }
}
