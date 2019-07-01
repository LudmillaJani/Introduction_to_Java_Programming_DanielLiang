/* Write a method that computes future investment value at a given interest rate for a
specified number of years
  */
import java.util.Scanner;
public class futureInvestmentValue {
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
        int nrOfYears = input.nextInt();

        System.out.printf("Accumulated value is $%.2f" , futureInvestmentValue(investmentAmount,monthlyInterestRate,nrOfYears));

    }

    public static double futureInvestmentValue(double investmentAmount, double monthlyInterestRate, int Years){
        return (investmentAmount *  Math.pow(1 + monthlyInterestRate, Years * 12));
    }

}
