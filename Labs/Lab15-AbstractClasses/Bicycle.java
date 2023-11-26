import java.util.ArrayList;

/**
 * Class that extends Vehicle to create a bicycle
 * @author Aiden Schroeder
 */
public class Bicycle extends Vehicle {

    /**
     * default constructor that assigns vehicle type as bicycle
     */
    public Bicycle() {
        super("bicycle");
    }

    /**
     * returns an arraylist of tires in the vehicle
     * @return tires in the vehicle
     */
    public ArrayList<Tire> getTires() {
        ArrayList<Tire> tires = new ArrayList<Tire>(2);
        return tires;
    }

}
