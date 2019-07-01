/* Random Point
Write a program that displays a random coordinate in a rectangle. The rectangle is centered at (0,0)
with width 100 and height 200.
 */

import java.util.Scanner;
public class RandomPoint {
    public static void main(String[] args){

        //x's range [-50,50]; y's range [-100,100]
        //(int)(Math.random() * (max - min + 1)) + min
        int x = (int)(Math.random()* 101) - 50;
        int y = (int)(Math.random() * 201) - 100;
        System.out.print("(" + x + "," + y + ")");

    }
}
