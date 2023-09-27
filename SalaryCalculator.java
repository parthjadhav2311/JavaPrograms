

import java.util.Scanner;

public class SalaryCalculator {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Enter the basic salary: ");
        double basicSalary = scanner.nextDouble();

        
        double hraRate = 45; 
		
        double taRate = 25;
		
        double daRate = 30;  
		
        double maRate = 5;  
		
        double pfRate = 25;  

        
        double hra = basicSalary * hraRate;
		
        double ta = basicSalary * taRate;
		
        double da = basicSalary * daRate;
		
        double ma = basicSalary * maRate;
		
        double pf = basicSalary * pfRate;

       
        double netSalary = basicSalary + hra + ta + da - ma - pf;

       
        System.out.println("Basic Salary: " + basicSalary);
		
        System.out.println("HRA: " + hra);
		
        System.out.println("TA: " + ta);
		
        System.out.println("DA: " + da);
		
        System.out.println("MA: " + ma);
		
        System.out.println("PF: " + pf);
		
        System.out.println("Net Salary: " + netSalary);

        
        scanner.close();
    }
}
