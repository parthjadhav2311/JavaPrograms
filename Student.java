//constructor
public class Student{
	int roll;
	String name;
	String address;
	
	
	public static void main(String[] args)
	{
		Student s1 = new Student();
		
		System.out.println(s1.name);
		System.out.println(s1.roll);
		
		s1.name = "Parth";
		s1.roll = 07;
		s1.address = "pune";
		
		System.out.println(s1.name);
		System.out.println(s1.roll);
		System.out.println(s1.address);
		
	Student s2 = new Student();
		System.out.println(s2.name);
		System.out.println(s2.roll);
		
		s2.name = "Sai";
		s2.roll = 07;
		s2.address = "Wakad";
		
		System.out.println(s2.name);
		System.out.println(s2.roll);
		System.out.println(s2.address);
	}
}

