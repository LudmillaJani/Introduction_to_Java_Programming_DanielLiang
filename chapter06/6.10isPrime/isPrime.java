/* Find the number of prime numbers less than 10,000 */

public class isPrime {
    public static void main(String[] args){

        printPrimes(10_000);
    }
    public static boolean isPrime(int n){
        for(int divisor = 2; divisor <= n/2 ; divisor++){
            if(n%divisor==0) //not prime
                return false;
        }
        return true;//number is prime
    }

    public static void printPrimes(int n){
        int count = 0;
        for(int i = 2; i <= n; i++){
            if(isPrime(i)){
                count++;
                System.out.print((count%10 != 0)? i+" " : i+"\n");
            }
        }
    }
}
