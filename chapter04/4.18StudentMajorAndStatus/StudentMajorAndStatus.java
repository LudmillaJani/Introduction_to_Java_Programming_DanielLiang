/*Student major and status
Write  program that prompts the user to enter two characters and displays the major and status
represented in the characters.
The first character indicates the major and the second is number character 1, 2, 3, 4, which
indicates whether a student is a freshmen, sophomore, junior, or senior.
Suppose the following characters are used to denote majors:
M: Mathematics
C: Computer Science
I: Information Technology
 */
import java.util.Scanner;
public class StudentMajorAndStatus {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter two characters: ");
        String twoCharacters = input.next();
        char majorChar = twoCharacters.charAt(0);
        char statusChar = twoCharacters.charAt(1);

        if(majorChar != 'M' && majorChar != 'C' && majorChar != 'I' &&
                !(1 <= statusChar && statusChar <= 4))
            System.out.print("Invalid input");
        else{
            switch (majorChar){
                case 'M': System.out.print("Mathematics "); break;
                case 'C': System.out.print("Computer Science "); break;
                case 'I': System.out.print("Information Technology "); break;
            }
            switch (statusChar){
                case '1': System.out.print("Freshmen "); break;
                case '2': System.out.print("Sophomore "); break;
                case '3': System.out.print("Junior "); break;
                case '4': System.out.print("Senior "); break;
            }
        }

    }
}
