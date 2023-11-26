import java.util.ArrayList;

/**
 * Abstract class for Vehicle to be used by Bicycle and Dragster
 * @author Aiden Schroeder
 */
public abstract class Vehicle {
    /** assigns a vehicle type to the vehicle */
    private String vehicleType;

    /**
     * returns an arraylist of tires in the vehicle
     * @return tires in the vehicle
     */
    public abstract ArrayList<Tire> getTires();

    /**
     * constructor that accepts a vehicle type to assign
     * @param vehicleType type of vehicle to be assigned
     */
    public Vehicle(String vehicleType) {
        this.vehicleType = vehicleType;
    }

    /**
     * returns the type of vehicle
     * @return type of vehicle
     */
    public String getVehicleType() {
        return vehicleType;
    }
}
