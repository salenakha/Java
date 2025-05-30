package RecursiveAreaLab;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
/**
 * @author salenakha
 * @version 2-1-23
 */

//Define a point class that represents an x, y coordinate pair
class Point { //create a point class to manage the user input coordinates
    //create x and y variables
    private final double x;
    private final double y;

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() { //get x for each coordinate
        return x;
    }
    public double getY() { //get y for each coordinate
        return y;
    }
}

public class PolygonArea {

    private ArrayList<Point> coordinates; //create an arraylist of Points with each coordinate (x,y)

    public PolygonArea(String userInput) { //user input parameter, the user will enter one line consisting of each point
        this.coordinates = new ArrayList<Point>(); //creates the list of points
        String[] inputToStrArr = userInput.split(" ");
        //keeps the input so that the user can add a space between each x and y coordinate in UI
        //['2', '3', '-10']

        for (int i = 1; i < inputToStrArr.length; i += 2) { //to get each x and y coordinate
            int x1 = Integer.parseInt(inputToStrArr[i-1]);
            //to get x, take the user input array starting w/ the 0th index, and keep +=2
            int y1 = Integer.parseInt(inputToStrArr[i]);
            //to get y, take the user input array and start with the 1st index, keep +=2
            Point p = new Point(x1, y1);
            coordinates.add(p); //coordinates is the array of points (x,y)
        }
    }

    public String getCoordinatesArrayList() {
        //create this to make the array of points to a string
        String res = "";
        for(Point p: coordinates) { //for each point, get the x and y as a string
            res += "(" + String.valueOf(p.getX()) + "," + String.valueOf(p.getY()) + ")" + " ";
        }
        return res;
    }

    public boolean hasNoPolygon(ArrayList<Point> inputCoordinates) { //input coordinates can be changed
        //the points do not form a polygon when the number of points is <=3, or if the points create a straight line
        if (inputCoordinates.size() < 3) {
            return true; //has no polygon is true
        }
        //to avoid points that create a line:
        //use the getters for x and y to calculate the slope of the points
        double y2 = inputCoordinates.get(1).getY();
        double y1 = inputCoordinates.get(0).getY();
        double x2 = inputCoordinates.get(1).getX();
        double x1 = inputCoordinates.get(0).getX();

        double initialSlope = (y2 - y1) / (x2 - x1);

        //example: (2, 3), (4, 5), (6, 7), (1, 4), (3, 8)
        for (int i = 2; i < inputCoordinates.size(); i++) { //going through
            double yTwo = inputCoordinates.get(i).getY();
            double yOne = inputCoordinates.get(i - 1).getY();
            double xTwo = inputCoordinates.get(i).getX();
            double xOne = inputCoordinates.get(i - 1).getX();
            double currentSlope = (yTwo - yOne) / (xTwo - xOne);

            if (currentSlope != initialSlope) {
                return false;
            }
        }
        return true;
    }

    //three methods below are for the tester that takes in user coordinates
    public double triangleAreaTest() {
        return triangleArea(coordinates);
    }

    public double polygonAreaTest() {
        return polygonArea(coordinates);
    }

    public boolean hasNoPolygonTest() {
        return hasNoPolygon(coordinates);
    }

    //the first function: calculate the area of the triangle
    public double triangleArea(ArrayList<Point> inputCoordinates) {
        //use the getter in Point to get each x and y for all three points of a triangle
        double x1 = inputCoordinates.get(0).getX();
        double x2 = inputCoordinates.get(1).getX();
        double x3 = inputCoordinates.get(2).getX();
        double y1 = inputCoordinates.get(0).getY();
        double y2 = inputCoordinates.get(1).getY();
        double y3 = inputCoordinates.get(2).getY();

        //these points are put into the formula (absolute value for area)
        return Math.abs((x1 * y2) + (x2 * y3) + (x3 * y1) - (y1 * x2) - (y2 * x3) - (y3 * x1)) / 2;
    }

    //the second function: recursively calculate the area of the polygon
    public double polygonArea(ArrayList<Point> inputCoordinates) {
        //base case: if the shape is polygon && has only three, non-linear points, return triangleArea
        //the base case is just triangle area.
        //code:
        if (hasNoPolygon(inputCoordinates)) {
            return 0;
        }
        if (inputCoordinates.size() == 3) {
            return triangleArea(inputCoordinates);
        } else {
            //if the coordinates are above 3 points, then polygon area
            //cut out a triangle using points at index 0, n-1, n-2
            int n = inputCoordinates.size();
            ArrayList<Point> resTriangle =
                    new ArrayList<Point>(Arrays.asList(inputCoordinates.get(0), inputCoordinates.get(n - 1), inputCoordinates.get(n - 2)));
            inputCoordinates.remove(n - 1);
            //this removes the last value of the array inputCoordinates, made for removing a value
            //this is the reduction step. take away one point of the polygon each time, until it gets to 3 points
            //when it has three, it will return triangleArea.
            return triangleArea(resTriangle) + polygonArea(inputCoordinates);
        }

    }
}



