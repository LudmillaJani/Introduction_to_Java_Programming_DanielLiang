/* Compute GCD
Another solution for listing 5.9 to find the GCD of two integers n1 and n2 is:
First find d to be the minimum of n1 and n2, then check whether d,d-1,d-2,...,2,1 is a
divisor for both n1 and n2 in this order.The first common divisor is the greatest common divisor
for both n1 and n2.
Write a program that prompts the user to enter two positive integers and displays the gcd.
 */
import java.util.Scanner;
public class GCD {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter two positive integers: ");
        int n1 = input.nextInt();
        int n2 = input.nextInt();

        int largerDivisor = 0;
        int divisor=0;

        int min = Math.min(n1,n2);//find the minimum of two numbers

        while(min >0){
            if(n1 % min == 0 && n2 % min ==0){ //check if two numbers are divisible by min--
                divisor = min;
                if (divisor > largerDivisor){
                    largerDivisor = divisor;
                }
            }
            min--;
        }
        System.out.println("The gcd is: " + largerDivisor);

    }
}
