/* Conversion form kilograms to pounds and pounds to kilograms
Write a program that displays the following two tables side by side:
 */

public class kilogramsToPounds {
    public static void main(String[] args){

        double poundPerOneKilo = 2.2; //pounds
        System.out.printf("%s  %10s %10s %20s %15s","kilograms","Pounds", "|", "Pounds", "Kilograms");
        for(int countKilograms = 1,pounds = 20; countKilograms <= 199 && pounds <516; countKilograms +=2,pounds+=5){
            {
                //System.out.printf("\n%d %15.1f ",countKilograms ,countKilograms * poundPerOneKilo);

                System.out.printf("\n%d %20.1f %10s %15d %15.2f",countKilograms ,(countKilograms * poundPerOneKilo),"|", pounds,( pounds/poundPerOneKilo));
            }

        }

    }
}
