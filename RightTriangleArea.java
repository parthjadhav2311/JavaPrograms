

import java.util.Scanner;

public class RightTriangleArea {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Enter the base of the right triangle: ");
        double base = scanner.nextDouble();
        
        System.out.print("Enter the height of the right triangle: ");
        double height = scanner.nextDouble();

        
        double area = 0.5 * base * height; 

        
        System.out.println("Area of the right triangle: " + area);

        
        scanner.close();
    }
}
