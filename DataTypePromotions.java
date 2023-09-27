public class DataTypePromotions{

    public static void main(String[]args){
	
	 byte x = 127;
	 
	 short y=x;  //implicit casting 
	 
	 System.out.println("Y value :"+y);
	 
	 short p =127;
	 
	 byte q = (byte) p; //explicit casting 
	 
	 System.out.println("Q value after explicit casting: "+q);
	 
	   }
	}