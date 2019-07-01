/** (Game: craps) Craps is a popular dice game played in casinos.
 *  Write a program to play a variation of the game, as follows:
 *  Roll two dice. Each die has six faces representing values 1, 2, …, and 6, respectively.
 *  Check the sum of the two dice. If the sum is 2, 3, or 12 (called craps), you
 *  lose; if the sum is 7 or 11 (called natural), you win; if the sum is another value
 *  (i.e., 4, 5, 6, 8, 9, or 10), a point is established. Continue to roll the dice until either
 *  a 7 or the same point value is rolled. If 7 is rolled, you lose. Otherwise, you win.
 *  Your program acts as a single player.
 */
import java.util.Scanner;
public class GameCraps {
    public static void main(String[] args){
        System.out.print(rollDice());
        Scanner input = new Scanner(System.in);

        System.out.print("Do you want to play the game(enter Y for yes, N for no: ");
        char yOrN = input.next().charAt(0);

        if(yOrN == 'Y'){
            int num1 = rollDice();
            int num2 = rollDice();
            int sum = getSum(num1,num2);
            System.out.println("You rolled " + num1 + "+" + num2 + "=" + sum);

            checkSum(sum);
        }


    }



    public static void checkSum(int sum){
        if(sum ==2 || sum == 3 || sum == 11)
            System.out.println("You lose!");
        if(sum == 7 || sum == 11)
            System.out.println("You win!");
        if(sum ==4 || sum == 5 || sum == 6 || sum == 8 || sum == 9){
            System.out.println("Yor point is " + sum);
            int num1 = rollDice();
            int num2 = rollDice();
            int s =  getSum(num1,num2);
            while((s !=7 || num1==num2)){
                System.out.println("Roll again: ");
                num1 = rollDice();
                num2 = rollDice();
                s =  getSum(num1,num2);
            }
            System.out.println("You rolled " + num1 + "+" + num2 + "=" + s

            if(s==7)
                System.out.println("You loose!");
            else
                System.out.println("You win");
        }
    }

    public static int getSum(int num1, int num2){
        return num1+num2;
    }

    public static int rollDice(){
        return(int)(Math.random()*6)+1;
    }
}
