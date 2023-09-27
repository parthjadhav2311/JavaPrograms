import java.util.Scanner;

public class Country {
    public static void main(String[] args) {
		
        Scanner scanner = new Scanner(System.in);
		
        System.out.print("Enter a number : ");
		
        int Country  = scanner.nextInt();

        switch (Country) {
            case 1:
                System.out.println("India");
                break;
				
            case 2:
                System.out.println("Brazil");
                break;
				
            case 3:
                System.out.println("Russia");
                break;
				
            default:
                System.out.println("Invalid Country");
        }
    }
}
