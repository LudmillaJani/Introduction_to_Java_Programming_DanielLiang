/** Check Password
Write a method that checks whether a string is a valid password. Suppose the passwords rules are as follows:
 Must have at least eight characters
 Consists of only letters and digits
 Must contain at least two digits
 AWrite a program that prompts the user to enter a password and displays Valid Password if
 the rules are followed or Invalid Password otherwise.
 */
import java.util. Scanner;
public class CheckPassword {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the password: ");
        String password = input.next();

        System.out.print("The pass is " + isValid(password));



    }

    public static boolean isValid(String password){

        int countDigits=0;
        int countLetters=0;

        for(int i = 0; i < password.length(); i++){//check every character
                char ch =password.charAt(i);
                if(Character.isDigit(ch))
                    countDigits++;
                else if(Character.isLetter(ch))
                    countLetters++;
                else
                    return false;
        }
        return (password.length() >=8 && countDigits >= 2);
    }

}
