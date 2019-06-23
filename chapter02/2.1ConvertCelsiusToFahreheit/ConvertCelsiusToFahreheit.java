/*
Write a program that reads a Celsius degree in double value from the console, then converts
it to Fahrenheit and displays the result.
 */
import java.util.Scanner;
public class ConvertCelsiusToFahreheit {
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        System.out.print("Enter a degree in Celsius: ");
        double celsius = input.nextDouble();

        double fahrenheit = (9.0 / 5) * celsius + 32;

        System.out.print(celsius + " Celsius is " + fahrenheit + " Fahrenheit");

    }
}
