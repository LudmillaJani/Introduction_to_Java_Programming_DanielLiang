/* Write a method that prints characters. */

public class displayCharacters {
    public static void main(String[] args){
        printChars('1','Z',10);

    }
    public static void printChars(char ch1, char ch2, int numberPerLine){
        int count = 1;
        for(int i = ch1; i <= ch2; i++){
            System.out.print((count%numberPerLine != 0)? (char)i+" " : (char)i+"\n");
            count++;

        }
    }
}
