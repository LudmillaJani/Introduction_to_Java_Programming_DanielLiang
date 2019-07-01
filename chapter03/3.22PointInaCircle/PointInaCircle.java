/* Geometry: point in a circle?
Write a program that prompts the user to enter a point (x,y) and checks whether is within the circle
centered at (0,0) with radius 10.
 */
import java.util.Scanner;
public class PointInaCircle {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
         System.out.print("Enter a point with two coordinates: ");
         double x = input.nextInt();
         double y = input.nextInt();

         double distance = Math.pow(x*x + y * y, 0.5);

         boolean isInCircle = (distance <= 10);
        System.out.print("The point (" +x + "," + y + ")" );
         if(isInCircle)
             System.out.print( " is in the circle." );
         else
             System.out.print(" is not in the circle");

    }
}
