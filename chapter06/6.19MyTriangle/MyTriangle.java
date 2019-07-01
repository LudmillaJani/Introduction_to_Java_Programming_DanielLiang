/** Write a test program that reads three sides for a triangle and computes the area if the input is valid.
 * Otherwise it displays that the input is invalid.
 */
import java.util.Scanner;
public class MyTriangle {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the three sides of the triangle: ");
        int side1 = input.nextInt();
        int side2 = input.nextInt();
        int side3 = input.nextInt();
        System.out.print("The area of the triangle with sides " + side1 + " "+ side2+ " " +side3+ " is ");
        System.out.printf(" %2.2f cm^2",AreaTriangle(side1,side2,side3));



    }

    public static double AreaTriangle(int side1, int side2, int side3){
        double s = (side1+side2+side3)/2;
        double area = Math.sqrt(s*(s-side1)*(s-side2)*(s-side3));
        return area;
    }
}
