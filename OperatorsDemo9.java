public class OperatorsDemo9 {
	
 public static void main(String[] args) {
	 
	  int a = 10, b = 15;
	  
	  if(a == 10)
	  {
		  System.out.println("Ten");
	  }
	  
	  else
	  {
		  System.out.println("Not Ten");
	  }
	  
	  System.out.println("---------------------------------------------------------");
	  
	  String res = (a == 10) ? "Ten" : "Not Ten"; //Terneray Operator
	  
	  System.out.println(res);
 }
}