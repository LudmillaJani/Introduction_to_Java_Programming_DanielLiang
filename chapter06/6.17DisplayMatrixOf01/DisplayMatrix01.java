public class DisplayMatrix01 {
    public static void main(String [] args){
        int random0_1 = (int)(Math.random()*2);
        //System.out.println(random0_1);

        printMatrix(6);

    }
    public static void printMatrix(int n){

        int count=1;
        for(int row=1; row<=n;row++){
            for(int col=1;col<=n;col++){
                int random0_1 = (int)(Math.random()*2);
                System.out.print((count%n != 0)? random0_1 + " " : random0_1 + "\n");
                count++;
            }
        }
    }
}
