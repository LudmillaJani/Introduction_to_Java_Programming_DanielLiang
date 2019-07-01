/* Write a method that computes the following series. Write a test program. */

public class sumSeries {
    public static void main(String[] args){
        System.out.println("i" + "            m(i)");
        System.out.println("___________________");
        printSum(20);


    }

    public static double sumSeries(int n){
        double sum = 0;
        for(double i = 1; i<=n;i++)
            sum += i/(i+1);

        return sum;
    }
    public static void printSum(int n){

        for(int i=1;i <= n; i++){
            System.out.printf("%d %15.4f \n",i,sumSeries(i));
        }
    }
}
