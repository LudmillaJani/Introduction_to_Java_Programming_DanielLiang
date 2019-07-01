/* Geometry: points in triangle
Suppose a right triangle is placed in a plane. The right-angle point is placed at (0,0), and the
other two points are placed at (200,0), and (0,100).
Write a program that prompts the user to enter a  point with x- and y- coordinates and determine
whether the point is inside the triangle.
 */

import java.util.Scanner;
public class pointInTriangle {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a point's x- and y-coordinates:");
        double x = input.nextDouble();
        double y = input.nextDouble();
        String isOrNot = " ";

        //slope of the line m= y2-y1 / x2-x1 .
        //equation of line with slope m =-0.5 and through the point (0,100): y=-0.5x+100
        if(x<200 && y<100 && (y<=100 + (-0.5)*x)){
            isOrNot = "is";
        }
        else
            isOrNot = "is not";

        System.out.print("The point " + isOrNot + " in the triangle");


    }
}
