class BlockEx1 {

	public static void addition(int a, int b) {
		int res = a + b;
		System.out.println("Addition of two numbers is:" + res);
	}

	{
		System.out.println("Inside instance block1-11!!");
	}

	{
		System.out.println("Inside instance block-222!!");
	}

	public BlockEx1()
	{
		System.out.println("inside no-arg constructor!!");
	}

	public static void main(String args[]) {

		System.out.println("inside main!!");

		addition(3, 10);

		BlockEx1 obj = new BlockEx1();
		 
		System.out.println("Main Method Ended");
	}

}