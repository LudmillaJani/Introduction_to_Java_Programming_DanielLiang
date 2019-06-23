/*Sum The Digits In An Integer
Write a program that reads  an integer between 0 and 1000 and adds all the digits in the
integer.
 */
import  java.util.Scanner;
public class SumDigitsInInteger {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number between 0 and 1000: ");
        int number = input.nextInt();
        int onesPlace = number % 10;
        int tensPlace = (number / 10) % 10;
        int hundredsPlace = (number/100) % 10;
        int sum = onesPlace + tensPlace + hundredsPlace;
        System.out.print("The sum of the digits is " + sum );
    }


}

