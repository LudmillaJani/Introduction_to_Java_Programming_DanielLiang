/*
Write a program that converts pounds into kilograms. The program prompts the user to enter a number in pounds, converts it
to kilograms, and displays the result. One pound is 0.454 kilograms.
 */
import java.util.Scanner;
public class ConvertPoundsIntoKilograms {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number in pounds: ");
        double pounds = input.nextDouble();
        final double onePound = 0.454;

        double kilograms = pounds * onePound;
        System.out.print(pounds + " pounds " + "is " + kilograms + " kilograms");


    }
}
