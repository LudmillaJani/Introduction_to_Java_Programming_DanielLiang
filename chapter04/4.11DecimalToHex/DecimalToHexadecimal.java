/* Decimal to Hex
Write a program that prompts the user to enter an integer between 0 and 15 and displays
its corresponding hex number.
 */
import java.util.Scanner;
public class DecimalToHexadecimal {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a decimal value (0 to 15): ");
        int decimal = input.nextInt();

        if (decimal < 0 || decimal > 15)
            System.exit(1);

        if(decimal>=0 && decimal <=9)
            System.out.print("The Hex number is " + decimal);
        else{
            char hexNumber = (char)(decimal+'A'-10);
            System.out.print("The Hex number is " + hexNumber);
        }

    }
}
