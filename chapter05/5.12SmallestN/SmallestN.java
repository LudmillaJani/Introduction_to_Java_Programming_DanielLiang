/* Find the smallest n such that n^2>12000
Use a while loop to find the smallest integer n such that n^2 is greater than 12,000
 */
public class SmallestN {
    public static void main(String[] args){
        int n = 1;

        while(n*n < 12_000)
            n++;
        System.out.print("The number is " + n);

    }
}
