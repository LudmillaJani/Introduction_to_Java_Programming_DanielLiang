/* Vowel or constant
Write a program that prompts the user to enter a letter and check whether the letter is a
vowel or consonant.
 */
import java.util.Scanner;
public class VowelOrConstant {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a letter grade: ");
        char letter = input.next().charAt(0);

        if(Character.isLetter(letter)){
            switch(Character.toUpperCase(letter))
            {
                case 'A':
                case 'E':
                case 'I':
                case '0':
                case 'U': System.out.println(letter + " is a vowel"); break;
                default : System.out.println(letter + " is a consonant");
            }
        }
        else
            System.out.print(letter + " is invalid input.");

    }
}
