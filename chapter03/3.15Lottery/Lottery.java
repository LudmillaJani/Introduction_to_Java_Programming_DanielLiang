/* Game: Lottery
Revise Listing 3.8, Lottery.java, to generate a lottery of a three-digit number. The program
prompts the user to enter a three-digit number and determines whether the user wins according
to the following rules:
1. If the user input matches the lottery number in the exact order, the award is $10,000.
2. If all digits in the user input matches all digits in the lottery number, the award is $3,000.
3. If one digit in the user input matches a digit in the lottery number, the award is $1,000.
 */

import java.util.Scanner;
public class Lottery {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        //generate a 3 digit number [0,999]
        int lottery = (int)(Math.random() * 1000);

        //prompt the user to enter a guess
        System.out.print("Enter your lottery pick(3digits): ");
        int guess = input.nextInt();

        //get digits from lottery
        int lotteryDigit1 = lottery /100;
        int remainingDigitsLottery= lottery % 100;
        int lotteryDigit2 =  remainingDigitsLottery/ 10;
        remainingDigitsLottery%= 10;
        int lotteryDigit3 = remainingDigitsLottery;

        //get digits form guess
        int guessDigit1 = guess /100;
        int remainingDigits = guess % 100;
        int guessDigit2 = remainingDigits / 10;
        remainingDigits %= 10;
        int guessDigit3 = remainingDigits;

        System.out.println("The lottery number is " + lottery);

        //check the guess
        if(guess == lottery)
            System.out.print("Exact match: you win $10,000");
        else if( (lotteryDigit1 == guessDigit2) && (lotteryDigit2 == guessDigit1) &&
                (lotteryDigit3 == guessDigit3) || (lotteryDigit1 == guessDigit2) &&
                (lotteryDigit2 == guessDigit3) && (lotteryDigit3 == guessDigit1) ||
                (lotteryDigit1 == guessDigit3) && (lotteryDigit2 == guessDigit1) &&
                        (lotteryDigit3 == guessDigit2) ||
                (lotteryDigit1 == guessDigit1) && (lotteryDigit2==guessDigit3) &&
                        (lotteryDigit3 == guessDigit1))
            System.out.print("Math all digits: you win $3,000");
        else if((guessDigit1 == lotteryDigit1) ||
               (guessDigit1 == lotteryDigit2) ||
                (guessDigit1 == lotteryDigit3) ||
                (guessDigit2 == lotteryDigit1) ||
                (guessDigit2 == lotteryDigit2) ||
                (guessDigit2 == lotteryDigit3) ||
                (guessDigit3 == lotteryDigit1) ||
                (guessDigit3 == lotteryDigit2) ||
                (guessDigit3 == lotteryDigit3) )
            System.out.print("Match one digit: you win $1,000");
        else
            System.out.print("Sorry, no match!");


    }
}
