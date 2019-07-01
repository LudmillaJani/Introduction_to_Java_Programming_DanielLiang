/** Mersenne Prime: A prime number is called a Mersenne Prime if it can be written in the form
 * 2^p - 1 for some integer p. Write a program that finds all Mersenne primes with p <=31 and
 * displays the output
  */

import java.util.Scanner;
public class MersennePrime {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter how many Mersenne numbers to display: ");
        int number = input.nextInt();
        printMorsenne(number);

    }

    public static void printMorsenne(int n){
        for(int i = 2; i<=n; i++){
            if(isPrime(i)){
                System.out.print(i + "             " + Mersenne(i) + "\n");

            }

        }
    }

    public static int Mersenne(int p){
        return (int)Math.pow(2, p) - 1;
    }

    public static boolean isPrime(int n){
        for(int i=2; i <= n/2; i++){
            if(n%i == 0) return false;
        }
        return true;
    }
}
