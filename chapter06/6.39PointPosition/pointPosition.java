/** Programming exercise 3.32 shows how to test whether a point is on the left side of a directed line,
 * on the right, or on the same line. Write a program that prompts the user  to enter three
 * points for p0,p1,p2 and displays whether p2 is on the line segment
 */
import java.util.Scanner;
public class pointPosition {
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        System.out.print("Enter three points for p0,p1,p2: ");
        double x0 = input.nextDouble();
        double y0 = input.nextDouble();
        double x1 = input.nextDouble();
        double y1 = input.nextDouble();
        double x2 = input.nextDouble();
        double y2 = input.nextDouble();

        String p0 = "(" + x0 + ", " + y0 + ")";
        String p1 = "(" + x1 + ", " + y1 + ")";
        String p2 = "(" + x2 + ", " + y2 + ")";
        String isOrNot = "not ";


        System.out.print(p2+" is on the " + check(x0,y0,x1,y1,x2,y2) + " from " + p0+ " to "+p1 );
    }

    public static String check(double x0, double y0, double x1, double y1,
                             double x2, double y2){
        String answer="";
        if(leftOfTheLine(x0,y0,x1,y1,x2,y2))
            answer= "left side of";
        else if(onTheSameLine(x0,y0,x1,y1,x2,y2))
            answer = "same line segment";
        else if( onTheLineSegment(x0,y0,x1,y1,x2,y2))
            answer = "line segment";
        else if(onTheRightSide(x0,y0,x1,y1,x2,y2))
            answer = "right side of";
        return answer;
    }
    public static boolean leftOfTheLine(double x0, double y0, double x1, double y1,
                                        double x2, double y2){
        double condition = (x1-x0)*(y2-y0)-(x2-x0)*(y1-y0);
        return(condition > 0);

    }

    public static boolean onTheSameLine(double x0, double y0, double x1, double y1,
                                        double x2, double y2){
        double condition = (x1-x0)*(y2-y0)-(x2-x0)*(y1-y0);
        return(condition == 0);

    }

    public static boolean onTheLineSegment(double x0, double y0, double x1, double y1,
                                        double x2, double y2){
        //check if the point p2 is on the same line
        boolean p2OnLine = (x1-x0)*(y2-y0)-(x2-x0)*(y1-y0) == 0;
        //check if the point p2 is between the points p0 and p1 ( between the segment [p0,01]
        boolean isInRange = ((x2 < x1 && x2 > x0) || (x2 < x0 && x2 > x1))
                && ((y2 < y1 && y2 > y0) || (y2 < y0 && y2 > y1));
        return (isInRange && p2OnLine);

    }

    public static boolean onTheRightSide(double x0, double y0, double x1, double y1,
                                           double x2, double y2){
        double condition = (x1-x0)*(y2-y0)-(x2-x0)*(y1-y0);
        return(condition < 0);

    }

}
