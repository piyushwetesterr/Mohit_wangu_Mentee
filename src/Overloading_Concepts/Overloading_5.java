package Overloading_Concepts;

public class Overloading_5 {
	
	
	public void m1(int i, float f)
	{
		System.out.println("integer float version");
		
	}
	
	
	
	public void m1(float f, int i)
	{
		System.out.println("float int version");
		
	}
	
	
	
	public static void main(String[] args) {
		
		
		Overloading_5 ol = new Overloading_5();
		
		ol.m1(10,10.5f); // int float version
		
		ol.m1(10.5f, 10); // float int version
		
		//ol.m1(10.5f, 10.5f); // error as conversion from float to int cant be done
		
		//ol.m1(10, 10); // ambigous call
		
	}

}
