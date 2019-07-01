import java.util.Scanner;
public class DisplayPiramid {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of lines(1-15):");
        int nrLines = input.nextInt();

        for(int currentRow = 1; currentRow <= nrLines; currentRow++){
            //for every row do:

            //print spaces
            for (int space = 1; space <= nrLines - currentRow; space++ ){
                System.out.print("  ");
            }

            //print numbers on the left
            for(int left = currentRow; left >= 1; left--){
                System.out.print(left + " ");
            }

            //print numbers on the right
            for(int right=2; right <= currentRow; right++){
                System.out.print(right + " ");
            }
            System.out.println();
        }


    }
}
