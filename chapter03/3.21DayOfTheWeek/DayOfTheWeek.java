/* Science: day of the week
Zeller's congruence is an algorithm developed by Christian Zeller to calculate the day of the week.
Write a program that prompts the user to enter a year, month, and day of the month, and displays
the name of the day of the week.
 */
import java.util.Scanner;
public class DayOfTheWeek {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter year: (e.g 2013): ");
        int year = input.nextInt();

        System.out.print("Enter month (1-12): ");
        int month = input.nextInt();

        System.out.print("Enter the day of the month(1-31): ");
        int dayMonth = input.nextInt();

        if(month == 1 || month==2){
            month = (month==1)? 13:14;
            year--;

        }

        int century = year / 100;
        int yearOfTheCentury = year % 100;

        int dayOfTheWeek = ( dayMonth + (26*(month + 1)/10) + yearOfTheCentury +
                yearOfTheCentury/4 + century/4 + 5*century ) % 7;

        System.out.print("The day of the week is ");
        switch (dayOfTheWeek){
            case 0: System.out.print("Saturday"); break;
            case 1: System.out.print("Sunday"); break;
            case 2: System.out.print("Monday"); break;
            case 3: System.out.print("Tuesday"); break;
            case 4: System.out.print("Wednesday"); break;
            case 5: System.out.print("Thursday"); break;
            case 6: System.out.print("Friday"); break;
        }

    }
}
