/** Revise Exercice 6.30 to run it 10,000 times and display the number of wining games.
 */
import java.util.Scanner;
public class ChanceOfWinningAtCraps {
    public static void main(String[] args){
        System.out.print(rollDice());
        Scanner input = new Scanner(System.in);

        System.out.print("Do you want to play the game(enter Y for yes, N for no: ");
        char yOrN = input.next().charAt(0);

        if(yOrN == 'Y' || yOrN=='y'){
            int num1 = rollDice();
            int num2 = rollDice();
            int sum = getSum(num1,num2);

            System.out.print("You won " + checkSum(sum, 1000)+ " time(s)");
        }else
            System.exit(-1);


    }

    public static int checkSum(int sum, int nrGames){
        int count=0;
        for(int i =1; i<=nrGames;i++){
            if(sum == 7 || sum == 11) {//win
                count++;
            }
            if(sum ==4 || sum == 5 || sum == 6 || sum == 8 || sum == 9){
                int num1 = rollDice();
                int num2 = rollDice();
                int s =  getSum(num1,num2);
                while((s !=7 || num1==num2)){
                    num1 = rollDice();
                    num2 = rollDice();
                    s =  getSum(num1,num2);
                }
                if(num1==num2)
                    count++;
            }
        }
        return count;
    }

    public static int getSum(int num1, int num2){
        return num1+num2;
    }

    public static int rollDice(){
        return(int)(Math.random()*6)+1;

    }
}
