/** Write a method that counts the number of letters in a string. Write a test program that
 * prompts the user to enter a string and displays the number of letters in the string.
 */
import java.util.Scanner;
public class countLettersInAString {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String stringInput = input.next();
        System.out.print(stringInput + " has " + countLetters(stringInput) + " letter(s)");
    }

    public static int countLetters(String stringInput){
        int count = 0;
        for(int i = 0; i<=stringInput.length()-1;i++){
            char ch = stringInput.charAt(i);
            if(Character.isLetter(ch))
                count++;
        }
        return count;
    }
}
