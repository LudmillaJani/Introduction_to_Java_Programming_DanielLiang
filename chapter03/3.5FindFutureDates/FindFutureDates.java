/* Find Future Dates
Write a program that prompts the user to enter an integer for today's day of the week (Sunday
is 0, Monday is 1, ..., and Saturday is 6). Also, prompt the user to enter the number of days
after today for a future day and display the future day of the week.
 */
import java.util.Scanner;
public class FindFutureDates {
    public static void main(String[] args){
        Scanner  input = new Scanner(System.in);

        System.out.print("Enter today's day: ");
        int dayToday = input.nextInt();

        if(dayToday < 0 || dayToday >6)
            System.out.print("Not a correct choice!");
        else {

            System.out.print("Enter the number of days elapsed since today: ");
            int nrDaysElapsed = input.nextInt();

            int futureDayNr = (dayToday + nrDaysElapsed) % 7;

            System.out.print("Today is");
            switch (dayToday) {
                case 0:
                    System.out.print(" Sunday ");
                    break;
                case 1:
                    System.out.print(" Monday ");
                    break;
                case 2:
                    System.out.print(" Tuesday ");
                    break;
                case 3:
                    System.out.print(" Wednesday ");
                    break;
                case 4:
                    System.out.print(" Thursday ");
                    break;
                case 5:
                    System.out.print(" Friday ");
                    break;
                case 6:
                    System.out.print(" Saturday ");
            }

            System.out.print("and the future day is ");
            switch (futureDayNr) {
                case 0:
                    System.out.print(" Sunday ");
                    break;
                case 1:
                    System.out.print(" Monday ");
                    break;
                case 2:
                    System.out.print(" Tuesday ");
                    break;
                case 3:
                    System.out.print(" Wednesday ");
                    break;
                case 4:
                    System.out.print(" Thursday ");
                    break;
                case 5:
                    System.out.print(" Friday ");
                    break;
                case 6:
                    System.out.print(" Saturday ");
                    break;
            }
        }

    }
}
