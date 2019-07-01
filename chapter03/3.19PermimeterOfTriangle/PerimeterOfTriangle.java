/* Compute the perimeter of a triangle
Write a program that reads three edges for a triangle and computes the perimeter if the input
is valid. Otherwise, display that the input is invalid. The input is valid if the sum of every pair
of two edges is greater than the remaining ege.
 */
import java.util.Scanner;
public class PerimeterOfTriangle {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter three edges for a triangle: ");
        System.out.print("Enter first point:");
        double x1 = input.nextDouble();
        double y1 = input.nextDouble();

        System.out.print("Enter second point:");
        double x2 = input.nextDouble();
        double y2 = input.nextDouble();

        System.out.print("Enter third point:");
        double x3 = input.nextDouble();
        double y3 = input.nextDouble();



        boolean inputValid = (x1+y1 > x2+y2 || x1+y1 > x3+y3 || x2+y2 > x3+y3 || x2+y2 > x1+y1 );

        if(inputValid){
            double side1 = Math.pow(Math.pow(x2-x1,2) + Math.pow(y2-y1,2), 0.5);
            double side2 = Math.pow(Math.pow(x3-x1,2) + Math.pow(y3-y1,2), 0.5);
            double side3 = Math.pow(Math.pow(x3-x2,2) + Math.pow(y3-y2,2), 0.5);

            double perimeter = side1 + side2 + side3;

            System.out.print("The perimeter is: " + (int)perimeter);

        }
        else
            System.out.print("The input is not valid.");





    }
}
