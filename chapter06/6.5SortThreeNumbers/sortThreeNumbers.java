/* Sort three numbers
Write a method to display three numbers in increasing order.
 */
import java.util.Scanner;
public class sortThreeNumbers {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter three integers: ");
        double n1 = input.nextDouble();
        double n2 = input.nextDouble();
        double n3 = input.nextDouble();
        displaySortedNumbers(n1,n2,n3);
    }

    public static void displaySortedNumbers(double num1, double num2, double num3){
        double temp;

        //compare first with second
        if (num1 > num2) {
            temp = num1;
            num1 = num2;
            num2 = temp;
        }
        //compare second with third
        if (num2 > num3) {
            temp = num2;
            num2 = num3;
            num3 = temp;
        }
        //compare first with second again
        if (num1 > num2) {
            temp = num1;
            num1 = num2;
            num2 = temp;
        }
        System.out.println("Sorted numbers are: "+num1 + " " + num2 + " " + num3);
    }
}
