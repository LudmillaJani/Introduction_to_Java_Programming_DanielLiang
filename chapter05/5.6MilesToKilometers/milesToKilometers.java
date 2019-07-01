/* conversion from miles to kilometers
Write a program that displays the following two tables side by side
 */

public class milesToKilometers {
    public static void main(String[] args) {

        final double mileOne = 1.609;//kilometers

        System.out.printf("%s %15s %5s %15s %10s", "Miles", "Kilometers","|" ,"Kilometers", "Miles");
        for (int miles = 1, kilometers = 20; miles < 11 && kilometers < 66 ; miles++,kilometers+=5) {
            System.out.printf("\n%-10d %-14.3f %-6s %-15d %-10.3f ", miles, (mileOne * miles),"|",kilometers, kilometers/mileOne);
        }
    }
}
