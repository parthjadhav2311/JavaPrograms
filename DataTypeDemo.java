public class DataTypeDemo {
	
	public static void main(String[] args) {
		
		//implicit casting
		byte b = 125;
		short s = b;
		
		System.out.println("b : "+b);
		
		System.out.println("s : "+s);
		
		//explicit casting
		short s1 = 125;
		byte b1 = (byte) s1;
		
		System.out.println("b : "+b);
		
		System.out.println("s : "+s);
	}
}