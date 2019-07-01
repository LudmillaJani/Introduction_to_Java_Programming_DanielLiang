/* Game: addition quiz
Listing 3.3 SubtractionQuiz.java, randomly generates a subtraction question. Revise the
program to randomly generate an addition question with two integers less then 100.
 */
import java.util.Scanner;
public class AdditionQuiz {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        //Generate two integers less then 100
        int number1 = (int)(Math.random()*100);
        int number2 = (int)(Math.random()*100);

        //if num1 < num 2 swap
        if(number1 < number2){
            int temp = number1;
            number1 = number2;
            number2 = temp;
        }

        System.out.print("What is number1 + number2? ");
        int answer = input.nextInt();

        if(number1 - number2 == answer)
            System.out.print("You are correct!");
        else{
            System.out.println("Your answer is wrong!");
            System.out.print(number1 + " - " + number2 + " = " + (number1 - number2));
        }

    }
}
