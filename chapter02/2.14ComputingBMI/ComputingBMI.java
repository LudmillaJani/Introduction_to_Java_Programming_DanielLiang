/* Health application: computing BMI
Body mass index (BMI) is a measure of health on weight. It can be calculated by taking your
weight in kilograms and dividing by the square of your height in meters. Write a program that prompts
the user to enetr a wight in pounds and height in inches and displays the BMI.
Note that 1 pound is 0.45359237 kilograms and one inch is 0.0254 meters.
 */
import java.util.Scanner;
public class ComputingBMI {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        final double poundPerKilogram = 0.45359237;
        final double inchPerMeter = 0.0254;

        System.out.print("Enter weight in pounds: ");
        double weight = input.nextDouble();
        System.out.print("Enter height in inches: ");
        double height = input.nextDouble();

        double weightInKilograms = weight * poundPerKilogram;
        double heightInMeters = height * inchPerMeter;

        double BMI = weightInKilograms / Math.pow(heightInMeters, 2);
        System.out.print("BMI is " + (int)(BMI * 100)/100.0);
    }

}
