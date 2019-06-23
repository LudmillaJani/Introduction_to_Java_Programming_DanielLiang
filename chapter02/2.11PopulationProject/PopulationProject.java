/*Population Project
Rewrite programing Exercise 1.11 to prompt the user to enter the number of years and displays the population after the
number of years. The population should be cast into an integer.
Exercise 1.11: The U.S Census Bureau projects population based on the following assumptions:
One birth every 7 seconds
One death every 13 seconds
One new immigrant every 45 seconds
Write a program to display the population for each of the next given years.
Assume the current population is 312,032,486 and 1 year has 365 days.
 */
import java.util.Scanner;
public class PopulationProject {
    public static void main(String[] args){
        final int currentPopulation = 312_032_486;
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number of Years: ");
        int nrYears = input.nextInt();

        int secondsInYear = 365 * 24 * 60 * 60;

        //calculate the number of births, of deaths, of immigrants per year
        double nrBirthYear = secondsInYear/7.0;
        double nrDeathYear = secondsInYear/13.0;
        double nrImmigrants = secondsInYear / 45.0;

        //calculate the new population
        int population = (int)(currentPopulation+(nrBirthYear + nrImmigrants - nrDeathYear) * 5);

        System.out.print("The population in " + nrYears + " years is " + population);



    }
}
