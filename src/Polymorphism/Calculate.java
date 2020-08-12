package Polymorphism;

public class Calculate {
	
	
	public void sum(int a, int b)
	{	
		int sum = a+b;
		
		System.out.println("Sum of integers is :"+ sum );
	}
	
	
	public void sum(float a, float b)
	{
		
		float sum = a+b;
		
		System.out.println("Sum of float types is :"+sum);
		
	}
	
	
	public int sum(int x, int y, int z)
	{
		int sum = x+y+z;
		
		
		return sum;
		
	}
	
	
	

	public static void main(String[] args) {
		
		Calculate c1 = new Calculate();
		
		c1.sum(5, 4);
		
		c1.sum(0.5f,1.5f);
		
		int val = c1.sum(5, 6, 7);
		
		System.out.println(val);
		

	}

}
