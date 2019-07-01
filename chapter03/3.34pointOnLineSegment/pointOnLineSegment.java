/* Geometry: point on line segment
Programing exercise 3.32 shows how to test whether a point is on an unbounded line.
Revise Programming Exercise 3.32 to test whether a point is on a line segment. Write
a program the prompts that prompts the user to enter the three points for p0, p1, p2
and displays whether p2 is on the line segment from p0 to p1.
 */
import java.util.Scanner;
public class pointOnLineSegment {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter three points for p0, p1, and p2: ");
        double x0 = input.nextDouble();
        double y0 = input.nextDouble();
        double x1 = input.nextDouble();
        double y1 = input.nextDouble();
        double x2 = input.nextDouble();
        double y2 = input.nextDouble();

        //use for output
        String p0 = "(" + x0 + ", " + y0 + ")";
        String p1 = "(" + x1 + ", " + y1 + ")";
        String p2 = "(" + x2 + ", " + y2 + ")";
        String isOrNot = "not ";

        //check if the point p2 is on the same line
        boolean p2OnLine = (x1-x0)*(y2-y0)-(x2-x0)*(y1-y0) == 0;
        //check if the point p2 is between the points p0 and p1 ( between the segment [p0,01]
        boolean isInRange = ((x2 < x1 && x2 > x0) || (x2 < x0 && x2 > x1))
                && ((y2 < y1 && y2 > y0) || (y2 < y0 && y2 > y1));

        if(isInRange && p2OnLine)
            isOrNot = "";

        System.out.print(p2 + " is " + isOrNot + "on the line segment from " + p0
                + " to " + p1);

    }
}
