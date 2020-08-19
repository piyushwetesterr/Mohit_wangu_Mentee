package Overriding_Concepts; // private access modifiers

class Demo3 {

	private void display()
	{
		
		System.out.println("Parent class");
	}
	
	
}


class Children extends Demo3
{
	private void display() // private members of parent class are not visible in child class hence those are not over-ridden
	{
		System.out.println("Child class");
	}
	
	
	
}

class TestClass1
{

	public static void main(String[] args) {
		
		
		Demo3 od = new Children();
		
		od.display(); // private members of both classes wont be visible outside the class
		
	}


}

