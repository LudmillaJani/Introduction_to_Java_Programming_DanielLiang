public class NumbersDivisibleBy5And6ButNotBoth {
    public static void main(String[] args){
        int numbers_per_line = 10;
        int count = 0;//count the number of numbers divisible by both

        for(int number=100; number<=200; number++){
            if(number%5==0 ^ number%6==0){//xor
                count++;
                if(count % numbers_per_line ==0)//check how many we have in a line
                    System.out.println(number);//display the number and advance to the next line
                else
                    System.out.print(number + " ");
            }


        }
    }
}
