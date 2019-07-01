/** Write a method that returns a number, given an uppercase letter
 * Write a test program that prompts the user to enter a phone number as a String.
 * The input number may contain letters. The program translates a letter(uppercase or lowercase)
 * to a digit and leaves all other characters intact.
 */
import java.util.Scanner;
public class PhoneKeypads {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a phone number as a string: ");
        String phoneNumber = input.nextLine();

       letterToNumber(phoneNumber);


    }
    public static void letterToNumber(String numberString){
        for(int i = 0; i<numberString.length(); i++ ){
            char ch = numberString.charAt(i);
            if(Character.isLetter(ch))
                System.out.print(charToPhoneNum(Character.toUpperCase(ch)));
            else{
                System.out.print(ch);
            }
        }
    }
    public static int charToPhoneNum(char letter){
        int digit=0;
        if(letter >= 'W' )
            digit=9;
        else if (letter >= 'T')
            digit=8;
        else if (letter >= 'P')
            digit=7;
        else if (letter >= 'M')
            digit=6;
        else if (letter >= 'J')
            digit=5;
        else if (letter >= 'G')
            digit=4;
        else if (letter >= 'D')
            digit = 3;
        else
            digit=2;

        return digit;
    }
}
