/*Financial Application: monetary units
Rewrite Listing 2.10, ComputeChange.java, to fix the possible loss of accuracy when converting
a double value to an int value. Enter the input as an integer whose last two digits represent
the cents. For example, the input 1156 represents 11 dollars and 56 cents.
 */
import java.util.Scanner;
public class MonetaryUnits {
    public static void main( String[] args){
        //create a scanner
        Scanner input = new Scanner(System.in);

        System.out.print("Enter an value as an integer: ");
        int amount = input.nextInt();

        int remainingAmount = amount;

        //Find the amount of one dollar
        int numberOfOneDollars = remainingAmount /100;
        remainingAmount = remainingAmount % 100;

        //Find the number of quarters in the remaining amount
        int numberOfQuarters = remainingAmount /25;
        remainingAmount = remainingAmount %25;

        //Find the number of dimes in the remaining amount
        int numberOfDimes = remainingAmount /10;
        remainingAmount = remainingAmount % 10;

        //Find the number of nickels  in the remaining amount
        int numberOfNickels = remainingAmount /5;
        remainingAmount = remainingAmount % 5;

        //Find the number of pennies in the remaining amount
        int numberOfPennies = remainingAmount;

        //Display Results
        System.out.println("Your amount " + amount + "consists of");
        System.out.println("    " + numberOfOneDollars + " dollars");
        System.out.println("    " + numberOfQuarters + " quarters");
        System.out.println("    " + numberOfDimes + " dimes");
        System.out.println("    " + numberOfNickels + " nickles");
        System.out.println("    " + numberOfPennies + " pennies");

    }


}
