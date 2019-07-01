/* Write a program that prompts the user to enter a letter and displays its corresponding number.

 */
import java.util.Scanner;
public class phoneKeyPads {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a letter: ");
        char charLetter = input.next().charAt(0);

        if(Character.isLetter(charLetter)){
            char letter = Character.toLowerCase(charLetter);

            System.out.print("The corresponding number is: ");
            if(letter == 'a' || letter=='b' || letter == 'c')
                System.out.print("2");
            else if(letter == 'd' || letter=='e' || letter == 'f')
                System.out.print("3");
            else if(letter == 'g' || letter=='h' || letter == 'i')
                System.out.print("4");
            else if(letter == 'j' || letter=='k' || letter == 'l')
                System.out.print("5");
            else if(letter == 'm' || letter=='n' || letter == 'o')
                System.out.print("6");
            else if(letter == 'p' || letter=='q' || letter == 'r' || letter == 's')
                System.out.print("7");
            else if(letter >= 't' )
                System.out.print("8");
            else if(letter >= 'w' )
                System.out.print("9");

        }else
            System.out.print(charLetter + " is invalid input.");

    }
}
