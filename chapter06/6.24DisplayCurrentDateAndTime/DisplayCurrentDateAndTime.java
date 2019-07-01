/** Improve Listing 2.7, ShowCurrentTime.java to display Current Date and Time.
 */
import java.util.Scanner;
public class DisplayCurrentDateAndTime {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the milliseconds :" );
        long millis = input.nextLong();

        //Display Result
        System.out.println("Converted: " + convertMillis(millis));

    }

    public static String convertMillis(long totalMilliseconds){


        //obtain the total seconds : 1 sec=1000 millisecond
        long totalSeconds = totalMilliseconds / 1000;

        //Compute the current second in the minute in the hour
        long currentSecond = totalSeconds % 60;

        //obtain the total minutes
        long totalMinutes  = totalSeconds /60;

        //compute the current minute in the hour
        long currentMinute = totalMinutes % 60;

        //Obtain the total hours
        long totalHours = totalMinutes / 60;

        //Compute the current hour
        long currentHour = totalHours % 24;

        String str = currentHour+":"+currentMinute+":"+currentSecond;

        return str;

    }
}
