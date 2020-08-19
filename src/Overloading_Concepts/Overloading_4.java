package Overloading_Concepts;

public class Overloading_4 {
	
	
	public void m1(int i)
	{
		System.out.println("integer version");
		
	}
	
	
	
	public void m1(int...x)
	{
		System.out.println("var-args version");
		
	}
	
	
	
	public static void main(String[] args) {
		
		Overloading_4 ol = new Overloading_4();
		
		ol.m1(null); // how will this get resolved?
		
		ol.m1(); // var-args can take any number of arguments including none as well so call goes to it
		
		ol.m1(10,20);// var-args can take any number of arguments so call goes to it
		
		ol.m1(10); // this will go to single parameter method due to it being a older concept
		
		// var-args will get least priority and only if nothing else matches then it will come in play
		
		//read more about var-args introduced from version 1.5 onwards
		
		
		
	}

}
