/* Cost of shipping
A shipping company uses the following function to calculate the cost(in dollars) of shipping based
on the weight of the package(in pounds).
Write a program that prompts the user to enter the wight of the package and display the shipping cost.
If the wight is greater than 50, display a message "the package cannot be shipped".
 */
import java.util.Scanner;
public class CostOfShipping {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the wight of the package: ");
        double weightPackage = input.nextDouble();

        double cost = 0;

        if(weightPackage > 20)
            System.out.print("The package cannot be shipped.");
        else{
            if(0<weightPackage && weightPackage <= 1)
                cost =3.5;
            else if(1<weightPackage && weightPackage <= 3)
                cost=5.5;
            else if(3<weightPackage && weightPackage <= 10)
                cost=8.5;
            else if(10<weightPackage && weightPackage <= 20)
                cost = 10.5;
            System.out.print("The shipping cost is: $" + cost * weightPackage);
        }
        
        
            



    }
}
