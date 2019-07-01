/* Geometry: area of pentagon
Write a program that prompts the user to enter the length from the center of a pentagon to a vertex
and computes the area of the pentagon. Round up two digits after the decimal point.
 */
import java.util.Scanner;
public class areaOfPentagon {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the length from the center to a vertex: ");
        double r = input.nextDouble();

        //length of a side
        double s = 2 * r * Math.sin(Math.PI / 5);

        //area of the pentagon
        double area = (5 * s*s) / (4 * Math.tan(Math.PI/5));

        System.out.printf("The area of the pentagon is %.2f", area);

    }
}
