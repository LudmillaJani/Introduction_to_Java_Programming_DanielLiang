/* Game:Add three numbers
The program in Listing 3.1, AddingQuiz.java, generates two integers and prompts the user to enter
the sum of these two integers.
Listing 3.1: Suppose you want to develop a program to let a first-grader practice addition. The program
randomly generates two single-digit integers, number1 and number2, and displays to the student a question
such as "what is 1 + 7". After the student types the answer, the program displays a message to indicate
whether it is true or false.
Revise the program to generate three single-digit integers and prompt the user to enter the sum of these
three integers.
 */
import java.util.Scanner;
public class AddThreeNumbers {
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        //generates 2 numbers between 0 and 9
        int number1 = (int)(Math.random()*10);
        int number2 = (int)(Math.random()*10);
        int number3 = (int)(Math.random()*10);

        System.out.print("What is number1 + number2 + number3? ");
        int answer = input.nextInt();

        System.out.println(number1 + " + " + number2 + " + " + number3 + " = " + answer + " is " +
                (number1 + number2 == answer));

    }
}
