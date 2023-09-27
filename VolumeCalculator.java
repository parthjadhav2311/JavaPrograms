
import java.util.Scanner;

public class VolumeCalculator {
	public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	
	System.out.print("Enter the length (L) of the box: ");
	double length = input.nextDouble();
	
	System.out.print("Enter the breadth (B) of the box: ");
	double breadth = input.nextDouble();
	
	System.out.print("Enter the height (H) of the box: ");
	double height = input.nextDouble();
	
	double volume = length * breadth * height;
	
	System.out.println("The volume of the box is: " + volume);
	
	input.close();
	}
}
		
		
		