public class OperatorsDemo10 {
	public static void main(String[] args) {
		
		if(isEven(10))
		{
			System.out.println(" Even Number!! ");
		}
		else
		{
		   System.out.println(" Not Even Number!! ");
		}
			
	}
	
	public static boolean isEven(int number)
	{
		return (number % 2 == 0) ? true : false;
	}
}