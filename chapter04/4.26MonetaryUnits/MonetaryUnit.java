/* Financial application:monetary Units
Rewrite listing 2.10, ComputeChange.java, to fix the possible loss of accuracy when converting
a float value to an int value. Read the input as a string such as "11.56". Your program should
extract the dollar amount before the decimal point and the cents after the decimal amount using
the indexOf and substring methods.
 */
import java.util.Scanner;
public class MonetaryUnit {
    public static void main(String[] args){
        //create a scanner
        Scanner input = new Scanner(System.in);

        System.out.print("Enter an value as an String: ");
        String amountInput = input.next();
        int index = amountInput.indexOf('.');
        String amount1 = amountInput.substring(0,index);
        String amount2 = amountInput.substring(index+1);
        String amount12 = amount1 + amount2;
        int amount = Integer.parseInt(amount12);


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
