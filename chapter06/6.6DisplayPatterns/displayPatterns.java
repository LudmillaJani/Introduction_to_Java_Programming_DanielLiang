/* Write a method to display a pattern as follows

 */
import java.util.Scanner;
public class displayPatterns {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int nrRows = input.nextInt();

        displayPattern(nrRows);

    }

    public static void displayPattern(int n){

        for(int currentRow = 1; currentRow <= n; currentRow++){
            //print empty spaces
            for(int col = 1; col<=n-currentRow;col++)
                System.out.print("  ");
            //print numbers
            for(int number=currentRow;number>=1;number--)
                System.out.print(number + " ");

            System.out.println();
        }
    }
}
