/* Print a Table
Write a program that displays the following table. Cast floating-point numbers into integers.
 */

import java.util.Scanner;
public class PrintTable {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.println("a    " + "b    " + "pow(a,b)");
        System.out.println("1    " + "2    " + (int)Math.pow(1,2));
        System.out.println("2    " + "3    " + (int)Math.pow(2,3));
        System.out.println("3    " + "4    " + (int)Math.pow(3,4));
        System.out.println("5    " + "6    " + (int)Math.pow(5,6));

    }
}
