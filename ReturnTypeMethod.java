public class ReturnTypeMethod {
	
	
	public int addition(int a, int b)
	{
		System.out.println("addition method started!!!");
		int res = a + b;
		
		System.out.println("addition method ended!!!");
		
		return res;
	}

	public static void main(String[] args) {
		
		System.out.println("main method started!!!");
		
		ReturnTypeMethod obj = new ReturnTypeMethod();
		
		int returnedValue = obj.addition(10, 30);
		
		System.out.println(">>> Addition is : "+returnedValue);
		
		System.out.println("main method ended!!!");
	}
	
}