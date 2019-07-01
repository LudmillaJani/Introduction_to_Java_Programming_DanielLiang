public class DisplayFourPatterns {
    public static void main(String[] args){

        final int nrRows = 7;

        System.out.println("Pattern A");
        for(int currentRow = 1; currentRow <= nrRows; currentRow++){
            //display numbers in each row
            for(int i = 1; i < currentRow; i++)
                System.out.print(i + " ");
            System.out.println();
        }

        System.out.println();
        System.out.println("Pattern B");
        for(int currentRow = 1; currentRow < 7; currentRow++){
            for(int i = 1; i <=(nrRows - currentRow); i++)
                System.out.print(i + " ");
            System.out.println();
        }

        System.out.println();
        System.out.println("Pattern C");
        for(int currentRow = 1; currentRow < 7; currentRow++){
            //print spaces
            for(int spaces = 1; spaces < nrRows-currentRow; spaces++)
                System.out.print("  ");
            //print numbers
            for(int numbers = currentRow; numbers>=1;numbers--)
                System.out.print(numbers + " ");
            System.out.println();
        }

        System.out.println();
        System.out.println("Pattern D");
        for(int currentRow = 1; currentRow < 7; currentRow++){
            //print spaces
            for(int spaces = 1; spaces < currentRow; spaces++)
                System.out.print("  ");
            //print numbers
            for(int numbers = 1; numbers <= nrRows-currentRow;numbers++)
                System.out.print(numbers + " ");
            System.out.println();
        }
    }
}
