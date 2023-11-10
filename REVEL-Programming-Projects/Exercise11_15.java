/*
A polygon is convex if it contains any line segment that connects two points of the polygon.
 Write a program that prompts the user to enter the number of points in a convex polygon,
 then enter the points clockwise, and display the area of the polygon.

Sample Run:
Enter the number of points: 7
Enter the coordinates of the points:
-12 0 -8.5 10 0 11.4 5.5 7.8 6 -5.5 0 -7 -3.5 -5.5
The total area is 244.575
 */
import java.util.ArrayList;
import java.util.Scanner;



public class Exercise11_15 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of points");
        int numberOfPoints = input.nextInt();
        System.out.println("Enter the coordinates of the points:");
        ArrayList<Double> coordinateList = new ArrayList<>();


        for (int i = 0; i < numberOfPoints * 2; i++) {
            coordinateList.add(input.nextDouble());
        }

        System.out.println("The total area is " + getArea(coordinateList));
    }

    public static double getArea(ArrayList<Double> list) {
        double area = 0;
        ArrayList<Double> organizedList = new ArrayList<>(list);

        organizedList.add(organizedList.get(0));
        organizedList.add(organizedList.get(1));

        double firstPart = 0;
        for (int i = 0; i < organizedList.size() - 3; i += 2) {
            firstPart += (organizedList.get(i) * organizedList.get(i + 3));
        }
        System.out.println(firstPart);
        double secondPart = 0;
        for (int i = 1; i < organizedList.size() - 1; i += 2) {
            secondPart += (organizedList.get(i) * organizedList.get(i + 1));
        }
        System.out.println(secondPart);

        area = (0.5 * (firstPart - secondPart));

        return area > 0 ? area : -area;
    }
}
