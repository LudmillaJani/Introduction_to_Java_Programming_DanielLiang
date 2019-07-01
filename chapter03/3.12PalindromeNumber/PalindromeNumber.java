/*Palindrome Number:
Write a program that prompts the user to enter a three digit integer and determines
 whether it is a palindrome number. A number is palindrome if it reads the same from right to left and from left to right.


 */
import java.util. Scanner;
public class PalindromeNumber {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a three-digit integer; ");
        int number = input.nextInt();

        int digit1 = number / 100;
        int remainingDigits = number % 100;
        int digit3 = remainingDigits % 10;


        System.out.print(number + " is " +
                 ((digit1 == digit3)? "a " : "not a ") +
                "palindrome." );
    }
}
