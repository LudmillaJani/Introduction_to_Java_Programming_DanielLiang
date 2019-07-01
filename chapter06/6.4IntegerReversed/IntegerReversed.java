/* Write a method to display an integer in reverse order
 */
import java.util.Scanner;
public class IntegerReversed {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int number = input.nextInt();
        reverse(number);


    }

    public static void reverse(int number){
        String numberString = number+"";
        String numberReverse="";
        for(int i = numberString.length()-1;i>=0; i-- ){//start from last character
            numberReverse +=numberString.charAt(i);
        }
        System.out.println(number + " reversed is " + Integer.parseInt(numberReverse));

    }

}
