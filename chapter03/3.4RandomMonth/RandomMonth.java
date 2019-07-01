/* Random Month
Write a program that randomly generates an integer between 1 and 12 and displays the english month
name January, February,..., December for the number 1,2,...,12, accordingly.
 */

public class RandomMonth {
    public static void main(String[] args){

        int number = (int)(Math.random() * 10);

        switch (number){
            case 1: System.out.print("1_st month is January");
              break;
            case 2 : System.out.print("2_nd month is February");
                break;
            case 3 : System.out.print("3_rd month is March");
                break;
            case 4 : System.out.print("4_th month is April");
                break;
            case 5 : System.out.print("5_th month is May");
                break;
            case 6 : System.out.print("6_th month is June");
                break;
            case 7 : System.out.print("7_th month is July");
                break;
            case 8 : System.out.print("8_th month is August");
                break;
            case 9 : System.out.print("9_th month is September");
                break;
            case 10 : System.out.print("10_th month is October");
                break;
            case 11 : System.out.print("11_th month is November");
                break;
            case 12 : System.out.print("12_th month is December");
                break;
        }

    }
}
