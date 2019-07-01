/* Financial Application: compute future tuition
suppose that the tuition for university is $10,000 this year and increases 5% every year. In one year
the tuition will be $10,500. Write a program that computes the tuition in ten years and the
total cost of four years worth of tuition after the tenth year.
 */

public class ComputeFutureTuition {
    public static void main(String[] args){

        double increaseRate = 0.05;
        //first year tuition
        double tuition = 10000;



        //tuition from first year to the 10th
        for(int year=1; year<10;year++){
             tuition += increaseRate * tuition;
        }
        double tuition4=tuition;
        for(int year4 = 0; year4<4; year4++){
             tuition4 += tuition * increaseRate;
        }
        double t =tuition4-tuition;
        System.out.println("The total tuition is: " + tuition);
        System.out.println("The total tuition after 4 years: " + t);
    }
}
