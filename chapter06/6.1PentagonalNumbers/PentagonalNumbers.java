/* Math: Pentagonal Numbers
Write a method that returns a pentagonal number.
 */

public class PentagonalNumbers {
    public static void main(String[] args){
        //the first 100 pentagonal numbers
        //10 per line
        int countPent = 1;
        for(int i = 0; i < 100; i++){
            System.out.print((countPent++%10 != 0)? getPentagonalNumber(i)+ " ":
                    getPentagonalNumber(i)+"\n");
        }

    }

    public static int getPentagonalNumber(int n){
        int pentNumber = (n*(3*n - 1))/2;
        return pentNumber;
    }
}
