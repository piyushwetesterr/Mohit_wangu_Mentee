package Overloading_Concepts;

public class Overloading_3 {
	
	
	public void m1(String str)
	{
		System.out.println("String version");
		
	}
	
	
	
	public void m1(StringBuffer sb)
	{
		System.out.println("StringBuffer version");
		
	}
	
	
	
	public static void main(String[] args) {
		
		Overloading_3 ol = new Overloading_3();
		
		ol.m1("abcd");
		
		ol.m1(new StringBuffer("abcd"));
		
		//ol.m1(null); // this call can't be resolved as there is no direct 
		//relation between the two classes i.e string and stringbuffer
		// this works in case of parent child relation only as seen in Overloading_2.java
		
		
		
		
	}

}
