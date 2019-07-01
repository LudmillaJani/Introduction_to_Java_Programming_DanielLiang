/* Game: scissor, rock, paper
Write a program that plays the popular scissor-rock-paper game. A scissor can cut a paper, a rock can
knock a scissor, and a paper can wrap a rock). The program randomly generates a number 0,1, or2
representing scissor, rock, and paper.
The program prompts the user to enter a number 0,1, or2 and displays a message indicating whether the user or the
computer wins, loses, or draws.
 */
import java.util.Scanner;
public class ScissorsRockPaper {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        int random123 = (int)(Math.random() * 4);

        System.out.print("Enter a number (0,1, or 2 for scissor, rock, paper): ");
        int usersInput = input.nextInt();

        System.out.print("The computer is ");
        switch (random123){
            case 1: System.out.print("scissor.");break;
            case 2: System.out.print("rock.");break;
            case 3: System.out.print("paper.");break;
        }

        System.out.print("You are ");
        switch (usersInput){
            case 1: System.out.print("scissor");break;
            case 2: System.out.print("rock");break;
            case 3: System.out.print("paper");break;
        }

        if(random123 == usersInput)
            System.out.print(" too. It is a draw.");
        else{
            boolean winComputer = (random123 == 0 && usersInput==3) ||
                    (random123==1 && usersInput==0) || (random123==3 && usersInput==1);
            if(winComputer)
                System.out.print(". Computer won.");
            else
                System.out.print(". You won.");
        }
    }
}
