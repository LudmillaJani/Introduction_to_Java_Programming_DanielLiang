/* Find the unicode of a character
Write a program that receives a character and displays its Unicode.
 */
import java.util.Scanner;
public class UnicodeOfCharacter {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a character: ");
        String unicodeChar = input.next();
        char character = unicodeChar.charAt(0);


        System.out.println("The Unicode for the character " +
                character + " is " + (int) character);

    }
}
