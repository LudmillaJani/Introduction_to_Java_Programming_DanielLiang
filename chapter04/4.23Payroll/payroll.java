/* Financial Application: payroll
Write a program that reads the following information and prints a payroll statement:
Employee’s name (e.g., Smith)
Number of hours worked in a week (e.g., 10)
Hourly pay rate (e.g., 9.75)
Federal tax withholding rate (e.g., 20%)
State tax withholding rate (e.g., 9%)
 */
import java.util.Scanner;
public class payroll {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter employee's name: ");
        String name = input.nextLine();

        System.out.print("Enter number of hours worked: ");
        int nrHours = input.nextInt();

        System.out.print("Enter hourly pay rate: ");
        double payRate = input.nextDouble();

        System.out.print("Enter federal tax withholding rate: ");
        double federalTaxRate = input.nextDouble();

        System.out.print("Enter state tax withholding rate: ");
        double stateTaxRate = input.nextDouble();

        //gross pay
        double grossPay = nrHours * payRate;

        //deductions
        //federal withholding
        double federalWithholding = grossPay * federalTaxRate;
        //state withholding
        double stateWithholding = grossPay * stateTaxRate;
        //total deduction
        double totalDeduction = federalWithholding + stateWithholding;

        //remaining
        double netPay = grossPay - totalDeduction;


        System.out.printf("Employ name: %s \nHours Worked: %d \nPay Rate: $%.2f \nGross Pay: $%.1f"
                ,name,nrHours,payRate,grossPay);


         System.out.printf("\nDeductions: \n   Federal Withholding: $%.2f \n   State Withholding: $%.2f \n" +
                "   Total Deduction: $%.2f \nNetPay: $%.2f",federalWithholding,stateWithholding,totalDeduction,netPay);


    }
}
