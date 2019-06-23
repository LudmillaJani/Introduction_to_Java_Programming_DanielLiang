/*Fiancial Application: Calculate Interest
Write a program that reads the balance and the annual interest rate and displays the interest
for the next month.
 */

import java.util.Scanner;
public class CalculateInterest {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter balance and annual interest rate ( e.g, 3 for 3%): ");

        double balance = input.nextDouble();
        double annualInterest = input.nextDouble();
        double interest = balance * (annualInterest / 1200);

        System.out.print("The interest is " + (int)(interest * 100) /100.0);



    }
}
