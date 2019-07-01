/* Financial: currency Exchange
Write a program that prompts the user to enter the exchange rate from currency in U.S dollars
to Chinese RMB. Prompt the user to enter 0 to convert from U.S dollars to Chinese RMB and 1
to convert from chinese RMB and U.S dollars. Prompt the user to enter the amount in U.S dollars or
Chinese RMB to convert it to Chinese RMB or U.S dollars, respectively.
 */
import java.util.Scanner;
public class currencyExchange {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the exchange rate from dollars to RMB: ");
        double exchRate = input.nextDouble();

        System.out.print("Enter 0 to convert dollars to RMB and 1 vice versa: ");
        int zeroOrOne = input.nextInt();

        if(zeroOrOne==0){
            System.out.print("Enter the dollar amount: ");
            double dollars = input.nextInt();
            double RMB = dollars * exchRate;
            System.out.print("$" + dollars + " is " + RMB + " yuan");
        }
        else if(zeroOrOne==1){
            System.out.print("Enter the RMB amount: ");
            double RMB = input.nextDouble();
            double dollars = RMB / exchRate ;
            System.out.print(RMB + " yuan is $" + (int)(dollars*100) / 100.0 );
        }
        else
            System.out.print("Incorrect input!");
    }
}
