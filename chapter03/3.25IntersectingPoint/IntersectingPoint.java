/* Geometry: intersecting point
Two points on line 1 are given as (x1,y1) and (x2,y2) and on line 2 as (x3,y3) and (x4,y4)
The intersecting point of the two lines can be found by solving the two equations.

 */
import java.util.Scanner;
public class IntersectingPoint {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter x1, y1, x2, y2, x3, y3, x4, y4: ");
        double x1 = input.nextDouble();
        double y1 = input.nextDouble();
        double x2 = input.nextDouble();
        double y2 = input.nextDouble();
        double x3 = input.nextDouble();
        double y3 = input.nextDouble();
        double x4 = input.nextDouble();
        double y4 = input.nextDouble();

        double a = y1 - y2;
        double b = x2-x1;
        double e =(y1-y2)*x1-(x1-x2)*y1;
        double c = y3 - y4;
        double d = x4-x3;
        double f = (y3-y4)*x3 - (x3-x4)*y3;

        double x = (e*d-b*f)/(a*d-b*c);
        double y =(a*f-e*c)/(a*d-b*c);

        if(a*d-b*c == 0)
            System.out.print("The two lines are parallel.");
        else
            System.out.print("The intersecting point is at (" +
                    (int)x + "," + (int)y + ")");



    }
}
