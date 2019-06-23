/*
Write a program that reads in the radius in the radius and length of a cylinder and computes the area and volume.
*/

import java.util.Scanner;
public class VolumeOfaCilinder {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the radius and length of a cylinder: ");
        double radius = input.nextDouble();
        double length  = input.nextDouble();
        final double pi = 3.14159;
        double area = radius * radius * pi;
        double volume = area * length;

        System.out.println("The area is " + (int)(area * 100) / 100.0);
        System.out.print("The volume is " + (int)(volume*100)/100.0);


    }
}
