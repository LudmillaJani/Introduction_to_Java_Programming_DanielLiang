/* Palindrome Integer
Write a test program to report whether the integer is a palindrome
 */
import java.util.Scanner;
public class PalindromeInteger {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter an integer: ");
        int number = input.nextInt();

        //System.out.println(reverse(number));
        System.out.println(isPalindrome(number));

    }

    public static int reverse(int number){
        String reverseString="";
        while(number>0){
            reverseString += number%10 + "";
            number=number/10;
        }
        int reverseInt = Integer.parseInt(reverseString);
        return reverseInt;
    }

    public static boolean isPalindrome(int number){
        return(number == reverse(number)? true : false );
    }
}
