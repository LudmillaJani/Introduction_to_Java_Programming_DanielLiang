/* Days of a month
Write a program that prompts the user to enter a year and the first three letters of a month name
(with the first letter in uppercase) and displays the number of days in the month.
 */
import java.util.Scanner;
public class daysOfMonth {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a year: ");
        int year = input.nextInt();

        System.out.print("Enter a month(the first three letters,first letter upperCase: ");
        String month = input.next();
        char firstLetter = month.charAt(0);

        if(!Character.isUpperCase(firstLetter)){
            System.out.print("The month should start with uppercase letter");
            System.exit(1);
        }

        String monthSub = month.substring(0,3);

        boolean isLeapYear = (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);

        switch (monthSub){
            case "Jan" : System.out.print(monthSub +" "+ year + " has " + "31 days"); break;
            case "Feb" : System.out.print(monthSub +" "+ year + " has " + ((isLeapYear)? "29 days" : "28 days")); break;
            case "Mar" : System.out.print(monthSub +" "+ year + " has " + "31 days"); break;
            case "Apr" : System.out.print(monthSub +" "+ year + " has " + "30 days"); break;
            case "May" : System.out.print(monthSub +" "+ year + " has " + "31 days"); break;
            case "Jun" : System.out.print(monthSub +" "+ year + " has " + "30 days"); break;
            case "Jul" : System.out.print(monthSub +" "+ year + " has " + "31 days"); break;
            case "Aug" : System.out.print(monthSub +" "+ year + " has " + "31 days"); break;
            case "Sep" : System.out.print(monthSub +" "+ year + " has " + "30 days"); break;
            case "Oct" : System.out.print(monthSub +" "+ year + " has " + "31 days"); break;
            case "Nov" : System.out.print(monthSub +" "+ year + " has " + "30 days"); break;
            case "Dec" : System.out.print(monthSub +" "+ year + " has " + "31 days"); break;
        }

    }
}
