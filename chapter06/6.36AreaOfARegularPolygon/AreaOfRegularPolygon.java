/** Write a method that returns the area of a regular polygon
 */
import java.util.Scanner;
public class AreaOfRegularPolygon {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of sides: ");
        int numberOfSides = input.nextInt();
        System.out.print("Enter the side: ");
        double side = input.nextDouble();
        System.out.print("The area of polygon is " + area(numberOfSides,side));

    }

    public static double area(int n, double s){
        double area = (n*s*s)/(4*Math.tan(Math.PI / n));
        return area;
    }
}
