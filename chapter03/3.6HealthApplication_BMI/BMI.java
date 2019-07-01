/* Health application: BMI
Revise Listing 3.4, ComputeAndInterpretBMI.java, to let the user enter weight, feet, and inches.
*/
import java.util.Scanner;
public class BMI {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);


        System.out.print("Enter wight in pounds: ");
        double weight = input.nextDouble();

        System.out.print("Enter feet: ");
        double feet = input.nextDouble();

        System.out.print("Enter inches: ");
        double inches = input.nextDouble();

        //1 foot = 12 inches
        double height = (feet * 12) + inches;

        final double KILOGRAMS_PER_POUND = 0.45359237;
        final double METERS__PER_INCH = 0.0254;

        //compute BMI
        double weightInKilograms = weight * KILOGRAMS_PER_POUND;
        double heightInMeters = height * METERS__PER_INCH;
        double bmi = weightInKilograms / (heightInMeters * heightInMeters);

        System.out.println("BMI is " + (int)bmi);

        if(bmi < 18.5)
            System.out.print("Underwight");
        else if(bmi < 25)
            System.out.print("Normal");
        else if (bmi < 30)
            System.out.print("Overweight");
        else
            System.out.print("Obese");

    }
}
