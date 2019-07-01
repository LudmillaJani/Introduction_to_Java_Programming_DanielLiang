/* Generate vehicle plate number
Assume a vehicle plate number consists of three uppercase letters followed by four digits.
Write a program to generate a plate number.
 */

public class GenerateVehiclePlateNumber {
    public static void main(String[] args){

        //generate three uppercase letters
        char letter1 = (char)(Math.random() * 26 + 'A');
        char letter2 = (char)(Math.random() * 26 + 'A');
        char letter3 = (char)(Math.random() * 26 + 'A');

        //generate four numbers [0,9]
        int num1 = (int)(Math.random()*10);
        int num2 = (int)(Math.random()*10);
        int num3 = (int)(Math.random()*10);
        int num4 = (int)(Math.random()*10);

        System.out.print("The plate number is " + letter1+letter2+letter3+num1+num2+
                num3+num4);

    }
}
