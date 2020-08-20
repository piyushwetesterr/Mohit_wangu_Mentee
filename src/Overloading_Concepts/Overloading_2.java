package Overloading_Concepts;

public class Overloading_2 {
	
	
	
	private void m1(Object o)
	{
		System.out.println("Object version");
		
	}
	
	
	final void m1(String a)
	{
		System.out.println("String version");
		
	}
	
	
	static int m1(int p)
	{
		System.out.println("integer version");
		return p;
		
	}
	
	
	public static void main(String[] args) {
		
		Overloading_2 o2 = new Overloading_2();
		
		o2.m1(new Object()); // this will point to the exact match method which takes object as it is given top
							//priority
		
		o2.m1("hello world"); // string method will be called
		
		
		o2.m1(null); // child version i.e string will get preference if avbl and if not then finally 
		             //goes to parent
		
	}

}
