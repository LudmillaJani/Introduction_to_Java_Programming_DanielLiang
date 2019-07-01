/** Twin primes are a pair of prime numbers that differ by2. For example,
 * 3 and 5 are twin primes, 5 and 7 are twin primes, and 11 and 13 are twin primes.
 * Write a program to find all twin primes less than 1,000. Display the output.
 */


public class TwinPrimes {
    public static void main(String[] args){


        printTwinPrimes(100);


    }

    public static void printTwinPrimes(int n) {
        for (int i = 2; i < 1000; i++) {
            if (isTwinPrime(i))
                System.out.println("(" + i + ", " + (i + 2) + ")");
        }
    }

        public static boolean isTwinPrime(int n) {

            return (isPrime(n) && isPrime(n + 2));
        }

    public static boolean isPrime(int n){
        for(int i=2; i<= n/2; i++){
            if(n % i == 0) return false;
        }
        return true;
    }
}
