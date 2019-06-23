/*
Write a program that prompts the user to enter the minutes (e.g 1 billion), and displays the
number of years and days for the minutes. For simplicity, assume that a year has 365 days.
 */
import java.util.Scanner;
public class FindTheNumberOfYears {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number of minutes: ");
        int minutes = input.nextInt();

        // 1year = 365days; 1day = 24hours; 1hour = 60min
        int minutesInOneYear = 365 * 24 * 60;
        int minutesInOneDay = 24 * 60;

        int nrYears = minutes / minutesInOneYear;
        int nrDays = minutes % minutesInOneYear / minutesInOneDay;

        System.out.print(minutes + " minutes is approximately " + nrYears +
                 " year(s)" +  " and " + nrDays + " day(s)");


    }
}
