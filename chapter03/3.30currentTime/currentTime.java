/* Current time
Revise programing exercise 2.8 to display the hour using a 12-hour clock
 */
import java.util.Scanner;
public class currentTime {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the time zone offset to GMT: ");
        int timeGMT = input.nextInt();
        //obtain the total milliseconds since midnight, Jan 1, 1970
        long totalMilliseconds = System.currentTimeMillis();

        //obtain the total seconds since midnight, Jan 1, 1970
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
        int currentHour = (int)totalHours % 24;
        currentHour += timeGMT;

        //use 12 hour clock
        if( 13<= currentHour && currentHour <= 24)
            currentHour %= 12;


        //Display Result
        System.out.println("Current time is " + currentHour + ":" + currentMinute + ":"
                + currentSecond);

    }
}
