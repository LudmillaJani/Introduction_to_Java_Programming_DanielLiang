/* Financial: Compare cost
Suppose you shop for rice in two different packages. You shoukd like to write a program to
compare the cost. The program prompts the user to enter the weight and price of tge each package and
displays one with the better price.
 */
import java.util.Scanner;
public class CompareCost {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter weight and price for package 1: ");
        double weight1 = input.nextDouble();
        double price1 = input.nextDouble();
        double cost1 = price1 /weight1;

        System.out.print("Enter weight and price for package 2: ");
        double weight2 = input.nextDouble();
        double price2 = input.nextDouble();
        double cost2 = price2/ weight2;

        if(cost1 == cost2)
            System.out.print("Two packages have the same price!");
        else if(cost1 < cost2)
            System.out.print("Package 1 has a better price!");
        else
            System.out.print("Package 2 has a better price!");


    }
}
