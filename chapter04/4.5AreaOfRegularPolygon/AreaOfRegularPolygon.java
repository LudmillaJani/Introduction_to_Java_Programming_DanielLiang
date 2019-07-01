/*Geometry: area of a regular polygon
A regular polygon is an n-sided polygon in which all sides are of the same length and all
angles have the same degree(i.e the polygon is both equilateral and equiangular).
Write a program that prompts the user to enter the number of sides and their length
of a regular polygon and displays its area.
 */
import java.util.Scanner;
public class AreaOfRegularPolygon {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of sides: ");
        int numberOfSides = input.nextInt();

        System.out.print("Enter the side: ");
        double side = input.nextDouble();

        double area = (numberOfSides * Math.pow(side,2))/ (4*Math.tan(Math.PI / numberOfSides));

        System.out.printf("The area of the polygon is %.2f",  area );


    }
}
