/* Find the number of days in a month
Write a program that prompts the user to enter the month and year and diplays the number of days in the
month.
 */
import java.util.Scanner;
public class NumberOfDaysInMonth {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the month and year as integers: ");
        int month = input.nextInt();
        int year = input.nextInt();

        boolean isLeapYear = (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);

        switch (month){
            case 1 : System.out.print("January " + year + " had " + "31 days"); break;
            case 2 : System.out.print("February " + year + " had " + ((isLeapYear)? "29 days" : "28 days")); break;
            case 3 : System.out.print("March " + year + " had " + "31 days"); break;
            case 4 : System.out.print("April " + year + " had " + "30 days"); break;
            case 5 : System.out.print("May " + year + " had " + "31 days"); break;
            case 6 : System.out.print("June " + year + " had " + "30 days"); break;
            case 7 : System.out.print("July " + year + " had " + "31 days"); break;
            case 8 : System.out.print("August " + year + " had " + "31 days"); break;
            case 9 : System.out.print("September " + year + " had " + "30 days"); break;
            case 10 : System.out.print("October " + year + " had " + "31 days"); break;
            case 11 : System.out.print("November " + year + " had " + "30 days"); break;
            case 12 : System.out.print("December " + year + " had " + "31 days"); break;
        }
    }
}
