/* Algebra: solve quadratic Equations
Write a program that prompts the user to enter values for a, b, c and displays the result
based on the discriminant. If the discriminant is positive, display two results.
If the discriminant is 0, display one root. Otherwise display "The equation has no real roots".
 */
import java.util.Scanner;
public class SolveQuadraticEquations {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a, b, c: ");
        double a = input.nextDouble();
        double b = input.nextDouble();
        double c = input.nextDouble();

        double discriminant = Math.pow( b * b - 4 * a * c , 0.5);
        double r1 = (-b + discriminant)/(2 * a);
        double r2 = (-b - discriminant)/(2 * a);

        if(discriminant > 0)
            System.out.print("The equation has two roots: " + (int)(r1 * 100) / 100.0 + " and " + (int)(r2 * 100) / 100.0);
        else if(discriminant == 0)
            System.out.print("The equation has one root: " + (int)(r1 * 100) / 100.0);
        else
            System.out.print("The equation has no real roots!");

    }
}
