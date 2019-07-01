/* Business: check ISBN-10
Rewrite programming exercise 3.9 by entering the ISBN number as a string.
 */
import java.util.Scanner;
public class checkISBN10 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the first 9 digits of an ISBN as a string: ");
        String isbnString = input.next();
        int ISBN = Integer.parseInt(isbnString);


        //extract all digits from ISBN
        int d1 = ISBN / 100_000_000;
        int remaining = ISBN % 100_000_000 ;

        int d2 = remaining / 10_000_000;
        remaining = remaining % 10_000_000;

        int d3 = remaining / 1_000_000;
        remaining = remaining % 1_000_000;

        int d4 = remaining / 100_000;
        remaining = remaining % 100_000;

        int d5 = remaining / 10_000;
        remaining = remaining % 10_000;

        int d6 = remaining / 1_000;
        remaining = remaining % 1_000;

        int d7 = remaining / 100;
        remaining = remaining % 100;

        int d8 = remaining / 10;
        remaining = remaining % 10;
        int d9 = remaining;

        //checksum
        int d10 = (d1 *1 + d2 * 2 + d3 * 3 + d4 * 4 + d5 * 5 + d6 * 6 + d7 * 7 + d8 * 8 + d9 * 9) % 11;
        //display result
        if(d10 == 10)
            System.out.print("The ISBN-10 number is " + d1+d2+d3+d4+d5+d6+d7+d8+d9 + "X");
        else
            System.out.print("The ISBN-10 number is " + d1+d2+d3+d4+d5+d6+d7+d8+d9 + d10);


    }
}
