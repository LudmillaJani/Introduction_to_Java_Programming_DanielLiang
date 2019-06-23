/*Physics: Acceleration
Average Acceleration is defined as the change of velocity divided by the time taken to make the change.
Write a program that prompts the user to enter the starting velocity vo in meters/second, the ending
velocity v1 in meters/second, and the time span t in seconds, and displays the average acceleration.
*/
import java.util.Scanner;
public class Acceleration {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter v0,v1, and t: ");
        double v0 = input.nextDouble();
        double v1 = input.nextDouble();
        double t = input.nextDouble();

        double acceleration = (v1 - v0) / t;

        System.out.print("The average acceleration is " + (int)(acceleration * 100)/100.0);

    }
}
