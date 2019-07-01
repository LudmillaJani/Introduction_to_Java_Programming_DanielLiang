/* Geometry: point in a rectangle?
Write a program that prompts the user to enter a point (x,y) and checks whether  the point is
the rectangle centered at (0,0) with width 10 and height 5.
A point is in the rectangle if its horizontal distance to (0,0) is less than or equal to width/x and its
vertical distance to (0,0) is less than or equal to height/y.
 */
import java.util.Scanner;
public class pointInaCircle {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a point with two coordinates: ");
        double x = input.nextDouble();
        double y = input.nextDouble();

        //width = 10  height =5. Since centered at 0,divide by 2
        boolean isInCircle = (Math.abs(x)<= 10/2) && (Math.abs(y)<=5/2);

        System.out.print("The point (" +x + ","+y + ")" + ((isInCircle)? " is ":" is not") + " in the Rectangle" );

    }
}
