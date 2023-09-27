public class OperatorsDemo7 {
	public static void main(String[] args) {
		
		StringBuffer s = new StringBuffer("Hello");
		
		isStringInstance(s);
		
	}
	
	public static void isStringInstance(Object o)
	{
		if( o instanceof String)
			
			System.out.println("Its String Object!!");
			
		else
			
			System.out.println("Its not String Object");
	}
}