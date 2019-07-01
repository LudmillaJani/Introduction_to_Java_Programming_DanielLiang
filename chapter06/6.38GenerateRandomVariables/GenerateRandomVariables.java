/** Use the method in random character in Listing 6.10 to print 100 Uppercase letters
 * and then 100 single digits, printing 10 per line
 */

public class GenerateRandomVariables {
    public static void main(String[] args){
        int count =1;

        for(int i = 1; i<= 100;i++){
            System.out.print((count%10 != 0)? getRandomUppercaseLetter()+
                    " ": getRandomUppercaseLetter() + "\n");
            count++;
        }
        for(int i = 1; i<= 100;i++){
            System.out.print((count%10 != 0)? getRandomDigitCharacter()+
                    " ": getRandomDigitCharacter() + "\n");
            count++;
        }


    }
    //generate a random character between ch1 and ch2
    public static char getRandomCharacter(char ch1, char ch2){
        return (char)(ch1+ Math.random()*(ch2-ch1 + 1));
    }

    public static char getRandomUppercaseLetter(){
        return getRandomCharacter('A','Z');
    }

    public static char getRandomDigitCharacter(){
        return getRandomCharacter('0','9');
    }
}
