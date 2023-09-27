
import java.util.*;
 
public class CalculateAddition {
    public static void main(String[] args) {
        int num1, num2, sum;
        Scanner scanner;
 
        scanner = new Scanner(System.in);
 
        
        System.out.println("Enter First Number");
        num1 = scanner.nextInt();
 
        System.out.println("Enter Second Number");
        num2 = scanner.nextInt();
 
       
        sum = num1 + num2;
       
	   System.out.println("Sum of " + num1 + " and " + num2 + " = " + sum);
    }
}
	