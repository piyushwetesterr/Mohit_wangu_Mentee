package Polymorphism;

public class MathClass extends Calculate {
	
	
	public static int sum(int a, int b, int c)
	{
		System.out.println("Child class method");
		
		int calc  = a+b+c;
		
		return calc;
		
	}
	

	public static void main(String[] args) {
		
		MathClass m1 = new MathClass();
		
		System.out.println(m1.sum(2, 3, 4));
		
		

		
		Calculate c1 = new MathClass();
		
		System.out.println(c1.sum(1, 2, 3));
		

	}

}
