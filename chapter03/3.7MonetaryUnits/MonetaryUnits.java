/* Financial Application:
Modify Listing 2.10, ComputeChange.java, to display the nonzero denominations only, using
singular words for single units as 1 dollar and 1 penny, and plural words for more than
one unit such as 2 dollars and 3 pennies.
 */
import java.util.Scanner;
public class MonetaryUnits {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter an amount in double, for example 11.6: ");
        double amount = input.nextDouble();

        int remainingAmount = (int)(amount * 100);

        int numberOfOneDollars = remainingAmount /100;
        remainingAmount = remainingAmount % 100;

        int numberOfQuarters = remainingAmount /25;
        remainingAmount = remainingAmount % 25;

        int numberOfNickels = remainingAmount /5;
        remainingAmount = remainingAmount % 5;

        int numberOfPennies = remainingAmount;

        System.out.println("Your amount " + amount + " consists of: ");
        System.out.println("     " + numberOfOneDollars + (numberOfOneDollars==1?" dollar":" dollars"));
        System.out.println("     " + numberOfQuarters + (numberOfQuarters==1?" quorter":" quorters"));
        System.out.println("     " + numberOfNickels + (numberOfNickels==1? "nickel" : " nickels"));
        System.out.println("     " + numberOfPennies + (numberOfPennies==1?"penny" : " pennies"));

    }
}
