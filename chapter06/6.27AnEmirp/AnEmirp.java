/** Emirp: An Emirp (prime spelled backwards) is a nonpalindromic prime number whose reversal is
 * also prime. For example, 17 is prime and 71 is prime, so 17 and 71 are emirps.
 * Write a program that displays the first 100 emirps. Display 10 numbers per line, separated by exactly
 * one space.
 */
import java.util.Scanner;
public class AnEmirp {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int number = input.nextInt();
        System.out.println("The first " + number + " Emirp numbers: ");


        int n = 2;//first emirp
        int count=0;
        while(count < number){
            if(isEmirp(n)){
                count++;
                System.out.print((count %10 != 0)? n + " " : n + "\n");
            }
            n++;
        }




    }

    public static boolean isEmirp(int n){
        if( isPrime(n) && !isPalindromic(n)&& isPrime(reverse(n)))
            return true;
        return false;

    }
    public static boolean isPalindromic(int n){
        if( n == reverse(n))
            return true;
        return false;
    }

    public static int reverse(int n){
        String reverse="";
        while(n!=0){
            reverse += n%10; //add last digit into reverse string
            n =n /10;//remove the last digit from number
        }
        return Integer.parseInt(reverse);
    }

    public static boolean isPrime(int n){
        for(int divisor = 2; divisor <= n/2; divisor++){
            if(n%divisor==0)
                return false;
        }
        return true;
    }

}
