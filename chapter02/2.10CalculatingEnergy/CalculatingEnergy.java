/* Science: Calculating Energy
Write a program that calculates the enrgy needed to heat water from an initial temperature
to a final temperature. Your program should prompt the user to enter the amount of water in
kilograms and the initial and final temperatures of the water.
 */
import java.util.Scanner;
public class CalculatingEnergy {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the amount of water in kilograms: ");
        double waterAmount = input.nextDouble();

        System.out.print("Enter the initial temperature: ");
        double initialTemp = input.nextDouble();

        System.out.print("Enter the final temperature: ");
        double finalTemp = input.nextDouble();

        //energy needed : Q
        double Q = waterAmount * (finalTemp - initialTemp) * 4184;

        System.out.print("The energy needed is " + Q);


    }
}
