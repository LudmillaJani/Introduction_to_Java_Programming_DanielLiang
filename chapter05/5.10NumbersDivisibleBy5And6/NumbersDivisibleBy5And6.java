/* Find numbers divisible by 5 and 6
Write a program that displays all the numbers from 100 and 1000, ten per line, that are divisible by
5 and 6. Numbers are separated by exactly one space.
 */

public class NumbersDivisibleBy5And6 {
    public static void main(String[] args){
        int numbers_per_line = 10;
        int count = 0;//count the number of numbers divisible by both

        for(int number=100; number<=1000; number++){
            if(number%5==0 && number%6==0){
                count++;
                if(count % numbers_per_line ==0)//check how many we have in a line
                    System.out.println(number);//display the number and advance to the next line
                else
                    System.out.print(number + " ");
            }


        }

    }
}
