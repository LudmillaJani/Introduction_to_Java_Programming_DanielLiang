/*Science: Wind-chill temperature
Write a program that prompts the user to enter a temperature between -58F and 41F and
a wind speed greater then or equal to 2 and displays the wind-chill temperature.
 */
import java.util.Scanner;
public class WindChillTemperature {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the temperature in Fahrenheit between -58 and 41: ");
        double temperature = input.nextDouble();

        System.out.print("Enter the wind speed (>=2) in miles per hour: ");
        double windSpeed = input.nextDouble();

        double windChill = 35.74 + 0.6215 * temperature -
                35.75 * Math.pow(windSpeed,0.16) + 0.4275 * temperature * Math.pow(windSpeed, 0.16);

        System.out.print("The wind-chill index is " + (int)(windChill * 100 )/100.0);

    }
}
