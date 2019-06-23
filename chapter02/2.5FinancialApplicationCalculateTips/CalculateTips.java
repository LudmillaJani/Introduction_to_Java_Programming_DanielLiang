/* Financial Application: calculate tips
Write a program that reads the subtotal and the gratuity rate, then computes the gratuity and
total.
 */

import  java.util.Scanner;
public class CalculateTips {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the subtotal and a gratuity rate: ");

        double subtotal = input.nextDouble();
        double gratuityRate = input.nextDouble();

        double gratuity = gratuityRate / subtotal;
        double total = subtotal + gratuity;

        System.out.print("The gratuity is $" + gratuity + " and total is $" + total );
    }
}
