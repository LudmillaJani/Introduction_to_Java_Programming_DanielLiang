/* Find the character of an ASCII code
Write a program that receives an ASCII code (an integer between 0 and 127) and displays its character.
 */
import java.util.Scanner;
public class findCharacterASCII {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter an ASCII code: ");
        int codeASCII = input.nextInt();

        if(0<=codeASCII && codeASCII<=127){
            char code = (char)codeASCII;
            System.out.print("The character for ASCii code " + codeASCII + " is " + code);
        }else
            System.out.printf("Not a valid ASCII code(enter an integer 0-127");


    }
}
