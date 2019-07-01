/* Count positive and negative numbers and compute the average of numbers
Write a program that reads an unspecified number of integers, determines how many positive
and negative values have been read, and computes the total and average of the input values
(not counting zeros). Your program ends with the input 0.
Display the average as a floating-point number.
 */
import java.util.Scanner;
public class countPositiveAndNegativeNumbers {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter an integer, the input ends if it is 0: ");
        int number;
        int countPositives=0;
        int countNegatives=0;
        int sum=0;
        int count = 0;

        if((number=input.nextInt()) == 0)
        {
            System.out.print("No numbers are entered except " + number);
            System.exit(1);
        }else{
            do{
                if(number>0)
                    countPositives++;
                else if(number<0)
                    countNegatives++;

                sum+=number;
                count++;
                number=input.nextInt();
            }while(number !=0);
        }

        double average = (double)(sum)/count;
        System.out.println("The number of positives is: " + countPositives);
        System.out.println("The number of negatives is: " + countNegatives);
        System.out.println("The total is: " + sum);
        System.out.println("The count is: " + count);
        System.out.printf("The average is: %.2f" , average);

    }
}
