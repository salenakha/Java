package RecursiveAreaLab;

import java.util.Scanner;

public class TesterPolygonArea {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Welcome! Please enter your Polygon points (x,y) in list form as: " +
                "x1 y1 x2 y2 x3 y3 ");
        String pointsStr = s.nextLine();

        PolygonArea test1 = new PolygonArea(pointsStr);

        System.out.println(test1.getCoordinatesArrayList());

        //Testing hasNoPolygon()
        System.out.println("Is this a invalid polygon?");
        System.out.println(test1.hasNoPolygonTest()); //test less than 3 points, straight line


        //testing triangleArea() function
        System.out.println("Print the area of the triangle: "); //test three points, write coordinates and output you're getting
        System.out.println(test1.triangleAreaTest()); //test case with a negative coordinate

        //testing polygonArea() function
        System.out.println("Print the area of the polygon: ");
        System.out.println(test1.polygonAreaTest()); //test case with negative coordinate, square

    }
}
