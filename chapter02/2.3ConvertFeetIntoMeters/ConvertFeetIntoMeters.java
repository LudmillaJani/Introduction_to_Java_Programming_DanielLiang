/*
Write a program that reads a number in feet, converts it to meters, and displays the result.
One foot is 0.305 meter
 */
import java.util.Scanner;
public class ConvertFeetIntoMeters {
    public static void main(String[] args){

        final double oneFoot = 0.305;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a value for feet: ");
        double feet = input.nextDouble();

        double meters = oneFoot * feet;
        System.out.println(feet + " feet" + " is " + meters + " meters");

    }
}
