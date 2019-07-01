/* Write a method that computes the sum of the digits in an integer
 */
import java.util.Scanner;
public class SumDigitsInInteger {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        long number = input.nextLong();

        System.out.println("The sum of digits is : " + sumDigits(number));
    }

    public static int sumDigits(long n){
        //int nrDigits = numberOfDigits(n);
        int sum = 0;
        while (n>0){
            sum+=n%10;//get the last digit
            n = n/10;//remove the last digit
        }
        return sum;
    }

}
