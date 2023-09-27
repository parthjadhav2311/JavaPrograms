public class Person {

     String name;
	 int height;
	 float weight;
	 
	 public Person()
	 {
		 super();
     }
	 
	 public Person(String name, int height,float weight)
	 {
		 this.name = name;
		 this.height = height;
		 this.weight = weight;
	 }
	 
	 public static void main(String[] args) {
		 
		 Person p = new Person("Parth", 7, 75.8f);
		 
		 System.out.println(p.name);
		 System.out.println(p.weight);
		 System.out.println(p.height);
		 
		 Person p1 = new Person();
		 
		 
	 }
}

	 
	 