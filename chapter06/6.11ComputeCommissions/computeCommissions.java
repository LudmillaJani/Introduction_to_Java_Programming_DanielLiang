/* Write a method that computes the commission, using the scheme in programming ex 5.39

 */

public class computeCommissions {
    public static void main(String[] args){
        System.out.printf("%12s%15s\n", "Sales Amount", "Commission");
        System.out.println("----------------------------");

        for (int i = 10000; i <= 100000; i += 5000) {
            System.out.printf("%-6d%15.1f\n", i, computeCommission(i));
        }
    }
    public static double computeCommission(double salesAmount) {
        double commission;
        if (salesAmount >= 10000.01)
            commission = 5000*0.08+5000*0.1 + (salesAmount - 10000.0) * 0.12;
        else if (salesAmount >= 5000.01)
            commission = 5000*0.08 + (salesAmount - 5000.0) * 0.1;
        else
            commission = salesAmount * 0.08;
        return commission;


    }
}
