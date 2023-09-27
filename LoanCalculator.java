

import java.util.Scanner;

public class LoanCalculator {
    public static void main(String[] args) {
      
        Scanner scanner = new Scanner(System.in);

       
        System.out.print("Enter the loan amount: ");
        double loanAmount = scanner.nextDouble();

       
        double annualInterestRate = 0.12;

       
        double interestAmount = loanAmount * annualInterestRate;

        
        double totalAmount = loanAmount + interestAmount;

        
        System.out.println("Interest Amount (12% per annum): " + interestAmount);
        System.out.println("Total Amount to be Repaid: " + totalAmount);

       
        scanner.close();
    }
}
