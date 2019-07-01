/* Geometry: two circles
Write a program that prompts the suer to enter the center coordinates and radius  of two circles
and determines whether the second circle is inside the first or overlaps with the first.
 */
import java.util.Scanner;
public class twoCircles {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter circle1's center x,y -coordinates, and radius: ");
        double x1 = input.nextDouble();
        double y1 = input.nextDouble();
        double radius1 = input.nextDouble();

        System.out.print("Enter circle2's center x,y - coordinates, and radius: ");
        double x2 = input.nextDouble();
        double y2 = input.nextDouble();
        double radius2 = input.nextDouble();

        //x and y distance between the tow centers
        double distanceBitweenCircles = Math.pow( Math.pow(x2-x1,2) + Math.pow(y2-y1,2) , 0.5);
        double xDistance = Math.abs(x2 - x1);
        double yDistance = Math.abs(y2 - y1);

        if(distanceBitweenCircles <= Math.abs(radius1 - radius2))
            System.out.print("circle2 is inside circle1");
        else if(distanceBitweenCircles <= Math.abs(radius1 + radius2))
            System.out.print("circle2 overlaps circle1");
        else
            System.out.print("circle2 and circle1 do not overlap");






    }
}
