/*Geometry: Area of Hexagon
Write a program that prompts the user to enter the side of a hexagon and displays its area.
*/
import java.util.Scanner;
public class AreaOfHexagon {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the side: ");
        double side = input.nextDouble();

        double area = (6 * Math.pow(side,2)) / (4 * Math.tan(Math.PI / 6));

        System.out.printf("The area of the hexagon is %.2f" , area);

    }
}
