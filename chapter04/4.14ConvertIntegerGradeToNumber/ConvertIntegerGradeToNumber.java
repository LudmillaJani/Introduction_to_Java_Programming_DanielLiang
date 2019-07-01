/*ConvertLetterGradeToNumber
Write a program that prompts the user to enter a letter grade A, B, C, D, or F and displays
its corresponding numeric value 4,3,2,1, or 0.
 */
import java.util.Scanner;
public class ConvertIntegerGradeToNumber {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a letter grade: ");
        char letterGrade = input.next().charAt(0);

        if('A'<=letterGrade && letterGrade <= 'F' && letterGrade != 'E'){
            System.out.print("The numeric value for grade " + letterGrade +
                    " is ");
            switch (letterGrade){
                case 'A': System.out.print("4");break;
                case 'B': System.out.print("3");break;
                case 'C': System.out.print("2");break;
                case 'D': System.out.print("1");break;
                case 'F': System.out.print("0");break;
            }
        }else
            System.out.print(letterGrade + " is invalid grade!");

    }
}
