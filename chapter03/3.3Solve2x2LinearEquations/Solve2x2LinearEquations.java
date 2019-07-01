/* Algebra: solve 2x2 linear equations
Write a program that prompts the user to enter a, b, c, d ,e, and f and displays the result.
If ad - bc is 0, report that the equation has no solution.
 */
import java.util.Scanner;
public class Solve2x2LinearEquations {
    public static void main(String[] args){
        Scanner  input = new Scanner(System.in);

        System.out.print("Enter a, b, c, d, e, f: ");
        double a = input.nextDouble();
        double b = input.nextDouble();
        double c = input.nextDouble();
        double d = input.nextDouble();
        double e = input.nextDouble();
        double f = input.nextDouble();

        //denominator
        double denominator = a*d-b*c;

        //solution for variable x
        double x = (e*d - b*f)/denominator;

        //solution for variable y
        double y = (a*f - e*c)/denominator;
        if(denominator == 0)
            System.out.print("The equation has no solution!");
        else
            System.out.print("The two solutions are: x = " + x + " y = " +y );



    }
}
