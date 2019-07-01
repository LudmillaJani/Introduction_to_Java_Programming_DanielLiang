/* Conversion from miles to kilometers
Write a program that displays the following table(note that 1 mile is 1.609 km)
 */
public class milesToKilometers {
    public static void main(String[] args){

        double mileOne = 1.609;
        System.out.printf("%s %15s", "Miles", "Kilometers");
        for(int miles=1; miles < 11; miles++){
            System.out.printf("\n%-10d %-1.3f ", miles, (mileOne*miles));

        }

    }
}
