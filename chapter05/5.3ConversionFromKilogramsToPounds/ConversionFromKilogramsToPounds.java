/* Write a program that displays the following table (note 1 kg is 2.2 pound)

 */
public class ConversionFromKilogramsToPounds {
    public static void main(String[] args){

        double poundPerOneKilo = 2.2; //pounds
        System.out.printf("%s  %-10s ","kilograms","Pounds");
        for(int countKilograms = 1; countKilograms <= 199 ; countKilograms +=2){
            System.out.printf("\n%d %15.1f ",countKilograms ,countKilograms * poundPerOneKilo);

        }

    }
}
