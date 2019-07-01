/* Write a program that prints the characters in ASCII character table from ! to ~,
10 characters per line.
 */
public class displayASCIIcharacterTable {
    public static void main(String[] args){
        System.out.println("ASCII Character Set in the Decimal Index");
        System.out.println("\n-------------------------------------------");

        int count = 1;
        for (int i = '!'; i <= '~'; i++)
            System.out.print((count++ % 10 != 0) ? (char)i + " " : (char)i + "\n");



    }
}
