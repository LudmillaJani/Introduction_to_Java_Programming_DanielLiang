/*(Geometry: great circle distance) The great circle distance is the distance between two points on the
surface of a sphere. Let (x1, y1) and (x2, y2) be the geographical latitude and longitude of two points.
The great circle distance between the two points can be computed using the following formula:
         d = radius * arcCos(sin(x1) * sin(x2) + cos(x1) * cos(x2) * cos(y1 - y2))
Write a program that prompts the user to enter the latitude and longitude of two points on the earth in
degrees and displays its great circle distance. The average earth radius is 6,371.01 km.
Note that you need to convert the degrees into radians using the Math.toRadians method since the Java
trigonometric methods use radians. The latitude and longitude degrees in the formula are for north and west.
Use negative to indicate south and east degrees.
 */
import java.util.Scanner;
public class gratCircleDistance {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        final double radius = 6371.01;

        System.out.print("Enter point 1(latitude and longitude) in degrees: ");
        String xy1Input = input.nextLine();

        System.out.print("Enter point 2(latitude and longitude) in degrees: ");
        String xy2Input = input.nextLine();

        int index1 = xy1Input.indexOf(',');
        double x1 = Double.parseDouble(xy1Input.substring(0,index1));
        double y1 = Double.parseDouble(xy1Input.substring(index1+1));

        int index2 = xy2Input.indexOf(',');
        double x2 = Double.parseDouble(xy2Input.substring(0,index2));
        double y2 = Double.parseDouble(xy2Input.substring(index2+1));

        System.out.println(x1 + " " +y1);
        System.out.println(x2 + " " +y2);
        x1 = Math.toRadians(x1);
        y1 = Math.toRadians(y1);
        x2 = Math.toRadians(x2);
        y2 = Math.toRadians(y2);

        //the great circle distance
        double d = radius * Math.acos(Math.sin(x1)) * Math.sin(x2) +
                Math.cos(x1) * Math.cos(x2)*Math.cos(y1-y2);


        System.out.print("The distance between the two points is " + d + " km.");


    }
}
