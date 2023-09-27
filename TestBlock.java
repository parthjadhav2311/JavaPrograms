public class TestBlock extends Parent{
	
	//static block
	
	static 
	{
         System.out.println("Inside static block-2222!!!");
    }	

    // No-arg Constructor
     
      public TestBlock()
	  {
        super();
         System.out.println("Inside TestBlock() no-arg constructor!!");
      }
	  
	  // Instance Block 
	  {
		  System.out.println("Inside instance block-111!!!");
	  }
	  
	  // static Block
	  static 
	  {
		  System.out.println("Inside static block-1111!!!");
	  }
	  
	  // instance Block
	  {
		  System.out.println("Inside instance block-222!!!");
	  }
	  
	  public static void printHello() //static method 
	  {
		  System.out.println("Inside printHello()");
	  }
	  
	  public void  printHii() // instance method 
	  {
		  System.out.println("inside printHii()");
	  }
	  
	  public static void main(String[] args) {
		  System.out.println("inside main method!!");

          TestBlock obj1 = new TestBlock();
          
          printHello();
          obj1.printHii();
      }
}
	  
	  