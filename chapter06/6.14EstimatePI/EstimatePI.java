/* Write a method that returns m(i) for a given i and write a test program */

public class EstimatePI {
    public static void main(String[] args){
        System.out.println("  i       " + "m(i)");
        System.out.println("_____________");
        printPI(901);
    }
    public static double estimatePI(int n){
        double PI = 0;
        for(double i = 1; i<=n;i++){
           PI += 4*(Math.pow(-1,i+1) / (2*i-1));
        }
        return PI;
    }
    public static void printPI(int n){
       for(int i=1;i<=n;i+=100){
           System.out.printf("%4d    %5.4f \n ", i, estimatePI(i));
       }
    }
}
