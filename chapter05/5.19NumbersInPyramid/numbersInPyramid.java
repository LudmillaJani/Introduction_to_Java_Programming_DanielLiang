public class numbersInPyramid {
    public static void main(String [] args){

        final int numRows = 8;
        int power2;


        for(int currentRow=1; currentRow<numRows;currentRow++){

            //print spaces
            for(int spaces = 1;spaces<numRows-currentRow;spaces++)
                System.out.print("  ");

            //print numbers on the left
            for(int numLeft = 0; numLeft < currentRow;numLeft++)
            {
               int number = (int) Math.pow(2, numLeft);
                System.out.print( number+ " ");

            }


            //print numbers on the right
            for(int numRight = currentRow; numRight>=0;numRight--)
            {
                int number = (int) Math.pow(2, numRight);
                System.out.print( number+ " ");
            }

            System.out.println();
        }
    }
}
