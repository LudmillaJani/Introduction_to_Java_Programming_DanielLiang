import java.util.Scanner;

/** Write a method to format an integer with specified width.The method returns a string for the numebr
 * with one or more prefix 0s. The size of the string is the width.
 * For example format(34,4) returns 0034 and format(34,5) returns 00034. If the numebr is longer than the
 * width, the method returns the string representation for the number.
 * For example, format(34,1) returns 34.
 */

public class FormatAnInteger {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = input.nextInt();
        System.out.print("Enter its width: ");
        int width = input.nextInt();
        System.out.print(format(number,width));
    }
    public static String format(int number, int width){
        String numberString= number+"";
        int lengthNumber = numberString.length();

        if(lengthNumber < width){
            for(int i =1; i<= width-lengthNumber;i++){
                numberString = 0+numberString;
            }
        }
        return numberString;

    }
}
