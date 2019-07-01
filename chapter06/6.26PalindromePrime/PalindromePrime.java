/** Palindrome Prime: A palindrome prime is a prime number and also palindromic.
 * Write a program that displays the first 100 palindromic prime numbers. Display
 * 10 numbers per line.
 */
import java.util.Scanner;
public class PalindromePrime {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter an integer: ");
        int number = input.nextInt();
        System.out.println("All palindromic primes less than " + number + " are:");

         printPalindromicPrime(number);
    }

    public static void printPalindromicPrime(int n){
        int count=1;
        for(int i =2; i<=n; i++){
            if(isPrime(i) &&isPalindromic(i)){
                System.out.print((count%10 != 0)? i + " ": i + "\n");
                count++;
            }

        }

    }
     public static boolean isPalindromic(int n){

         if(n==reverse(n))
             return true;
       return false;


     }
     public static int reverse(int n) {
         String reverse = "";
         while (n != 0) {
             reverse += n % 10;
             n = n / 10;
         }
         return Integer.parseInt(reverse);
     }

    public static boolean isPrime(int n){
        if(n<2) return false;
        for(int divisor = 2; divisor <=n/2 ;divisor++){
            if(n % divisor == 0) return false;
        }
        return true;
    }
}
