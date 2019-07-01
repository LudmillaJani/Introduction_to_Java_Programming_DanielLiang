/*Find the factors of an integer
Write a program that reads an integer and displays all its smallest factors in increasing order.

 */
import java.util.Scanner;
public class FactorsOfInteger {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int number = input.nextInt();

        for(int j = 2; j < number; j++){
            if(number%j==0){
                System.out.print(j + " ");
                number/=j; // there is remainder 0 because of condition
                j--; // do j once more
            }
        }
    }
}
