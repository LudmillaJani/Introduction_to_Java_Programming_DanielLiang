/** Write a method that finds the number of occurrences of a specified character in a string.
 * Write a test program that prompts the user to enter a string followed by a character and displays the number of
 * occurrences of the character in the string
 */

import java.util.Scanner;
public class OccurrencesOfSpecialCharacter {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a string and a character: ");
        String str = input.nextLine();
        char ch = input.next().charAt(0);
        System.out.print("Number of occurrences of " + ch + " in the " + str  +" is: " +
                count(str,ch));


    }
    public static int count(String str, char a){
        int count=0;
        for(int i = 0;i<str.length();i++){
            if(str.charAt(i) == a)
                count++;
        }
        return count;

    }
}
