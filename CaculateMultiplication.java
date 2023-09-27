// Take input 3 values & calculate Multiplication

import java.util.Scanner;

public class CaculateMultiplication{
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Enter the First Number: ");
		double num1 = scanner.nextDouble();
		
		System.out.print("Enter the Second Number: ");
		double num2 = scanner.nextDouble();
		
		System.out.print("Enter the Third Number: ");
		double num3 = scanner.nextDouble();
		
		double product = num1 * num2 * num3;

   System.out.println("The product of " + num1 + "," + num2 +", and " + num3 + " is: " + product);
   
   scanner.close();
	}
}