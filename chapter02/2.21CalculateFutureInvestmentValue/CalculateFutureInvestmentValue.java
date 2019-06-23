/*Financila Application: Calculate Future investment value
Write a program that reads in investment amount, annual interest rate, and number of years, and displays
the future investment value.
 */
import java.util.Scanner;
public class CalculateFutureInvestmentValue {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter investment amount: ");
        double investmentAmount = input.nextDouble();

        System.out.print("Enter Annual Interest Rate in percentage: ");
        double annualInterestRate = input.nextDouble();

        //divide by 100 to get from percentage to decimal
        //also divide by 12 months
        double monthlyInterestRate = annualInterestRate / 1200 ;

        System.out.print("Enter number of years: ");
        double nrOfYears = input.nextDouble();

        double futureInvestmentValue = investmentAmount *  Math.pow(1 + monthlyInterestRate, nrOfYears * 12);

        System.out.print("Accumulated value is $" + (int)(futureInvestmentValue * 100) / 100.0);


    }
}
