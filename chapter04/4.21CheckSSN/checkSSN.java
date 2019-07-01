/* Check SSN
Write a program that prompts the user to enter a Social Security Number in the format
DDD-DD-DDDD, where D is a digit. Your program should check whether the input is valid.
 */
import java.util.Scanner;
public class checkSSN {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a SSN: ");
        String SSN = input.next();

        int index1 = SSN.indexOf('-');
        String firstThree = SSN.substring(0,index1);
        String sub2SSn = SSN.substring(index1 + 1);

        int index2 = sub2SSn.indexOf('-');
        String secondTwo = sub2SSn.substring(0,index2);
        String thirdFour = sub2SSn.substring(index2 + 1);


        if(firstThree.length() == 3 && secondTwo.length() == 2 && thirdFour.length() == 4)
                System.out.print(SSN +" is a valid social security number.");

        else
        System.out.print(SSN + " is an invalid SSN.");

    }



}
