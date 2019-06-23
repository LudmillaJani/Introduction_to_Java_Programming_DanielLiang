/*Physics:finding runway length
Given an airplane's acceleration a and take-off speed v, you can compute the minimum
runway length needed for an airplane to take off using the following formula: length = v^2 / 2a
Write a program that prompts the user to enter v in meters/second(m/s) and the acceleration a in
meters/second squared (m/s^2), and displays the minimum runway length.
 */
import  java.util.Scanner;
public class FindingRunWayLength {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter speed and acceleration: ");
        double speed = input.nextDouble();
        double acceleration = input.nextDouble();

        double length = Math.pow(speed,2) / (2 * acceleration);

        System.out.print("The minimum runway length for this airplane is " + (int)(length * 100)/100.0);


    }
}
