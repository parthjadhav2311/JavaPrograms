public class OperatorsDemo6 {
	public static void main(String[] args) {
		
		String s = "Hello";
		
		guessTheTypeOfInstance(s);
		
	}
	
	public static void guessTheTypeOfInstance(Object o)
	{
		if( o instanceof String)
			
			System.out.println("Its String Object!!");
			
		else
			
			System.out.println("Its not String Object");
	}
}