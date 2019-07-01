/* Game: heads or Tails
Write a program that lets the user guess whether the flip of a coin results in heads or tails.
The program randomly generates an integer 0 or 1, which represents head or tail. The program
prompts the user to enter a guess and reports whether the guess is correct or incorrect.
 */
import java.util.Scanner;
public class HeadsOrTails {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        //generate 0 or 1
        int randomGuess = (int)(Math.random() * 2);
        System.out.println(randomGuess);
        System.out.print("Enter a guess ( 0 for heads, 1 for Tail): ");
        int guess = input.nextInt();

        System.out.print((guess == randomGuess)? "The guess is correct!" : "The guess is incorrect!");


    }
}
