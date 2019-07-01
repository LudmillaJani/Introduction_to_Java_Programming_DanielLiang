/* Sort three integers
Write a program that prompts the user to enter three integers and display the integer
in non-decreasing order.

 */
import java.util.Scanner;
public class SortThreeIntegers {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter three integers: ");
        int integer1 = input.nextInt();
        int integer2 = input.nextInt();
        int integer3 = input.nextInt();

        int temp;
        //compare int1 with int2 and int3
        if(integer2 < integer1 || integer3 < integer1)
        {

            if(integer2 < integer1) {
                temp = integer1;
                integer1 = integer2;
                integer2 = temp;
            }
            if(integer3 < integer1) {
                temp = integer1;
                integer1 = integer3;
                integer3 = temp;
            }
        }
        //compare int 2 with int 3
        if(integer3 < integer2){
            temp = integer2;
            integer2 = integer3;
            integer3 = temp;
        }


        System.out.print("The three sorted integers are: " + integer1 + " " + integer2 + " " + integer3);
    }

}
