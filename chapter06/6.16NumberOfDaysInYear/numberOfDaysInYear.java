/* Write a method that returns the number of days ina a year.
Write a test program that displays the number of days in year from 2000 to 2020.
 */

public class numberOfDaysInYear {
    public static void main(String[] args){
        printNrDaysInYears(2000,2020);

    }
    public static int numberOfDaysInAYear(int year){
        boolean leapYear= year%4==0 && year%100!=0 || year%400==0;
        return(leapYear)? 366 : 365;
    }

    public static void printNrDaysInYears(int year1, int year2){
        for(int i = year1; i<=year2; i++){
            System.out.println(i + "    " + numberOfDaysInAYear(i));
        }
    }
}
