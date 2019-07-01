/*Random character
Write a program that displays a random uppercase letter using Math.random() method.
 */
public class RandomCharacter {
    public static void main(String[] args){

        char randomUpperCase = (char)(Math.random() * 26 +'A');
        System.out.println(randomUpperCase);


        /* random lower case letter
        char randomLowerCase = (char)(Math.random() * 26 +'a');
        System.out.println(randomLowerCase);
         */




    }
}
