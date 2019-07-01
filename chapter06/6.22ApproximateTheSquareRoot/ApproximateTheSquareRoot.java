/** Math: Approximate the square root
 */

import java.util.Scanner;

public class ApproximateTheSquareRoot {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        long number = input.nextLong();


        System.out.println("Square root of " + number + ": "+sqrt(4));

    }
    public static double sqrt(long n){
        double nextGuess = 1;
        double lastGuess ;
        double difference;

        do{
            lastGuess=nextGuess;
            nextGuess = (lastGuess + n/ lastGuess)/2;
            difference = (nextGuess - lastGuess > 0) ? nextGuess - lastGuess : lastGuess - nextGuess;
        } while (difference > 0.0001);
        return lastGuess;
    }
}
