/* Process a string
Write a program that prompts a user to enter a string and displays its length and its first character.
 */
import java.util.Scanner;
public class processA_String {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String usersString = input.next();

        int length = usersString.length();
        char firstChar = usersString.charAt(0);
        System.out.printf("The length is %d and its first character is %c ", length, firstChar);
    }
}
