/* Geometry: two rectangles
Write a program that prompts the user to enter the center x,y - coordinates, width, and height
of two rectangles and determines whether the second rectangle is inside the first or overlaps
with the first.
 */
import java.util.Scanner;
public class twoRectangles {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        //first rectangle
        System.out.print("Enter r1's center x,y -coordinates, width and height: ");
        double x1 = input.nextDouble();
        double y1 = input.nextDouble();
        double width1 = input.nextDouble();
        double heght1 = input.nextDouble();

        //second rectangle
        System.out.print("Enter r1's center x,y -coordinates, width and height: ");
        double x2 = input.nextDouble();
        double y2 = input.nextDouble();
        double width2 = input.nextDouble();
        double height2 = input.nextDouble();

        //x and y distance from rect1 and rect2
        double x_distance = Math.abs(x2-x1);
        double y_distance = Math.abs(y2-y1);

        //check
        if(x_distance <= (width1 - width2)/2 &&
                y_distance <= (heght1-height2))
            System.out.print("r2 is inside r1");
        else if(x_distance <= (width1 + width2)/2 &&
                y_distance <= (heght1+height2))
            System.out.print("r2 overlaps r1");
        else
            System.out.print("r2 does not overlap r1");


    }
}
