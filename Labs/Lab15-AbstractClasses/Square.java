/**
 * Class to create a square object that extends geometric object
 * and implements colorable
 * @author Aiden Schroeder
 */
public class Square extends GeometricObject implements Colorable {

    /** side length of square */
    private double side = 0;

    /**
     * no-arg constructor that creates a square with side 0
     */
    public Square() { }

    /**
     * constructor that creates a square with specified side
     * @param side length of side
     */
    public Square(double side) {
        this.side = side;
    }

    /**
     * prints how to color the square
     */
    public void howToColor() {
        System.out.println("Color all four sides.");
    }

    /**
     * Calculates and returns area of square
     * @return area of square
     */
    @Override
    public double getArea() {
        return Math.pow(side, 2);
    }

    /**
     * Calculates and returns perimeter of square
     * @return perimeter of square
     */
    @Override
    public double getPerimeter() {
        return side * 4;
    }
}
