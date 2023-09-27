
import java.util.Scanner;

public class SwapValues {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

       
        System.out.print("Enter the first value: ");
        int firstValue = scanner.nextInt();

       
        System.out.print("Enter the second value: ");
        int secondValue = scanner.nextInt();

        
        System.out.println("Original values:");
        System.out.println("First Value: " + firstValue);
        System.out.println("Second Value: " + secondValue);

      
        int temp = firstValue;
        firstValue = secondValue;
        secondValue = temp;

       
        System.out.println("\nSwapped values:");
        System.out.println("First Value: " + firstValue);
        System.out.println("Second Value: " + secondValue);

       
        scanner.close();
    }
}
