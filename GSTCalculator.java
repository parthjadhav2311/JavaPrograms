

import java.util.Scanner;

public class GSTCalculator {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

       
        System.out.print("Enter the bill amount: ");
        double billAmount = scanner.nextDouble();

        
        double gstAmount = 18 * billAmount;

       
        double netAmount = billAmount + gstAmount;

       
        System.out.println("GST Amount (18%): " + gstAmount);
        System.out.println("Net Amount: " + netAmount);

       
        scanner.close();
    }
}
