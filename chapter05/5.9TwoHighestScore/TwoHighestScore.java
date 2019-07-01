/* Find the two Highest Scores
Write a program that prompts the user to enter the number of students and each student's name amd
score, and displays the student with the highest score and the students with the second highest score.
 */
import java.util.Scanner;
public class TwoHighestScore {
    public static void main(String[] args){

        String nameHS = "";
        double scoreHS = 0;
        String nameHS_P = " ";
        double scoreHS_P = 0;
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number of students: ");
        int numberOfStudents = input.nextInt();

        System.out.println("Enter their name and score: ");
        int count=1;
        while(count <= numberOfStudents){
            System.out.print("Student " + count + ":");
            String name = input.next();
            double score = input.nextDouble();
            if (scoreHS < score){
                scoreHS_P = scoreHS;
                scoreHS = score;
                nameHS_P = nameHS;
                nameHS = name;
            }
            count++;

        }

        System.out.print("\nStudent with highest score: " + nameHS + " " + scoreHS);
        System.out.print("\nStudent with second-highest score: " + nameHS_P + " " + scoreHS_P);

    }
}
