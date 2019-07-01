/* Random points on a Circle
Write a program that generates three random points on a circle centered at (0,0) with radius
40 and display three angles ina triangle formed by these three points.
 */

public class RandomPointsOnCircle {
    public static void main(String[] args){

        final int radius = 40;

        //point 1
        double alpha1 = Math.random() * (Math.PI * 2);
        double x1 = radius * Math.cos(alpha1);
        double y1 = radius * Math.sin(alpha1);
        String point1 = "(" + x1 + "," + y1 + ")";

        //point 2
        double alpha2 = Math.random() * (Math.PI * 2);
        double x2 = radius * Math.cos(alpha2);
        double y2 = radius * Math.sin(alpha2);
        String point2 = "(" + x2 + "," + y2 + ")";

        //point 3
        double alpha3 = Math.random() * (Math.PI * 2);
        double x3 = radius * Math.cos(alpha3);
        double y3 = radius * Math.sin(alpha3);
        String point3 = "(" + x3 + "," + y3 + ")";

        /*
        System.out.printf("Point 1: " + point1 + "\n" +
                "Point 2: " + point2 + "\n" +
                "Point 3: " + point3);
         */

        // Compute three sides
        double side1 = Math.sqrt(Math.pow(x1 - x2, 2) + Math.pow(y1 - y2, 2));
        double side2 = Math.sqrt(Math.pow(x2 - x3, 2) + Math.pow(y2 - y3, 2));
        double side3 = Math.sqrt(Math.pow(x1 - x3, 2) + Math.pow(y1 - y3, 2));


        // Compute three angles
        double angle1 = Math.toDegrees(Math.acos((side2 * side2 - side3 * side3 - side1 * side1) / (-2 * side3 * side1)));
        double angle2 = Math.toDegrees(Math.acos((side3 * side3 - side2 * side2 - side1 * side1) / (-2 * side2 * side1)));
        double angle3 = Math.toDegrees(Math.acos((side1 * side1 - side3 * side3 - side2 * side2) / (-2 * side2 * side3)));

        System.out.printf("Angle 1: %.2f \nAngle 2: %.2f \nAngle 3: %.2f", angle1 , angle2, angle3);


    }


}
