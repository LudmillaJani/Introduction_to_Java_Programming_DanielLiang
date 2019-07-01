/* Check Substring
Write a program that prompts the user to enter two strings and reports whether the second
string is a substring of the first string.
 */
import java.util.Scanner;
public class checkSubstring {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter string s1: ");
        String s1 = input.next();
        System.out.print("Enter string s2: ");
        String s2 = input.next();

        boolean isSubstring = s1.contains(s2);

        System.out.print(s2 + " is" +((isSubstring)? "":" not") +" a substring of " + s1);

    }
}
